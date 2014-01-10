package com.digitizedcurrencynow.client;

import java.util.List;

import com.digitizedcurrencynow.shared.KeyCitiesServiceAsync;
import com.digitizedcurrencynow.shared.KeyCitiesService;
import com.digitizedcurrencynow.shared.model.KeyCities;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class KeyCitiesDelegate {
	
	private KeyCitiesServiceAsync keyCitiesService = GWT.create(KeyCitiesService.class);
	
	protected KeyCitiesAdd keyCitiesAdd;
	protected KeyCitiesListComposite keyCitiesListComposite;
	protected KeyCitiesUpdateDeleteComposite  keyCitiesUpdateDeleteComposite;
	protected KeyCitiesUpdateComposite keyCitiesUpdateComposite;
	
	public void saveKeyCityData(KeyCities keycity){
		keyCitiesService.addKeyCities(keycity, new AsyncCallback<Void>() {
			@Override
			public void onSuccess(Void result) {
				System.out.println(">>onSuccess saveKeyCityData ");
				keyCitiesAdd.ser_eventSaveKeyCitiesSucess();
			}
			@Override
			public void onFailure(Throwable caught) {
				System.out.println(">>onFailure saveKeyCityData ");
				keyCitiesAdd.ser_eventSaveKeyCitiesFailed(caught);
			}
		});
	}


	public void removeKeyCitiesData(KeyCities keycity){
		keyCitiesService.removeKeyCities(keycity, new AsyncCallback<Void>() {
			@Override
			public void onSuccess(Void result) {
				System.out.println(">>onSuccess removeKeyCitiesData ");
				keyCitiesUpdateDeleteComposite.ser_eventDeleteKeyCitiesSuccess();
			}
			@Override
			public void onFailure(Throwable caught) {
				System.out.println(">>onFailure removeKeyCitiesData ");
				keyCitiesUpdateDeleteComposite.ser_eventDeletKeyCitiesFailed(caught);
			}
		});
	}
	
	
	public void updateKeyCitiesData(KeyCities keycity){
		keyCitiesService.updateKeyCities(keycity, new AsyncCallback<Void>() {
			@Override
			public void onSuccess(Void result) {
				System.out.println(">>onSuccess updateKeyCitiesData ");
				keyCitiesUpdateComposite.ser_eventUpdateKeyCitiesSucess();
			}
			@Override
			public void onFailure(Throwable caught) {
				System.out.println(">>onFailure updateKeyCitiesData ");
				keyCitiesUpdateComposite.ser_eventUpdateKeyCitiesFailed(caught);
			}
		});
	}
 	
	
	public void getKeyCitiesData(){
		keyCitiesService.getKeyCities( new AsyncCallback<List<KeyCities>>() {
			@Override
			public void onSuccess(List<KeyCities> result) {
				for (KeyCities up : result) {
					System.out.println("individual city "+up.toString());
				}
				System.out.println("getKeyCitiesData "+result.size());
				if (keyCitiesListComposite!=null){
					keyCitiesListComposite.ser_eventListKeyCitiesSucsess(result);
					System.out.println("result getKeyCitiesData keyCitiesListComposite>> "+result.size());
				}
				
				if (keyCitiesUpdateDeleteComposite!=null){
					keyCitiesUpdateDeleteComposite.serv_eventKeyCitiesListDataSuccess(result);
					System.out.println("result getKeyCitiesData keyCitiesUpdateDeleteComposite >> "+result.size());
				}
			}
			@Override
			public void onFailure(Throwable caught) {
				System.out.println("&&** onFailure getKeyCitiesData "+caught.getStackTrace());
				if (keyCitiesListComposite!=null){
					System.out.println("Fail keyCitiesListComposite keyCitiesListComposite >> ");
					keyCitiesListComposite.ser_eventListKeyCitiesFailed(caught);
				}
				if (keyCitiesUpdateDeleteComposite!=null){
					System.out.println("Fail keyCitiesUpdateDeleteComposite keyCitiesUpdateDeleteComposite >> ");
					keyCitiesUpdateDeleteComposite.ser_eventKeyCitiesListDataFailed(caught);
				}
			}
		});
	}
	
}
