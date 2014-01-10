package com.digitizedcurrencynow.shared.simulator;

import java.io.Serializable;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Institution implements Serializable{
	
	/**
	 * Institution 
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long institutionId;
	
	@Persistent
	private String instType;
	
	@Persistent
	private String instName1;
	
	@Persistent
	private String instName2;
	
	@Persistent
	private String instFiscalYear;
	
	@Persistent
	private String instPrimeLang;
	
	@Persistent
	private String instEffectiveFromDate;
	
	@Persistent
	private String instEffectiveToDate;
	
	@Persistent
	private String instCurrentFlag;
	
	public Institution() {
		super();
	}
	
	
	
	

	public Long getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(Long institutionId) {
		this.institutionId = institutionId;
	}

	public String getInstType() {
		return instType;
	}

	public void setInstType(String instType) {
		this.instType = instType;
	}

	public String getInstName1() {
		return instName1;
	}

	public void setInstName1(String instName1) {
		this.instName1 = instName1;
	}

	public String getInstName2() {
		return instName2;
	}

	public void setInstName2(String instName2) {
		this.instName2 = instName2;
	}

	public String getInstFiscalYear() {
		return instFiscalYear;
	}

	public void setInstFiscalYear(String instFiscalYear) {
		this.instFiscalYear = instFiscalYear;
	}

	public String getInstPrimeLang() {
		return instPrimeLang;
	}

	public void setInstPrimeLang(String instPrimeLang) {
		this.instPrimeLang = instPrimeLang;
	}

	public String getInstEffectiveFromDate() {
		return instEffectiveFromDate;
	}

	public void setInstEffectiveFromDate(String instEffectiveFromDate) {
		this.instEffectiveFromDate = instEffectiveFromDate;
	}

	public String getInstEffectiveToDate() {
		return instEffectiveToDate;
	}

	public void setInstEffectiveToDate(String instEffectiveToDate) {
		this.instEffectiveToDate = instEffectiveToDate;
	}

	public String getInstCurrentFlag() {
		return instCurrentFlag;
	}

	public void setInstCurrentFlag(String instCurrentFlag) {
		this.instCurrentFlag = instCurrentFlag;
	}
	
	
	
	

}
