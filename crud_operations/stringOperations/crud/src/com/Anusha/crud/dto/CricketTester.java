package com.Anusha.crud.dto;


public class CricketTester {
	public static void main(String []args) {
		
		DtoCricket operations = new DtoCricket();
		
		Cricketdto dtos =new Cricketdto("Rahul",(byte)29,"15-09-1987",(long)1956752244,(byte)20,"RCB","India");
		operations.add(dtos);
		
		operations.getAll();

		operations.updateNameByContact(1956752244l,"Rahul Dravid");
		
	}
}	