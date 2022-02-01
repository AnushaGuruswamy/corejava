package com.Anusha.inheritance.testers;

import com.Anusha.inheritance.dtoFruit.Banana;
import com.Anusha.inheritance.dtoFruit.Fruit;

public class TesterFruit {
	public static void main(String []args) {
		
		Fruit fruit = new Fruit();
		
		System.out.println(fruit.milkShake(2135));
		System.out.println(fruit.iceCreams(212));
		System.out.println(fruit.fruitSalad((byte)50));
		System.out.println(fruit.juices((byte)512));
		System.out.println(fruit.sweets((byte)60));
		
		
		Banana banana = new Banana();
		
		System.out.println(banana.milkShake(2135));
		System.out.println(banana.iceCreams(212));
		System.out.println(banana.fruitSalad((byte)50));
		System.out.println(banana.juices((byte)512));
		System.out.println(banana.sweets((byte)60));
		
		System.out.println(banana.types("there are more than 1000 tyes of bananas in the world"));
		System.out.println(banana.grow("more than 150 countries gow bananas"));
		System.out.println(banana.usedToGainWeight(true));
		System.out.println(banana.panCakes("Banana pancakes"));
		System.out.println(banana.richIn("carbs"));
		
	}
}
