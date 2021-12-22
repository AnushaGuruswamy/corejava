package com.xworkz.animal.dog;

public class TestDog {
	public static void main (String []anu) {
		
		com.xworkz.animal.dog.Dog dog = new com.xworkz.animal.dog.Dog();
		com.xworkz.animal.dog.Dog dog1 = new com.xworkz.animal.dog.Dog("Tom");
		com.xworkz.animal.dog.Dog dog2 = new com.xworkz.animal.dog.Dog("Subbu",(byte)14,"Golden Retriever");
		com.xworkz.animal.dog.Dog dog3 = new com.xworkz.animal.dog.Dog("Goldie",(byte)24,"Golden Retriever","Gold","Pedegee");
		com.xworkz.animal.dog.Dog dog4 = new com.xworkz.animal.dog.Dog("Silky",(byte)16,"Street dog","Balck","Milk and rice");
		
		System.out.println(dog.getAll());
		System.out.println(dog1.getAll());
		System.out.println(dog2.getAll());
		System.out.println(dog3.getAll());
		System.out.println(dog4.getAll());
	}
}
