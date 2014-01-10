package com.digitizedcurrencynow.shared;


import java.util.List;
import com.digitizedcurrencynow.shared.model.Configration;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


@RemoteServiceRelativePath("configration")
public interface ConfigrationService extends RemoteService {
	
	public void addConfigration(Configration configration) ;
	public void removeConfigration(Configration configration) ;
	public  List<Configration> getConfigration();
	public void updateConfigration(Configration configration) ;
	

}
