package com.digitizedcurrencynow.shared;


import java.util.List;




import com.digitizedcurrencynow.shared.model.trading.Transaction;
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

@RemoteServiceRelativePath("transaction")
public interface TransactionService extends RemoteService {
	
	public void addTransaction(Transaction transaction) ;
	public void removetTransaction(Transaction transaction) ;
	public  List<Transaction> getTransaction();
	public void updateTransaction(Transaction transaction) ;
}
