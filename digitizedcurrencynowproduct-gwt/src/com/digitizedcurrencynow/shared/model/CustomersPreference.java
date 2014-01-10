package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class CustomersPreference implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long customersPreferenceId;
	
	@Persistent
	private Long customerId;
	
	@Persistent
	private String customersPreferenceName;
	
	@Persistent
	private String customersPreferenceValue;
	
	@Persistent
	private String customersPreferenceDefaultValue;
	
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	public CustomersPreference() {
		super();
	}

	public Long getCustomersPreferenceId() {
		return customersPreferenceId;
	}

	public void setCustomersPreferenceId(Long customersPreferenceId) {
		this.customersPreferenceId = customersPreferenceId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomersPreferenceName() {
		return customersPreferenceName;
	}

	public void setCustomersPreferenceName(String customersPreferenceName) {
		this.customersPreferenceName = customersPreferenceName;
	}

	public String getCustomersPreferenceValue() {
		return customersPreferenceValue;
	}

	public void setCustomersPreferenceValue(String customersPreferenceValue) {
		this.customersPreferenceValue = customersPreferenceValue;
	}

	public String getCustomersPreferenceDefaultValue() {
		return customersPreferenceDefaultValue;
	}

	public void setCustomersPreferenceDefaultValue(
			String customersPreferenceDefaultValue) {
		this.customersPreferenceDefaultValue = customersPreferenceDefaultValue;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getSaveDate() {
		return saveDate;
	}

	public void setSaveDate(Date saveDate) {
		this.saveDate = saveDate;
	}

	@Override
	public String toString() {
		return "CustomersPreference [customersPreferenceId="  + customersPreferenceId + ", customerId=" + customerId  + ", customersPreferenceName=" + customersPreferenceName
				+ ", customersPreferenceValue=" + customersPreferenceValue + ", customersPreferenceDefaultValue=" + customersPreferenceDefaultValue + ", insertDate="
				+ insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]";
	}
	
	
}
