package com.Anusha.ipl.dto;

public class LeaderDTO {
	String name;
	byte experience;
	byte age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getExperience() {
		return experience;
	}
	public void setExperience(byte experience) {
		this.experience = experience;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	public String toString() {
		return "name=" + name + ", experience=" + experience + ", age=" + age ;
	}
	
	
}
