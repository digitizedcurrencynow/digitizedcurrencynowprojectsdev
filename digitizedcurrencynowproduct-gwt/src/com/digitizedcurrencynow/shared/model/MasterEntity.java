package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class MasterEntity implements Serializable{
	
	/**
	 * MasterEntity back from User users of .
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long entityId;
	
	@Persistent
	private String entityType;
	
	@Persistent
	private String entityName1;
	
	@Persistent
	private String entityName2;
	
	@Persistent
	private String parentEntityId;
	
	@Persistent
	private String entityPrimeLanguage;
	
	@Persistent
	private String entitySecondLanguage;
	
	@Persistent
	private String entityTimeZone;
	
	@Persistent
	private String entityStatus;
	
	@Persistent
	private String externalEntityId;
	
	@Persistent
	private String instituationId;
	
	@Persistent
	private String effectiveFromDate;
	
	@Persistent
	private String effectiveToDate;
	
	@Persistent
	private String currentFlag;
	
	
	public MasterEntity() {
		super();
	}


	public Long getEntityId() {
		return entityId;
	}


	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}


	public String getEntityType() {
		return entityType;
	}


	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}


	public String getEntityName1() {
		return entityName1;
	}


	public void setEntityName1(String entityName1) {
		this.entityName1 = entityName1;
	}


	public String getEntityName2() {
		return entityName2;
	}


	public void setEntityName2(String entityName2) {
		this.entityName2 = entityName2;
	}


	public String getParentEntityId() {
		return parentEntityId;
	}


	public void setParentEntityId(String parentEntityId) {
		this.parentEntityId = parentEntityId;
	}


	public String getEntityPrimeLanguage() {
		return entityPrimeLanguage;
	}


	public void setEntityPrimeLanguage(String entityPrimeLanguage) {
		this.entityPrimeLanguage = entityPrimeLanguage;
	}


	public String getEntitySecondLanguage() {
		return entitySecondLanguage;
	}


	public void setEntitySecondLanguage(String entitySecondLanguage) {
		this.entitySecondLanguage = entitySecondLanguage;
	}


	public String getEntityTimeZone() {
		return entityTimeZone;
	}


	public void setEntityTimeZone(String entityTimeZone) {
		this.entityTimeZone = entityTimeZone;
	}


	public String getEntityStatus() {
		return entityStatus;
	}


	public void setEntityStatus(String entityStatus) {
		this.entityStatus = entityStatus;
	}


	public String getExternalEntityId() {
		return externalEntityId;
	}


	public void setExternalEntityId(String externalEntityId) {
		this.externalEntityId = externalEntityId;
	}


	public String getInstituationId() {
		return instituationId;
	}


	public void setInstituationId(String instituationId) {
		this.instituationId = instituationId;
	}


	public String getEffectiveFromDate() {
		return effectiveFromDate;
	}


	public void setEffectiveFromDate(String effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}


	public String getEffectiveToDate() {
		return effectiveToDate;
	}


	public void setEffectiveToDate(String effectiveToDate) {
		this.effectiveToDate = effectiveToDate;
	}


	public String getCurrentFlag() {
		return currentFlag;
	}


	public void setCurrentFlag(String currentFlag) {
		this.currentFlag = currentFlag;
	}


	@Override
	public String toString() {
		return "MasterEntity [entityId=" + entityId + ", entityType=" 	+ entityType + ", entityName1=" + entityName1
				+ ", entityName2=" + entityName2 + ", parentEntityId=" 	+ parentEntityId + ", entityPrimeLanguage="
				+ entityPrimeLanguage + ", entitySecondLanguage="  + entitySecondLanguage + ", entityTimeZone=" + entityTimeZone
				+ ", entityStatus=" + entityStatus + ", externalEntityId=" + externalEntityId + ", instituationId=" + instituationId
				+ ", effectiveFromDate=" + effectiveFromDate + ", effectiveToDate=" + effectiveToDate + ", currentFlag=" + currentFlag + "]";
	}
	
	
	
	

}
