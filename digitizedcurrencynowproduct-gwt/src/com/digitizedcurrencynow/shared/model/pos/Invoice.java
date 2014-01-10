package com.digitizedcurrencynow.shared.model.pos;

import java.io.Serializable;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


/**
 * Invoice for the POS system for   
 */

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Invoice implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long invoiceId;
	
	@Persistent
	private String invoiceShort;
	
	@Persistent
	private String invoiceDetails;
	
	@Persistent
	private String invoiceFromDate;
	
	@Persistent
	private String invoiceToDate;
	
	@Persistent
	private String invoiceCurrentFlag;
	
	
	
	@Persistent
	private String invocieInstituationId;
	
	@Persistent
	private String invocieEntityId;
	
	@Persistent
	private String userId;
	
	
	public Invoice() {
		super();
	}


	public Long getInvoiceId() {
		return invoiceId;
	}


	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}


	public String getInvoiceShort() {
		return invoiceShort;
	}


	public void setInvoiceShort(String invoiceShort) {
		this.invoiceShort = invoiceShort;
	}


	public String getInvoiceDetails() {
		return invoiceDetails;
	}


	public void setInvoiceDetails(String invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}


	public String getInvoiceFromDate() {
		return invoiceFromDate;
	}


	public void setInvoiceFromDate(String invoiceFromDate) {
		this.invoiceFromDate = invoiceFromDate;
	}


	public String getInvoiceToDate() {
		return invoiceToDate;
	}


	public void setInvoiceToDate(String invoiceToDate) {
		this.invoiceToDate = invoiceToDate;
	}


	public String getInvoiceCurrentFlag() {
		return invoiceCurrentFlag;
	}


	public void setInvoiceCurrentFlag(String invoiceCurrentFlag) {
		this.invoiceCurrentFlag = invoiceCurrentFlag;
	}


	public String getInvocieInstituationId() {
		return invocieInstituationId;
	}


	public void setInvocieInstituationId(String invocieInstituationId) {
		this.invocieInstituationId = invocieInstituationId;
	}


	public String getInvocieEntityId() {
		return invocieEntityId;
	}


	public void setInvocieEntityId(String invocieEntityId) {
		this.invocieEntityId = invocieEntityId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", invoiceShort=" + invoiceShort + ", invoiceDetails=" + invoiceDetails
				+ ", invoiceFromDate=" + invoiceFromDate + ", invoiceToDate=" + invoiceToDate + ", invoiceCurrentFlag=" + invoiceCurrentFlag
				+ ", invocieInstituationId=" + invocieInstituationId + ", invocieEntityId=" + invocieEntityId + ", userId=" + userId
				+ "]";
	}
	

}
