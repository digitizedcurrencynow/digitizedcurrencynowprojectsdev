package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.trading.BankTransfer;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BankTransferServiceAsync {

	void addBankTransfer(BankTransfer bankTransfer, AsyncCallback<Void> callback);
	void getBankTransfer(AsyncCallback<List<BankTransfer>> callback);
	void removeBankTransfer(BankTransfer bankTransfer, AsyncCallback<Void> callback);
	void updateBankTransfer(BankTransfer bankTransfer, AsyncCallback<Void> callback);

}
