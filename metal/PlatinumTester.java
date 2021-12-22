package com.Anusha.metal;

import com.Anusha.metal.platinum.Platinum;

public class PlatinumTester {

	public static void main(String[] args) {
		
		Metal metal = new Metal();
		System.out.println("calling metal (parent) class properties");
		System.out.println(metal.price);
		System.out.println(metal.color);
		System.out.println(metal.thickness);
		System.out.println(metal.type);
		System.out.println(metal.weight);
		
		Platinum platinum = new Platinum();
		System.out.println("calling platinum (child) class properties");
		System.out.println(platinum.chemicalName);
		System.out.println(platinum.atomicNum);
		System.out.println(platinum.atomicMass);
		System.out.println(platinum.meltingPoint);
		System.out.println(platinum.boilingPoint);
		System.out.println(platinum.price);
		System.out.println(platinum.color);
		System.out.println(platinum.thickness);
		System.out.println(platinum.type);
		System.out.println(platinum.weight);
		
		Metal metal1 = new Platinum();
		System.out.println("creating object of platinum (child) class and initializing properties of metal (parent) class");
		System.out.println(metal1.price);
		System.out.println(metal1.color);
		System.out.println(metal1.thickness);
		System.out.println(metal1.type);
		System.out.println(metal1.weight);
		
		Platinum platinum1 = (Platinum)metal1;
		System.out.println("creating object of Metal (parent) class and initializing properties of platinum (child) class");
		System.out.println(platinum1.chemicalName);
		System.out.println(platinum1.atomicNum);
		System.out.println(platinum1.atomicMass);
		System.out.println(platinum1.meltingPoint);
		System.out.println(platinum1.boilingPoint);
		System.out.println(platinum1.price);
		System.out.println(platinum1.color);
		System.out.println(platinum1.thickness);
		System.out.println(platinum1.type);
		System.out.println(platinum1.weight);
	}

}
