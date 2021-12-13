package com.Anusha.ipl.dto;

public class IplDTO {
	String team;
	byte players;
	String owner;
	String place;
	LeaderDTO leader;
	
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public byte getPlayers() {
		return players;
	}
	public void setPlayers(byte players) {
		this.players = players;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public LeaderDTO getLeader() {
		return leader;
	}
	public void setLeader(LeaderDTO leader) {
		this.leader = leader;
	}
	
	public String toString() {
		return "team=" + team + ", players=" + players + ", owner=" + owner + ", place=" + place + ", leader="
				+ leader ;
	}
	
	
	
}
