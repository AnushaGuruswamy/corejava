package com.Anusha.metal;

import com.Anusha.metal.gold.Gold;

public class GoldTester {
	public static void main(String []args) {
		
		
		Metal metal = new Metal();
		System.out.println("calling Metal (parent) class constuctors");
		System.out.println(metal.price);
		System.out.println(metal.color);
		System.out.println(metal.thickness);
		System.out.println(metal.type);
		System.out.println(metal.weight);
		
		Gold gold = new Gold();
		System.out.println("calling Gold (child) class constructors");
		System.out.println(gold.chemicalName);
		System.out.println(gold.atomicWeight);
		System.out.println(gold.atomicNum);
		System.out.println(gold.meltingPoint);
		System.out.println(gold.valanceElectron);
		System.out.println(gold.price);
		System.out.println(gold.color);
		System.out.println(gold.thickness);
		System.out.println(gold.type);
		System.out.println(gold.weight);
		
		Metal metal1 = new Gold();
		System.out.println("creating object of Gold (child) class initializing the values of Metal (parent) class");
		System.out.println(metal1.price);
		System.out.println(metal1.color);
		System.out.println(metal1.thickness);
		System.out.println(metal1.type);
		System.out.println(metal1.weight);
		
		Gold gold1 = (Gold)metal1;
		System.out.println("creating object of Metal (parent) class initializing the values of Gold (child) class");
		System.out.println(gold1.chemicalName);
		System.out.println(gold1.atomicWeight);
		System.out.println(gold1.atomicNum);
		System.out.println(gold1.meltingPoint);
		System.out.println(gold1.valanceElectron);
		
		System.out.println(gold1.price);
		System.out.println(gold1.color);
		System.out.println(gold1.thickness);
		System.out.println(gold1.type);
		System.out.println(gold1.weight);
	}
}
