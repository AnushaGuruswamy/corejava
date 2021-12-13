package com.Anusha.stringOperations.hills;

public class HillsTester {
	public static void main(String []args) {
		
		Hills hills = new Hills();
		
		hills.add("Nandi hills");
		hills.add("Chamundi hills");
		hills.add("Tumati hills");
		hills.add("Mincheri hills");
		hills.add("Agumbe hills");
		
		hills.printAll();
		
		hills.read("Agumbe hills");
		
		hills.update("Nandi hills", "Nandi Hills");
	}
}
