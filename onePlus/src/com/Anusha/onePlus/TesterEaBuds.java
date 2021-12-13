package com.Anusha.onePlus;


import com.Anusha.onePlus.dto.EarBudsDTO;

import com.Anusha.onePlus.operations.EarBudsOperations;
public class TesterEaBuds {
	public static void main(String []args) {
		
		EarBudsOperations operations = new EarBudsOperations();
		
		EarBudsDTO info = new EarBudsDTO("Yellow","9R",4500,"wired");
		EarBudsDTO info1 = new EarBudsDTO("Blue","8R",6500,"wireless");
		EarBudsDTO info2 = new EarBudsDTO("White","Nord",2500,"wired");
		EarBudsDTO info3 = new EarBudsDTO("Black","8T",7500,"wireless");
		EarBudsDTO info4 = new EarBudsDTO("Red","2T",4000,"wired");
		operations.add(info);
		operations.add(info1);
		operations.add(info2);
		operations.add(info3);
		operations.add(info4);
		operations.getAll();
		System.out.println(operations.updatePrice("Red", 5500));
		operations.getAll();
		System.out.println(operations.deleteColor("Yellow"));
		operations.getAll();
	}
}
