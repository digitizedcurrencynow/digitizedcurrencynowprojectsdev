package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.KeyCities;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface KeyCitiesServiceAsync {

	void addKeyCities(KeyCities keycities, AsyncCallback<Void> callback);
	void removeKeyCities(KeyCities keycities, AsyncCallback<Void> callback);
	void getKeyCities(AsyncCallback<List<KeyCities>> callback);
	void updateKeyCities(KeyCities keycities, AsyncCallback<Void> callback);

}
