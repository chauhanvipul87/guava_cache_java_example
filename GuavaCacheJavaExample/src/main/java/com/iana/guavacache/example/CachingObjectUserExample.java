package com.iana.guavacache.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.iana.guavacache.model.User;
import com.iana.guavacache.repository.DBConnection;


public class CachingObjectUserExample {

	private final LoadingCache<User, List<User>> cache = CacheBuilder.newBuilder()
			.build(new CacheLoader<User, List<User>>() {

			  @Override
		      public List<User> load(User user) throws Exception {
		        return new CachingObjectUserExample().getUserList(user);
		      }
		    });

		public List<User> getUser(User user) {
		  return cache.getUnchecked(user);
		}
		
	public static void main(String[] args) {
			  try {
				  CachingObjectUserExample s = new CachingObjectUserExample();
				  
				  for(int i = 0;i<10;i++) {
					  
					  long startTime = System.currentTimeMillis();
						 User u = new User();
						 if(i > 4) {
							 u.setUserName("a");
						 } else {
							 u.setUserName("b");
						 }
						 List<User> lst = s.getUser(u);
						 System.out.println("size:" + lst.size());
						 long endTime = System.currentTimeMillis();
						 System.out.println("Time taken:" + (endTime - startTime));
				  }
			 
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	private List<User> getUserList(User user) {

		List<User> userList = new ArrayList<User>();
		Connection conn = null;
		
		
		try {

		  	conn = DBConnection.getConnection();
		  	
		  	String query ="SELECT login_id, user_name, scac_code, account_number FROM user_login WHERE user_name LIKE ?";
		  	System.out.println("User query:=>" + query);
		  	
			java.sql.PreparedStatement stmt=conn.prepareStatement(query);
			stmt.setString(1, user.getUserName()+"%");
	  		ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				User u = new User();
				u.setLoginId(rs.getLong("login_id"));
				u.setUserName(rs.getString("user_name"));
				u.setScacCode(rs.getString("scac_code"));

				userList.add(u);
			}
  		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	  finally{
		  
			  try {
					conn.close();
			  } catch (SQLException e) {
				e.printStackTrace();
		  		} 
		}
		
		return userList;
	    }
}