package com.Anusha.inheritance.dtoBirds;

public class Birds {
	public String species = "pheasant";
	public float flyingDistance = 50.5f;
	public String color;
	public boolean laysEgg = true;
	public boolean swim = false;
	
	public Birds() {
		System.out.println("Invoking Birds class");
	}
	
	public String species(String species) {
		this.species=species;
		return species;
	}
	
	public float flyingDistance(float flyingDistance) {
		this.flyingDistance=flyingDistance;
		return flyingDistance;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
	public boolean laysEgg(boolean laysEgg) {
		this.laysEgg=laysEgg;
		return laysEgg;
	}
	
	public boolean swim(boolean swim) {
		this.swim=swim;
		return swim;
	}
}
