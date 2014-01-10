package com.digitizedcurrencynow.client;


import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;


public class FooterLinks extends Composite {

	private static FooterLinksUiBinder uiBinder = GWT.create(FooterLinksUiBinder.class);
	private String sparekeypleaseLink="http://sparekeyplease.tumblr.com/";
	
	interface FooterLinksUiBinder extends UiBinder<Widget, FooterLinks> {
	}
	
	@UiField
	Button home;

	@UiField
	Button aboutus;
	
	@UiField
	Button faq;
	
	@UiField
	Button contactus;
	
	public FooterLinks() {
		initWidget(uiBinder.createAndBindUi(this));
		home.setText("home");
		aboutus.setText("aboutus");
		faq.setText("faq");
		contactus.setText("contactus");
	}

	public FooterLinks(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setHome(String text) {
		home.setText(text);
	}

	public String getHome() {
		return home.getText();
	}

	public void setAboutus(String text) {
		aboutus.setText(text);
	}

	public String getAboutus() {
		return aboutus.getText();
	}
	
	public void setFaq(String text) {
		faq.setText(text);
	}

	public String getFaq() {
		return faq.getText();
	}
	
	
	public void setContactus(String text) {
		contactus.setText(text);
	}

	
	
	@UiHandler("home")
	void onClickHome(ClickEvent e) {
		DigitizedCurrencyNowFlowControl.go("home");
	}
	@UiHandler("aboutus")
	void onClickAboutus(ClickEvent e) {
		DigitizedCurrencyNowFlowControl.go("ourteam");
	}
	@UiHandler("faq")
	void onClickFaq(ClickEvent e) {
		DigitizedCurrencyNowFlowControl.go("faq");
	}
	@UiHandler("contactus")
	void onClickCcontactus(ClickEvent e) {
		DigitizedCurrencyNowFlowControl.go("feedback");
	}
	
	
	public static native void redirect(String url)/*-{
	$wnd.location = url;
	}-*/;
	

	@UiHandler("home") 
	void onMouseHome(MouseOverEvent e) {
		home.setStyleName("buttonlinks-mouse");
	}
	@UiHandler("home") 
	void onMouseOutHome(MouseOutEvent e) {
		home.setStyleName("buttonlinks");
	}
	
	@UiHandler("aboutus") 
	void onMouseAboutus(MouseOverEvent e) {
		aboutus.setStyleName("buttonlinks-mouse");
	}
	@UiHandler("aboutus") 
	void onMouseOutAboutus(MouseOutEvent e) {
		aboutus.setStyleName("buttonlinks");
	}
	
	
	@UiHandler("faq") 
	void onMouseFaq(MouseOverEvent e) {
		faq.setStyleName("buttonlinks-mouse");
	}
	@UiHandler("faq") 
	void onMouseOutFaq(MouseOutEvent e) {
		faq.setStyleName("buttonlinks");
	}
	
	@UiHandler("contactus") 
	void onMouseContactus(MouseOverEvent e) {
		contactus.setStyleName("buttonlinks-mouse");
	}
	@UiHandler("contactus") 
	void onMouseOutContactus(MouseOutEvent e) {
		contactus.setStyleName("buttonlinks");
	}
	


}
