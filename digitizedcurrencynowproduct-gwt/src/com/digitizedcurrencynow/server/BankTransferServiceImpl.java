package com.digitizedcurrencynow.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import com.digitizedcurrencynow.shared.BankTransferService;
import com.digitizedcurrencynow.shared.model.trading.BankTransfer;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;



public class BankTransferServiceImpl extends RemoteServiceServlet implements  BankTransferService {
	
	private static final long serialVersionUID = 1L;
	private static final PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	private PersistenceManager getPersistenceManager() {
		return PMF.getPersistenceManager();
	}

	@Override
	public void addBankTransfer(BankTransfer bankTransfer) {
		// TODO Auto-generated method stub
		PersistenceManager pm = getPersistenceManager();
		try {
			System.out.println("BankTransfer "+bankTransfer.toString());
			pm.makePersistent(bankTransfer);
		}catch(Exception e){
			System.out.println("Exception addBankTransfer");
			e.printStackTrace();
		} 
		finally {
			pm.close();
		}
		
	}

	@Override
	public List<BankTransfer> getBankTransfer() {
		// TODO Auto-generated method stub
		PersistenceManager pm = getPersistenceManager();
		ArrayList<BankTransfer> bankTransferList = new ArrayList<BankTransfer>();
		try {
			String query= "select from "+BankTransfer.class.getName();
			@SuppressWarnings("unchecked")
			List<BankTransfer> result = (List<BankTransfer>) pm.newQuery(query).execute();
			
			for (BankTransfer up : result) {
				bankTransferList.add(up);
			}
			
		}catch(Exception e){
			System.out.println("Exception getBankTransfer");
			e.printStackTrace();
		}
		finally {
			pm.close();
		}
		return bankTransferList;
	}
	

	@Override
	public void removeBankTransfer(BankTransfer bankTransfer) {
		// TODO Auto-generated method stub
		PersistenceManager pm = getPersistenceManager();
		try {
			pm.currentTransaction().begin();
			bankTransfer = pm.getObjectById(BankTransfer.class,bankTransfer.getTransferId());
			pm.deletePersistent(bankTransfer);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception removeBankTransfer ");
			e.printStackTrace();
		}finally {
			pm.close();
		}
		
	}


	@Override
	public void updateBankTransfer(BankTransfer bankTransfer) {
		// TODO Auto-generated method stub
		Long transferId = bankTransfer.getTransferId();
		
		PersistenceManager pm = getPersistenceManager();
		String accountName = bankTransfer.getAccountName();
		String accountNumber = bankTransfer.getAccountNumber();
		String amount = bankTransfer.getAmount();
		String bankName = bankTransfer.getBankName();
		String customerId = bankTransfer.getCustomerId();
		String transferComment = bankTransfer.getTransferComment();
		Date insertDate = bankTransfer.getInsertDate();
		Date saveDate = bankTransfer.getSaveDate();
		Date updateDate = bankTransfer.getUpdateDate();
		
		try {
			pm.currentTransaction().begin();
			
			bankTransfer = pm.getObjectById(BankTransfer.class, bankTransfer.getTransferId());
			
			bankTransfer.setAccountName(accountName);
			bankTransfer.setAccountNumber(accountNumber);
			bankTransfer.setAmount(amount);
			bankTransfer.setAmount(bankName);
			bankTransfer.setCustomerId(customerId);
			bankTransfer.setTransferComment(transferComment);
			bankTransfer.setInsertDate(insertDate);
			bankTransfer.setSaveDate(saveDate);
			bankTransfer.setTransferId(transferId);
			bankTransfer.setUpdateDate(updateDate);
			
			
			pm.makePersistent(bankTransfer);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception updateBankTransfer ");
			e.printStackTrace();
		} 
		finally {
			pm.close();
		}
		
	}

	
}
