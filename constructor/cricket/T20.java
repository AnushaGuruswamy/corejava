package com.xworkz.cricket.t20;

public class T20 {
	String country;
	int matches;
	byte participants;
	String venue;
	char team;
	long priceMoney;
	String referee;
	
	public T20(String country) {
		this.country = country;
	}

	public T20(String country, int matches) {
		this(country);
		this.matches = matches;
	}

	public T20(String country, int matches, byte participants, String venue) {
		this(country,matches);
		this.participants = participants;
		this.venue = venue;
	}

	public T20(String country, int matches, byte participants, String venue, char team) {
		this(country,matches,participants,venue);
		this.team = team;
	}

	public T20(String country, int matches, byte participants, String venue, char team, long priceMoney) {
		this(country,matches,participants,venue,team);
		this.priceMoney = priceMoney;
	}

	public T20(String country, int matches, byte participants, String venue, char team, long priceMoney,
			String referee) {
		this(country,matches,participants,venue,team,priceMoney);
		this.referee = referee;
	}
	
	public String printAll() {
		String a = "country :" + country + "\n" + "matches :" + matches + "\n" + "participants :" + participants + "\n" + "venue :" + venue + "\n" + "team :" + team + "\n" + "priceMoney :" + priceMoney + "\n" + "referee :" + referee;
		return a;
	}
}
