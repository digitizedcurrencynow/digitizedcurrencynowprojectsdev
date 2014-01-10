package com.digitizedcurrencynow.client;

import java.util.List;

import com.digitizedcurrencynow.shared.model.KeyCities;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;



public class KeyCitiesListComposite extends Composite {

	private CellTable <KeyCities> table = new CellTable<KeyCities>();
	private List<KeyCities> keycitiesList;
	protected KeyCitiesDelegate keyCitiesDelegate;
	protected VerticalPanel verticalPanel;
	protected Label headerLabel;
	protected ScrollPanel scrollPanel;
	
	public KeyCitiesListComposite() {
		
		verticalPanel = new VerticalPanel();
		scrollPanel   = new ScrollPanel();
		scrollPanel.setStyleName("admin-table-scrollbar");
		scrollPanel.add(table);
		
		headerLabel = new Label();
		headerLabel.setText("Cities Edit");
		headerLabel.setStyleName("admin-label-scrollbar");
		verticalPanel.add(headerLabel);
		verticalPanel.add(scrollPanel);
		
		initWidget(verticalPanel);
	}

	public void setupDisplay(){
		
		TextColumn<KeyCities> cityNameColumn = new TextColumn<KeyCities>() {
	      @Override
	      public String getValue(KeyCities keycities) {
	        return keycities.getCityName();
	      }
	    };
	    
	    TextColumn<KeyCities> cityImageUrlColumn = new TextColumn<KeyCities>() {
	      @Override
	      public String getValue(KeyCities keycities) {
	        return keycities.getCityImageUrl();
	      }
	    };
	    
	    TextColumn<KeyCities> cityLatColumn = new TextColumn<KeyCities>() {
	      @Override
	      public String getValue(KeyCities keycities) {
	        return keycities.getCityLat();
	      }
	    };
	    TextColumn<KeyCities> cityLongColumn = new TextColumn<KeyCities>() {
	      @Override
	      public String getValue(KeyCities keycities) {
	        return keycities.getCityLong();
	      }
	    };
	    TextColumn<KeyCities> cityDescDetailsColumn = new TextColumn<KeyCities>() {
	      @Override
	      public String getValue(KeyCities keycities) {
	        return keycities.getCityDescDetails();
	      }
	    };
			    
				    
			
		table.addColumn(cityNameColumn, "City Name");
	    table.addColumn(cityImageUrlColumn, "City Image");
	    table.addColumn(cityLatColumn, "City Latitude");
	    table.addColumn(cityLongColumn, "City Longitude");
	    table.addColumn(cityDescDetailsColumn, "City Details");

	    // Set the width of the table and put the table in fixed width mode.
	    table.setSize("710px", "200px");

	    // Set the width of each column.
	    table.setColumnWidth(cityNameColumn, 15.0, Unit.PCT);
	    table.setColumnWidth(cityImageUrlColumn, 15.0, Unit.PCT);
	    table.setColumnWidth(cityLatColumn, 20.0, Unit.PCT);
	    table.setColumnWidth(cityLongColumn, 20.0, Unit.PCT);
	    table.setColumnWidth(cityDescDetailsColumn, 120.0, Unit.PCT);
	    
	    // Set the total row count. This isn't strictly necessary, but it affects paging calculations, so its good habit to keep the row count up to date.
	    table.setRowCount(getKeyCitiesList().size(), true);

	    // Push the data into the widget.
	    table.setRowData(0, getKeyCitiesList());

		
	}

	public List<KeyCities> getKeyCitiesList() {
		return this.keycitiesList;
	}

	public void setKeyCitiesList(List<KeyCities> feedbackList) {
		this.keycitiesList = feedbackList;
	}
	
	public void ser_eventListKeyCitiesSucsess(List<KeyCities> result){
		setKeyCitiesList(result);
		setupDisplay();
		System.out.println("Sucessfully got  KeyCities ser_eventListKeyCitiesSucsess");
	}
	
	public void ser_eventListKeyCitiesFailed(Throwable caught){
		System.out.println("Failed to get list of KeyCities ser_eventListKeyCitiesFailed");
	}

}
