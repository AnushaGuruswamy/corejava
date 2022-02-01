package com.Anusha.inheritance.dtoWood;

public class Wood {
	public String nameOfWood="teakWood";
	public String habitat="middleAsia";
	public float heightinmeter =120.56f;
	public float circumference = 5.64f;
	public float weight =2500.56f;
	
	public Wood() {
		System.out.println("Wood class");
	}
	
	public String nameOfWood(String nameOfWood) {
		return nameOfWood;
	}
	
	public String habitat(String habitat) {
		return habitat;
	}
	
	public float heightinmeter(float heightinmeter) {
		return heightinmeter;
	}
	
	public float circumference(float circumference) {
		return circumference;
	}
	
	public float weight(float weight) {
		return weight;
	}
}
