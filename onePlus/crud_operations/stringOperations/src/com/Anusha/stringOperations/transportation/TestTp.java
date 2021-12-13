package com.Anusha.stringOperations.transportation;
import com.Anusha.stringOperations.temple.Temple;
import com.Anusha.stringOperations.transportation.Transportation;

public class TestTp {
public static void main(String []args) {
		
		Transportation tp = new Transportation();
		
		tp.add("Bus");
		tp.add("Car");
		tp.add("Train");
		tp.add("Bike");
		tp.add("Cycle");
		tp.add("Airways");
		tp.add("Metro");
		tp.add("Bull cart");
		tp.add("Auto");
		
		
		
		tp.printAll();
		
		tp.read("Cycle");
		
		tp.update("Metro", "Namma Metro");
		tp.update("Train", "Rajadhani Expess");
		tp.update("Airways", "Air India");
		tp.update("Auto", "Ola Auto");
		tp.update("Car", "Ola cab");
	
	}
}
