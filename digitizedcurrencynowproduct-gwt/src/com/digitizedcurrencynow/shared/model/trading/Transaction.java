package com.digitizedcurrencynow.shared.model.trading;

import java.io.Serializable;
import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Transaction implements Serializable{
	
	/**
	 * Transaction for an Order
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long tranacationId;
	
	@Persistent
	private String AOrderId;
	
	@Persistent
	private String AAmount;
	
	@Persistent
	private String ACommission;
	
	
	@Persistent
	private String BAmount;
	
	@Persistent
	private String BCommission;
	
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;

	public Long getTranacationId() {
		return tranacationId;
	}

	public void setTranacationId(Long tranacationId) {
		this.tranacationId = tranacationId;
	}

	public String getAOrderId() {
		return AOrderId;
	}

	public void setAOrderId(String aOrderId) {
		AOrderId = aOrderId;
	}

	public String getAAmount() {
		return AAmount;
	}

	public void setAAmount(String aAmount) {
		AAmount = aAmount;
	}

	public String getACommission() {
		return ACommission;
	}

	public void setACommission(String aCommission) {
		ACommission = aCommission;
	}

	public String getBAmount() {
		return BAmount;
	}

	public void setBAmount(String bAmount) {
		BAmount = bAmount;
	}

	public String getBCommission() {
		return BCommission;
	}

	public void setBCommission(String bCommission) {
		BCommission = bCommission;
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
		return "Transaction [tranacationId=" + tranacationId + ", AOrderId=" + AOrderId + ", AAmount=" + AAmount + ", ACommission="
				+ ACommission + ", BAmount=" + BAmount + ", BCommission=" + BCommission + ", insertDate=" + insertDate + ", updateDate="
				+ updateDate + ", saveDate=" + saveDate + "]";
	}

}
