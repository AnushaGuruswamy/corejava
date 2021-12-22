package com.Anusha.metal;

import com.Anusha.metal.iron.Iron;

public class IronTester {
	public static void main(String []args) {
		
		Metal metal = new Metal();
		System.out.println("calling Metal (parent) class propeties");
		System.out.println(metal.price);
		System.out.println(metal.color);
		System.out.println(metal.thickness);
		System.out.println(metal.type);
		System.out.println(metal.weight);
		
		Iron iron = new Iron();
		System.out.println("calling iron (child) class properties");
		System.out.println(iron.chemicalName);
		System.out.println(iron.density);
		System.out.println(iron.atomicNum);
		System.out.println(iron.meltingPoint);
		System.out.println(iron.boilingPoint);
		System.out.println(iron.price);
		System.out.println(iron.color);
		System.out.println(iron.thickness);
		System.out.println(iron.type);
		System.out.println(iron.weight);
		
		Metal metal1 = new Iron();
		System.out.println("creating object of iron (child) class and initializing value of metal (parent) class");
		System.out.println(metal1.price);
		System.out.println(metal1.color);
		System.out.println(metal1.thickness);
		System.out.println(metal1.type);
		System.out.println(metal1.weight);
		
		Iron iron1 = (Iron)metal1;
		System.out.println("creating object of metal (parent) class and initializing value of iron (child) class");
		System.out.println(iron1.price);
		System.out.println(iron1.color);
		System.out.println(iron1.thickness);
		System.out.println(iron1.type);
		System.out.println(iron1.weight);
		System.out.println(iron1.chemicalName);
		System.out.println(iron1.density);
		System.out.println(iron1.atomicNum);
		System.out.println(iron1.meltingPoint);
		System.out.println(iron1.boilingPoint);
		
	}
}
