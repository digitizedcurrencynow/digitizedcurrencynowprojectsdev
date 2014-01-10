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
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;



public class KeyCitiesAdd extends Composite implements HasText {

	private static KeyCitiesAddUiBinder uiBinder = GWT.create(KeyCitiesAddUiBinder.class);

	interface KeyCitiesAddUiBinder extends UiBinder<Widget, KeyCitiesAdd> {
	}
	
	protected KeyCitiesDelegate keyCitiesDelegate;
	protected AdminPanelComposite adminPanelComposite;
	
	private String country[]={"USA","Canada","Europe"};
	private List<String> countryLst;
	
	@UiField
	Button savebutton;
	
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
	
	@UiField
	TextArea secutityToken;
	
	public KeyCitiesAdd() {
		initWidget(uiBinder.createAndBindUi(this));
		initilizeCitiesList();
		setCountryNameLst(countryLst);
		
	}

	private void initilizeCitiesList(){
		countryLst = new ArrayList<String>();
		for (int x = 0 ; x < country.length; x++ ){
			countryLst.add(country[x]);
		}
	}

	private KeyCities getKeyCitiesFields(){
		
		KeyCities keycities= new KeyCities();
		
		keycities.setCityName(getCityNameTxt().getText());
		keycities.setCityImageUrl(getCityImageUrlTxt().getText());
		keycities.setCityLat(getCityLatTxt().getText());
		keycities.setCityLong(getCityLongTxt().getText());
		keycities.setCityDescDetails(getCityDescDetailsTxt().getText());
		keycities.setCountryName(getCountryNameLst().getItemText(getCountryNameLst().getSelectedIndex()));
		return keycities;
	}
	
	@UiHandler("savebutton")
	void onClickSave(ClickEvent e) {
		Window.alert("Save City buttonHello!");
		KeyCities keycity = getKeyCitiesFields();
		keyCitiesDelegate.saveKeyCityData(keycity);
	}
	
	public void ser_eventSaveKeyCitiesSucess(){
		adminPanelComposite.listCities();
		System.out.println("Composite Sucessfully Saved Feedback in ser_eventSaveKeyCitiesSucess");
	}
	
	public void ser_eventSaveKeyCitiesFailed(Throwable caught){
		System.out.println("Composite Failed  to Save Feedback ser_eventSaveKeyCitiesFailed");
	}

	public TextBox getCityNameTxt() {
		return cityNameTxt;
	}

	public void setCityNameTxt(TextBox cityNameTxt) {
		this.cityNameTxt = cityNameTxt;
	}

	public TextBox getCityImageUrlTxt() {
		return cityImageUrlTxt;
	}

	public void setCityImageUrlTxt(TextBox cityImageUrlTxt) {
		this.cityImageUrlTxt = cityImageUrlTxt;
	}
	
	public TextBox getCityLatTxt() {
		return cityLatTxt;
	}

	public void setCityLatTxt(TextBox cityLatTxt) {
		this.cityLatTxt = cityLatTxt;
	}

	public TextBox getCityLongTxt() {
		return cityLongTxt;
	}

	public void setCityLongTxt(TextBox cityLongTxt) {
		this.cityLongTxt = cityLongTxt;
	}

	public TextBox getCityDescDetailsTxt() {
		return cityDescDetailsTxt;
	}

	public void setCityDescDetailsTxt(TextBox cityDescDetailsTxt) {
		this.cityDescDetailsTxt = cityDescDetailsTxt;
	}
	
	public ListBox getCountryNameLst() {
		return countryNameLst;
	}

	public void setCountryNameLst(List<String>  countryLst) {
		for (int x =0 ; x<countryLst.size();x++) {
			  this.countryNameLst.addItem((String)countryLst.get(x));
		}
	}
	
	public void setText(String text) {
		savebutton.setText(text);
	}

	public String getText() {
		return savebutton.getText();
	}
	
	public TextArea getSecutityToken() {
		return secutityToken;
	}

	public void setSecutityToken(String secutityToken) {
		this.secutityToken.setText(secutityToken);
	}
	
	

}
