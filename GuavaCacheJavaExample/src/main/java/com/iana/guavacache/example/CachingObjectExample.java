package com.iana.guavacache.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.iana.guavacache.model.AccountInfoBean;
import com.iana.guavacache.model.SearchAccountBean;
import com.iana.guavacache.repository.DBConnection;
import com.iana.guavacache.utils.UiiaConstants;


public class CachingObjectExample {
	
	public ArrayList searchMember(Connection con, SearchAccountBean params) throws Exception
	{
		ArrayList<AccountInfoBean> arlMemberList=new ArrayList<AccountInfoBean>();
		PreparedStatement pstmt = null ; 
		ResultSet rsMemList=null;
		StringBuffer tempCompName=new StringBuffer(params.getCompanyName());
		tempCompName.append("%");
		StringBuffer tempSCAC=new StringBuffer(params.getSCAC());
		tempSCAC.append("%");
		StringBuffer tempAccNo=new StringBuffer(params.getAccNo());
		tempAccNo.append("%");
		StringBuffer tempMemType= new StringBuffer(params.getUserType());
		tempMemType.append("%");
		
		String test=params.getNewCompName();
		
		StringBuffer sbGetQuery = null;
		if(!params.getKnownAs().equalsIgnoreCase(""))
		{
			sbGetQuery = new StringBuffer("SELECT a.account_no,a.company_name,a.scac_code,a.uiia_status,a.mem_type,m.addr_city,m.addr_state,mcsc.mc_new_name");//modified by ankur DATE:Dec-2008
			sbGetQuery.append(" FROM address_master m,account_info a LEFT JOIN mc_scac_name_history mcsc ON(mcsc.mc_acct_no=a.account_no and (mc_verified_dt is null and mc_verified_by is null)) WHERE ");//modified by ankur DATE:Dec-2008
			sbGetQuery.append(" ((a.company_name LIKE  ? OR mcsc.mc_new_name like ?) AND IF(a.scac_code IS NOT NULL,a.scac_code,'%') LIKE ? AND a.account_no like ? )AND (a.account_no=m.account_no) ");
			if(tempMemType.toString().equalsIgnoreCase("IDD%"))
				sbGetQuery.append(" AND (m.account_no like ? OR m.account_no like 'OTH%') ");
			else
				sbGetQuery.append(" AND (m.account_no like ?)");
			sbGetQuery.append(" AND (m.addr_type='contact')  ");

			if(tempMemType.toString().equalsIgnoreCase("IDD%"))
			{
				sbGetQuery.append(" AND (a.mem_type like ? || ");
				sbGetQuery.append(" a.account_no in (SELECT DISTINCT mc_acct_no FROM driver_details)) ");
			}
			else
			{
				sbGetQuery.append(" AND a.mem_type like ? ");
			}

			if(test.equalsIgnoreCase("pending"))	
			{
				sbGetQuery.append(" AND a.uiia_status='pending' ");
			}

			sbGetQuery.append(" AND EXISTS (SELECT 1 FROM ep_mc_join_details e WHERE a.account_no = e.mc_acct_no ");
			sbGetQuery.append(" AND IF(e.ep_known_as is not null, e.ep_known_as,'%') LIKE ?)");
			sbGetQuery.append(" ORDER BY a.company_name");			
		}
		else
		{
			sbGetQuery = new StringBuffer("SELECT distinct a.account_no,a.company_name,a.scac_code,a.uiia_status,a.mem_type,m.addr_city,m.addr_state,mcsc.mc_new_name");//modified by ankur DATE:Dec-2008 DATE:Dec-2008
			sbGetQuery.append(" FROM address_master m,account_info a LEFT JOIN mc_scac_name_history mcsc ON(mcsc.mc_acct_no=a.account_no and (mc_verified_dt is null and mc_verified_by is null)) WHERE ");//modified by ankur DATE:Dec-2008
			sbGetQuery.append(" ((a.company_name LIKE  ? or mcsc.mc_new_name like ?) AND IF(a.scac_code IS NOT NULL,a.scac_code,'%') LIKE ? AND a.account_no like ? ) AND (a.account_no=m.account_no) ");
			if(tempMemType.toString().equalsIgnoreCase("IDD%"))
				sbGetQuery.append(" AND (m.account_no like ? OR m.account_no like 'OTH%') ");
			else
				sbGetQuery.append(" AND (m.account_no like ?)");
			sbGetQuery.append(" AND (m.addr_type='contact')  ");
			if(tempMemType.toString().equalsIgnoreCase("IDD%"))
			{
				if(params.getIddMemberType().equalsIgnoreCase("IDD Only"))
					sbGetQuery.append(" AND (a.mem_type like ? AND ");
				else if(params.getIddMemberType().equalsIgnoreCase("IDD Only DELETED - UIIA"))
					sbGetQuery.append(" AND (a.mem_type = 'MC' and a.uiia_status='DELETED' AND ");
				else if(params.getIddMemberType().equalsIgnoreCase("IDD Only UIIA"))
					sbGetQuery.append(" AND (a.mem_type='MC' AND a.uiia_status<>'DELETED' AND ");
				else if(params.getIddMemberType().equalsIgnoreCase("SEARCH ALL"))
					sbGetQuery.append(" AND (a.mem_type like ? || (a.mem_type='MC' AND ");
				else
					sbGetQuery.append(" AND (a.mem_type like ? || ");
				
				if(params.getIddMemberType().equalsIgnoreCase("SEARCH ALL"))
					sbGetQuery.append(" a.account_no in (SELECT DISTINCT mc_acct_no FROM driver_details))) ");
				else
					sbGetQuery.append(" a.account_no in (SELECT DISTINCT mc_acct_no FROM driver_details)) ");
			}
			else
			{
				sbGetQuery.append(" AND a.mem_type like ? ");
			}
			
			if(test.equalsIgnoreCase("pending"))
			{
				sbGetQuery.append(" AND a.uiia_status='pending' ");
			}
			
			sbGetQuery.append(" ORDER BY a.company_name");
		}
		if(! UiiaConstants.YES.equals(params.getSkipPagination()))
		{
			sbGetQuery.append(" LIMIT ?,?");
		}
		
		try
		{
			System.out.println("Query Fired IS :"+sbGetQuery.toString());
		 	pstmt = con.prepareStatement(sbGetQuery.toString());
		 	pstmt.setString(1,tempCompName.toString());
		 	pstmt.setString(2,tempCompName.toString());
		 	pstmt.setString(3,tempSCAC.toString());
		 	pstmt.setString(4,tempAccNo.toString());
		 	if(tempMemType.toString().equalsIgnoreCase("IDD%"))
		 	{
		 		pstmt.setString(5,"MC%");
		 	}
		 	else
		 	{
		 		if(tempMemType.toString().equalsIgnoreCase("EP%"))
		 			pstmt.setString(5,"%");
		 		else
		 			pstmt.setString(5,tempMemType.toString());
		 	}
		 	int i=7;
		 	if(tempMemType.toString().equalsIgnoreCase("IDD%") && !(params.getIddMemberType().equalsIgnoreCase("IDD Only") || params.getIddMemberType().equalsIgnoreCase("SEARCH ALL") ))
		 	{
		 		 i=6;
		 	}else
		 	{
		 		pstmt.setString(6,tempMemType.toString());
		
		 	}
		 	
		 	if(!params.getKnownAs().equalsIgnoreCase(""))
			{
		 		StringBuffer tmpKnwAs = new StringBuffer(params.getKnownAs());
		 		tmpKnwAs.append("%");
		 		pstmt.setString(i,tmpKnwAs.toString());
		 		i++;
			}
		 	
		 	if(!UiiaConstants.YES.equals(params.getSkipPagination()))
			{
		 		pstmt.setInt(i++,(params.getPageNumber()*(params.getLimit()-1)));
			 	pstmt.setInt(i,params.getLimit());
			}
		 	
		 	if(params!=null )
		 	{
		 		rsMemList=pstmt.executeQuery();
		 		
		 		if(rsMemList!=null)
		 		{
		 			while(rsMemList.next())
		 			{
		 				System.out.println("Entering while(rsEPList.next())");
		 				AccountInfoBean acctDetails=new AccountInfoBean();
		 				acctDetails.setAccountNo(rsMemList.getString("account_no"));
		 				acctDetails.setCompanyName(rsMemList.getString("company_name"));
		 				acctDetails.setScac(rsMemList.getString("scac_code"));
		 				acctDetails.setCurrent_UIIA_Status(rsMemList.getString("uiia_status"));
		 				acctDetails.setMemberType(rsMemList.getString("mem_type"));
		 				
		 				if(rsMemList.getString("mem_type")!=null && rsMemList.getString("mem_type").equalsIgnoreCase(UiiaConstants.ROLE_IDD_MC))
		 				{
		 					acctDetails.setIddMemberType("IDD ONLY");
		 				}else if(rsMemList.getString("mem_type")!=null && rsMemList.getString("mem_type").equalsIgnoreCase(UiiaConstants.ROLE_MC) && (rsMemList.getString("uiia_status")!=null && rsMemList.getString("uiia_status").equalsIgnoreCase(UiiaConstants.DELETEDMEMBER)))
		 				{
		 					acctDetails.setIddMemberType("IDD ONLY DELETED - UIIA");
		 				}else if(rsMemList.getString("mem_type")!=null && rsMemList.getString("mem_type").equalsIgnoreCase(UiiaConstants.ROLE_MC) && (rsMemList.getString("uiia_status")!=null && !rsMemList.getString("uiia_status").equalsIgnoreCase(UiiaConstants.DELETEDMEMBER)))
		 				{
		 					acctDetails.setIddMemberType("IDD ONLY UIIA");
		 				}else
		 				{
		 					acctDetails.setIddMemberType(params.getIddMemberType());
		 				}
		 				
		 				
		 				acctDetails.setCity(rsMemList.getString("addr_city"));
		 				acctDetails.setState(rsMemList.getString("addr_state"));
		 				
		 				acctDetails.setNewName(rsMemList.getString("mc_new_name"));
		 				
		 				if(((rsMemList.getString("mc_new_name")!= null) && (!rsMemList.getString("mc_new_name").equalsIgnoreCase(""))))
						{
							acctDetails.setStatus(UiiaConstants.NAMEPENDING);
					    }
		 				
		 				arlMemberList.add(acctDetails);
		 			}
		 			rsMemList.close();
		 		}
		 	}
		}
		catch(SQLException sqlEx)
		{
			sqlEx.printStackTrace();			
		}
		finally
		{
			try
			{
				if(pstmt!=null)
				{
					pstmt.close();
				}
			}
			catch(SQLException sqlEx)
			{
				sqlEx.printStackTrace();
			}
		}	
		return arlMemberList;
	}

	
	public ArrayList getMemberList(SearchAccountBean searchParam) throws Exception
	{
		System.out.println("Session Facade: Entering method  getMemberList("+searchParam.toString()+") of SearchAccount class");
		ArrayList arlMemList = new ArrayList();
		Connection con=null;
		try
		{
			con = DBConnection.getConnection();
		}//end of Try
		catch(Exception genExp)
		{
			genExp.printStackTrace();
		}
		try
		{
			if(searchParam!=null)
			{
				System.out.println("Entering if(searchParam!=null)");
				arlMemList=searchMember(con,searchParam);
				if(arlMemList.isEmpty())
				{
					System.out.println("Entering ifarlMemList.isEmpty()");
				}
			}
		
		}//end of Try Block
		catch(Exception uiiaExp)
		{
			uiiaExp.printStackTrace();
		}
		finally
		{
			try
			{
				if(con!=null){con.close();}
			}
			catch(SQLException sqlEx)
			{
				sqlEx.printStackTrace();
			}
		}

		return arlMemList;
	}

	
	private final LoadingCache<SearchAccountBean, ArrayList> cache = CacheBuilder.newBuilder()
			.build(new CacheLoader<SearchAccountBean, ArrayList>() {

			  @Override
		      public ArrayList load(SearchAccountBean searchAccountBean) throws Exception {
		        return new CachingObjectExample().getMemberList(searchAccountBean);
		      }
		    });

		public ArrayList getMemberList1(SearchAccountBean searchAccountBean) {
		  return cache.getUnchecked(searchAccountBean);
		}		
	public static void main(String[] args) {
			  try {
				  CachingObjectExample s = new CachingObjectExample();
				  
				  for(int i = 0;i<10;i++) {
					  
					  long startTime = System.currentTimeMillis();
					  SearchAccountBean u = new SearchAccountBean();
					  	u.setLimit(11);
					  	u.setUserType("MC");
						 ArrayList lst = s.getMemberList1(u);
						 System.out.println("size:" + lst.size());
						 long endTime = System.currentTimeMillis();
						 System.out.println("Time taken:" + (endTime - startTime));
				  }
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}