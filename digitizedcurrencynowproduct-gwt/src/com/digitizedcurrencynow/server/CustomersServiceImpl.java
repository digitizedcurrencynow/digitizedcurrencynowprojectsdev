package com.digitizedcurrencynow.server;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import com.digitizedcurrencynow.shared.KeyCitiesService;
import com.digitizedcurrencynow.shared.model.KeyCities;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;



public class CustomersServiceImpl extends RemoteServiceServlet implements  KeyCitiesService {
	
	
	private static final long serialVersionUID = 1L;
	private static final PersistenceManagerFactory PMF = JDOHelper.getPersistenceManagerFactory("transactions-optional");

	public void addKeyCities(KeyCities keycities)  {
		PersistenceManager pm = getPersistenceManager();
		try {
			System.out.println("keycities "+keycities.toString());
			pm.makePersistent(keycities);
		}catch(Exception e){
			System.out.println("Exception addKeyCities");
			e.printStackTrace();
		} 
		finally {
			pm.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<KeyCities> getKeyCities()  {
		
		PersistenceManager pm = getPersistenceManager();
		ArrayList<KeyCities> keycitieslist = new ArrayList<KeyCities>();
		try {
			String query= "select from "+KeyCities.class.getName();
			List<KeyCities> result = (List<KeyCities>)pm.newQuery(query).execute();
			
			for (KeyCities up : result) {
				keycitieslist.add(up);
			}
			
		}catch(Exception e){
			System.out.println("Exception getUserProfile");
			e.printStackTrace();
		}
		finally {
			pm.close();
		}
		return keycitieslist;
	}
	
	
	public void removeKeyCities(KeyCities keycities)  {
		PersistenceManager pm = getPersistenceManager();
		try {
			pm.currentTransaction().begin();
			keycities = pm.getObjectById(KeyCities.class,keycities.getId());
			pm.deletePersistent(keycities);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception removeKeyCities ");
			e.printStackTrace();
		}finally {
			pm.close();
		}
	}
	
	
	public void updateKeyCities(KeyCities keycities)  {
		
		PersistenceManager pm = getPersistenceManager();
		String cityName = keycities.getCityName();
		String cityImageUrl = keycities.getCityImageUrl();
		String cityLat = keycities.getCityLat();
		String cityLong = keycities.getCityLong();
		String cityDescDetails = keycities.getCityDescDetails();
		String cityCountryName = keycities.getCountryName();
		
		try {
			pm.currentTransaction().begin();
			
			keycities = pm.getObjectById(KeyCities.class, keycities.getId());
			
			keycities.setCityName(cityName);
			keycities.setCityImageUrl(cityImageUrl);
			keycities.setCityLat(cityLat);
			keycities.setCityLong(cityLong);
			keycities.setCityDescDetails(cityDescDetails);
			keycities.setCountryName(cityCountryName);
			
			pm.makePersistent(keycities);
			pm.currentTransaction().commit();
			pm.close();
			
		}catch(Exception e){
			System.out.println("Exception updateUserProfile ");
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
