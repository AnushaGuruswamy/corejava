package com.Anusha.inheitance.dtoPhone;

public class Phone {
	public byte brands=56;
	public byte proccessors=20;
	public int features=15123;
	public boolean radio=true;
	public String type = "mobile";
	
	public Phone() {
		System.out.println("Phone class");
	}
	
	public byte brands(byte brands) {
		return brands;
	}
	
	public byte proccessors(byte proccessors) {
		return proccessors;
	}
	
	public int features(int features) {
		return features;
	}
	
	public boolean radio(boolean radio) {
		return radio;
	} 
	
	public String type(String type) {
		return type;
	}
}
