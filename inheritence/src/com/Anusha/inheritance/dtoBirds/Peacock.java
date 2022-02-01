package com.Anusha.inheritance.dtoBirds;

public class Peacock extends Birds {
	public String color = "White";
	public short noOfFethers = 2671;
	public float weight = 7.53f;
	public byte height = 2;
	public byte count = 83;
	
	public Peacock() {
		System.out.println("Invoking Peacock class");
	}

	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public short noOfFethers(short noOfFethers) {
		this.noOfFethers=noOfFethers;
		return noOfFethers;
	}
	
	public float weight(float weight) {
		this.weight=weight;
		return weight;
	}
	
	public byte height(byte height) {
		this.height=height;
		return height;
	}
	
	public byte count(byte count) {
		this.count=count;
		return count;
	}
}
