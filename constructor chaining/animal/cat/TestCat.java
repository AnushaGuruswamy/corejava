package com.xworkz.animal.cat;

public class TestCat {
	public static void main (String []args) {
		
		com.xworkz.animal.cat.Cat cat = new com.xworkz.animal.cat.Cat();
		com.xworkz.animal.cat.Cat cat1 = new com.xworkz.animal.cat.Cat("Ladu");
		com.xworkz.animal.cat.Cat cat2 = new com.xworkz.animal.cat.Cat("Simba",(byte)2,(byte)4,"Gold",50f);
		com.xworkz.animal.cat.Cat cat3 = new com.xworkz.animal.cat.Cat("Panther",(byte)2,(byte)4,"Black",60f);
		com.xworkz.animal.cat.Cat cat4 = new com.xworkz.animal.cat.Cat("Doraemon",(byte)1,(byte)4,"Cream",30f);
		
		System.out.println(cat.getAll());
		System.out.println(cat1.getAll());
		System.out.println(cat2.getAll());
		System.out.println(cat3.getAll());
		System.out.println(cat4.getAll());
	}
}
