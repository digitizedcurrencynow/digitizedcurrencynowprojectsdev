package com.digitizedcurrencynow.shared;


import java.util.List;
import com.digitizedcurrencynow.shared.model.trading.OrdersStatusHistory;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
/*
AuditLog
Configration.java
Customers
CustomersPreference
EntityContact.java
Institution.java
MasterEntity.java
UserProfile.java
*/

@RemoteServiceRelativePath("ordersstatushistory")
public interface OrdersStatusHistoryService extends RemoteService {
	
	public void addOrdersStatusHistory(OrdersStatusHistory ordersStatusHistory) ;
	public void removeOrdersStatusHistory(OrdersStatusHistory ordersStatusHistory) ;
	public  List<OrdersStatusHistory> getOrdersStatusHistory();
	public void updateOrdersStatusHistory(OrdersStatusHistory ordersStatusHistory) ;
	
	
}
