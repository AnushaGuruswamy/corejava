package com.xworkz.animal.cow;

public class Cow {
	String name;
	byte age;
	double weight;
	byte vaccination;
	String colour;
	int milkQuantity;
	
	public Cow() {
		System.out.println("Cow - the milk producer");
	}

	public Cow(String name) {
		this.name = name;
	}

	public Cow(String name, byte age) {
		this(name);
		this.age = age;
	}

	public Cow(String name, byte age, double weight) {
		this(name,age);
		this.weight = weight;
	}

	public Cow(String name, byte age, double weight, byte vaccination, String colour, int milkQuantity) {
		this(name,age,weight);
		this.vaccination = vaccination;
		this.colour = colour;
		this.milkQuantity = milkQuantity;
	}
	
	public String getAll() {
		String c = name +"\n"+ age +"\n"+ weight +"\n"+ vaccination +"\n"+ colour +"\n"+ milkQuantity;
		System.out.println("\n");
		return c;
	}
}
