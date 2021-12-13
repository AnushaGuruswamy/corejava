package com.Anusha.crud.dto;

public class Cricketdto {

	String name;
	byte age;
	String dOB;
	long contact;
	byte matches;
	String teamName;
	String country;
	
	public Cricketdto(String name,byte age,String dOB,long contact,byte matches,String teamName,String country){
		this.name = name;
		this.age = age;
		this.dOB = dOB;
		this.contact = contact;
		this.matches = matches;
		this.teamName = teamName;
		this.country = country;
	}
	
	public String getAll() {
		String res = (name +"\n"+ age +"\n"+ age +"\n"+ dOB +"\n"+ contact +"\n"+ matches +"\n"+ teamName +"\n"+ country);
		return res;
	}
}
