package com.digitizedcurrencynow.shared.model;

import java.io.Serializable;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


/**
 *  1.Stores Information for a given city.
 *  Along with city Lat and longitude for the google map api
 *  
 *  
 *  
 */

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class KeyCities implements Serializable{
	
	/*private String country[]={"USA","Canada","Europe"};
	private String citiesEurope[]={"Berlin","Paris","Barcelona","Budapest","London"};
	private String citiesUs[]={"California", "Minnesota", "San Francisco", "Detroit", "New York", "Washington", "Arizona","Kentucky","Wellington", "Boston","Pennsylvania","Montana"};
	private String citiesCanada[]={"Saskatoon","Vancouver","Alberta","Windsor","Toronto"};
	*/
	private static final long serialVersionUID = 1L;

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String userName;
	
	@Persistent
	private String cityName;
	@Persistent
	private String cityDescDetails;
	@Persistent
	private String cityImageUrl;
	
	@Persistent
	private String cityLat;
	@Persistent
	private String cityLong;
	@Persistent
	private String countryName;
	

	
	public KeyCities() {
		super();
	}
	
	public KeyCities(String cityName, String userName) {
		super();
		this.cityName = cityName;
		this.userName = userName;
	
	}
	
	public KeyCities(String cityName, String userName,String countryName) {
		super();
		this.cityName = cityName;
		this.userName = userName;
		this.countryName = countryName;
	
	}
	
	public KeyCities(String userName, String cityName, String cityImageUrl,	String haveKeysNumber, String needKeysNumber) {
		super();
		this.cityName = cityName;
		this.cityImageUrl = cityImageUrl;
		this.userName = userName;
	}
	public KeyCities(String userName, String cityName, String cityDescDetails, String cityImageUrl,String cityLat, String cityLong, String countryName) {
		super();
		this.userName = userName;
		this.cityName = cityName;
		this.cityDescDetails = cityDescDetails;
		this.cityImageUrl = cityImageUrl;
		this.cityLat = cityLat;
		this.cityLong = cityLong;
		this.countryName = countryName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	

	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityDescDetails() {
		return cityDescDetails;
	}
	public void setCityDescDetails(String cityDescDetails) {
		this.cityDescDetails = cityDescDetails;
	}
	
	public String getCityImageUrl() {
		return cityImageUrl;
	}
	public void setCityImageUrl(String cityImageUrl) {
		this.cityImageUrl = cityImageUrl;
	}
	
	public String getCityLat() {
		return cityLat;
	}
	public void setCityLat(String cityLat) {
		this.cityLat = cityLat;
	}
	public String getCityLong() {
		return cityLong;
	}
	public void setCityLong(String cityLong) {
		this.cityLong = cityLong;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "KeyCities [id=" + id + ", userName=" + userName + ", cityName="	+ cityName + ", cityDescDetails=" + cityDescDetails + ", cityImageUrl=" + cityImageUrl + ", cityLat=" + cityLat
				+ ", cityLong=" + cityLong + ", countryName=" + countryName + "]";
	}

	
	
}
