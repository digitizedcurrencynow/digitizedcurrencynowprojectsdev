package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class EntityContact implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long entityContactId;
	
	@Persistent
	private String entityContactKey;
	
	@Persistent
	private String entityContactType;
	
	@Persistent
	private String entityContactString;
	
	@Persistent
	private String entityContactNumber;
	
	@Persistent
	private String entityContactFromDate;
	
	@Persistent
	private String entityContactToDate;
	
	

	public Long getEntityContactId() {
		return entityContactId;
	}

	public void setEntityContactId(Long entityContactId) {
		this.entityContactId = entityContactId;
	}

	public String getEntityContactKey() {
		return entityContactKey;
	}

	public void setEntityContactKey(String entityContactKey) {
		this.entityContactKey = entityContactKey;
	}

	public String getEntityContactType() {
		return entityContactType;
	}

	public void setEntityContactType(String entityContactType) {
		this.entityContactType = entityContactType;
	}

	public String getEntityContactString() {
		return entityContactString;
	}

	public void setEntityContactString(String entityContactString) {
		this.entityContactString = entityContactString;
	}

	public String getEntityContactNumber() {
		return entityContactNumber;
	}

	public void setEntityContactNumber(String entityContactNumber) {
		this.entityContactNumber = entityContactNumber;
	}

	public String getEntityContactFromDate() {
		return entityContactFromDate;
	}

	public void setEntityContactFromDate(String entityContactFromDate) {
		this.entityContactFromDate = entityContactFromDate;
	}

	public String getEntityContactToDate() {
		return entityContactToDate;
	}

	public void setEntityContactToDate(String entityContactToDate) {
		this.entityContactToDate = entityContactToDate;
	}

	@Override
	public String toString() {
		return "EntityContact [entityContactId=" + entityContactId  + ", entityContactKey=" + entityContactKey + ", entityContactType=" + entityContactType
				+ ", entityContactString=" + entityContactString  + ", entityContactNumber=" + entityContactNumber  + ", entityContactFromDate=" + entityContactFromDate
				+ ", entityContactToDate=" + entityContactToDate + "]";
	}

}
