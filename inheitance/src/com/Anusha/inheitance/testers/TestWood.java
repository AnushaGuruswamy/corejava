package com.Anusha.inheitance.testers;

import com.Anusha.inheitance.dtoWood.Table;
import com.Anusha.inheitance.dtoWood.Wood;

public class TestWood {

	public static void main(String[] args) {
		
		Wood wood = new Wood();
		
		System.out.println(wood.nameOfWood);
		System.out.println(wood.habitat);
		System.out.println(wood.heightinmeter);
		System.out.println(wood.circumference);
		System.out.println(wood.weight);
		
		Table table = new Table();
		
		System.out.println(table.nameOfWood);
		System.out.println(table.habitat);
		System.out.println(table.heightinmeter);
		System.out.println(table.circumference);
		System.out.println(table.weight);
		
		System.out.println(table.type);
		System.out.println(table.chairs);
		System.out.println(table.length);
		System.out.println(table.width);
		System.out.println(table.price);
	}

}
