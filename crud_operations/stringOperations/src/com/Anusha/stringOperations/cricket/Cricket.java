package com.Anusha.stringOperations.cricket;

public class Cricket {
	String []players = new String[11];
	int index = 0;
	
	public void add(String names) {
	
			players[index]= names;
			index++;
		}
	
	public void read(String names) {
		if(index<players.length) {
			players[index]= names;
			index++;
		}
		else {
			System.out.println("array full");
		}
	}
	
	public void update(String oldName, String newName) {
		for(int index = 0 ; index < players.length ; index++) {
			if(players[index]==oldName) {
				players[index]=newName;
				
				System.out.println(players[index]);
			}
		}
	}
	
	public void printAll() {
		for(int index = 0 ; index < players.length ; index++) {
			System.out.println(players[index]);
		}
	}
	
	public String delete(String name) {
		for(int index = 0 ; index < players.length ; index++) {
			if(players[index].equals(name)) {
				players[index] = null;
				System.out.println(players[index]);
			}
		}
		return name;
	} 
}
