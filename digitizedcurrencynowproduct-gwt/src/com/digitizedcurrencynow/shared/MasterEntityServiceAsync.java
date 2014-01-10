package com.digitizedcurrencynow.shared;

import java.util.List;

import com.digitizedcurrencynow.shared.model.MasterEntity;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface MasterEntityServiceAsync {

	void addMasterEntity(MasterEntity masterEntity, AsyncCallback<Void> callback);
	void getMasterEntity(AsyncCallback<List<MasterEntity>> callback);
	void removeMasterEntity(MasterEntity masterEntity, AsyncCallback<Void> callback);
	void updateMasterEntity(MasterEntity masterEntity, AsyncCallback<Void> callback);

}
