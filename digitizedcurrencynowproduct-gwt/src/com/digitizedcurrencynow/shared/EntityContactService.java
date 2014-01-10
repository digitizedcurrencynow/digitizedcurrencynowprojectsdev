package com.digitizedcurrencynow.shared;


import java.util.List;
import com.digitizedcurrencynow.shared.model.EntityContact;
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

@RemoteServiceRelativePath("entitycontact")
public interface EntityContactService extends RemoteService {
	
	public void addEntityContact(EntityContact entityContact) ;
	public void removeEntityContact(EntityContact entityContact) ;
	public  List<EntityContact> getEntityContact();
	public void updateEntityContact(EntityContact entityContact) ;

}
