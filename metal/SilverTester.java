package com.Anusha.metal;


import com.Anusha.metal.silver.Silver;

public class SilverTester {
	public static void main(String []args) {
		
		Metal metal = new Metal();
		System.out.println("calling Metal (parent) class properties");
		System.out.println(metal.price);
		System.out.println(metal.color);
		System.out.println(metal.thickness);
		System.out.println(metal.type);
		System.out.println(metal.weight);
		
		Silver silver = new Silver();
		System.out.println("calling Silver (child) class properties");
		System.out.println(silver.price);
		System.out.println(silver.color);
		System.out.println(silver.thickness);
		System.out.println(silver.type);
		System.out.println(silver.weight);
		System.out.println(silver.chemicalName);
		System.out.println(silver.atomicWeight);
		System.out.println(silver.atomicNum);
		System.out.println(silver.meltingPoint);
		System.out.println(silver.valanceElectron);
		
		Metal metal1 = new Silver();
		System.out.println("creating object of Silver (child) class and intializing metal (parent) class properties");
		System.out.println(metal1.price);
		System.out.println(metal1.color);
		System.out.println(metal1.thickness);
		System.out.println(metal1.type);
		System.out.println(metal1.weight);
		
		Silver silver1 = (Silver)metal1;
		System.out.println("creating object of Metal (parent) class initializing the values of Silver (child) class properties");
		System.out.println(silver1.price);
		System.out.println(silver1.color);
		System.out.println(silver.thickness);
		System.out.println(silver1.type);
		System.out.println(silver1.weight);
		System.out.println(silver1.chemicalName);
		System.out.println(silver1.atomicWeight);
		System.out.println(silver1.atomicNum);
		System.out.println(silver1.meltingPoint);
		System.out.println(silver1.valanceElectron);
		
	}
}
