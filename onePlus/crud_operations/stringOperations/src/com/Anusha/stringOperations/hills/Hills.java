package com.Anusha.stringOperations.hills;

public class Hills {
	String []hills = new String[5];
	int index = 0;

	public void add(String names) {
		hills[index]=names;
		index++;
	}
	
	public void read(String names) {
		if(index<hills.length) {
			hills[index]=names;
			index++;
		}
	}
	
	public void update(String oldName,String newName) {
		for(index = 0;index<hills.length;index++) {
			if(hills[index].equals(oldName)) {
				hills[index]=newName;
				System.out.println(hills[index]);
			}
		}
	}
	
	public void printAll() {
		for(int index = 0 ; index < hills.length ; index++) {
			System.out.println(hills[index]);
		}
	}	
}
