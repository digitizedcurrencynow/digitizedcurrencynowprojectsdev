package com.digitizedcurrencynow.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class AdminPanelComposite extends Composite  {

	private static AdminPanelCompositeUiBinder uiBinder = GWT.create(AdminPanelCompositeUiBinder.class);

	interface AdminPanelCompositeUiBinder extends UiBinder<Widget, AdminPanelComposite> {
	}
	

	@UiField
	SplitLayoutPanel splitpanel ;
	@UiField
	VerticalPanel multiPanel;
	@UiField
	VerticalPanel linksPanel ;
	@UiField
	Tree tree;
	
	AdminPanelComposite admincomposite;
    /*private TripsSave tripsSave;
	private TripsListComposite tripsListComposite;
	private TripsUpdateDeleteComposite tripsUpdateDeleteComposite;
	private TripsDelegate tripsDelegate;
	
	private FeedbackComposite  feedbackComposite ;
	private FeedbackListComposite feedbackListComposite ;
	private FeedbackUpdateDeleteComposite feedbackUpdateDeleteComposite ;
	private FeedbackDelegate feedbackDelegate;
	
	private UserProfileSignupComposite userProfileSignupComposite;
	private UserProfileListComposite userProfileListComposite ;
	private UserProfileUpdateDeleteComposite userProfileUpdateDeleteComposite;
	private UserProfileDelegate userProfileDelegate;
	
	*/
	
	private KeyCitiesAdd keyCitiesAdd;
	private KeyCitiesListComposite keyCitiesListComposite ;
	private KeyCitiesUpdateDeleteComposite keyCitiesUpdateDeleteComposite;
	private KeyCitiesDelegate keyCitiesDelegate;
	
	TreeItem rootCities;
	
	//TreeItem rootUser;
    //TreeItem rootfeedback;
    //TreeItem rootTrip;
    //TreeItem rootFeedback;
    
    
    public AdminPanelComposite() {
		initWidget(uiBinder.createAndBindUi(this));
		setupTree();
		linksPanel.add(tree);
		splitpanel.setWidgetToggleDisplayAllowed(linksPanel, true);
		
		keyCitiesDelegate = new KeyCitiesDelegate();
		admincomposite=this;
		
		/*
		tripsDelegate = new TripsDelegate();
		feedbackDelegate = new FeedbackDelegate();
		friendsFeedDelegate = new FriendsFeedDelegate();
		userProfileDelegate = new UserProfileDelegate();
		 */	
	}
    
    
    
	@SuppressWarnings("deprecation")
    private void setupTree(){
    	
    	tree = new Tree();
    	
    	rootCities = new TreeItem(imageItemHTML("Cities"));
	    tree.addItem(rootCities);
	    addImageItem(rootCities, "Add Cities" );
	    addImageItem(rootCities, "List Cities" );
	    addImageItem(rootCities, "Edit Cities" );
	    
	    /*
	     
	    rootUser = new TreeItem(imageItemHTML("User"));
	    tree.addItem(rootUser);
	    addImageItem(rootUser, "Add Users" );
	    addImageItem(rootUser, "List Users" );
	    addImageItem(rootUser, "Edit Users" );
	    
		rootfeedback = new TreeItem(imageItemHTML("Feedback"));
	    tree.addItem(rootfeedback);
	    addImageItem(rootfeedback, "Add Feedback" );
	    addImageItem(rootfeedback, "List Feedback" );
	    addImageItem(rootfeedback, "Edit Feedback" );

	    rootTrip = new TreeItem(imageItemHTML("Trip"));
	    tree.addItem(rootTrip);
	    addImageItem(rootTrip, "Add Trips" );
	    addImageItem(rootTrip, "List Trips" );
	    addImageItem(rootTrip, "Edit Trips" );
	    
	  	rootFeedback = new TreeItem(imageItemHTML("FriendFeed"));
	    tree.addItem(rootFeedback);
	    addImageItem(rootFeedback, "Add FriendFeed" );
	    addImageItem(rootFeedback, "List FriendFeed" );
	    addImageItem(rootFeedback, "Edit FriendFeed" );
	    */
	    	    
	    //rootUser.setState(true);
	    rootCities.setState(true);
	    addTreeHandlers();
    }
	
	/*
	
	 public void listUsers() {
		userProfileListComposite= new UserProfileListComposite();
		userProfileListComposite.userProfileDelegate=userProfileDelegate;
		userProfileDelegate.userProfileListComposite=userProfileListComposite;
		userProfileDelegate.getAllUserProfileData();
		multiPanel.clear();
		multiPanel.add(userProfileListComposite);
	}
	
	public void listFeedback() {
		feedbackListComposite= new FeedbackListComposite();
		feedbackListComposite.feedbackDelegate=feedbackDelegate;
		feedbackDelegate.feedbackListComposite=feedbackListComposite;
		feedbackDelegate.getFeedbackData();
		multiPanel.clear();
		multiPanel.add(feedbackListComposite);
	}
	
	public void listeditFeedback() {
		feedbackUpdateDeleteComposite = new FeedbackUpdateDeleteComposite(admincomposite);
  		feedbackUpdateDeleteComposite.feedbackDelegate=feedbackDelegate;
    	feedbackDelegate.feedbackUpdateDeleteComposite=feedbackUpdateDeleteComposite;
		feedbackDelegate.getFeedbackUpdateDeleteData();
		multiPanel.clear();
		multiPanel.add(feedbackUpdateDeleteComposite);
	}
	
	public void listTrip() {
		tripsListComposite= new TripsListComposite();
		tripsListComposite.tripsDelegate=tripsDelegate;
		tripsDelegate.tripsListComposite=tripsListComposite;
		tripsDelegate.getTripsData();
		multiPanel.clear();
		multiPanel.add(tripsListComposite);
	}
	
	
	
	public void listFriendfeed() {
		friendsFeedListComposite= new FriendsFeedListComposite();
		friendsFeedListComposite.friendsFeedDelegate=friendsFeedDelegate;
		friendsFeedDelegate.friendsFeedListComposite=friendsFeedListComposite;
		friendsFeedDelegate.getAllFriendsFeedListData();
		multiPanel.clear();
		multiPanel.add(friendsFeedListComposite);
	}
	public void listeditFriendfeed() {
		friendsFeedUpdateDeleteComposite= new FriendsFeedUpdateDeleteComposite(admincomposite);
 		friendsFeedUpdateDeleteComposite.friendsFeedDelegate=friendsFeedDelegate;
       	friendsFeedDelegate.friendsFeedUpdateDeleteComposite=friendsFeedUpdateDeleteComposite;
       	friendsFeedDelegate.getAllFriendsFeedListData();
   		multiPanel.clear();
   		multiPanel.add(friendsFeedUpdateDeleteComposite);
	}
	
	
	
	*/
	
	public void listCities() {
		keyCitiesListComposite= new KeyCitiesListComposite();
		keyCitiesListComposite.keyCitiesDelegate=keyCitiesDelegate;
		keyCitiesDelegate.keyCitiesListComposite=keyCitiesListComposite;
		keyCitiesDelegate.getKeyCitiesData();
		multiPanel.clear();
		multiPanel.add(keyCitiesListComposite);
	}
	
	
	
	
	public void addTreeHandlers(){
		tree.addSelectionHandler(new SelectionHandler<TreeItem>() {
		  @Override
		  public void onSelection(SelectionEvent<TreeItem> event) {
		    TreeItem item = (TreeItem) event.getSelectedItem();
		    /*
		    if (item.getText().equalsIgnoreCase("Add Users")){ //Users
		    	userProfileSignupComposite = new UserProfileSignupComposite();
                userProfileSignupComposite.userProfileDelegate=userProfileDelegate;
		    	userProfileDelegate.userProfileSignupComposite=userProfileSignupComposite;
		    	userProfileSignupComposite.adminPanelComposite=admincomposite;
				multiPanel.clear();
		   		multiPanel.add(userProfileSignupComposite);
		    }
		    else if (item.getText().equalsIgnoreCase("List Users")){
		    	listUsers();
		    }
		    else if (item.getText().equalsIgnoreCase("Edit Users")){
		    	userProfileUpdateDeleteComposite= new UserProfileUpdateDeleteComposite(admincomposite);
	     		userProfileUpdateDeleteComposite.userProfileDelegate=userProfileDelegate;
		    	userProfileDelegate.userProfileUpdateDeleteComposite=userProfileUpdateDeleteComposite;
		       	userProfileDelegate.getAllUserProfileData();
		   		multiPanel.clear();
		   		multiPanel.add(userProfileUpdateDeleteComposite);
		    }
		    
		    else if (item.getText().equalsIgnoreCase("Add Feedback")){ //Feedback
		    	feedbackComposite = new FeedbackComposite();
				feedbackComposite.feedbackDelegate=feedbackDelegate;
				feedbackDelegate.feedbackComposite=feedbackComposite;
				feedbackComposite.adminPanelComposite=admincomposite;
				multiPanel.clear();
				multiPanel.add(feedbackComposite);
		    }
		    else if (item.getText().equalsIgnoreCase("List Feedback")){
		    	listFeedback();
		    
		    }
		    else if (item.getText().equalsIgnoreCase("Edit Feedback")){
		    	feedbackUpdateDeleteComposite = new FeedbackUpdateDeleteComposite(admincomposite);
		  		feedbackUpdateDeleteComposite.feedbackDelegate=feedbackDelegate;
		    	feedbackDelegate.feedbackUpdateDeleteComposite=feedbackUpdateDeleteComposite;
				feedbackDelegate.getFeedbackUpdateDeleteData();
				multiPanel.clear();
				multiPanel.add(feedbackUpdateDeleteComposite);
		    }
		    
		    else if (item.getText().equalsIgnoreCase("Add Trips")){ //Trips
		    	tripsSave= new TripsSave();
				tripsSave.tripsDelegate=tripsDelegate;
				tripsDelegate.tripsSave=tripsSave;
				tripsSave.adminPanelComposite=admincomposite;
				multiPanel.clear();
				multiPanel.add(tripsSave);
		    }
		    else if (item.getText().equalsIgnoreCase("List Trips")){
		    	listTrip();
		    }
		    else if (item.getText().equalsIgnoreCase("Edit Trips")){
		    	tripsUpdateDeleteComposite= new TripsUpdateDeleteComposite(admincomposite);
		  		tripsUpdateDeleteComposite.tripsDelegate=tripsDelegate;
				tripsDelegate.tripsUpdateDeleteComposite=tripsUpdateDeleteComposite;
				tripsDelegate.getTripsUpdateDeleteData();
				multiPanel.clear();
				multiPanel.add(tripsUpdateDeleteComposite);
		    }
		    
		    else if (item.getText().equalsIgnoreCase("Add FriendFeed")){ //FriendFeed
		    	friendsFeedSave = new FriendsFeedSave();
				friendsFeedSave.friendsFeedDelegate=friendsFeedDelegate;
				friendsFeedDelegate.friendsFeedSave=friendsFeedSave;
				friendsFeedSave.adminPanelComposite=admincomposite;
		   		multiPanel.clear();
		   		multiPanel.add(friendsFeedSave);
		    }
		    else if (item.getText().equalsIgnoreCase("List FriendFeed")){
		    	listFriendfeed();
		    }
		    else if (item.getText().equalsIgnoreCase("Edit FriendFeed")){
		    	friendsFeedUpdateDeleteComposite= new FriendsFeedUpdateDeleteComposite(admincomposite);
	     		friendsFeedUpdateDeleteComposite.friendsFeedDelegate=friendsFeedDelegate;
		       	friendsFeedDelegate.friendsFeedUpdateDeleteComposite=friendsFeedUpdateDeleteComposite;
		       	friendsFeedDelegate.getAllFriendsFeedListData();
		   		multiPanel.clear();
		   		multiPanel.add(friendsFeedUpdateDeleteComposite);
		    }*/
		    
		    
		    if (item.getText().equalsIgnoreCase("Add Cities")){ //Cities
		    	keyCitiesAdd= new KeyCitiesAdd();
		    	keyCitiesAdd.keyCitiesDelegate=keyCitiesDelegate;
				keyCitiesDelegate.keyCitiesAdd=keyCitiesAdd;
				keyCitiesAdd.adminPanelComposite=admincomposite;
				multiPanel.clear();
				multiPanel.add(keyCitiesAdd);
		    }
		    else if (item.getText().equalsIgnoreCase("List Cities")){
		    	listCities();
		    }
		    else if (item.getText().equalsIgnoreCase("Edit Cities")){
		    	keyCitiesUpdateDeleteComposite= new KeyCitiesUpdateDeleteComposite(admincomposite);
		  		keyCitiesUpdateDeleteComposite.keyCitiesDelegate=keyCitiesDelegate;
		    	keyCitiesDelegate.keyCitiesUpdateDeleteComposite=keyCitiesUpdateDeleteComposite;
		    	keyCitiesDelegate.getKeyCitiesData();
				multiPanel.clear();
				multiPanel.add(keyCitiesUpdateDeleteComposite);
		    }
		    
		   
		  
		  }

		});
	}
	
	public VerticalPanel getLinksPanel() {
		return linksPanel;
	}

	public void setLinksPanel(VerticalPanel linksPanel) {
		this.linksPanel = linksPanel;
	}

	public VerticalPanel getMultiPanel() {
		return multiPanel;
	}

	public void setMultiPanel(VerticalPanel multiPanel) {
		this.multiPanel = multiPanel;
	}
	
	
	private String imageItemHTML(String title) {
	    return title;
	}
	
	private TreeItem addImageItem(TreeItem root, String title) {
	    @SuppressWarnings("deprecation")
		TreeItem item = new TreeItem(imageItemHTML(title));
	    root.addItem(item);
	    return item;
	}
	
}
