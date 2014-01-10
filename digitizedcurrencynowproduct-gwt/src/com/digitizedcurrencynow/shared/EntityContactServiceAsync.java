package com.digitizedcurrencynow.shared;



import java.util.List;

import com.digitizedcurrencynow.shared.model.EntityContact;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface EntityContactServiceAsync {

	void addEntityContact(EntityContact entityContact, AsyncCallback<Void> callback);
	void removeEntityContact(EntityContact entityContact, AsyncCallback<Void> callback);
	void getEntityContact(AsyncCallback<List<EntityContact>> callback);
	void updateEntityContact(EntityContact entityContact, AsyncCallback<Void> callback);

}
