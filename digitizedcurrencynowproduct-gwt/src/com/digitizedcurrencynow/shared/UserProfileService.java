package com.digitizedcurrencynow.shared;


import java.util.List;



import com.digitizedcurrencynow.shared.model.UserProfile;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("userprofile")
public interface UserProfileService extends RemoteService {
	
	public void addUserProfile(UserProfile userProfile) ;
	public void removeUserProfile(UserProfile userProfile) ;
	public  List<UserProfile> getUserProfile();
	public void updateUserProfile(UserProfile userProfile) ;
	

}
