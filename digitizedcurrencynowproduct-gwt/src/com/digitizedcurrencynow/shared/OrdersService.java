package com.digitizedcurrencynow.shared;


import java.util.List;


import com.digitizedcurrencynow.shared.model.trading.Orders;
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

@RemoteServiceRelativePath("orders")
public interface OrdersService extends RemoteService {
	
	public void addOrders(Orders orders) ;
	public void removeOrders(Orders orders) ;
	public  List<Orders> getOrders();
	public void updateOrders(Orders orders) ;
}
