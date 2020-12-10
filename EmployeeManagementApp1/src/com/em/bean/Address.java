package com.em.bean;

public class Address {
	private String streetName;
	private String cityName;
	private String stateName;
	private String postalCode;

	public Address(String streetName, String cityName, String stateName, String postalCode) {

		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
		this.postalCode = postalCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

}
