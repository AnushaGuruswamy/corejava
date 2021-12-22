package com.xworkz.cricket.test;

public class Test {
	String country;
	String captain;
	String location;
	byte totalMatchesPlayed;
	byte won;
	byte lost;
	byte draw;
	int period;
	
	public Test(String country) {
		this.country = country;
	}

	public Test(String country, String captain) {
		this(country);
		this.captain = captain;
	}

	public Test(String country, String captain, String location,byte totalMatchesPlayed) {
		this(country,captain);
		this.location = location;
		this.totalMatchesPlayed = totalMatchesPlayed;
	}

	public Test(String country, String captain, String location, byte totalMatchesPlayed, byte won) {
		this(country,captain,location,totalMatchesPlayed);
		this.won = won;
	}
	
	public Test(String country, String captain, String location, byte totalMatchesPlayed, byte won,int period) {
		this(country,captain,location,totalMatchesPlayed,won);
		this.period = period;
	}
	
	
	
	public Test(String country, String captain, String location, byte totalMatchesPlayed, byte won, byte lost,
			byte draw, int period) {
		this(country,captain,location,totalMatchesPlayed,won,period);
		this.draw = draw;
		
	}

	public String printAll() {
		String data ="country :" + country + "\n"+ "captain :" + captain + "\n" + "location :" + location + "\n" + "totalMatchesPlayed :" + totalMatchesPlayed + "\n" + "won:" + won + "\n" + "draw :" + draw +"\n"+ "period :" + period;
		System.out.println("\n");
		return data;
	}
}