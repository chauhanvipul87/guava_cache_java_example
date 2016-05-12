package com.iana.guavacache.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class UiiaConstants
{
	public enum IA_INSURER_INDEX { A, B, C, D, E }  
	
	public static final String MOTORCARRIER = "MC";
	public static final String EQUIPMENTPROVIDER= "EP";
	public static final String INSURANCEAGENT= "IA";
	public static final String IDDUSER= "IDD";
	public static final String OTHER="OTH";
	public static final String OTHERS="OTHER";
	/*added by Ashok -- 02-Aug-06*/
	public static final String UIIA_EP="UIIAEP";
	//added by ravi
	public static final String ROLE_UIIASTAFF = "UIIA";
	public static final String ROLE_MC = "MC";
	public static final String ROLE_EP= "EP";
	public static final String ROLE_IA= "IA";
	public static final String ROLE_IDD= "IDD";
	public static final String ROLE_ADMIN= "ADMIN";
	public static final String ROLE_FIN= "FIN";
	public static final String ROLE_SUB= "SUB";
	public static final String ROLE_IDD_MC= "IDD_MC";
	public static final String ROLE_IDD_EP= "IDD_EP";
	public static final String ROLE_IDD_OTH="IDD_OTH";
	//till here
	// Role for IDD Secondary User - added by Smita Valdia
	public static final String ROLE_IDD_SEC = "IDD_SEC";
	// End - Smita Valdia
	//Role for ITR Agencies - added by Ranajit Ganguly
	public static final String ROLE_ITRAGENT = "ITRAGENT";
	//End -Jan2011
	public static final String SUBSPUSER= "SUB";
	public static final String BILLADDRESSTYPE= "BILLING";
	public static final String CONTACTADDTYPE= "CONTACT";
	public static final String DISPUTEADDRESSTYPE= "DISPUTE";
	public static final String APPRVD_STATUS="APPROVED";
	public static final String NOT_APPRVD_STATUS="NOT APPROVED";
	//Added by Ashok	
	//For specifying record type as Get
	public static final String RECGETTYPE="GET";
	//For specifying record type as Update
	public static final String RECUPDATETYPE="UPDATE";
	public static final String RECINSERTTYPE="INSERT";
	
	/*added for showing the EP template status for fetching----swati 09/06*/
	public static final String PRESENTTEMPLATE = "ACTIVE";
	public static final String PASTTEMPLATE = "PREVIOUS";
	public static final String WHATIFTEMPLATE = "FUTURE";
	//added by swati on 19/07/2006
	public static final String PENDINGTEMPLATES = "W";
	
	/*added for showing STATUS AS VALID/INVALID --ashok 09/06/06*/
	public static final String VALIDSTATUS="VALID";
	public static final String INVALIDSTATUS="INVALID";
	
	/*  added for showing various policy types --ashok 11/06/06*/
	public static final String AUTOPOLICY="AL";
	public static final String GENPOLICY="GL";
	public static final String CARGOPOLICY="CARGO";
	public static final String TRAILERPOLICY="TI";
	
	//added on 12/06/06
	public static final String CONTCARGO="CONTCARGO";
	public static final String REFTRAILER="REFTRAILER";
	public static final String WORKCOMP="WC";
	public static final String EMPLIABILITY="EL";
	public static final String EMPDISHBOND="EMPDHBOND";
	public static final String UMBRELLA="UMB";
	/*Additional Insured --ashok 26/06/2006*/
	public static final String ADDLNINSRD="ADDINS";
	public static final String ADDLNINSRD_EPSPEC="ADDINSEPSPEC";
	/* added for Y N check --ashok 11/06/06 */
	public static final String YES="Y";
	public static final String NO="N";
	/*Account Details --ashok 17/07/2006*/
	public static final String ACCTDTLS="ACCTDTLS"; /* added for U Need U Have*/
	/*added for certificate/policy status*/
	public static final String SAVED = "SAVED";
	public static final String NAMECH = "NAMECHANGE";
	public static final String SUBMITTED = "SUBMITTED";
	public static final String ACTIVE = "ACTIVE";
	public static final String PENDING = "PENDING";
	public static final String DELETED = "DELETED";
	public static final String OVERWRITTEN = "OVERWRITTEN";
	public static final String LAPSED = "EXPIRED";
	public static final String BADCERTIFICATE = "BAD";
	public static final String PASTCERTIFICATE = "PAST";
	
	public static final String PRIMARYPOLICY = "PRIMARY";
	public static final String EXCESSPOLICY = "EXCESS";
	public static final String EPSPECIFICPOLICY = "EPSPECIFIC";
	
	/* added for Zero Deductible Allowed --353630 07/09/12 */
	public static final String ZERODEDUCTIBLE = "N/A";
	
	/*UIIA member status*/
	
	public static final String ACTIVEMEMBER = "ACTIVE";
	public static final String DELETEDMEMBER = "DELETED";
	public static final String CANCELLEDMEMBER = "CANCELLED";
	public static final String PENDINGMEMBER = "PENDING";
	//added for approved name/scac changes
	public static final String APPROVEDSTATUS = "APPROVED";
	
	/* Notification Modes --ashok 23/06/2006*/
	public static final String NOTFNMAIL = "MAIL";
	public static final String NOTFNFAX = "FAX";
	public static final String NOTFNPRINT = "PRINT";
	public static final String NOTFNPRINT_NP = "NOT PRINTED";
	public static final String NOTFNPRINT_P = "PRINTED";
	public static final String NOTFNNOTHING = "--select--";
	
	/*Notification Types -- Ravi 26/6/2006*/
	public static final String NOTFN_CUSTOM_MANUAL = "MANUAL";
	public static final String NOTFN_CUSTOM_STANDARD = "STANDARD";
	public static final String NOTFN_CUSTOM_MODIFYTEMPLATE = "MODIFYTEMPLATE";
	public static final String NOTFN_SYSTEM = "SYSTEM";
	public static final String NOTFN_RUNTIME = "RUNTIME";
	public static final String NOTFN_EXCEPTION = "EXCEPTION";
	/*Notification Types -- Ends*/
	
	/* Status for Notification*/
	public static final String NOTFNPENDING = "PENDING";
	public static final String NOTFNSUCCESS = "SUCCESS";
	public static final String NOTFNFAILURE = "FAILURE";
	/* Error message key -- ronak 23/06/06 */
	public static final String NODATA = "nodata";
	
	/*Notification codes for Notification Master -- ashok 23/06/2006*/
	public static final String EPCANCELMC = "MCCANCEL";
	public static final String VIPACCTCNG = "VIPACCTCNG";
	public static final String NOTIFYBADCERTI = "BADCERTI";
	public static final String NOTIFYBADCERTITOMC = "BADCERTITOMC";
	public static final String NOTIFYBADCERTITOIA = "BADCERTITOIA";	
	public static final String MCINVLDBYIA = "MCINVLDIA";
	public static final String MCINVLDBYIATOIA = "MCINVLDIATOIA";
	public static final String IAINVLDBYMC ="IAINVLDMC";
	public static final String IAINVLDBYMCTOMC ="IAINVLDMCTOMC";
	public static final String NOTFNSNTCOUNT="1";
	public static final String NEWMCDELW="NEWMCDELW";
	public static final String NEWMCDELF="NEWMCDELF";
	public static final String EVG10DAYNOT="EVG10DAYNOT";
	public static final String EVG15DAYNOT="EVG15DAYNOT";

	
	/*UIIA Staff contact details --ashok 24/06/2006*/
	public static final String UIIAEMAIL="ravi@iana.com";
	public static final String UIIAFAX="ravi@iana.com";
	public static final String UIIAACCTNO="UIIASTAFF";
	/*Differenct Currencies --ashok 26/06/2006*/
	public static final String CURRUSD="USD";
	public static final String CURRCANADIAN="CND";
	public static final String CURRMEXICAN="MEX";
	/*Standard Endorsements for Auto Liability --ashok 26/06/2006*/
	public static final String ENDOUIIE1="UIIE-1";
	public static final String ENDOCA2317="CA23-17";
	public static final String ENDOTE2317B ="TE23-17B ";
	public static final int LIMIT=10;
	
	/*wording master related constants*/
	public static final String BLANKETWORDING = "BLANKET";
	/*Password length added by ashok 06/07/2006*/
	public static final int PASSWORDLENGTH=8;	
	
	/*added by Ashok 11/07/2006 for Uneed Uhave*/
	public static final String MCEPJOINPRBLMS="MCEPPRBLM";
	public static final String MCEP_AREQ_PRBLMS="MCEPAREQPRBLMS";
    public static final String MCEP_OTHR_PRBLSM="OTHRPRBLMS";
	public static final String ADDLNREQ="ADDTNLREQ";
	public static final String RAMP="RAMP";
	public static final String MEM_SPECIFIC_CARRIER="MEM SPC CAREER";
	public static final String CANCELLED_BY_EP="CANCELLEDBYEP";
	public static final String PEND_REQ_EP="PENDINGREQEP";
	/*added by ashok for UValid and UNeed You Have --11/07/2006*/
	public static final String UVLD_SELF_INSRD_PRBLM="SELFINSRD";
	public static final String UVLD_ADDLN_INSRD_PRBLM="ADDLNINSRD";
	public static final String UVLD_LIMITS_PRBLM="LIMITS";
	public static final String UVLD_DED_PRBLM="DEDUCTIBLES";
	public static final String UVLD_RRG_PRBLM="RRG";
	public static final String UVLD_SPL_INS_PRBLM="SPLINSRN";
	public static final String UVLD_EP_LIMITS_PRBLM="EPLIMITS";
	public static final String UVLD_BLNKT_PRBLM="BLANKET";
	public static final String UVLD_AL_STDENDO_PRBLM="ALSTDENDO";
	public static final String UVLD_AL_SCDHRD_PRBLM="ALSCHDHRD";
	public static final String UNUHINSKEY="INSDETAILS"; /* U Need You have Insurance Details*/
	public static final String UVLD_POL_TRMNTD="TERMINATED";
	public static final String UVLD_INS_KEY="INS DTLS";
	public static final String UVLD_NO_ADDLN_REQ_PRBLM="NOADDLNREQMC";
	public static final String UVLD_WC_EXEMPTION="WCEXEMP";
	//Temp Key used in Uvalid to put HashMap of problems
	public static final String TEMP_KEY_UIIEP="TMPUIIAEP";
	public static final String MC_VLDWITH_ONE_EP="MCVLDONEEP";
	public static final String MC_HAS_ALGL="MCHASALGL";
	public static final String MC_HAS_EXPAL="MCHASEXPAL";
	public static final String MC_HAS_EXPGL="MCHASEXPGL";
	public static final String MC_HAS_NOPOLICY="MCNOPOLICY";
	public static final String TEMPLATE_LIST="TEMPLATEIDS";
	public static final String EP_GEN_DTLS="EPBSCDTLS";
	
	/*added by ashok for Addtln Req LOC 29/07/2006 */
	public static final String ADDL_REQ_LOC="LOC";
	
	/*Report paths and jrxml file name */
	public static final String DATAPARAMB="B";
	public static final String DATAPARAMS="S";
	public static final String DATAPARAMP="P";
	public static final String BOOK="Book";
	public static final String SUPP="Supplement";
	public static final String PROOF="Proof";
	
	/*Added by Ashok to be used in UValid.... 04/09/2006*/
	public static final String MC_CHANGE="MCCHNG";
	public static final String EP_CHANGE="EPCHNG";
	public static final String MC_EP_CHANGE="MCEPCHNG";
	
	
	
	public static final String COUNTRY_USA="USA";
	public static final String COUNTRY_CANADA="CAN";
	public static final String COUNTRY_MEXICO="MEX";
	
	/*added for knowing what change the MC has applied for*/
	public static final String NAMESCACCHANGE = "NS";
	public static final String NAMECHANGE = "N";
	public static final String SCACCHANGE = "S";
	
	/*added by Ronak 20/07/2006 for ajax options (cases)*/
	public static final int AJAXZIP=1;
	public static final int AJAXNAIC=2;
	
	/*Special case: NOT A CONSTANT*/
	public static Properties APP_PROPERTIES=null;
	public static Properties VERISIGN_PROPERTIES=null;//31/8---swati---for payment gateway
	public static Properties ROLE_ACCESS_PROPERTIES=null; //14/10 -- Harish -- for role access
	
	//warning message to be shown to the user in case of saving a new acord certificate or a saved certificate
	public static String WARNINGMSG = "You need to re-instate the existing terminated policy with policy number ";
	public static String REASONS =  "The following items are pending for verification or found to be Not OK:";
//	Added by piyush
	public static final String ALL="ALL";
	public static final String TEMP="TEMP";
	public static final String PERM="PERMANENT";
	public static final String P3 = "P3";
	public static final String P4 = "P4";
	public static final String OPEN = "OPEN";
	public static final String CLOSED = "CLOSED";
	public static final String WRITTEN = "WRITTEN-OFF";
	public static final String REDUCED="REDUCED";
	public static final String INCREASED="INCREASED";
	public static final String REVERSAL="REVERSAL";
	public static final String TEMP_INV_FLAG="T";
	public static final String PERM_INV_FLAG="P";
	public static final String INVOICE_ADJUST="19";
	public static final String CHECK="CHEQUE";
	public static final String ONLINE="ONLINE";
	public static final String STATUTORY="STATUTORY";
	public static final String uiiaTemplate="UIIA";
	public static final String ianaTemplate="IANA";
	public static final String START_TIME="00:00:00";
	public static final String END_TIME="23:59:59";
	//---End Piyush --------------
	
	//added for the key in the hashmap corresponding to the EP list
	public static final String EPLST = "EPLST";
	
	//added for MC status calculation and verification purposes
	public static final String CHK_ITEM_NOINS = "P5";
	public static final String CHK_ITEM_INSUFFINS = "P6";
	public static final String CHK_ITEM_NOVALIDEP = "P7";
	public static final String MANUAL_CANC_CODES = "C1,C2,C3,C4,C9,C10,C11,C12";
	public static final String CANC_CODE_NOSTDENDO = "C6";
	public static final String CANC_CODE_INSUFFINS_NOALSCHD = "C8";
	//added by ravi. 31 May 2007. Add below constant to create two diff cancellation codes for
	//C7 letter. This is used in calculateMCStatus method and in notificationSender class' notifyOnStatusChange method.
	//this was done to send notification on termination of any of AL and/or GL. Previosly notification was sent 
	//only for either AL or GL.
	public static final String CANC_CODE_TERMINATED_GL = "C7_GL";
	public static final String CANC_CODE_TERMINATED = "C7";
	public static final String CANC_CODE_EXPIRED = "C5";
	public static final String CANC_CODE_NOPAYMENT = "C1";
	public static final String CANC_CODE_REQUEST = "C2";
	public static final String CANC_CODE_OUTOFBUSINESS = "C3";
	public static final String CANC_CODE_MAILBOUNCE = "C4";
	public static final String CANC_CODE_SCAC_CANC = "C9";
	public static final String CANC_CODE_NOFAX = "C10";
	public static final String CANC_CODE_NOPREAMBLE = "C11";
	public static final String CANC_CODE_USDOTREVOKED = "C12";
	/*public static final String CANC_CODE_NOVALIDEMAIL = "C13";*/
	
	//billing type
	public static final String ANNUAL_BILLING_TYPE = "ANNUALLY";
	//swati for EP billing type
	public static final String MONTHLY_BILLING_TYPE = "MONTHLY";
	public static final String QUARTERLY_BILLING_TYPE = "QUARTERLY";
	public static final String SEMIANNUAL_BILLING_TYPE = "SEMIANNUALLY";
	
	public static final String SUCCESS = "SUCCESS";
	public static final String FAILURE = "FAILURE";
	public static final String ERROR = "ERROR";
	public static final String STATUSBEAN = "statusBean";
	
	//
	public static final String SEVEN_DAY_NOTIF = "INS07";
	public static final String THIRTY_DAY_NOTIF = "INS030";
	public static final String MC_SIXTYDAY_EXP = "DELOTHW";
	public static final String IA_ACTIVATION = "IAREGISTER";
	public static final String MC_NINETYFIVEDAY_EXP = "DELOTHER";
	public static final String MC_23DAYNOTVERIFY_WARN = "NUIIA-ORIGW";
	public static final String MC_30DAYNOTVERIFY_CANCEL = "NUIIA-ORIG";
	public static final String MC_NOFAX = "NOFAX";
	public static final String MC_NOPREAMBLE = "NUIIA-ORIG";
	public static final String MC_NOSCAC = "C9NOSCAC";
	public static final String PENDING_NS_CHG = "PENDNM-SCACCHG";
	public static final String PENDSCACCHG = "PENDSCACCHG";
	public static final String APPROVED_NM_CHG = "NMCHGCOMPLETE";
	public static final String APPROVED_SCAC_CHG = "SCACCHGCOMPLETE";
	public static final String APPROVED_NS_CHG = "NMSCACCHGCOMPLETE";
	public static final String MC_NOFEE60DAY_WARN = "NOFEE60";
	public static final String MC_UIIA_CAN30 = "MCUIIACAN30";  //Added By Vipul Chauhan -used to fetch record from notification master 
	public static final String MC_NOFEE30DAY_WARN = "NOFEE30";
	public static final String MC_NOFEE75DAY_WARN = "NOFEE75";
	public static final String MC_NOFEE95DAY_WARN = "NOFEE95";
	public static final String MC_CHG_PW = "MCCHGPW";
	public static final String MC_IA_PW = "MCIAPW";
	public static final String INV_DETAILS ="NOFEE30"; //Enh 39
	public static final String MC_INV_DETAILS ="MCINVRENEWALS"; //Enh 39
	public static final String EP_INV_DETAILS ="EPINVRENEWALS"; //Enh 39
	public static final String SUB_INV_DETAILS ="SUBINVRENEWALS"; //Enh 39
	
	//added by ashok
	public static final String NOTFN_EXPN="NOTFN EXCEPTION";
	//added by ravi
	public static final String NO_EMAIL = "NOEMAIL";
	public static final String NO_FAX = "NOFAX";
	
	//constants for return hashmap keys of calculateMCstatus
	public static final String OLDSTATUS = "OLDSTATUS";
	public static final String NEWSTATUS = "NEWSTATUS";
	public static final String OLDSTATUSCD = "OLDSTATUSCD";
	public static final String NEWSTATUSCD = "NEWSTATUSCD";
	
	//constants for notifications
	public static final String UIIAACCEPT = "UIIAACCEPT";
	public static final String C5ALGLEXP = "C5ALGLEXP";
	public static final String C8SCHED = "C8SCHED";
	public static final String C8LIMITS = "C8LIMITS";
	public static final String C8LIMITSCAN = "C8LIMITSCAN";
	public static final String C7ALGLCAN = "C7ALGLCAN";
	public static final String C6STDEND = "C6STDEND";
	public static final String REINS = "REINS";
	public static final String ALSELF = "ALSELF";
	public static final String GLSELF = "GLSELF";
	public static final String CRSELF = "CRSELF";
	public static final String TISELF = "TISELF";
	public static final String WCELSELF = "WCELSELF";
	public static final String MCDELETE = "MCDELETE";
	public static final String FORGOTPWD = "FORGOTPWD";
	public static final String FORGOTPWDIDDSEC = "FORGOTPWDIDDSEC";
	public static final String MCCHGIAPWD = "MCCHGIAPWD";
	
	public static final String NOTFN_TEMP_TYPE_MANUAL = "MANUAL";
	public static final String NOTFN_TEMP_TYPE_SYSTEM = "SYSTEM";
	public static final String DOC_TYPE_DOWNLOAD = "DOWNLOAD";

	public static final String FAXBACK = "FAXBACKREQ";
	public static final String MCWEBUPDT = "MCWEBUPDT";
	
	public static final String FAILEDNOTIF = "FAILEDNOTIF";
	public static final String NOTIFFAILTOSTAFF = "NOTIFFAILTOSTAFF";
	
	// Start :: Notification Template/ Batch Process Name for IDD - Smita Lohia
	public static final String NOTFN_TEMP_IDD_STATISTICS = "IDD_STATISTICS";
	public static final String BATCH_PROCESS_IDD_STATISTICS = "IDD_STATISTICS";
	public static final int IDD_NO_ACTIVITY_LIMIT = 30;
	public static final String NOTFN_NO_ACTIVITY_MC = "IDD_NOACTIVITY_MC";
	public static final String NOTFN_NO_ACTIVITY_ADMIN = "IDD_NOACTIVITY_ADMIN";
	public static final String BATCH_PROCESS_IDD_NO_ACTIVITY = "IDD_NO_ACTIVITY";
	// End :: Notification Template for IDD - Smita Lohia
	
	// SUSEC:
	
	public static final String ROLE_SUB_SEC ="SU_SEC";
	public static final String HTML_QUERY ="HTML";
	public static final String XML_QUERY ="XML";
	public static final int WEB_QUERY_DRIVER_LIMIT =10;

	// END
	//swati---21/9
	public static final String SELECTED_APPROVED = "Selected Approved";
	public static final String NSELECTED_APPROVED = "Not Selected Approved";
	public static final String SELECTED_PENDING = "Selected Pending";
	public static final String NSELECTED_PENDING = "Not Selected Pending";
	
	//for payment received case
	public static final String PAYMENT_RCVD = "PAYMENT_RCVD";
	
	//notification template codes for latest templates sent by client
	public static final String NEW_MC_REG = "NEWMCREG";
	public static final String NEW_EP_REG = "NEWEPREG";
	public static final String NEW_MC_VERIFY = "NEWMCUIIA";
	public static final String NEW_IA_VERIFY = "NEWIAUIIA";
	public static final String NEW_IDD_REG = "NEWIDDREG";
	public static final String C2CANC = "MCCAN";
	public static final String C3CANC = "MCBUS";
	public static final String C4CANC = "MCMAILRTD";
	/*public static final String C13CANC = "NOVALIDEMAIL";*/
	public static final String C12CANC = "USDOTREVOKED";
	public static final String C12CANCWAR = "USDOTREVOKEDWAR";
	public static final String NAME_SCAC_CHG_UIIA = "NSCHGUIIA";
	
	public static final String POLICY_SORT_ORDER = "GL,AL,CARGO,TI,WC,EL,UMB,REFTRAILER,CONTCARGO,EMPDHBOND";
	
	// Custom messages for IDD to be set in status bean
	public static final String DATA_SUCCESS = "Data saved successfully.";
	public static final String OTHER_DATA_SUCCESS = "Other data saved successfully.";
	public static final String DISPATCH_OFFICE_DELETE = " cannot be deleted as it is being referenced for driver details.";
	public static final String SEC_USERNAME_DUPLICATE = "Duplicate Secondary Username found for ";
	
	public static final String SCAC_OK="SCAC OK";
	public static final String TAX_ID_OK="TAX ID OK";
	
	//Demographic Regions
	public static final String NORTH_ATLANTIC = "North Atlantic";
	public static final String SOUTH_ATLANTIC = "South Atlantic";
	public static final String GULF = "Gulf";
	public static final String CENTRAL = "Central";
	public static final String PACIFIC_NORTHWEST = "Pacific Northwest";
	public static final String PACIFIC_SOUTHWEST = "Pacific Southwest";
	public static final String OTHER_CANADIAN = "Other Canadian";
	public static final String MEXICO = "Mexico";
	
	// Driver Terminated status
	public static final String DRIVER_TERMINATED_STATUS = "Terminated";
	public static final String DRIVER_DELETED_STATUS = "Deleted";
	public static final String DRIVER_ACTIVE_STATUS = "Active";

//	batchjob status
	public static final String DISABLED = "DISABLED";
	public static final String ENABLED = "ENABLED";
	
	//changes for uat---19/10
	public static final String RTLSELF = "RTLSELF";
	public static final String CCSELF = "CCSELF";
	
	//swati---20/10
	public static final String AL = "Auto Liability";
	public static final String GL = "General Liability";
	public static final String CL = "Cargo";
	public static final String CC = "Contingent Cargo";
	public static final String TL = "Trailer Interchange";
	public static final String RTL = "Refrigerated Trailer Liability";
	public static final String WC = "Worker's Compensation";
	public static final String EL = "Employer's Liability";
	public static final String EMPDISH = "Employer's Dishonesty Bond";
	public static final String UMB = "Umbrella";
	
	public static final String reportXlsExt = ".xls";
	
	public static final String RRG_NOTFN = "RRG";
	public static final String TRANSID = "PNREF";
	public static final String AUTHCODE = "AUTHCODE";
	public static final String CERT_TYPE_PRIEXC = "PRIEXC";
	public static final String CERT_TYPE_EPSPEC = "EPSPEC";
	
	//Swati----30/11---RRG template EP list
	public static final String NORRG_ALLPOL_EPLST = "NORRGALLPOL";
	public static final String NORRG_AUTOPOL_EPLST = "NORRGAUTOPOL";
	
	//Shubham ----7/12
	
	public static final String UIIA_OFFICE_AGENT = "Uiia Office Agent";
	//Added by Piyush 7/12/2006----------------
	public static final String ADDNL_REQ_SMCHKLST = "ADDNREQSCHKLST";
	
	//swati----16/02---for new notifications related to termination of policies other than AL/GL
	public static final String FUTURETERM = "TERMPEND";
	public static final String CURRENTTERM = "TERMOTHR";
	
	public static final String UVLD_CARGO_HAULSOWN = "HAULSOWN";//swati---22/02----Cargo Hauls Own
	
	//28/2---New Name/SCAC change strategy
	public static final String NSCHGLIST = "NSCHGLIST";
	public static final String UIIAVERFITEMS = "UIIAVERFITEMS";
	public static final String ADDENDAVERFITEMS = "ADDENDAVERFITEMS";
	public static final String PENDINGINSITEMS = "PENDINGINSITEMS";
	public static final String MCBASICDTLS = "MCBASICDTLS";
	public static final String INSRECVD = "INSRECVD";
	
	public static final String CUSTOMFEED_NOTIF = "CUSTOMFEED_NOTIF";
	public static final String FAX_COVER = "FAXCOVER";
	
	public static final String UVLD_POLICY_EXPIRED = "POLICYEXPIRED";
	
	public static final String NOTFN_LETTERHEAD_UIIA = "UIIA";
	public static final String NOTFN_LETTERHEAD_IANA = "IANA";
	public static final String NOTFN_LETTERHEAD_IDD = "IDD";
	
	public static final String EMAIL_COVER = "EMAILCOVER";
	public static final String NO_COMPANY = "NOCOMPANY";
	public static final String NO_CNTCT_PERSON = "NOCONTACTPERSON";

	public static final String ALINST ="alinst.pdf";
	public static final String GLINST ="glinst.pdf";
	public static final String CARGOINST ="crinst.pdf";
	public static final String WCELINST ="wcelinst.pdf";
	public static final String TIINST ="tiinst.pdf";
	
	public static final String WCUNEEDUHAVE ="WCUNEEDUHAVE";
	
	public static final String ALL_INCL_DEL = "All including deleted";
	public static final String DEL_FILE_DAYS = "1";
	public static final String SELF_INSURED = "SELF INSURED";
	
	public static final String UNBAN = "UNBAN";
	public static final String BAN = "BAN";
	public static final String MC_COPY_DEL = "NEWMCDEL";
	@SuppressWarnings("rawtypes")
	public static ArrayList CURR_ARRAY = new ArrayList(3);
	public static final String TIFEED ="TF";
	public static final String TFS ="TFS-DLS";
	public static final String BNDIDD ="IDD";
	public static final String NOTIFY_MC_ADDENDUM = "MCONLINEADDN";
	public static final String NOTIFY_STAFF_ADDENDUM = "STAFFONLINEADDN";
	public static final String NOTIFY_IA= "SVDCERTNOTIFICATION";//Added By Ankur March 2009
	public static final String NOTIFY_MC = "IDDLICEXPIRY"; // Added by Anirban May 2009
	public static final String NOTIFY_MC_IDDLICEXP = "IDDLICEXPIRYONEYEAR"; // Added by Basith FEB 2011
	public static final String NOTIFY_MC_IDDLICEXPPURGE = "IDDLICEXPPURGE"; // Added by Basith FEB 2011
	public static final String NOTIFY_MC_IDDNAMECHECK = "IDDNAMECHECK"; // Added by Basith FEB 2011
	public static final String ONLINE_CREDITAPP_EPS ="EP065585,UP,EP093573,NSCU,EP200003,CSXU,EP071443,IC,EP069813,CXXX,EP200013,KCS";
	public static final String ONLINE_ADD_EPS ="EP065585,UP,EP106554,TIPL,EP093573,NSCU,EP158474,EGLV,EP200003,CSXU,EP071443,IC,EP053653,BNAU,EP069813,CXXX,EP200013,KCS";

	// DTR Registration
	
	public static final int TRUCK_MODEL_YR_START = 1970;
	public static final int TRUCK_MODEL_YR_END = 2025;
	public static final int ENGINE_MODEL_YR_START = 1970;
	public static final int ENGINE_MODEL_YR_END = 2025;
	public static final String FUEL_TYPE="58";
	
	// DTR BATCH JOB STATUS
	
	public static final String DTRPENDING = "PENDING";
	public static final String DTRSENT = "SENT";
	public static final String DTRAPPROVED = "APPROVED";
	public static final String DTRNONCOMPLIANT = "Non Compliant";
	public static final String DTRREGISTERED = "Registered";
	public static final String DTRCOMPLIANT = "Compliant";
	public static final String DTREXEMPT = "Exempt";
	public static final String FILESEPERATOR = System.getProperty("file.separator");
	public static final String NEWLINE = System.getProperty("line.separator");

	public static final String OWNER = "0";
	public static final String GROUP = "607";
	//prarit added for mc name change pending indicator
	public static final String NAMEPENDING = "Pending";
	public static final String NAMEPENDINGCOL = "Pending New Name";
	/*added by Basith for notfn_cut_offID */
	public static final int notfn_cut_offID=1103444;
    // for PWSS by Ranajit 
	public static final int PWSS_LIMIT=2;
	public static final String PWSS_NOFILE="NoFile.pdf";
	public static final String PWSS_NOFILE_ID="00";
	//for web query direct access
	public static final int WEB_QUERY_DIRECT_ACCESS_LIMIT=500;	
	//for EP Annual Invoice Breakdown
	public static final String DATECHECK="2012-06-06";
	
	public static final String NOT_FOUND = "NOT FOUND";
	
	public static final String EMPTY = "";
	
	public static final String SPACE = " ";
	
	public static final String PASSWORD_MASK = "^[0-9a-zA-Z]+[0-9a-zA-Z_]*$";
	
	public static final String AMOUNT_MASK = "^[0-9]*[.]?[0-9]*$";
	
	public static final String DATE_PATTERN = "^(1[0-2]|0?[1-9])/(3[01]|[12][0-9]|0?[1-9])/(?:[0-9]{2})?[0-9]{2}$";
	
	public static final String PHONE_PATTERN = "^\\(?(\\d{3})\\)?(\\d{3})[-]?(\\d{4})|([ ]?Ext[:]?[ ](\\d{5}))$";
	
	public static final String FAX_PATTERN = "^\\(?(\\d{3})\\)?(\\d{3})[-]?(\\d{4})$";
	
	public static final String ALPHABET_PATTERN = "^[A-Za-z]*$";
	
	public static final String UPPER_ALPHABET_PATTERN = "^[A-Z]*$";
	
	public static final String ALPHABET_NUMERIC_PATTERN = "^[0-9a-zA-Z]*$";
	
	public static final String FTP_HOST_PATTERN = "^[0-9.]*$";
	
	public static final String USERNAME_PATTERN = "^[0-9a-zA-Z]+[0-9a-zA-Z_]*$";
	
	public static final String ZIP_CODE_PATTERN = "^[0-9a-zA-Z\\- ]*$";
	
	public static final String NAME_PATTERN = "^[0-9A-Za-z&amp;'&quot;(:)\\/,.\\- ]*$";
	
	public static final String ALPHABET_WITH_SPACE_PATTERN = "^[A-Za-z]+[A-Za-z ]*$";
	
	public static final String CITY_PATTERN = "^[0-9A-Za-z&amp;\\-.,' ]*$";
	
	public static final String TITLE_PATTERN = "^[a-zA-Z\\-.' ]+$";
	
	public static final String MIDDLE_NAME_PATTERN = "^[0-9A-Za-z&amp;'&quot;(:)\\/,.\\- ]*$";
	
	public static final String NUMERIC_PATTERN = "^[0-9]*$";
	
	public static final String ALPHA_NUMERIC_WITH_NO_PATTERN = "^[0-9-()a-zA-Z ]*$";

	public static final String IA_LIC_EXP_30DAYS_NTFN = "IA_LIC_EXP_30DAYS_NTFN";
	
	public static final String IA_LIC_CANCEL_NTFN = "IA_LIC_CANCEL_NTFN";

	public static final int MYSQL_DUPLICATE_UK = 1062;
	
	public static String EXCEPTION_EMAIL_TO 	= "itsupport@ianaoffshore.com";
	public static String EXCEPTION_EMAIL_FROM 	= "alerts@uiia.org";
	public static String EXCEPTION_EMAIL_TITLE	= "UIIA - Error Notif";
// table name
	
	public static final String  TBL_POLICY_MASTER			= "policy_master";
	public static final String  TBL_POLICY_DETAILS			= "policy_details";
	public static final String  TBL_POLICY_SPECIFIC_EPLIST	= "policy_specific_eplist";
	public static final String  TBL_UMBRELLA_POLICY_MPG		= "umbrella_policy_mpg";
	
	public static final String  TRUE		= "true";
	public static final String  FALSE		= "false";
	
	public static final String  TERMINATE	= "terminate";
	public static final String  REINSTATE	= "reinstate";
	
	public static final String  EXIST					 = "exist";
	public static final String COPY_ACTIVE_POLICY        = "copyActivePolicy";
	public static final String SHOW_CERTI_NO_VIEW_ACORD  = "showCertiNoViewAcord";
	
	public static final String YES_Camel_Case="Yes";
	public static final String NO_Camel_Case="No";
	
	public static final String SELECTED_FLG ="selectedFlg";
	public static final String ADDLN_INS_REQD="addtlnInsReqd";
	public static final String POLICY_KEY= "policyKey";
	public static final String EDIT_CERTI= "EditCerti";
	public static final String ADD_NEW_POLICY= "AddNewPolicy";
	public static final String EP_ACC_NO = "EP_ACC_NO";
	public static final String CHECKED = "checked";
	
	public static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public static final Map<String, String> POLICY_SELECTION_MAP = new HashMap<String, String>(){
		/**
		 * 
		 */
		private static final long serialVersionUID = -4446357704220839260L;

		{
		 	put("1", "Auto");
		 	put("2", "General");
		 	put("3", "Cargo");
		 	put("4", "Contingent Cargo");
		 	put("5", "Trailer Interchange");
		 	put("6", "Ref. Trailer");
		 	put("7", "Work Comp");
		 	put("8", "Employers Liability");
		 	put("9", "Employee Dishonesty");
		 	put("10", "Umbrella");
		 }
   };

   public static final String MC_ACC_NO = "mcAccNo";
   public static final String MC_COMP_NAME = "mcCompName";
   public static final String MC_COMP_SCAC = "mcCompScac";

   public static final String IDD_SCAC_PATTERN = "[0-9]{9}|[a-zA-Z]{4}";
}
