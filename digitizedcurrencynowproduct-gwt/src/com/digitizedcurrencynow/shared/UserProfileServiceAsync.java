package com.digitizedcurrencynow.shared;

import java.util.List;
import com.digitizedcurrencynow.shared.model.UserProfile;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UserProfileServiceAsync {

	void addUserProfile(UserProfile userProfile, AsyncCallback<Void> callback);
	void getUserProfile(AsyncCallback<List<UserProfile>> callback);
	void removeUserProfile(UserProfile userProfile, AsyncCallback<Void> callback);
	void updateUserProfile(UserProfile userProfile, AsyncCallback<Void> callback);

}
