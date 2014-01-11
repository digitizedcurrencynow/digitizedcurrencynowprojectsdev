package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.trading.Transaction;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TransactionServiceAsync {

	void addTransaction(Transaction transaction, AsyncCallback<Void> callback);

	void getTransaction(AsyncCallback<List<Transaction>> callback);

	void removetTransaction(Transaction transaction, AsyncCallback<Void> callback);

	void updateTransaction(Transaction transaction, AsyncCallback<Void> callback);

}
