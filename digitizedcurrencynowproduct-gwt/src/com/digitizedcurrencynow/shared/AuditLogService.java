package com.digitizedcurrencynow.shared;


import java.util.List;

import com.digitizedcurrencynow.shared.model.AuditLog;

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

@RemoteServiceRelativePath("auditlog")
public interface AuditLogService extends RemoteService {
	
	public void addAuditLog(AuditLog auditLog) ;
	public  List<AuditLog> getAuditLog();
	
	

}
