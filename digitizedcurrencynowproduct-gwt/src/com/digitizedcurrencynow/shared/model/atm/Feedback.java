package com.digitizedcurrencynow.shared.model.atm;

import java.io.Serializable;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Feedback implements Serializable{
	
	/**
	 * Feeed back from User users of .
	 */
	
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	
	@Persistent
	private String feedbackshort;
	
	@Persistent
	private String feedbackDetails;
	
	@Persistent
	private String usersName;
	
	@Persistent
	private String userEmail;
	
	
	public Feedback() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFeedbackshort() {
		return feedbackshort;
	}
	public void setFeedbackshort(String feedbackshort) {
		this.feedbackshort = feedbackshort;
	}
	

	public String getFeedbackDetails() {
		return feedbackDetails;
	}
	
	public void setFeedbackDetails(String feedbackDetails) {
		this.feedbackDetails = feedbackDetails;
	}
	
	public String getUsersName() {
		return usersName;
	}
	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", feedbackshort=" + feedbackshort + ", feedbackDetails=" + feedbackDetails + ", usersName=" + usersName + ", userEmail=" + userEmail + "]";
	}
	
	

}
