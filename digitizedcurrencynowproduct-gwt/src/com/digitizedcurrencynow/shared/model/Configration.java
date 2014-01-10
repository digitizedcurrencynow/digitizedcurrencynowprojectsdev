package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Configration implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long configrationId;
	
	@Persistent
	private String name;
	
	@Persistent
	private String value;
	
	@Persistent
	private String description;
	
	@Persistent
	private String sortOrer;
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	public Configration() {
		super();
	}

	public Long getConfigrationId() {
		return configrationId;
	}

	public void setConfigrationId(Long configrationId) {
		this.configrationId = configrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSortOrer() {
		return sortOrer;
	}

	public void setSortOrer(String sortOrer) {
		this.sortOrer = sortOrer;
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
		return "Configration [configrationId=" + configrationId + ", name=" + name + ", value=" + value + ", description=" + description
				+ ", sortOrer=" + sortOrer + ", insertDate=" + insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]";
	}
	
}
