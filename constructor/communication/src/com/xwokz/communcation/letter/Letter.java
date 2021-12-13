package com.xwokz.communcation.letter;

public class Letter {
	String type;
	int distance;
	String base;
	int year;
	
	public Letter() {
		System.out.println("Letter writing");
	}

	public Letter(String type) {
		this.type = type;
	}

	public Letter(String type, int distance) {
		this(type);
		this.distance = distance;
	}

	public Letter(String type, int distance, String base) {
		this(type,distance);
		this.base = base;
	}

	public Letter(String type, int distance, String base, int year) {
		this(type,distance,base);
		this.year = year;
	}
	
	public String getAll() {
		String l = type +"\n"+ distance +"\n"+ base +"\n"+ year;
		System.out.println("\n");
		return l;
	} 
}
