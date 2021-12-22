package com.xworkz.animal.rabbit;

public class Rabbit {
	String type;
	char colour;
	long hair;
	int friends;
	double weight;
	
	public Rabbit() {
		System.out.println("Rabbit");
	}

	public Rabbit(String type) {
		this.type = type;
	}

	public Rabbit(String type, char colour) {
		this(type);
		this.colour = colour;
	}

	public Rabbit(String type, char colour, long hair, int friends) {
		this(type,colour);
		this.hair = hair;
		this.friends = friends;
	}

	public Rabbit(String type, char colour, long hair, int friends, double weight) {
		this(type,colour,hair,friends);
		this.weight = weight;
	}
	
	public String getAll() {
		String r = type +"\t"+ colour +"\t"+ hair +"\t"+ friends +"\t"+ weight;
		System.out.println("\n");
		return r;
	}	
}
