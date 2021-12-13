package com.Anusha.postOffice.dto;

public class AddressDTO {
	String streetName;
	String area;
	int pinCode;
	String place;
	
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	public String toString() {
		return "AddressDTO [streetName=" + streetName + ", area=" + area + ", pinCode=" + pinCode + ", place=" + place
				+ "]";
	}
	
	
	
	
}
