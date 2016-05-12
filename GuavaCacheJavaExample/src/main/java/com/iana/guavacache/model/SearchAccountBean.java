/*
 *  File		: SearchAccountBean.java
 *  Author		: Ashok Soni
 *  Created		: June 09,2006
 *  Description	: This bean will be used to search BasicAccount details like
 *  			  Company Name,SCAC Code, Account No,  and will  be used
 *  			  to display search results for Account Details 
 * 	Copyright   : Copyright (c) 2006-2007 IANA  
 * 				  All rights reserved 	
 */

/**
 * @author 146877
 *
 */
package com.iana.guavacache.model;

public class SearchAccountBean {

	private String companyName="";
	private String SCAC="";
	private String accNo="";
	private String knownAs="";
	private String licenseNumber="";
	private int pageNumber=0;
	private int limit=10;
	private String userType="";
	private String epName = "";
	private String epScac = "";
	private String date = "";
	private String newCompName = "";
	private String skipPagination = "";
	// Added by Harshdeep Ratnani
	private String lastName="";
	private String iddMemberType="";
	
	
	public String getSkipPagination() {
		return skipPagination;
	}
	public void setSkipPagination(String skipPagination) {
		this.skipPagination = skipPagination;
	}
	public String getNewCompName() {
		return newCompName;
	}
	public void setNewCompName(String newCompName) {
		this.newCompName = newCompName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEpName() {
		return epName;
	}
	public void setEpName(String epName) {
		this.epName = epName;
	}
	public String getEpScac() {
		return epScac;
	}
	public void setEpScac(String epScac) {
		this.epScac = epScac;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	public String getKnownAs() {
		return knownAs;
	}
	public void setKnownAs(String knownAs) {
		this.knownAs = knownAs;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSCAC() {
		return SCAC;
	}
	public void setSCAC(String scac) {
		SCAC = scac;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	// Added by Harshdeep Ratnani
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getIddMemberType() {
		return iddMemberType;
	}
	public void setIddMemberType(String iddMemberType) {
		this.iddMemberType = iddMemberType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SCAC == null) ? 0 : SCAC.hashCode());
		result = prime * result + ((accNo == null) ? 0 : accNo.hashCode());
		result = prime * result
				+ ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((epName == null) ? 0 : epName.hashCode());
		result = prime * result + ((epScac == null) ? 0 : epScac.hashCode());
		result = prime * result
				+ ((iddMemberType == null) ? 0 : iddMemberType.hashCode());
		result = prime * result + ((knownAs == null) ? 0 : knownAs.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((licenseNumber == null) ? 0 : licenseNumber.hashCode());
		result = prime * result + limit;
		result = prime * result
				+ ((newCompName == null) ? 0 : newCompName.hashCode());
		result = prime * result + pageNumber;
		result = prime * result
				+ ((skipPagination == null) ? 0 : skipPagination.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchAccountBean other = (SearchAccountBean) obj;
		if (SCAC == null) {
			if (other.SCAC != null)
				return false;
		} else if (!SCAC.equals(other.SCAC))
			return false;
		if (accNo == null) {
			if (other.accNo != null)
				return false;
		} else if (!accNo.equals(other.accNo))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (epName == null) {
			if (other.epName != null)
				return false;
		} else if (!epName.equals(other.epName))
			return false;
		if (epScac == null) {
			if (other.epScac != null)
				return false;
		} else if (!epScac.equals(other.epScac))
			return false;
		if (iddMemberType == null) {
			if (other.iddMemberType != null)
				return false;
		} else if (!iddMemberType.equals(other.iddMemberType))
			return false;
		if (knownAs == null) {
			if (other.knownAs != null)
				return false;
		} else if (!knownAs.equals(other.knownAs))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (licenseNumber == null) {
			if (other.licenseNumber != null)
				return false;
		} else if (!licenseNumber.equals(other.licenseNumber))
			return false;
		if (limit != other.limit)
			return false;
		if (newCompName == null) {
			if (other.newCompName != null)
				return false;
		} else if (!newCompName.equals(other.newCompName))
			return false;
		if (pageNumber != other.pageNumber)
			return false;
		if (skipPagination == null) {
			if (other.skipPagination != null)
				return false;
		} else if (!skipPagination.equals(other.skipPagination))
			return false;
		if (userType == null) {
			if (other.userType != null)
				return false;
		} else if (!userType.equals(other.userType))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SearchAccountBean [companyName=" + companyName + ", SCAC="
				+ SCAC + ", accNo=" + accNo + ", knownAs=" + knownAs
				+ ", licenseNumber=" + licenseNumber + ", pageNumber="
				+ pageNumber + ", limit=" + limit + ", userType=" + userType
				+ ", epName=" + epName + ", epScac=" + epScac + ", date="
				+ date + ", newCompName=" + newCompName + ", skipPagination="
				+ skipPagination + ", lastName=" + lastName
				+ ", iddMemberType=" + iddMemberType + "]";
	}
	
	
}
