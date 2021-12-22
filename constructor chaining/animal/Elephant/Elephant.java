package com.xworkz.animal.Elephant;

public class Elephant {
	String place;
	int age;
	byte kids;
	float weight;
	
	public Elephant() {
		System.out.println("Ganesha");
	}
	
	public Elephant(String place) {
		this.place = place;
	}

	public Elephant(String place, int age) {
		this(place);
		this.age = age;
	}

	public Elephant(String place, int age, byte kids) {
		this(place,age);
		this.kids = kids;
	}

	public Elephant(String place, int age, byte kids, float weight) {
		this(place,age,kids);
		this.weight = weight;
	}
	
	public String getAll() {
		
		String e = place +"\n"+ age +"\n"+ kids +"\n"+ weight;
		System.out.println("\n");
		return e;
	}
}
