package com.digitizedcurrencynow.shared.model.trading;

import java.io.Serializable;
import java.util.Date;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Orders implements Serializable{
	
	/**
	 * Orders
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long ordersId;
	
	@Persistent
	private String ordersTypeName;
	
	@Persistent
	private String ordersTypeDesc;
	
	
	@Persistent
	private String customerId;
	
	@Persistent
	private String offerAsssetTypeDesc;
	
	@Persistent
	private String wantAsssetTypeDesc;
	
	
	@Persistent
	private String quantity;
	
	@Persistent
	private String price;
	
	
	@Persistent
	private String orderStatus;
	
	@Persistent
	private String marketOrder;
	
	@Persistent
	private String takeProfitOrderId;
	
	@Persistent
	private String stopLossOrderId;
	
	
	
	
	
	
	@Persistent
	private String ordersIsActive;
	
	@Persistent
	private String usersName;
	
	@Persistent
	private String userEmail;
	
	@Persistent
	private Date insertDate;
	
	@Persistent
	private Date updateDate;
	
	@Persistent
	private Date saveDate;
	
	
	public Orders() {
		super();
	}


	public Long getOrdersId() {
		return ordersId;
	}


	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}


	public String getOrdersTypeName() {
		return ordersTypeName;
	}


	public void setOrdersTypeName(String ordersTypeName) {
		this.ordersTypeName = ordersTypeName;
	}


	public String getoOrdersTypeDesc() {
		return ordersTypeDesc;
	}


	public void setOrdersTypeDesc(String ordersTypeDesc) {
		this.ordersTypeDesc = ordersTypeDesc;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getOfferAsssetTypeDesc() {
		return offerAsssetTypeDesc;
	}


	public void setOfferAsssetTypeDesc(String offerAsssetTypeDesc) {
		this.offerAsssetTypeDesc = offerAsssetTypeDesc;
	}


	public String getWantAsssetTypeDesc() {
		return wantAsssetTypeDesc;
	}


	public void setWantAsssetTypeDesc(String wantAsssetTypeDesc) {
		this.wantAsssetTypeDesc = wantAsssetTypeDesc;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public String getMarketOrder() {
		return marketOrder;
	}


	public void setMarketOrder(String marketOrder) {
		this.marketOrder = marketOrder;
	}


	public String getTakeProfitOrderId() {
		return takeProfitOrderId;
	}


	public void setTakeProfitOrderId(String takeProfitOrderId) {
		this.takeProfitOrderId = takeProfitOrderId;
	}


	public String getStopLossOrderId() {
		return stopLossOrderId;
	}


	public void setStopLossOrderId(String stopLossOrderId) {
		this.stopLossOrderId = stopLossOrderId;
	}




	public String getOrdersIsActive() {
		return ordersIsActive;
	}


	public void setOrdersIsActive(String ordersIsActive) {
		this.ordersIsActive = ordersIsActive;
	}


	public String getUsersName() {
		return usersName;
	}


	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
		return "Orders [ordersId=" + ordersId + ", ordersTypeName=" + ordersTypeName + ", ordersTypeDesc=" + ordersTypeDesc
				+ ", customerId=" + customerId + ", offerAsssetTypeDesc=" 	+ offerAsssetTypeDesc + ", wantAsssetTypeDesc="
				+ wantAsssetTypeDesc + ", quantity=" + quantity + ", price="+ price + ", orderStatus=" + orderStatus + ", marketOrder="
				+ marketOrder + ", takeProfitOrderId=" + takeProfitOrderId + ", stopLossOrderId=" + stopLossOrderId 
				+ ", ordersIsActive=" + ordersIsActive + ", usersName=" + usersName + ", userEmail=" + userEmail
				+ ", insertDate=" + insertDate + ", updateDate=" + updateDate + ", saveDate=" + saveDate + "]";
	}
	
	
	
	

}
