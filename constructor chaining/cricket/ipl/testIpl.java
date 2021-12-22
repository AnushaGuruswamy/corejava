package com.xworkz.cricket.ipl;

public class testIpl {
	public static void main(String []args) {
		
		String []names = {"Virat","Devdutt","ABD","Chahal"};
		//String name = names.toString();
		int []ages = {35,24,37,38};
		//String age = ages.toString();
				
		Ipl ipl1 = new Ipl("RCB");
		Ipl ipl2 = new Ipl("RCB","Banglore");
		Ipl ipl3 = new Ipl("RCB","Banglore","Karnataka");
		Ipl ipl4 = new Ipl("RCB","Banglore","Karnataka",names,(byte)10);
		Ipl ipl5 = new Ipl("RCB","Banglore","Karnataka",names,(byte)10,(byte)74,ages);
		System.out.println(ipl4.printAll());
		
	}
}
