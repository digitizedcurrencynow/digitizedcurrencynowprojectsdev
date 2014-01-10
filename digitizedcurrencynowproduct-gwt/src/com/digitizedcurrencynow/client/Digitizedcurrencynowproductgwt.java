package com.digitizedcurrencynow.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.RootPanel;

/*
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
*/

//TODO Validate Password
//TODO Improve Ui buttons 
//TODO Add Admin function 
//TODO Add Search ability to loggin Page

//TODO Create City Suggest List 
//TODO Remember password Screens.
//TODO Add search in all screens
//TODO Improve Screen usability UIX
//TODO Create message Screen login Retrive etc.

//TODO Add Drop Values on all screens 80 done

//TODO Facebook APi
//TODO Send email 
//TODO Get Cites from DB instread of Ui hard code.

//TODO Add Country to KeyCities.
//TODO Bring Fiend feed based on logge din user 
//TODO Connect Add my Trip List 
//TODO Connect Add my Edit and update
//TODO Create flows100
//TODO Logout 100
//TODO Fix refresh login issue Done 100
//TODO CreateBlog login 100
//TODO Add Retrieved named on logged in Screen.100
//TODO Merger Trip and KeyCities. Done 100
//TODO Save User name in the friends feed Done
//TODO Link signup Page with login backend.-Done
//TODO Navigatuon -Done
//TODO Condional login Header -Done
//TODO Add Delegates in the Keycity and Freind Feed.-Done 
//TODO Add All Columns in the user profile list -Done
//TODO Create Trip and Friend Add and Delete -Done
//TODO Add Delegates to the Add Update/Remove Composites List do not need Delegate. -Done


/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Digitizedcurrencynowproductgwt implements EntryPoint {

	// http://127.0.0.1:8888/GWTProject.html?gwt.codesvr=127.0.0.1:9997

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		System.out.println("Start");

		//userProfileDeletgate = new UserProfileDelegate();
		//userProfileDeletgate.sparekeyplease = this;
		//userProfileDeletgate.getUserName();
		
		HeaderComposite  headerComposite = new HeaderComposite();
		//FeedbackComposite feedbackComposite = new FeedbackComposite();
		//SigninComposite signinComposite = new SigninComposite();
		CellTableBinder cellTableBinder = new CellTableBinder();
		FooterLinks footerlinks = new FooterLinks();
		AdminPanelComposite adminPanelComposite = new AdminPanelComposite();
	    
		RootPanel.get("headerContainer").add(headerComposite);
	    RootPanel.get("application").add(adminPanelComposite);
	    RootPanel.get("footerlinksContainer").add(footerlinks);
		

		System.out.println(" End");

	}

	public void onValueChange(ValueChangeEvent<String> e) {
		DigitizedCurrencyNowFlowControl.go(History.getToken());
	}

	// User Profile
	public void service_eventSparekeyFindUserProfileSuccess() {
		DigitizedCurrencyNowFlowControl.go("loginsuccess");
		
	}

	public void service_eventSparekeyFindUserProfileFailed(Throwable caught) {
		System.out.println("Failed to found User profile service_eventFindUserProfileFailed");
	}

	
	

}
