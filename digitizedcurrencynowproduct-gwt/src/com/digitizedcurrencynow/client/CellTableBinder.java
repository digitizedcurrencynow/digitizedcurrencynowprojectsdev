package com.digitizedcurrencynow.client;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.digitizedcurrencynow.shared.model.UserProfile;
import com.google.gwt.cell.client.CheckboxCell;
import com.google.gwt.cell.client.EditTextCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.view.client.DefaultSelectionEventManager;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.SelectionModel;



public class CellTableBinder extends Composite {

	private static CellTableBinderUiBinder uiBinder = GWT.create(CellTableBinderUiBinder.class);
	private ListDataProvider<UserProfile> dataProvider = new ListDataProvider<UserProfile>();
	@UiField(provided = true)
	CellTable<UserProfile> cellTable;

	//The pager used to change the range of data.
	@UiField(provided = true)
	SimplePager pager;

	interface CellTableBinderUiBinder extends UiBinder<Widget, CellTableBinder> {
	}

	public CellTableBinder() {
		
		initWidget(onInitialize());
		
		List<UserProfile> l = new ArrayList<UserProfile>();
		//(Long id, String userName, String userEmail, String userPassword, String userPhone, String userRole, String userAccountStatus)
		UserProfile u1 = new UserProfile(1L, "Bilal","value1","calue","aa","bb","cc");
		UserProfile u2 = new UserProfile(2L, "Jun","value2","calue3","aa2","bb2","cc2");
		l.add(u1);
		l.add(u2);
		dataProvider.setList(l);
		
	}
	
	
	  /**
	   * Initialize this example.
	   */
	  //@Override
	public Widget onInitialize() {
	    // Create a CellTable.

	    // Set a key provider that provides a unique key for each contact. If key is
	    // used to identify contacts when fields (such as the name and address)
	    // change.
	    //cellTable = new CellTable<UserProfile>(ContactDatabase.UserProfile.KEY_PROVIDER);
	    cellTable = new CellTable<UserProfile>(UserProfile.KEY_PROVIDER);
	    cellTable.setWidth("100%", true);

	    // Do not refresh the headers and footers every time the data is updated.
	    cellTable.setAutoHeaderRefreshDisabled(true);
	    cellTable.setAutoFooterRefreshDisabled(true);

	    // Attach a column sort handler to the ListDataProvider to sort the list.
	    //ListHandler<UserProfile> sortHandler = new ListHandler<UserProfile>(ContactDatabase.get().getDataProvider().getList());
	    ListHandler<UserProfile> sortHandler = new ListHandler<UserProfile>(dataProvider.getList());
	    cellTable.addColumnSortHandler(sortHandler);

	    // Create a Pager to control the table.
	    SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
	    pager = new SimplePager(TextLocation.CENTER, pagerResources, false, 0, true);
	    pager.setDisplay(cellTable);

	    // Add a selection model so we can select cells.
	    final SelectionModel<UserProfile> selectionModel = new MultiSelectionModel<UserProfile>(UserProfile.KEY_PROVIDER);
	    cellTable.setSelectionModel(selectionModel,DefaultSelectionEventManager.<UserProfile> createCheckboxManager());

	    // Initialize the columns.
	    initTableColumns(selectionModel, sortHandler);

	    // Add the CellList to the adapter in the database.
	   // ContactDatabase.get().addDataDisplay(cellTable);
	    dataProvider.addDataDisplay(cellTable);
	   

	    // Create the UiBinder.
	    //Binder uiBinder = GWT.create(Binder.class);
	    Widget widget = uiBinder.createAndBindUi(this);

	    return widget;
	  }

	  /**
	   * Add the columns to the table.
	   * userName
	   * userEmail;
	     userPassword;
	     userPhone;
	     userRole;
	     userAccountStatus;
	   */
	
	
	  
	  
	  private void initTableColumns( final SelectionModel<UserProfile> selectionModel,  ListHandler<UserProfile> sortHandler) {
	    // Checkbox column. This table will uses a checkbox column for selection.  Alternatively, you can call cellTable.setSelectionEnabled(true) to enable mouse selection.
		Column<UserProfile, Boolean> checkColumn = new Column<UserProfile, Boolean>(new CheckboxCell(true, false)) {
	      @Override
	      public Boolean getValue(UserProfile object) {
	        // Get the value from the selection model.
	        return selectionModel.isSelected(object);
	      }
	    };
	    cellTable.addColumn(checkColumn, SafeHtmlUtils.fromSafeConstant("<br/>"));
	    cellTable.setColumnWidth(checkColumn, 40, Unit.PX);

	    // userName
	    Column<UserProfile, String> userNameColumn = new Column<UserProfile, String>(new EditTextCell()) {
	      @Override
	      public String getValue(UserProfile object) {
	        return object.getUserName();
	      }
	    };
	    
	    userNameColumn.setSortable(true);
	    sortHandler.setComparator(userNameColumn, new Comparator<UserProfile>() {
	      @Override
	      public int compare(UserProfile o1, UserProfile o2) {
	        return o1.getUserName().compareTo(o2.getUserName());
	      }
	    });
	    cellTable.addColumn(userNameColumn,"User Name ");  //cellTable.addColumn(firstNameColumn, constants.cwCellTableColumnFirstName());
	    userNameColumn.setFieldUpdater(new FieldUpdater<UserProfile, String>() {
	      @Override
	      public void update(int index, UserProfile object, String value) {
	        // Called when the user changes the value.
	        object.setUserName(value);
	        //ContactDatabase.get().refreshDisplays();
	        dataProvider.refresh();
	      }
	    });
	    cellTable.setColumnWidth(userNameColumn, 20, Unit.PCT);
	   
	    // User Email 
	    Column<UserProfile, String> userEmailColumn = new Column<UserProfile, String>(new EditTextCell()) {
	      @Override
	      public String getValue(UserProfile object) {
	        return object.getUserEmail();
	      }
	    };
	    userEmailColumn.setSortable(true);
	    sortHandler.setComparator(userEmailColumn, new Comparator<UserProfile>() {
	      @Override
	      public int compare(UserProfile o1, UserProfile o2) {
	        return o1.getUserEmail().compareTo(o2.getUserEmail());
	      }
	    });
	    cellTable.addColumn(userEmailColumn,"User Email"); //cellTable.addColumn(lastNameColumn, constants.cwCellTableColumnLastName());
	    userEmailColumn.setFieldUpdater(new FieldUpdater<UserProfile, String>() {
	      @Override
	      public void update(int index, UserProfile object, String value) {
	        // Called when the user changes the value.
	        object.setUserEmail(value);
	        //ContactDatabase.get().refreshDisplays();
	      }
	    });
	    cellTable.setColumnWidth(userEmailColumn, 20, Unit.PCT);

	    // UserPassword.
	    Column<UserProfile, String> userPasswordColumn = new Column<UserProfile, String>(new TextCell()) {
	      @Override
	      public String getValue(UserProfile object) {
	        return object.getUserPassword();
	      }
	    };
	    userPasswordColumn.setSortable(true);
	    userPasswordColumn.setDefaultSortAscending(false);
	    sortHandler.setComparator(userPasswordColumn, new Comparator<UserProfile>() {
	      @Override
	      public int compare(UserProfile o1, UserProfile o2) {
	        return o1.getUserPassword().compareTo(o2.getUserPassword());
	      }
	    });
	    
	    cellTable.addColumn(userPasswordColumn, "User Password"); 
	    userPasswordColumn.setFieldUpdater(new FieldUpdater<UserProfile, String>() {
			@Override
			public void update(int index, UserProfile object, String value) {
				// Called when the user changes the value.
				object.setUserPassword(value);
				// ContactDatabase.get().refreshDisplays();
			}
		});
	    cellTable.setColumnWidth(userPasswordColumn, 60, Unit.PCT);
	    
	    // User Role.
	    Column<UserProfile, String> userRoleColumn = new Column<UserProfile, String>(new TextCell()) {
	      @Override
	      public String getValue(UserProfile object) {
	        return object.getUserRole();
	      }
	    };
	    
	    userRoleColumn.setSortable(true);
	    userRoleColumn.setDefaultSortAscending(false);
	    sortHandler.setComparator(userRoleColumn, new Comparator<UserProfile>() {
	      @Override
	      public int compare(UserProfile o1, UserProfile o2) {
	        return o1.getUserRole().compareTo(o2.getUserRole());
	      }
	    });
	    
	    cellTable.addColumn(userRoleColumn, "User Role"); 
	    userRoleColumn.setFieldUpdater(new FieldUpdater<UserProfile, String>() {
			@Override
			public void update(int index, UserProfile object, String value) {
				// Called when the user changes the value.
				object.setUserRole(value);
				// ContactDatabase.get().refreshDisplays();
			}
		});
	    cellTable.setColumnWidth(userRoleColumn, 60, Unit.PCT);
	    
		Column<UserProfile, String> userAccountStatusColumn = new Column<UserProfile, String>(new TextCell()) {
			@Override
			public String getValue(UserProfile object) {
				return object.getUserAccountStatus();
			}
		};

		userAccountStatusColumn.setSortable(true);
		userAccountStatusColumn.setDefaultSortAscending(false);
		sortHandler.setComparator(userAccountStatusColumn, new Comparator<UserProfile>() {
			@Override
			public int compare(UserProfile o1, UserProfile o2) {
				return o1.getUserAccountStatus().compareTo(o2.getUserAccountStatus());
			}
		});

		cellTable.addColumn(userRoleColumn, "User Role");
		userAccountStatusColumn.setFieldUpdater(new FieldUpdater<UserProfile, String>() {
			@Override
			public void update(int index, UserProfile object, String value) {
				// Called when the user changes the value.
				object.setUserAccountStatus(value);
				// ContactDatabase.get().refreshDisplays();
			}
		});
		cellTable.setColumnWidth(userAccountStatusColumn, 60, Unit.PCT);
	    
	    /*
	    // Category.
	    final Category[] categories = ContactDatabase.get().queryCategories();
	    List<String> categoryNames = new ArrayList<String>();
	    for (Category category : categories) {
	      categoryNames.add(category.getDisplayName());
	    }
	    
	    SelectionCell categoryCell = new SelectionCell(categoryNames);
	    Column<UserProfile, String> categoryColumn = new Column<UserProfile, String>(
	        categoryCell) {
	      @Override
	      public String getValue(UserProfile object) {
	        return object.getCategory().getDisplayName();
	      }
	    };
	    
	    cellTable.addColumn(categoryColumn, "Category"); //cellTable.addColumn(categoryColumn, constants.cwCellTableColumnCategory());
	    categoryColumn.setFieldUpdater(new FieldUpdater<UserProfile, String>() {
	      @Override
	      public void update(int index, UserProfile object, String value) {
	        for (Category category : categories) {
	          if (category.getDisplayName().equals(value)) {
	            object.setCategory(category);
	          }
	        }
	        ContactDatabase.get().refreshDisplays();
	      }
	    });9
	    cellTable.setColumnWidth(categoryColumn, 130, Unit.PX);*/
	    
	  }

}
