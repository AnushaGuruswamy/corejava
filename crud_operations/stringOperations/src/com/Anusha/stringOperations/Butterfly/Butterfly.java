package com.Anusha.stringOperations.Butterfly;

public class Butterfly {
	String []bf = new String[9];
	int index = 0;

	public void add(String colors) {
	
		bf[index]= colors;
		index++;
	}
	
	public void read(String colors) {
	if(index<bf.length) {
		bf[index]= colors;
		index++;
	}
	else {
		System.out.println("array full");
	}
	}
	
	public void update(String oldName, String newName) {
		for(int index = 0 ; index < bf.length ; index++) {
			if(bf[index].equals(oldName)) {
				bf[index]=newName;
				
				System.out.println(bf[index]);
			}
		}
	}
	
	public void printAll() {
		for(int index = 0 ; index < bf.length ; index++) {
			System.out.println(bf[index]);
		}
	}
}
