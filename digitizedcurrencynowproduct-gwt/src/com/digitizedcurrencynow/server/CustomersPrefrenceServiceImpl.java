package com.digitizedcurrencynow.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import com.digitizedcurrencynow.shared.CustomersPreferenceService;
import com.digitizedcurrencynow.shared.model.CustomersPreference;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;



public class CustomersPrefrenceServiceImpl extends RemoteServiceServlet implements  CustomersPreferenceService {
	
	
	private static final long serialVersionUID = 1L;
	private static final PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	public void  addCustomersPreference(CustomersPreference customersPreference)  {
		PersistenceManager pm = getPersistenceManager();
		try {
			System.out.println("customersPreference "+customersPreference.toString());
			pm.makePersistent(customersPreference);
		}catch(Exception e){
			System.out.println("Exception addCustomersPreference");
			e.printStackTrace();
		} 
		finally {
			pm.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<CustomersPreference> getConfigration()  {
		
		PersistenceManager pm = getPersistenceManager();
		ArrayList<CustomersPreference> customersPreferencelist = new ArrayList<CustomersPreference>();
		try {
			String query= "select from "+CustomersPreference.class.getName();
			List<CustomersPreference> result = (List<CustomersPreference>) pm.newQuery(query).execute();
			
			for (CustomersPreference up : result) {
				customersPreferencelist.add(up);
			}
			
		}catch(Exception e){
			System.out.println("Exception getConfigration");
			e.printStackTrace();
		}
		finally {
			pm.close();
		}
		return customersPreferencelist;
	}
	
	
	public void removeCustomersPreference(CustomersPreference customersPreference)  {
		PersistenceManager pm = getPersistenceManager();
		try {
			pm.currentTransaction().begin();
			customersPreference = pm.getObjectById(CustomersPreference.class,customersPreference.getCustomerId());
			pm.deletePersistent(customersPreference);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception removeCustomersPreference ");
			e.printStackTrace();
		}finally {
			pm.close();
		}
	}
	
	
	public void updateCustomersPreference(CustomersPreference customersPreference)  {
		
		PersistenceManager pm = getPersistenceManager();
		String preferenceDefaultValue = customersPreference.getCustomersPreferenceDefaultValue();
		String preferenceName = customersPreference.getCustomersPreferenceName();
		String preferenceValue = customersPreference.getCustomersPreferenceValue();
		Long customersPreferenceId = customersPreference.getCustomersPreferenceId();
		
		Date insertDate = customersPreference.getInsertDate();
		Date saveDate = customersPreference.getSaveDate();
		Date updateDate = customersPreference.getUpdateDate();
		
		try {
			pm.currentTransaction().begin();
			
			customersPreference = pm.getObjectById(CustomersPreference.class, customersPreference.getCustomersPreferenceId());
			
			customersPreference.setCustomersPreferenceId(customersPreferenceId);
			customersPreference.setCustomersPreferenceDefaultValue(preferenceDefaultValue);
			customersPreference.setCustomersPreferenceName(preferenceName);
			customersPreference.setCustomersPreferenceValue(preferenceValue);
			customersPreference.setCustomersPreferenceId(customersPreferenceId);
			
			customersPreference.setInsertDate(insertDate);
			customersPreference.setSaveDate(saveDate);
			customersPreference.setUpdateDate(updateDate);
			
			pm.makePersistent(customersPreference);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception updateCustomersPreference ");
			e.printStackTrace();
		} 
		finally {
			pm.close();
		}
	}
	
	private PersistenceManager getPersistenceManager() {
		return PMF.getPersistenceManager();
	}

	
}
