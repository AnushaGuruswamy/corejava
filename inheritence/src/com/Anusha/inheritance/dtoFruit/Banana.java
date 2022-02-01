package com.Anusha.inheritance.dtoFruit;

public class Banana extends Fruit{
	public short types = 1200;
	public short growingCountries = 183;
	public boolean areBananasClones = true;
	public String name = "plantains";
	public byte carbs = 32;
	
	public Banana() {
		System.out.println("Banana class");
	}
	
	public String types(String types) {
		return "there are more than 1000 tyes of bananas in the world";
	}
	
	public String grow(String grow) {
		return "more than 150 countries gow bananas";
	}
	
	public boolean usedToGainWeight(boolean usedToGainWeight) {
		return true;
	}
	
	public String panCakes(String panCakes) {
		return "Banana pancakes";
	}
	
	public String richIn(String richIn) {
		return "carbs";
	}
}
