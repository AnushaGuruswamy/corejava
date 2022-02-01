package com.Anusha.abstractClass;

public abstract class Metro {
	
	int noOfTrains = 20;
	String city = "Banglore";
	
	public void greenLine() {
		System.out.println("green line starts from yashwanthpur to banashankari");
	}
	
	public void purpleLine() {
		System.out.println("purple line starts from Mysore road to halasur");
	}
	
	public abstract void blueLine();
	
	public abstract void yellowLine();
}
