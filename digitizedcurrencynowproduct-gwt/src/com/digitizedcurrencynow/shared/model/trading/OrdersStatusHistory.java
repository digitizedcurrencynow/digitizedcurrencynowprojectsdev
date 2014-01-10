package com.digitizedcurrencynow.shared.model.trading;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class OrdersStatusHistory implements Serializable{
	
	/**
	 * OrdersStatusHistory.
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long ordersStatusHistoryId;
	
	@Persistent
	private String ordersId;
	
	@Persistent
	private String orderStatusId;
	
	@Persistent
	private String statusUpdateBy;
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	
	public OrdersStatusHistory() {
		super();
	}


	public Long getOrdersStatusHistoryId() {
		return ordersStatusHistoryId;
	}


	public void setOrdersStatusHistoryId(Long ordersStatusHistoryId) {
		this.ordersStatusHistoryId = ordersStatusHistoryId;
	}


	public String getOrdersId() {
		return ordersId;
	}


	public void setOrdersId(String ordersId) {
		this.ordersId = ordersId;
	}


	public String getOrderStatusId() {
		return orderStatusId;
	}


	public void setOrderStatusId(String orderStatusId) {
		this.orderStatusId = orderStatusId;
	}


	public String getStatusUpdateBy() {
		return statusUpdateBy;
	}


	public void setStatusUpdateBy(String statusUpdateBy) {
		this.statusUpdateBy = statusUpdateBy;
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
		return "OrdersStatusHistory [ordersStatusHistoryId=" + ordersStatusHistoryId + ", ordersId=" + ordersId + ", orderStatusId=" + orderStatusId + ", statusUpdateBy="
				+ statusUpdateBy + ", insertDate=" + insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]";
	}
	

}
