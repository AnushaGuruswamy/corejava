package com.Anusha.stringOperations.transportation;

public class Transportation {
	String []tp = new String[9];
	int index = 0;

	public void add(String names) {
	
		tp[index]= names;
		index++;
	}
	
	public void read(String names) {
	if(index<tp.length) {
		tp[index]= names;
		index++;
	}
	else {
		System.out.println("array full");
	}
	}
	
	public void update(String oldName, String newName) {
		for(int index = 0 ; index < tp.length ; index++) {
			if(tp[index].equals(oldName)) {
				tp[index]=newName;
				
				System.out.println(tp[index]);
			}
		}
	}
	
	public void printAll() {
		for(int index = 0 ; index < tp.length ; index++) {
			System.out.println(tp[index]);
		}
	}
}
