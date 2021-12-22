package com.xworkz.animal.cow;

public class TestCow {
	public static void main (String []an) {
		
		com.xworkz.animal.cow.Cow cow = new com.xworkz.animal.cow.Cow();
		com.xworkz.animal.cow.Cow cow1 = new com.xworkz.animal.cow.Cow("Gouri");
		com.xworkz.animal.cow.Cow cow2 = new com.xworkz.animal.cow.Cow("Moosha",(byte)38);
		com.xworkz.animal.cow.Cow cow3 = new com.xworkz.animal.cow.Cow("Sita",(byte)66,97);
		com.xworkz.animal.cow.Cow cow4 = new com.xworkz.animal.cow.Cow("Bhuja",(byte)49,77,(byte)2,"White",0);
		com.xworkz.animal.cow.Cow cow5 = new com.xworkz.animal.cow.Cow("Doli",(byte)69,103,(byte)1,"Brown",23);
		com.xworkz.animal.cow.Cow cow6 = new com.xworkz.animal.cow.Cow("Dhaari",(byte)75,91,(byte)1,"Black",16);
		
		System.out.println(cow.getAll());
		System.out.println(cow1.getAll());
		System.out.println(cow2.getAll());
		System.out.println(cow3.getAll());
		System.out.println(cow4.getAll());
		System.out.println(cow5.getAll());
		System.out.println(cow6.getAll());
	}
}
