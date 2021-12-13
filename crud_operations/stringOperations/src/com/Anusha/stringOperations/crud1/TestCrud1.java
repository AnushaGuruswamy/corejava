package com.Anusha.stringOperations.crud1;

public class TestCrud1 {
	public static void main(String []args) {
		
		Crud1 operation = new Crud1();
		
		operation.add("Pooja");
		operation.add("Neelamma");
		operation.add("Bana");
		operation.add("Nagesh");
		operation.add("Gavi");
		operation.add("Arun");
		operation.add("Shanmukh");
		operation.add("Amrutha");
		operation.add("Manoj");
		operation.add("Soma");
		
		operation.printAll();
		
		operation.read("Bana");
		operation.printAll();
		
		String res = operation.update("Gavi","GaviRangaSwamy");
		System.out.println(res);
		
		operation.printAll();
	}
}
