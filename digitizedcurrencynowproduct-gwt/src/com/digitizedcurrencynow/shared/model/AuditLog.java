package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class AuditLog implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long auditLogId;
	
	@Persistent
	private String customerId;
	
	
	@Persistent
	private String customer2Id;
	
	
	@Persistent
	private String activityType;
	
	
	@Persistent
	private String auditDescription;
	
	
	@Persistent
	private String auditValue;
	
	
	
	public AuditLog() {
		super();
	}



	public Long getAuditLogId() {
		return auditLogId;
	}



	public void setAuditLogId(Long auditLogId) {
		this.auditLogId = auditLogId;
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getCustomer2Id() {
		return customer2Id;
	}



	public void setCustomer2Id(String customer2Id) {
		this.customer2Id = customer2Id;
	}



	public String getActivityType() {
		return activityType;
	}



	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}



	public String getAuditDescription() {
		return auditDescription;
	}



	public void setAuditDescription(String auditDescription) {
		this.auditDescription = auditDescription;
	}



	public String getAuditValue() {
		return auditValue;
	}



	public void setAuditValue(String auditValue) {
		this.auditValue = auditValue;
	}



	@Override
	public String toString() {
		return "AuditLog [auditLogId=" + auditLogId + ", customerId=" + customerId + ", customer2Id=" + customer2Id
				+ ", activityType=" + activityType + ", auditDescription=" + auditDescription + ", auditValue=" + auditValue + "]";
	}

}
