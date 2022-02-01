package com.Anusha.abstractClass;

public class Tester {

	public static void main(String[] args) {
		
		Metro metro = new YellowLine();
		
		System.out.println(metro.city);
		System.out.println(metro.noOfTrains);
		
		metro.greenLine();
		metro.purpleLine();
		metro.blueLine();
		metro.yellowLine();

	}

}
