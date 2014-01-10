package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.Configration;
import com.google.gwt.user.client.rpc.AsyncCallback;


public interface ConfigrationServiceAsync {

	void addConfigration(Configration configration, AsyncCallback<Void> callback);
	void removeConfigration(Configration configration, AsyncCallback<Void> callback);
	void getConfigration(AsyncCallback<List<Configration>> callback);
	void updateConfigration(Configration configration, AsyncCallback<Void> callback);
}
