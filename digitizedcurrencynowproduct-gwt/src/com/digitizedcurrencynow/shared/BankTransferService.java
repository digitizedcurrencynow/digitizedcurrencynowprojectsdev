package com.digitizedcurrencynow.shared;


import java.util.List;
import com.digitizedcurrencynow.shared.model.trading.BankTransfer;
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

@RemoteServiceRelativePath("banktransfer")
public interface BankTransferService extends RemoteService {
	
	public void addBankTransfer(BankTransfer bankTransfer) ;
	public void removeBankTransfer(BankTransfer bankTransfer) ;
	public  List<BankTransfer> getBankTransfer();
	public void updateBankTransfer(BankTransfer bankTransfer) ;
}
