package com.Anusha.metal;

import com.Anusha.metal.copper.Copper;

public class CopperTester {

	public static void main(String[] args) {
		
		Metal metal = new Metal();
		System.out.println("calling metal (parent) class properties");
		System.out.println(metal.price);
		System.out.println(metal.color);
		System.out.println(metal.thickness);
		System.out.println(metal.type);
		System.out.println(metal.weight);
		
		Copper copper = new Copper();
		System.out.println("calling copper (child) class properties");
		System.out.println(copper.price);
		System.out.println(copper.color);
		System.out.println(copper.thickness);
		System.out.println(copper.type);
		System.out.println(copper.weight);
		System.out.println(copper.chemicalName);
		System.out.println(copper.atomicNum);
		System.out.println(copper.density);
		System.out.println(copper.meltingPoint);
		System.out.println(copper.boilingPoint);
		
		Metal metal1 = new Copper();
		System.out.println("creating object of copper (child) class and initializing properties of metal (parent) class");
		System.out.println(metal1.price);
		System.out.println(metal1.color);
		System.out.println(metal1.thickness);
		System.out.println(metal1.type);
		System.out.println(metal1.weight);
		
		Copper copper1 = (Copper)metal1;
		System.out.println("creating object of metal (parent) class and initializing properties of copper (child) class");
		System.out.println(copper1.price);
		System.out.println(copper1.color);
		System.out.println(copper1.thickness);
		System.out.println(copper1.type);
		System.out.println(copper1.weight);
		System.out.println(copper1.chemicalName);
		System.out.println(copper1.atomicNum);
		System.out.println(copper1.density);
		System.out.println(copper1.meltingPoint);
		System.out.println(copper1.boilingPoint);
		
	}

}
