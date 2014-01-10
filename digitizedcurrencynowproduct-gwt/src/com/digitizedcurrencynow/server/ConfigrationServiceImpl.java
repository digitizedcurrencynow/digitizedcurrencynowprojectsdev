package com.digitizedcurrencynow.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import com.digitizedcurrencynow.shared.ConfigrationService;
import com.digitizedcurrencynow.shared.model.Configration;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;



public class ConfigrationServiceImpl extends RemoteServiceServlet implements  ConfigrationService {
	
	
	private static final long serialVersionUID = 1L;
	private static final PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	public void addConfigration(Configration configration)  {
		PersistenceManager pm = getPersistenceManager();
		try {
			System.out.println("configration "+configration.toString());
			pm.makePersistent(configration);
		}catch(Exception e){
			System.out.println("Exception addConfigration");
			e.printStackTrace();
		} 
		finally {
			pm.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Configration> getConfigration()  {
		
		PersistenceManager pm = getPersistenceManager();
		ArrayList<Configration> configrationlist = new ArrayList<Configration>();
		try {
			String query= "select from "+Configration.class.getName();
			List<Configration> result = (List<Configration>)pm.newQuery(query).execute();
			
			for (Configration up : result) {
				configrationlist.add(up);
			}
			
		}catch(Exception e){
			System.out.println("Exception getConfigration");
			e.printStackTrace();
		}
		finally {
			pm.close();
		}
		return configrationlist;
	}
	
	
	public void removeConfigration(Configration configration)  {
		PersistenceManager pm = getPersistenceManager();
		try {
			pm.currentTransaction().begin();
			configration = pm.getObjectById(Configration.class,configration.getConfigrationId());
			pm.deletePersistent(configration);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception removeConfigration ");
			e.printStackTrace();
		}finally {
			pm.close();
		}
	}
	
	
	public void updateConfigration(Configration configration)  {
		
		PersistenceManager pm = getPersistenceManager();
		
		String description = configration.getDescription();
		String name = configration.getName();
		String sortOrer = configration.getSortOrer();
		String value = configration.getValue();
		Long configrationId = configration.getConfigrationId();
		Date insertDate = configration.getInsertDate();
		Date saveDate = configration.getSaveDate();
		Date updateDate = configration.getUpdateDate();
						
		
		try {
			pm.currentTransaction().begin();
			
			configration = pm.getObjectById(Configration.class, configration.getConfigrationId());
			
			configration.setDescription(description);
			configration.setName(name);
			configration.setSortOrer(sortOrer);
			configration.setValue(value);
			configration.setConfigrationId(configrationId);
			configration.setInsertDate(insertDate);
			configration.setSaveDate(saveDate);
			configration.setUpdateDate(updateDate);
			
			pm.makePersistent(configration);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception updateConfigration ");
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
