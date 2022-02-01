package com.Anusha.inheritance.testers;

import com.Anusha.inheritance.dtoBirds.Birds;
import com.Anusha.inheritance.dtoBirds.Peacock;

public class TesterBirds {
	public static void main(String []args) {
		
		Birds birds = new Birds();
		
		System.out.println(birds.species);
		System.out.println(birds.flyingDistance);
		System.out.println(birds.color);
		System.out.println(birds.laysEgg);
		System.out.println(birds.swim);
		
		Peacock peacock = new Peacock();
		
		System.out.println(peacock.color);
		System.out.println(peacock.weight);
		System.out.println(peacock.noOfFethers);
		System.out.println(peacock.height);
		System.out.println(peacock.count);
		
		System.out.println(birds.species);
		System.out.println(birds.flyingDistance);
		System.out.println(birds.color);
		System.out.println(birds.laysEgg);
		System.out.println(birds.swim);
		
	}
}
