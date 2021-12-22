package com.xworkz.animal.cat;

public class Cat {
	String name;
	byte age;
	byte paws;
	String colour;
	float milk;
	
	public Cat() {
		System.out.println("Cats");
	}

	public Cat(String name) {
		this.name = name;
	}

	public Cat(String name, byte age) {
		this(name);
		this.age = age;
	}

	public Cat(String name, byte age, byte paws, String colour, float milk) {
		this(name,age);
		this.paws = paws;
		this.colour = colour;
		this.milk = milk;
	}
	
	public String getAll() {
		
		String a = name +"\n"+ age +"\n"+ paws +"\n"+ colour +"\n"+ milk;
		System.out.println("\n");
		return a;
	}
}
