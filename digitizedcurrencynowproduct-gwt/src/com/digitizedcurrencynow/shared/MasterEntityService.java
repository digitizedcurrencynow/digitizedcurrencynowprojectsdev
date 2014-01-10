package com.digitizedcurrencynow.shared;


import java.util.List;
import com.digitizedcurrencynow.shared.model.MasterEntity;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
/*
AuditLog
Configration.java
Customers
CustomersPreference
EntityContact.java
Institution.java
MasterEntity.java
UserProfile.java
*/

@RemoteServiceRelativePath("masterentity")
public interface MasterEntityService extends RemoteService {
	
	public void addMasterEntity(MasterEntity masterEntity) ;
	public void removeMasterEntity(MasterEntity masterEntity) ;
	public  List<MasterEntity> getMasterEntity();
	public void updateMasterEntity(MasterEntity masterEntity) ;

}
