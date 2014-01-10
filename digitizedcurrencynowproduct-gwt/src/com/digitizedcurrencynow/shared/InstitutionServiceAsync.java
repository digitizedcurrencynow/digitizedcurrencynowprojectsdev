package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.Institution;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface InstitutionServiceAsync {

	void addInstitution(Institution institution, AsyncCallback<Void> callback);
	void getInstitution(AsyncCallback<List<Institution>> callback);
	void removeInstitution(Institution institution, AsyncCallback<Void> callback);
	void updateInstitution(Institution institution, AsyncCallback<Void> callback);

}
