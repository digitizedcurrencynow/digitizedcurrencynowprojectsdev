package com.digitizedcurrencynow.shared.model.trading;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class BankTransfer implements Serializable{
	
	/**
	 * BankTransfer from User users of .
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long transferId;
	
	@Persistent
	private String customerId;
	
	@Persistent
	private String bankName;
	
	@Persistent
	private String accountName;
	
	@Persistent
	private String accountNumber;
	
	@Persistent
	private String amount;
	
	@Persistent
	private String transferComment;
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	
	
	public BankTransfer() {
		super();
	}

	public Long getTransferId() {
		return transferId;
	}

	public void setTransferId(Long transferId) {
		this.transferId = transferId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTransferComment() {
		return transferComment;
	}

	public void setTransferComment(String transferComment) {
		this.transferComment = transferComment;
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
		return "BankTransfer [transferId=" + transferId + ", customerId=" + customerId + ", bankName=" + bankName + ", accountName="
				+ accountName + ", accountNumber=" + accountNumber 	+ ", amount=" + amount + ", transferComment=" + transferComment
				+ ", insertDate=" + insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]";
	}
	

}
