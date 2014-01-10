package com.digitizedcurrencynow.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HeaderComposite extends Composite  {

	private static HeaderCompositeUiBinder uiBinder = GWT.create(HeaderCompositeUiBinder.class);

	interface HeaderCompositeUiBinder extends UiBinder<Widget, HeaderComposite> {
	}

	public HeaderComposite() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public HeaderComposite(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
}
