package com.digitizedcurrencynow.shared;


import java.util.List;




import com.digitizedcurrencynow.shared.model.trading.TransferRequest;
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

@RemoteServiceRelativePath("transferrequest")
public interface TransferRequestService extends RemoteService {
	
	public void addTransferRequest(TransferRequest transferRequest) ;
	public void removettransferRequest(TransferRequest transferRequest) ;
	public  List<TransferRequest> gettransferRequest();
	public void updateTransferRequest(TransferRequest transferRequest) ;
}
