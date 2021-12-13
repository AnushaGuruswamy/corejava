package com.Anusha.stringOperations.cricket;
import com.Anusha.stringOperations.cricket.Cricket;
public class TestCricket {
	public static void main(String []args) {
		
		Cricket players = new Cricket();
		
		players.add("Virat");
		players.add("Padikkal");
		players.add("Rahul");
		players.add("Chahal");
		players.add("Rohit");
		players.add("Jadeja");
		players.add("Rishabh");
		players.add("Dhavan");
		players.add("Bumrah");
		players.add("Hardik");
		players.add("Sachin");
		
		
		players.printAll();
		
		players.read("Chahal");
		
		players.update("Virat", "Virat Kohli");
		players.update("Padikkal", "Devdutt Padikkal");
		players.update("Rahul", "K L Rahul");
		players.update("Chahal", "Yuzvendra Chahal");
		players.update("Rohit", "Rohit Sharma");
		players.update("Jadeja", "Ravindra Jadeja");
		players.update("Rishab", "Risha Panth");
	
		players.delete("Chahal");
	}
	
}
