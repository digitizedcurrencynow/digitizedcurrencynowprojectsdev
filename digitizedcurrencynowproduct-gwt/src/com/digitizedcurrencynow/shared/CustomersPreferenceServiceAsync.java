package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.CustomersPreference;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface CustomersPreferenceServiceAsync {

	void addCustomersPreference(CustomersPreference customersPreference, AsyncCallback<Void> callback);
	void getConfigration(AsyncCallback<List<CustomersPreference>> callback);
	void removeCustomersPreference(CustomersPreference customersPreference, AsyncCallback<Void> callback);
	void updateCustomersPreference(CustomersPreference customersPreference, AsyncCallback<Void> callback);

}
