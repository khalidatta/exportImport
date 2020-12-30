package com.exportImport.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity

public class Import {
	
	@Id
	@GeneratedValue
	private long id;
	private String MLTCD;
	private String SB;
	private String Imp_date;
;
	private String PCT;
	private String DESCRIPTION;
	private long CODE;
	private String COUNTRY;
	private long NTN;
	private String EXPORTER;
	private String EXPORTER_ADDRESS ;
	private String  IMPORTER_NAM ;
	private String  IMPORTER_ADDRESS  ;
	private String Gross_Wt;
	private String Net_Wt;
	private String QTY;
	private String UNIT;
	private String UNIT_PRICE;
	private long CURR_CODE;
	private String FOB_Value;
	private long FOB_Cur;
	private String VALUE__FC_;
	private String VALUE__PKR_;
	private long AGNT_NO;
	private String AGNT_NAM;
	
	public Import(long id, String mLTCD, String sB, String imp_date, String pCT, String dESCRIPTION, long cODE,
			String cOUNTRY, long nTN, String eXPORTER, String eXPORTER_ADDRESS, String iMPORTER_NAM,
			String iMPORTER_ADDRESS, String gross_Wt, String net_Wt, String qTY, String uNIT, String uNIT_PRICE,
			long cURR_CODE, String fOB_Value, long fOB_Cur, String vALUE__FC_, String vALUE__PKR_, long aGNT_NO,
			String aGNT_NAM) {
		super();
		this.id = id;
		MLTCD = mLTCD;
		SB = sB;
		Imp_date = imp_date;
		PCT = pCT;
		DESCRIPTION = dESCRIPTION;
		CODE = cODE;
		COUNTRY = cOUNTRY;
		NTN = nTN;
		EXPORTER = eXPORTER;
		EXPORTER_ADDRESS = eXPORTER_ADDRESS;
		IMPORTER_NAM = iMPORTER_NAM;
		IMPORTER_ADDRESS = iMPORTER_ADDRESS;
		Gross_Wt = gross_Wt;
		Net_Wt = net_Wt;
		QTY = qTY;
		UNIT = uNIT;
		UNIT_PRICE = uNIT_PRICE;
		CURR_CODE = cURR_CODE;
		FOB_Value = fOB_Value;
		FOB_Cur = fOB_Cur;
		VALUE__FC_ = vALUE__FC_;
		VALUE__PKR_ = vALUE__PKR_;
		AGNT_NO = aGNT_NO;
		AGNT_NAM = aGNT_NAM;
	}

	public Import() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMLTCD() {
		return MLTCD;
	}

	public void setMLTCD(String mLTCD) {
		MLTCD = mLTCD;
	}

	public String getSB() {
		return SB;
	}

	public void setSB(String sB) {
		SB = sB;
	}

	public String getImp_date() {
		return Imp_date ;
	}

	public void setImp_date(String imp_date) {
		Imp_date = imp_date
;
	}

	public String getPCT() {
		return PCT;
	}

	public void setPCT(String pCT) {
		PCT = pCT;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public long getCODE() {
		return CODE;
	}

	public void setCODE(long cODE) {
		CODE = cODE;
	}

	public String getCOUNTRY() {
		return COUNTRY;
	}

	public void setCOUNTRY(String cOUNTRY) {
		COUNTRY = cOUNTRY;
	}

	public long getNTN() {
		return NTN;
	}

	public void setNTN(long nTN) {
		NTN = nTN;
	}

	public String getEXPORTER() {
		return EXPORTER;
	}

	public void setEXPORTER(String eXPORTER) {
		EXPORTER = eXPORTER;
	}

	public String getEXPORTER_ADDRESS() {
		return EXPORTER_ADDRESS;
	}

	public void setEXPORTER_ADDRESS(String eXPORTER_ADDRESS) {
		EXPORTER_ADDRESS = eXPORTER_ADDRESS;
	}

	public String getIMPORTER_NAM() {
		return IMPORTER_NAM;
	}

	public void setIMPORTER_NAM(String iMPORTER_NAM) {
		IMPORTER_NAM = iMPORTER_NAM;
	}

	public String getIMPORTER_ADDRESS() {
		return IMPORTER_ADDRESS;
	}

	public void setIMPORTER_ADDRESS(String iMPORTER_ADDRESS) {
		IMPORTER_ADDRESS = iMPORTER_ADDRESS;
	}

	public String getGross_Wt() {
		return Gross_Wt;
	}

	public void setGross_Wt(String gross_Wt) {
		Gross_Wt = gross_Wt;
	}

	public String getNet_Wt() {
		return Net_Wt;
	}

	public void setNet_Wt(String net_Wt) {
		Net_Wt = net_Wt;
	}

	public String getQTY() {
		return QTY;
	}

	public void setQTY(String qTY) {
		QTY = qTY;
	}

	public String getUNIT() {
		return UNIT;
	}

	public void setUNIT(String uNIT) {
		UNIT = uNIT;
	}

	public String getUNIT_PRICE() {
		return UNIT_PRICE;
	}

	public void setUNIT_PRICE(String uNIT_PRICE) {
		UNIT_PRICE = uNIT_PRICE;
	}

	public long getCURR_CODE() {
		return CURR_CODE;
	}

	public void setCURR_CODE(long cURR_CODE) {
		CURR_CODE = cURR_CODE;
	}

	public String getFOB_Value() {
		return FOB_Value;
	}

	public void setFOB_Value(String fOB_Value) {
		FOB_Value = fOB_Value;
	}

	public long getFOB_Cur() {
		return FOB_Cur;
	}

	public void setFOB_Cur(long fOB_Cur) {
		FOB_Cur = fOB_Cur;
	}

	public String getVALUE__FC_() {
		return VALUE__FC_;
	}

	public void setVALUE__FC_(String vALUE__FC_) {
		VALUE__FC_ = vALUE__FC_;
	}

	public String getVALUE__PKR_() {
		return VALUE__PKR_;
	}

	public void setVALUE__PKR_(String vALUE__PKR_) {
		VALUE__PKR_ = vALUE__PKR_;
	}

	public long getAGNT_NO() {
		return AGNT_NO;
	}

	public void setAGNT_NO(long aGNT_NO) {
		AGNT_NO = aGNT_NO;
	}

	public String getAGNT_NAM() {
		return AGNT_NAM;
	}

	public void setAGNT_NAM(String aGNT_NAM) {
		AGNT_NAM = aGNT_NAM;
	}

	@Override
	public String toString() {
		return "Import [Id=" + id + ", MLTCD=" + MLTCD + ", SB=" + SB + ", Imp_date=" + Imp_date + ", PCT=" + PCT
				+ ", DESCRIPTION=" + DESCRIPTION + ", CODE=" + CODE + ", COUNTRY=" + COUNTRY + ", NTN=" + NTN
				+ ", EXPORTER=" + EXPORTER + ", EXPORTER_ADDRESS=" + EXPORTER_ADDRESS + ", IMPORTER_NAM=" + IMPORTER_NAM
				+ ", IMPORTER_ADDRESS=" + IMPORTER_ADDRESS + ", Gross_Wt=" + Gross_Wt + ", Net_Wt=" + Net_Wt + ", QTY="
				+ QTY + ", UNIT=" + UNIT + ", UNIT_PRICE=" + UNIT_PRICE + ", CURR_CODE=" + CURR_CODE + ", FOB_Value="
				+ FOB_Value + ", FOB_Cur=" + FOB_Cur + ", VALUE__FC_=" + VALUE__FC_ + ", VALUE__PKR_=" + VALUE__PKR_
				+ ", AGNT_NO=" + AGNT_NO + ", AGNT_NAM=" + AGNT_NAM + ", getId()=" + getId() + ", getMLTCD()="
				+ getMLTCD() + ", getSB()=" + getSB() + ", getImp_date()=" + getImp_date() + ", getPCT()=" + getPCT()
				+ ", getDESCRIPTION()=" + getDESCRIPTION() + ", getCODE()=" + getCODE() + ", getCOUNTRY()="
				+ getCOUNTRY() + ", getNTN()=" + getNTN() + ", getEXPORTER()=" + getEXPORTER()
				+ ", getEXPORTER_ADDRESS()=" + getEXPORTER_ADDRESS() + ", getIMPORTER_NAM()=" + getIMPORTER_NAM()
				+ ", getIMPORTER_ADDRESS()=" + getIMPORTER_ADDRESS() + ", getGross_Wt()=" + getGross_Wt()
				+ ", getNet_Wt()=" + getNet_Wt() + ", getQTY()=" + getQTY() + ", getUNIT()=" + getUNIT()
				+ ", getUNIT_PRICE()=" + getUNIT_PRICE() + ", getCURR_CODE()=" + getCURR_CODE() + ", getFOB_Value()="
				+ getFOB_Value() + ", getFOB_Cur()=" + getFOB_Cur() + ", getVALUE__FC_()=" + getVALUE__FC_()
				+ ", getVALUE__PKR_()=" + getVALUE__PKR_() + ", getAGNT_NO()=" + getAGNT_NO() + ", getAGNT_NAM()="
				+ getAGNT_NAM() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
