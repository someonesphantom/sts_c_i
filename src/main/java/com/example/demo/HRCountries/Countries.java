package com.example.demo.HRCountries;

import org.springframework.data.annotation.Id;

public class Countries {
	@Id
	public String _id;
	
	
	private String countryID;
	private String countryName;
	private String regionID;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getCountryID() {
		return countryID;
	}
	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getRegionID() {
		return regionID;
	}
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}
	
	
}
