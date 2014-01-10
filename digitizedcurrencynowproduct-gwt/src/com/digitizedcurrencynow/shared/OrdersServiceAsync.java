package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.trading.Orders;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface OrdersServiceAsync {

	void addOrders(Orders orders, AsyncCallback<Void> callback);
	void getOrders(AsyncCallback<List<Orders>> callback);
	void removeOrders(Orders orders, AsyncCallback<Void> callback);
	void updateOrders(Orders orders, AsyncCallback<Void> callback);

}
