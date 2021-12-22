package com.xworkz.animal.Elephant;

public class TestElephant {
public static void main (String []anu) {
		
		com.xworkz.animal.Elephant.Elephant ele = new com.xworkz.animal.Elephant.Elephant();
		com.xworkz.animal.Elephant.Elephant ele1 = new com.xworkz.animal.Elephant.Elephant("Hampi");
		com.xworkz.animal.Elephant.Elephant ele2 = new com.xworkz.animal.Elephant.Elephant("Mysore",40);
		com.xworkz.animal.Elephant.Elephant ele3 = new com.xworkz.animal.Elephant.Elephant("Ballari",52,(byte)2);
		com.xworkz.animal.Elephant.Elephant ele4 = new com.xworkz.animal.Elephant.Elephant("Gokarna",63,(byte)0,158.96f);
		com.xworkz.animal.Elephant.Elephant ele5 = new com.xworkz.animal.Elephant.Elephant("Badami",75,(byte)3,167.33f);
		com.xworkz.animal.Elephant.Elephant ele6 = new com.xworkz.animal.Elephant.Elephant("Madikeri",100,(byte)6,193.21f);
		
		System.out.println(ele.getAll());
		System.out.println(ele1.getAll());
		System.out.println(ele2.getAll());
		System.out.println(ele3.getAll());
		System.out.println(ele4.getAll());
		System.out.println(ele5.getAll());
		System.out.println(ele6.getAll());
	}
}
