package com.Anusha.inheitance.testers;

import com.Anusha.inheitance.dtoTrain.Metro;
import com.Anusha.inheitance.dtoTrain.Train;

public class TesterTrain {
	public static void main(String []args) {
		
		Train train = new Train();
		
		System.out.println(train.types);
		System.out.println(train.seats);
		System.out.println(train.compartments);
		System.out.println(train.wheels);
		System.out.println(train.foodCatering);
		
		Metro metro = new Metro();
		
		System.out.println(metro.noOfTrains);
		System.out.println(metro.passengers);
		System.out.println(metro.sensors);
		System.out.println(metro.voltage);
		System.out.println(metro.color);
		
		System.out.println(metro.types);
		System.out.println(metro.seats);
		System.out.println(metro.compartments);
		System.out.println(metro.wheels);
		System.out.println(metro.foodCatering);
	}
}
