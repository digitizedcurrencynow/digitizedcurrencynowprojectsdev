package com.digitizedcurrencynow.client;

import java.util.ArrayList;
import java.util.List;

import com.digitizedcurrencynow.shared.model.KeyCities;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;


public class KeyCitiesUpdateComposite extends Composite {

	private static KeyCitiesUpdateCompositeUiBinder uiBinder = GWT.create(KeyCitiesUpdateCompositeUiBinder.class);

	interface KeyCitiesUpdateCompositeUiBinder extends UiBinder<Widget, KeyCitiesUpdateComposite> {
	}
	
	protected KeyCitiesDelegate keyCitiesDelegate;
	protected AdminPanelComposite adminPanelComposite;
		
	
	private String country[]={"USA","Canada","Europe"};
	private List<String> countryLst;

	Long keycityId;
	
	@UiField
	Button updatebutton;
	@UiField
	TextBox cityNameTxt;
	@UiField
	TextBox cityImageUrlTxt;
	@UiField
	TextBox cityLatTxt;
	@UiField
	TextBox cityLongTxt;
	@UiField
	TextBox cityDescDetailsTxt;
	@UiField
	ListBox countryNameLst;
	
	
	public KeyCitiesUpdateComposite() {
		initWidget(uiBinder.createAndBindUi(this));
		initilizeCitiesList();
		setCountryNameLst(countryLst);
	}

	@UiHandler("updatebutton")
	void onClick(ClickEvent e) {
		KeyCities keycity = getKeyCitiesFields();
		keyCitiesDelegate.updateKeyCitiesData(keycity);
		Window.alert("Update City buttonHello!");
	}
	
	private void initilizeCitiesList(){
		countryLst = new ArrayList<String>();
		for (int x = 0 ; x < country.length; x++ ){
			countryLst.add(country[x]);
		}
	}

	public void setText(String text) {
		updatebutton.setText(text);
	}

	public String getText() {
		return updatebutton.getText();
	}
	
	private KeyCities getKeyCitiesFields(){
		
		KeyCities keycities= new KeyCities();
		
		keycities.setId(getKeycityId());
		keycities.setCityName(getCityNameTxt().getText());
		keycities.setCityImageUrl(getCityImageUrlTxt().getText());
		keycities.setCityLat(getCityLatTxt().getText());
		keycities.setCityLong(getCityLongTxt().getText());
		keycities.setCityDescDetails(getCityDescDetailsTxt().getText());
		keycities.setCountryName(getCountryNameLst().getItemText(getCountryNameLst().getSelectedIndex()));
		
		return keycities;
	}

	public void setKeyCitiesFields(KeyCities keycities ){
		
		this.setKeycityId(keycities.getId());
		this.setCityNameTxt(keycities.getCityName());
		this.setCityImageUrlTxt(keycities.getCityImageUrl());
		this.setCityLatTxt(keycities.getCityLat());
		this.setCityLongTxt(keycities.getCityLong());
		this.setCityDescDetailsTxt(keycities.getCityDescDetails());
		this.getCountryNameLst().setItemSelected(countryLst.indexOf(keycities.getCountryName()),true);
	
	}
	
	
	
	public void ser_eventUpdateKeyCitiesSucess(){
		adminPanelComposite.listCities();
		System.out.println("Composite Sucessfully Saved Key City in ser_eventUpdateKeyCitiesSucess");
	}
	
	public void ser_eventUpdateKeyCitiesFailed(Throwable caught){
		System.out.println("Composite Failed  to Save  Key City ser_eventUpdateKeyCitiesFailed");
	}
	
	

	public Long getKeycityId() {
		return keycityId;
	}

	public void setKeycityId(Long keycityId) {
		this.keycityId = keycityId;
	}

	public TextBox getCityNameTxt() {
		return cityNameTxt;
	}

	public void setCityNameTxt(String cityNameTxt) {
		this.cityNameTxt.setText(cityNameTxt);
	}

	public TextBox getCityImageUrlTxt() {
		return cityImageUrlTxt;
	}

	public void setCityImageUrlTxt(String cityImageUrlTxt) {
		this.cityImageUrlTxt.setText(cityImageUrlTxt);
	}
	
	public TextBox getCityLatTxt() {
		return cityLatTxt;
	}

	public void setCityLatTxt(String cityLatTxt) {
		this.cityLatTxt.setText(cityLatTxt);
	}

	public TextBox getCityLongTxt() {
		return cityLongTxt;
	}

	public void setCityLongTxt(String cityLongTxt) {
		this.cityLongTxt.setText(cityLongTxt);
	}

	public TextBox getCityDescDetailsTxt() {
		return cityDescDetailsTxt;
	}

	public void setCityDescDetailsTxt(String cityDescDetailsTxt) {
		this.cityDescDetailsTxt.setText(cityDescDetailsTxt);
	}
	
	public ListBox getCountryNameLst() {
		return countryNameLst;
	}

	public void setCountryNameLst(List<String>  countryLst) {
		for (int x =0 ; x<countryLst.size();x++) {
			  this.countryNameLst.addItem((String)countryLst.get(x));
		}
	}

}
