package com.Anusha.encapsulation.dto;

public class PgDTO {
	private short rooms;
	private byte branches;
	private int doors;
	private int windows;
	private byte workers;
	private String name;
	private long switches;
	private int beds;
	private int rent;
	private long chairs;
	
	public PgDTO() {
		
	}
	
	public void setRooms(short rooms) {
		this.rooms=rooms;	
	}	
	public short getRooms() {
		return rooms;
	}
	
	public void setBranches(byte branches) {
		this.branches=branches;
	}	
	public byte getBranches() {
		return branches;
	}
	
	public void setDoors(int doors) {
		this.doors=doors;
	}
	public int getDoors() {
		return doors;
	}
	
	public void setWindows(int windows) {
		this.windows=windows;
	}
	public int getWindows() {
		return windows;
	}
	
	public void setWorkers(byte workers) {
		this.workers=workers;
	}
	public short getWorkers() {
		return workers;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setSwitches(long switches) {
		this.switches=switches;
	}
	public long getSwitches() {
		return switches;
	}
	
	public void setBeds(int beds) {
		this.beds=beds;
	}
	public int getBeds() {
		return beds;
	}
	
	public void setRent(int rent) {
		this.rent=rent;
	}
	public int getRent() {
		return rent;
	}
	
	public void setChairs(long chairs) {
		this.chairs=chairs;
	}
	public long getChairs() {
		return chairs;
	}

	
	public String getAll() {
		return "rooms=" + rooms + ", branches=" + branches + ", doors=" + doors + ", windows=" + windows
				+ ", workers=" + workers + ", name=" + name + ", switches=" + switches + ", beds=" + beds + ", rent="
				+ rent + ", chairs=" + chairs ;
	}
	
	
}
