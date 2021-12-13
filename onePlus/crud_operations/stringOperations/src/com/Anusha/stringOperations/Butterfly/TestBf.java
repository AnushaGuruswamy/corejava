package com.Anusha.stringOperations.Butterfly;
import com.Anusha.stringOperations.Butterfly.Butterfly;
import com.Anusha.stringOperations.transportation.Transportation;

public class TestBf {
public static void main(String []args) {
		
		Butterfly bf = new Butterfly();
		
		bf.add("Yellow");
		bf.add("Blue");
		bf.add("Black");
		bf.add("Red");
		bf.add("Green");
		bf.add("Orange");
		bf.add("Yellow an black");
		bf.add("Dark blue");
		bf.add("Pink");
		
		
		
		bf.printAll();
		
		bf.read("Pink");
		
		bf.update("Yellow", "Yellow color butterfly");
		bf.update("Blue", "Blue color butterfly");
		bf.update("Red", "Red color butterfly");
		bf.update("Oange", "Orange color butterfly");
		bf.update("Black", "Black color butterfly");
	
	}
}
