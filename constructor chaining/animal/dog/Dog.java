package com.xworkz.animal.dog;

public class Dog {
	
	String name;
	byte age;
	String breed;
	String colour;
	String food;
	
	public Dog() {
		System.out.println("Doggies");
	}

	public Dog(String name) {
		this.name = name;
	}

	public Dog(String name, byte age, String breed) {
		this(name);
		this.age = age;
		this.breed = breed;
	}

	public Dog(String name, byte age, String breed, String colour, String food) {
		this(name,age,breed);
		this.colour = colour;
		this.food = food;
	}
	
	public String getAll() {
		String d = name +"\t"+ age +"\t"+ breed +"\t"+ colour +"\t"+ food;
		return d;
	}
}
