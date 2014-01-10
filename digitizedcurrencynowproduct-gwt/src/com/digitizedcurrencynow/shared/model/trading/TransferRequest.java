package com.digitizedcurrencynow.shared.model.trading;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class TransferRequest implements Serializable{
	
	/**
	 * TransferRequest from User users of .
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long transferRequestID;
	
	@Persistent
	private String transferRequestDesc; //DN
	
	
	@Persistent
	private String amount;
	
	@Persistent
	private String commision;
	
	@Persistent
	private String asssetTypeDesc;  //DN
	
	@Persistent
	private String requestStatusDesc;  //DN
	
	@Persistent
	private String bitcoinAddressId;
	
	@Persistent
	private String bankTransferId;
	
	
	@Persistent
	private String customerId; //Join DN
	
	@Persistent
	private String balance; //DN
	
	
	
		
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	
	
	public TransferRequest() {
		super();
	}



	public Long getRransferRequestID() {
		return transferRequestID;
	}



	public void setRransferRequestID(Long rransferRequestID) {
		this.transferRequestID = rransferRequestID;
	}



	public String getTransferRequestDesc() {
		return transferRequestDesc;
	}



	public void setTransferRequestDesc(String transferRequestDesc) {
		this.transferRequestDesc = transferRequestDesc;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	public String getCommision() {
		return commision;
	}



	public void setCommision(String commision) {
		this.commision = commision;
	}



	public String getAsssetTypeDesc() {
		return asssetTypeDesc;
	}



	public void setAsssetTypeDesc(String asssetTypeDesc) {
		this.asssetTypeDesc = asssetTypeDesc;
	}



	public String getRequestStatusDesc() {
		return requestStatusDesc;
	}



	public void setRequestStatusDesc(String requestStatusDesc) {
		this.requestStatusDesc = requestStatusDesc;
	}



	public String getBitcoinAddressId() {
		return bitcoinAddressId;
	}



	public void setBitcoinAddressId(String bitcoinAddressId) {
		this.bitcoinAddressId = bitcoinAddressId;
	}



	public String getBankTransferId() {
		return bankTransferId;
	}



	public void setBankTransferId(String bankTransferId) {
		this.bankTransferId = bankTransferId;
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getBalance() {
		return balance;
	}



	public void setBalance(String balance) {
		this.balance = balance;
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
		return "TransferRequest [rransferRequestID=" + transferRequestID  + ", transferRequestDesc=" + transferRequestDesc + ", amount="
				+ amount + ", commision=" + commision + ", asssetTypeDesc=" + asssetTypeDesc + ", requestStatusDesc=" + requestStatusDesc
				+ ", bitcoinAddressId=" + bitcoinAddressId  + ", bankTransferId=" + bankTransferId + ", customerId="
				+ customerId + ", balance=" + balance + ", insertDate=" + insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]"; 
	}


}
