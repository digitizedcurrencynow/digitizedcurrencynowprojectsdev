package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.gwt.view.client.ProvidesKey;



@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class UserProfile implements Serializable {
	
	/**
	 * User name and basic profile info for users of Digital Currency Now.
	 */
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long userId;
	
	@Persistent
	private String userName;
	
	@Persistent
	private String userEmail;
	
	@Persistent
	private String userPassword;
	
	@Persistent
	private String userPhone;
	
	@Persistent
	private String userRole;
	
	@Persistent
	private String userAccountStatus;
	
	
	public UserProfile() {
		
	}
	
	public UserProfile(String userName) {
		this.userName = userName;
	}
	
	public UserProfile( Long userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}
	
	

	public UserProfile(Long userId, String userName, String userEmail, String userPassword, String userPhone, String userRole, String userAccountStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userRole = userRole;
		this.userAccountStatus = userAccountStatus;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserAccountStatus() {
		return userAccountStatus;
	}

	public void setUserAccountStatus(String userAccountStatus) {
		this.userAccountStatus = userAccountStatus;
	}

	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword 
				+ ", userPhone=" + userPhone + ", userRole=" + userRole + ", userAccountStatus=" + userAccountStatus + "]";
	}
	
	public static final ProvidesKey<UserProfile> KEY_PROVIDER = new ProvidesKey<UserProfile>() {
		@Override
		public Object getKey(UserProfile item) {
			return item == null ? null : item.getUserId();
		}
	};
	
	
	// @Override
	public int compareTo(UserProfile o) {
		return (o == null || o.getUserName() == null) ? -1 : -o.userName.compareTo(userName);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof UserProfile) {
			return userId == ((UserProfile) o).userId;
		}
		return false;
	}
	

}
