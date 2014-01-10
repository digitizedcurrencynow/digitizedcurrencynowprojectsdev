package com.digitizedcurrencynow.client;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;

public class DigitizedCurrencyNowFlowControl {
	
	private static DigitizedCurrencyNowFlowControl instance;
	
	private DigitizedCurrencyNowFlowControl() {
		
	}
	
	public static void go(String token) {
		
		// Can probably make these constants in this class
		
	}
	
	public static void go(Composite composite) {
	    if (instance == null){ // not sure why we need this yet since everything is static.
	    	instance = new DigitizedCurrencyNowFlowControl(); 
	    }
	    
	    RootPanel.get("application").clear();
	    RootPanel.get("application").getElement().getStyle().setPosition(Position.RELATIVE); // not sure why, but GWT throws an exception without this. Adding to CSS doesn't work.
	    
	    // add, determine height/width, center, then move. height/width are unknown until added to document. Catch-22!
	    
	    RootPanel.get("application").add(composite);
	    
	    //int left = Window.getClientWidth() / 2 - composite.getOffsetWidth() / 2; // find center
	    //int top = Window.getClientHeight() / 2 - composite.getOffsetHeight() / 2;
	    //RootPanel.get("application").setWidgetPosition(composite, left, top);
	    History.newItem(composite.getTitle()); // TODO: need to change and implement (or override) this method on each screen
	}
	
	

}
