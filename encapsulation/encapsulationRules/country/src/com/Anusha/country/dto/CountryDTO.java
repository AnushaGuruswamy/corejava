package com.Anusha.country.dto;

public class CountryDTO {
	String name;
	byte states;
	short rivers;
	int historicalPlaces;
	String continent;
	KarnatakaDTO state;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getStates() {
		return states;
	}
	public void setStates(byte states) {
		this.states = states;
	}
	public short getRivers() {
		return rivers;
	}
	public void setRivers(short rivers) {
		this.rivers = rivers;
	}
	public int getHistoricalPlaces() {
		return historicalPlaces;
	}
	public void setHistoricalPlaces(int historicalPlaces) {
		this.historicalPlaces = historicalPlaces;
	}
	public KarnatakaDTO getState() {
		return state;
	}
	public void setState(KarnatakaDTO state) {
		this.state = state;
	}
	
	public String toString() {
		return "name=" + name + ", states=" + states + ", rivers=" + rivers + ", historicalPlaces="
				+ historicalPlaces + "continent=" + continent + "state=" + state ;
	}
	
	
}
