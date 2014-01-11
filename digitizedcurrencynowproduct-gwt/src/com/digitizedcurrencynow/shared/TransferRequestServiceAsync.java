package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.trading.TransferRequest;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TransferRequestServiceAsync {

	void addTransferRequest(TransferRequest transferRequest, AsyncCallback<Void> callback);

	void gettransferRequest(AsyncCallback<List<TransferRequest>> callback);

	void removettransferRequest(TransferRequest transferRequest, AsyncCallback<Void> callback);

	void updateTransferRequest(TransferRequest transferRequest, AsyncCallback<Void> callback);

}
