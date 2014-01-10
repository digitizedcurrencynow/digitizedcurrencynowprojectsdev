package com.digitizedcurrencynow.shared;


import java.util.List;


import com.digitizedcurrencynow.shared.model.Institution;
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

@RemoteServiceRelativePath("institution")
public interface InstitutionService extends RemoteService {
	
	public void addInstitution(Institution institution) ;
	public void removeInstitution(Institution institution) ;
	public  List<Institution> getInstitution();
	public void updateInstitution(Institution institution) ;

}
