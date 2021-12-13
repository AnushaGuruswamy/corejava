package com.Anusha.stringOperations.temple;

public class Temple {
	String []temple = new String[10];
	int index = 0;

	public void add(String names) {
	
		temple[index]= names;
		index++;
	}
	
	public void read(String names) {
	if(index<temple.length) {
		temple[index]= names;
		index++;
	}
	else {
		System.out.println("array full");
	}
	}
	
	public void update(String oldName, String newName) {
		for(int index = 0 ; index < temple.length ; index++) {
			if(temple[index]==oldName) {
				temple[index]=newName;
				
				System.out.println(temple[index]);
			}
		}
	}
	
	public void printAll() {
		for(int index = 0 ; index < temple.length ; index++) {
			System.out.println(temple[index]);
		}
	}
	
	public String delete(String name) {
		for(int index = 0 ; index < temple.length ; index++) {
			if(temple[index].equals(name)) {
				temple[index] = null;
				System.out.println(temple[index]);
			}
		}
		return name;
	} 
}