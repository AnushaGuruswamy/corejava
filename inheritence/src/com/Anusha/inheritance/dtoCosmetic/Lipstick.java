package com.Anusha.inheritance.dtoCosmetic;

public class Lipstick extends Cosmetic{
	public String brand = "Lackme";
	public String color = "Red";
	public String type="Matt";
	public short price = 250;
	public float netWeight = 52.31f;
	
	public Lipstick() {
		System.out.println("Lipstic class");
	}
	
	public String brand(String brand) {
		return brand;
	}
	
	public String color(String color) {
		return color;
	}
	
	public String type(String type) {
		return type;
	}
	
	public short price(short price) {
		return price;
	}
	
	public float netWeight(float netWeight) {
		return netWeight;
	}
}
