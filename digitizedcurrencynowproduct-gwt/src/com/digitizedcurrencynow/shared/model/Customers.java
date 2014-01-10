package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Customers implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long customerId;
	
	@Persistent
	private String customerUserName;
	
	@Persistent
	private String customerEmail;
	
	@Persistent
	private String customerName;
	
	@Persistent
	private String customerMobile;
	

	
	@Persistent
	private String customerVarifyId1; //DN
	
	@Persistent
	private String customerVarifyId2; //DN
	
	@Persistent
	private String customerVarifyId3; //DN
	
	@Persistent
	private String customerIsConfirmed;
	
	@Persistent
	private String customerConfirmationKey;
	
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	
	public Customers() {
		super();
	}


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerUserName() {
		return customerUserName;
	}


	public void setCustomerUserName(String customerUserName) {
		this.customerUserName = customerUserName;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName="  + customerName + ", customerUserName=" + customerUserName + ", customerEmail=" + customerEmail + "]";
	}
	
}
