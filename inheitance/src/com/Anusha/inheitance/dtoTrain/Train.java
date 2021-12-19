package com.Anusha.inheitance.dtoTrain;

public class Train {
	public byte types = 6;
	public int seats = 13552;
	public short wheels = 256;
	public byte compartments = 38;
	public boolean foodCatering = true;
	
	public Train() {
		System.out.println("Invoking Train class");
	}
	
	public byte types(byte types) {
		this.types=types;
		return types;
	}
	
	public int seats(int seats) {
		this.seats=seats;
		return seats;
	}
	
	public short wheels(short wheels) {
		this.wheels=wheels;
		return wheels;
	}
	
	public byte compartments(byte compartments) {
		this.compartments=compartments;
		return compartments;
	}
	
	public boolean foodCatering(boolean foodCatering) {
		this.foodCatering=foodCatering;
		return foodCatering;
	}
}
