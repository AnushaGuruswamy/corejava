package com.Anusha.country.dto;

public class KarnatakaDTO {
	byte district;
	byte rivers;
	byte hills;
	String capital;
	
	public byte getDistrict() {
		return district;
	}
	public void setDistrict(byte district) {
		this.district = district;
	}
	public byte getRivers() {
		return rivers;
	}
	public void setRivers(byte rivers) {
		this.rivers = rivers;
	}
	public byte getHills() {
		return hills;
	}
	public void setHills(byte hills) {
		this.hills = hills;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	public String toString() {
		return "district=" + district + ", rivers=" + rivers + ", hills=" + hills + ", capital=" + capital;
	}
	
	
}
