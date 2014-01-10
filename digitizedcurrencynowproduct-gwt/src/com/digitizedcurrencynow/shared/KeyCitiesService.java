package com.digitizedcurrencynow.shared;


import java.util.List;

import com.digitizedcurrencynow.shared.model.KeyCities;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("keycities")
public interface KeyCitiesService extends RemoteService {
	
	public void addKeyCities(KeyCities keycities) ;
	public void removeKeyCities(KeyCities keycities) ;
	public  List<KeyCities> getKeyCities();
	public void updateKeyCities(KeyCities keycities) ;
	

}
