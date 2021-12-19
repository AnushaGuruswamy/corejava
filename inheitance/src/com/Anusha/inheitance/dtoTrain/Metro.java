package com.Anusha.inheitance.dtoTrain;

public class Metro extends Train{
	public byte noOfTrains = 20;
	public int passengers = 5000;
	public short sensors = 450;
	public short voltage = 750;
	public String color = "White";
	
	public Metro() {
		System.out.println("Invoking Metro class");
	}
	
	public byte noOfTrains(byte noOfTrains) {
		this.noOfTrains=noOfTrains;
		return noOfTrains;
	}
	
	public int passengers(int passengers) {
		this.passengers=passengers;
		return passengers;
	}
	
	public short sensors(short sensors) {
		this.sensors=sensors;
		return sensors;
	}
	
	public short voltage(short voltage) {
		this.voltage=voltage;
		return voltage;
	}
	
	public String color(String color) {
		this.color=color;
		return color;
	}
	
}
