package com.Anusha.onePlus;

import com.Anusha.onePlus.operations.WatchOperations;
import com.Anusha.onePlus.dto.WatchDTO;
public class TesterWatch {
	
public static void main(String []args) {
		
		WatchOperations operations = new WatchOperations();
		
		WatchDTO info = new WatchDTO("S6","Black","9R",4500,(byte)3);
		WatchDTO info1 = new WatchDTO("S5","Red","8R",8500,(byte)2);
		WatchDTO info2 = new WatchDTO("S6+","White","Nord",6500,(byte)1);
		WatchDTO info3 = new WatchDTO("S2","Yellow","8T",5000,(byte)2);
		WatchDTO info4 = new WatchDTO("S4+","Blue","2T",3000,(byte)3);
		operations.add(info);
		operations.add(info1);
		operations.add(info2);
		operations.add(info3);
		operations.add(info4);
		operations.getAll();
		System.out.println(operations.updatePrice("Blue", 5500));
		operations.getAll();
		System.out.println(operations.deleteColor("White"));
		operations.getAll();
	}
}
