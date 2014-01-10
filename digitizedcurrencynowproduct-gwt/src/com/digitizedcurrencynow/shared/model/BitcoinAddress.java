package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class BitcoinAddress implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long bitcoinAddressId;
	
	@Persistent
	private String customerId;
	
	@Persistent
	private String bitcoinAddress;
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	
	
	public BitcoinAddress() {
		super();
	}



	public Long getBitcoinAddressId() {
		return bitcoinAddressId;
	}



	public void setBitcoinAddressId(Long bitcoinAddressId) {
		this.bitcoinAddressId = bitcoinAddressId;
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getBitcoinAddress() {
		return bitcoinAddress;
	}



	public void setBitcoinAddress(String bitcoinAddress) {
		this.bitcoinAddress = bitcoinAddress;
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
		return "BitcoinAddress [bitcoinAddressId=" + bitcoinAddressId + ", customerId=" + customerId + ", bitcoinAddress="
				+ bitcoinAddress + ", insertDate=" + insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]";
	}

}
