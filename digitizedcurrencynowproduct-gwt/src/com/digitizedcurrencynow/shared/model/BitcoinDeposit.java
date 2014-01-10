package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class BitcoinDeposit implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long depositId;
	
	@Persistent
	private String bitcoinAddressId;
	
	
	@Persistent
	private String amount;
	
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	
	
	public BitcoinDeposit() {
		super();
	}



	public Long getDepositId() {
		return depositId;
	}
    
	public void setDepositId(Long depositId) {
		this.depositId = depositId;
	}



	public String getBitcoinAddressId() {
		return bitcoinAddressId;
	}

	public void setBitcoinAddressId(String bitcoinAddressId) {
		this.bitcoinAddressId = bitcoinAddressId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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
		return "BitcoinDeposit [depositId=" + depositId + ", bitcoinAddressId=" +  bitcoinAddressId + ", amount=" + amount + ", insertDate="
				+ insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]";
	}


}
