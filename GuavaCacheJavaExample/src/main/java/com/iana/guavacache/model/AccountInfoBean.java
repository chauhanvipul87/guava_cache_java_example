package com.iana.guavacache.model;


public class AccountInfoBean implements Comparable<AccountInfoBean> {

	private String accountNo = "";
	private String companyName = "";
	private String entitiesName = "";
	private String scac = "";
	private String oldScac = "";
	private String ianaMember = "N";
	private String uiiaStatus = "";
	private String uiiaStatusCode = "";
	private String memberType = "";
	private String companyUrl = "";
	private String attr1 = "";
	private String attr2 = "";
	private String attr3 = "";
	private String memEffDate = "";
	private String canDate = "";
	private String delDate = "";
	private String reInsDate = "";
	private String lstUpdtDate = "";
	private String password = "";
	private String oldUiiaStatus = "";
	private String secUserName = "";
	private String oldSecUserName = "";
	private String uiiaMem = "";
	private String iddMem = "";
	private String iddStatus = "";
	private String applyUiiaMem = "";
	private String loginAllwd = "";
	private String company_Name = "";
	private String current_UIIA_Status = "";
	private String dt = "";
	// attritbute added for identifiying in change password if the password is
	// changed for sec idd user
	private String iddSec = "N";
	// attributes added for IA used to display in IA search by Huda
	private String iaFaxRcvd = "N";
	private String contctName = "";
	private String iaPassword = "";

	// Added by Sumukh on 31st March 2008
	private String city = "";
	private String state = "";

	// Added by Sumukh on 1st April 2008
	private String addr_street1 = "";
	private String addr_street2 = "";
	private String zip = "";
	private String country = "";

	// prarit added for mc name change pending indicator
	private String status = "";
	private String verifiedBy = "";
	private String verifiedDate = "";
	private String newName = null;
	private String iaFax = "";
	private String iaEmail = "";
	private String iddMemberType = "";
	
	private String firstName = "";
	private String lastName = "";
	private String phone = "";
	private String fax = "";
	private String email = "";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy;
	}

	public String getVerifiedDate() {
		return verifiedDate;
	}

	public void setVerifiedDate(String verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	// prarit
	public String getEntitiesName() {
		return entitiesName;
	}

	public void setEntitiesName(String entitiesName) {
		this.entitiesName = entitiesName;
	}

	public String getAddr_street1() {
		return addr_street1;
	}

	public void setAddr_street1(String addr_street1) {
		this.addr_street1 = addr_street1;
	}

	public String getAddr_street2() {
		return addr_street2;
	}

	public void setAddr_street2(String addr_street2) {
		this.addr_street2 = addr_street2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIaPassword() {
		return iaPassword;
	}

	public void setIaPassword(String iaPassword) {
		this.iaPassword = iaPassword;
	}

	public String getIaFaxRcvd() {
		return iaFaxRcvd;
	}

	public void setIaFaxRcvd(String iaFaxRcvd) {
		this.iaFaxRcvd = iaFaxRcvd;
	}

	public String getCurrent_UIIA_Status() {
		return current_UIIA_Status;
	}

	public void setCurrent_UIIA_Status(String current_UIIA_Status) {
		this.current_UIIA_Status = current_UIIA_Status;
	}

	public String getCompany_Name() {
		return company_Name;
	}

	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}

	public String getLoginAllwd() {
		return loginAllwd;
	}

	public void setLoginAllwd(String loginAllwd) {
		this.loginAllwd = loginAllwd;
	}

	public String getApplyUiiaMem() {
		return applyUiiaMem;
	}

	public void setApplyUiiaMem(String applyUiiaMem) {
		this.applyUiiaMem = applyUiiaMem;
	}

	public String getIddStatus() {
		return iddStatus;
	}

	public void setIddStatus(String iddStatus) {
		this.iddStatus = iddStatus;
	}

	public String getIddMem() {
		return iddMem;
	}

	public void setIddMem(String iddMem) {
		this.iddMem = iddMem;
	}

	public String getUiiaMem() {
		return uiiaMem;
	}

	public void setUiiaMem(String uiiaMem) {
		this.uiiaMem = uiiaMem;
	}

	public String getOldSecUserName() {
		return oldSecUserName;
	}

	public void setOldSecUserName(String oldSecUserName) {
		this.oldSecUserName = oldSecUserName;
	}

	public String getSecUserName() {
		return secUserName;
	}

	public void setSecUserName(String secUserName) {
		this.secUserName = secUserName;
	}

	public String getOldUiiaStatus() {
		return oldUiiaStatus;
	}

	public void setOldUiiaStatus(String oldUiiaStatus) {
		this.oldUiiaStatus = oldUiiaStatus;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAttr1() {
		return attr1;
	}

	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	public String getAttr2() {
		return attr2;
	}

	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}

	public String getAttr3() {
		return attr3;
	}

	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyUrl() {
		return companyUrl;
	}

	public void setCompanyUrl(String companyUrl) {
		this.companyUrl = companyUrl;
	}

	public String getIanaMember() {
		return ianaMember;
	}

	public void setIanaMember(String ianaMember) {
		this.ianaMember = ianaMember;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public String getCanDate() {
		return canDate;
	}

	public void setCanDate(String canDate) {
		this.canDate = canDate;
	}

	public String getDelDate() {
		return delDate;
	}

	public void setDelDate(String delDate) {
		this.delDate = delDate;
	}

	public String getMemEffDate() {
		return memEffDate;
	}

	public void setMemEffDate(String memEffDate) {
		this.memEffDate = memEffDate;
	}

	public String getReInsDate() {
		return reInsDate;
	}

	public void setReInsDate(String reInsDate) {
		this.reInsDate = reInsDate;
	}

	public String getScac() {
		return scac;
	}

	public void setScac(String scac) {
		this.scac = scac;
	}

	public String getUiiaStatus() {
		return uiiaStatus;
	}

	public void setUiiaStatus(String uiiaStatus) {
		this.uiiaStatus = uiiaStatus;
	}

	public String getUiiaStatusCode() {
		return uiiaStatusCode;
	}

	public void setUiiaStatusCode(String uiiaStatusCode) {
		this.uiiaStatusCode = uiiaStatusCode;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String toString() {
		StringBuffer sbTemp = new StringBuffer();

		sbTemp.append(this.getClass().getName());
		sbTemp.append(" accountNo[");
		sbTemp.append(this.accountNo);
		sbTemp.append("] companyName[");
		sbTemp.append(this.companyName);
		sbTemp.append("] scac[");
		sbTemp.append(this.scac);
		sbTemp.append("] ianaMember[");
		sbTemp.append(this.ianaMember);
		sbTemp.append("] uiiaStatus[");
		sbTemp.append(this.uiiaStatus);
		sbTemp.append("] uiiaStatusCode[");
		sbTemp.append(this.uiiaStatusCode);
		sbTemp.append("] memberType[");
		sbTemp.append(this.memberType);
		sbTemp.append("] companyUrl[");
		sbTemp.append(this.companyUrl);
		sbTemp.append("] attr1[");
		sbTemp.append(this.attr1);
		sbTemp.append("] attr2[");
		sbTemp.append(this.attr2);
		sbTemp.append("] attr3[");
		sbTemp.append(this.attr3);
		sbTemp.append("] memEffDate[");
		sbTemp.append(this.memEffDate);
		sbTemp.append("] canDate[");
		sbTemp.append(this.canDate);
		sbTemp.append("] delDate[");
		sbTemp.append(this.delDate);
		sbTemp.append("] reInsDate[");
		sbTemp.append(this.reInsDate);
		sbTemp.append("] password[");
		sbTemp.append("***********");
		sbTemp.append("]");
		sbTemp.append(" oldUiiaStatus[").append(this.oldUiiaStatus).append("]");
		sbTemp.append(" secUserName[").append(this.secUserName).append("]");
		sbTemp.append(" uiiaMem[").append(this.uiiaMem).append("]");
		sbTemp.append(" iddMem[").append(this.iddMem).append("]");
		sbTemp.append(" iddStatus[").append(this.iddStatus).append("]");
		sbTemp.append(" applyUiiaMem[").append(this.applyUiiaMem).append("]");
		sbTemp.append(" loginAllwd[").append(this.loginAllwd).append("]");
		sbTemp.append(" oldSecUserName[").append(this.oldSecUserName)
				.append("]");

		return sbTemp.toString();
	}

	public String getLstUpdtDate() {
		return lstUpdtDate;
	}

	public void setLstUpdtDate(String lstUpdtDate) {
		this.lstUpdtDate = lstUpdtDate;
	}

	public String getContctName() {
		return contctName;
	}

	public void setContctName(String contctName) {
		this.contctName = contctName;
	}

	public String getOldScac() {
		return oldScac;
	}

	public void setOldScac(String oldScac) {
		this.oldScac = oldScac;
	}

	public String getIddSec() {
		return iddSec;
	}

	public void setIddSec(String iddSec) {
		this.iddSec = iddSec;
	}

	public String getDt() {
		return dt;
	}

	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getIaFax() {
		return iaFax;
	}

	public void setIaFax(String iaFax) {
		this.iaFax = iaFax;
	}

	public String getIaEmail() {
		return iaEmail;
	}

	public void setIaEmail(String iaEmail) {
		this.iaEmail = iaEmail;
	}

	public String getIddMemberType() {
		return iddMemberType;
	}

	public void setIddMemberType(String iddMemberType) {
		this.iddMemberType = iddMemberType;
	}
	
	@Override
	public int compareTo(AccountInfoBean aib) {
        return this.companyName.compareTo(aib.getCompanyName());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
