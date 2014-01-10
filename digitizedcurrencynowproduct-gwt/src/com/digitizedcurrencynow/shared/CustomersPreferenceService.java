package com.digitizedcurrencynow.shared;


import java.util.List;
import com.digitizedcurrencynow.shared.model.CustomersPreference;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("customerspreference")
public interface CustomersPreferenceService extends RemoteService {
	
	public void addCustomersPreference(CustomersPreference customersPreference) ;
	public void removeCustomersPreference(CustomersPreference customersPreference) ;
	public  List<CustomersPreference> getConfigration();
	public void updateCustomersPreference(CustomersPreference customersPreference) ;
	

}
