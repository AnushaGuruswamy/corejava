package com.Anusha.inheritance.testers;

import com.Anusha.inheritance.dtoCosmetic.Cosmetic;
import com.Anusha.inheritance.dtoCosmetic.Lipstick;

public class TestCosmetic {

	public static void main(String[] args) {
		
		Cosmetic cosmetic = new Cosmetic();
		
		System.out.println(cosmetic.types);
		System.out.println(cosmetic.brands);
		System.out.println(cosmetic.things);
		System.out.println(cosmetic.safe);
		System.out.println(cosmetic.productionCountries);

		Lipstick lipstick = new Lipstick();
		
		System.out.println(lipstick.types);
		System.out.println(lipstick.brands);
		System.out.println(lipstick.things);
		System.out.println(lipstick.safe);
		System.out.println(lipstick.productionCountries);
		
		System.out.println(lipstick.brand);
		System.out.println(lipstick.color);
		System.out.println(lipstick.type);
		System.out.println(lipstick.price);
		System.out.println(lipstick.netWeight);
	}

}
