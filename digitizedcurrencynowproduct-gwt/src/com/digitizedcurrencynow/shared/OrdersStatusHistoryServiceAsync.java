package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.trading.OrdersStatusHistory;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface OrdersStatusHistoryServiceAsync {

	void addOrdersStatusHistory(OrdersStatusHistory orders, AsyncCallback<Void> callback);
	void getOrdersStatusHistory(AsyncCallback<List<OrdersStatusHistory>> callback);
	void removeOrdersStatusHistory(OrdersStatusHistory orders, AsyncCallback<Void> callback);
	void updateOrdersStatusHistory(OrdersStatusHistory orders, AsyncCallback<Void> callback);

}
