package com.digitizedcurrencynow.client;

import java.util.List;

import com.digitizedcurrencynow.shared.model.KeyCities;
import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.VerticalPanel;



public class KeyCitiesUpdateDeleteComposite extends Composite  {
	
	private CellTable <KeyCities> table = new CellTable<KeyCities>();
	private List<KeyCities> keyCitiesList;
	protected KeyCitiesDelegate keyCitiesDelegate;
	protected KeyCitiesUpdateComposite keyCitiesUpdateComposite;
	protected AdminPanelComposite adminPanelComposite;
	protected VerticalPanel verticalPanel;
	protected Label headerLabel;
	protected ScrollPanel scrollPanel;
	

	public KeyCitiesUpdateDeleteComposite() {
		initWidget(table.asWidget());
	}
	public KeyCitiesUpdateDeleteComposite(AdminPanelComposite adminPanelComposite) {
		this.adminPanelComposite = adminPanelComposite;
		
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
		
		ButtonCell deletebuttonCell = new ButtonCell();
		Column<KeyCities, String> deletebuttonColumn = new Column<KeyCities, String>(deletebuttonCell) {
		  @Override
		  public String getValue(KeyCities object) {
			  return "Delete";
		  }
		};
		
		ButtonCell updatebuttonCell = new ButtonCell();
		Column<KeyCities, String> updatebuttonColumn = new Column<KeyCities, String>(updatebuttonCell) {
		  @Override
		  public String getValue(KeyCities object) {
		      return "Update";
		  }
		};
		
		table.addColumn(cityNameColumn, "City Name");
	    table.addColumn(cityImageUrlColumn, "City Image");
	    table.addColumn(cityLatColumn, "City Latitude");
	    table.addColumn(cityLongColumn, "City Longitude");
	    table.addColumn(cityDescDetailsColumn, "City Details");
	    
	    table.addColumn(deletebuttonColumn, "DELETE");
	    table.addColumn(updatebuttonColumn, "UPDATE");
	   
	    // Set the width of the table and put the table in fixed width mode.
	    table.setWidth("100%", true);
	    // Set the width of the table and put the table in fixed width mode.
	    table.setSize("860px", "200px");

	    // Set the width of each column.
	    table.setColumnWidth(cityNameColumn, 30.0, Unit.PCT);
	    table.setColumnWidth(cityImageUrlColumn, 30.0, Unit.PCT);
	    table.setColumnWidth(cityLatColumn, 30.0, Unit.PCT);
	    table.setColumnWidth(cityLongColumn, 30.0, Unit.PCT);
	    table.setColumnWidth(cityDescDetailsColumn, 50.0, Unit.PCT);
	    table.setColumnWidth(deletebuttonColumn, 20.0, Unit.PCT);
	    table.setColumnWidth(updatebuttonColumn, 20.0, Unit.PCT);
	    
	    
	   
	    // Set the total row count. This isn't strictly necessary, but it affects paging calculations, so its good habit to keep the row count up to date.
	    table.setRowCount(getKeyCitiesList().size(), true);

	    // Push the data into the widget.
	    table.setRowData(0, getKeyCitiesList());
	    
	    
	    deletebuttonColumn.setFieldUpdater(new FieldUpdater<KeyCities, String>() {
			  public void update(int index, KeyCities keycity, String value) {
			    // Value is the button value.  Object is the row object.
				  keyCitiesDelegate.removeKeyCitiesData(keycity);
			  }
		});
	    
	    updatebuttonColumn.setFieldUpdater(new FieldUpdater<KeyCities, String>() {
			  public void update(int index, KeyCities keycities, String value) {
				// Value is the button value.  Object is the row object.
				keyCitiesUpdateComposite = new KeyCitiesUpdateComposite();
				keyCitiesUpdateComposite.keyCitiesDelegate=keyCitiesDelegate;
				keyCitiesUpdateComposite.adminPanelComposite=adminPanelComposite;
				keyCitiesUpdateComposite.setKeyCitiesFields(keycities);
				keyCitiesDelegate.keyCitiesUpdateComposite=keyCitiesUpdateComposite;
				
				
				adminPanelComposite.getMultiPanel().clear();
				adminPanelComposite.getMultiPanel().add(keyCitiesUpdateComposite);
			}
		});

	
	}
	
	
	public void ser_eventDeleteKeyCitiesSuccess(){
		adminPanelComposite.listCities();
		System.out.println("***Sucessfully Delete  Key Cities  ser_eventDeleteKeyCitiesSuccess");
	}
	
	public void ser_eventDeletKeyCitiesFailed(Throwable caught){
		System.out.println("Failed to Delete Key Cities  ser_eventDeletKeyCitiesFailed");
	}
	             
	public void serv_eventKeyCitiesListDataSuccess(List<KeyCities> result){
		setKeyCitiesList(result);
		setupDisplay();
		System.out.println("***Sucessfully got  Key Cities serv_eventKeyCitiesListDataSuccess");
	}
	
	public void ser_eventKeyCitiesListDataFailed(Throwable caught){
		System.out.println("Failed to get list of Key Cities ser_eventKeyCitiesListDataFailed");
	}
	
	public List<KeyCities> getKeyCitiesList() {
		return this.keyCitiesList;
	}
	
	public void setKeyCitiesList(List<KeyCities> keyCitiesList) {
		this.keyCitiesList = keyCitiesList;
	}
	
}
