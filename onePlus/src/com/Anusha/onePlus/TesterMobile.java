package com.Anusha.onePlus;

import com.Anusha.onePlus.operations.MobileOperation;
import com.Anusha.onePlus.dto.MobileDTO;

public class TesterMobile {
	public static void main(String []args) {
		
		MobileOperation operations = new MobileOperation();
		
		MobileDTO info = new MobileDTO("sd780","Blue",(byte)4,(byte)32,"9R",45000,(byte)4);
		MobileDTO info1 = new MobileDTO("sd980","Yellow",(byte)5,(byte)64,"8R",65000,(byte)2);
		MobileDTO info2 = new MobileDTO("sd280","White",(byte)6,(byte)16,"Nord",25000,(byte)9);
		MobileDTO info3 = new MobileDTO("sd730","Red",(byte)2,(byte)8,"8T",75000,(byte)2);
		MobileDTO info4 = new MobileDTO("sd785","Black",(byte)1,(byte)4,"2T",40000,(byte)3);
		operations.add(info);
		operations.add(info1);
		operations.add(info2);
		operations.add(info3);
		operations.add(info4);
		operations.getAll();
		System.out.println(operations.updatePrice("Yellow", 55000));
		operations.getAll();
		System.out.println(operations.deleteColor("Yellow"));
		
	}
}
