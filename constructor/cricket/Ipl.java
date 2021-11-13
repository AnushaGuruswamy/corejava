package com.xworkz.cricket.ipl;

public class Ipl {
	String teamName;
	String homeTown;
	String state;
	String []playerName;
	byte teams;
	byte matches;
	int []age;
	
	public Ipl(String teamName) {
		this.teamName = teamName;
	}

	public Ipl(String teamName, String homeTown) {
		this(teamName);
		this.homeTown = homeTown;
	}

	public Ipl(String teamName, String homeTown, String state) {
		this(teamName,homeTown);
		this.state = state;
	}

	public Ipl(String teamName, String homeTown, String state, String []playerName, byte teams) {
		this(teamName,homeTown,state);
		this.playerName = playerName;
		this.teams = teams;
	}

	public Ipl(String teamName, String homeTown, String state, String []playerName, byte teams, byte matches,int []age) {
		this(teamName,homeTown,state,playerName,teams);
		this.matches = matches;
		this.age = age;
		
	}
	
	String printAll() {
	
		String res ="teamName :"  + teamName+ "\n" +"homeTown :" + homeTown+ "\n" +"state :"+  state+ "\n" + "playerName :"+ playerName+ "\n" + "teams :"+ teams+ "\n" + "matches :"+ matches+ "\n" +
	"age :"+age;
		return res;
	}
}