package com.xworkz.cricket.t20;

public class TestT20 {
	public static void main(String []anu){
		
		T20 t20 = new T20("India",40,(byte)16,"UAE",'M',(long)1600000,"Rod Tucker");
		T20 t201 = new T20("Netherland",32,(byte)16,"Ireland",'M',(long)800000,"Richard Illingworth");
		T20 t202 = new T20("Bangladesh",12,(byte)16,"South Africa",'F');
		T20 t203 = new T20("Sri Lanka",42,(byte)15,"Namibia",'M',(long)1200000,"Marais Erasmus");
		T20 t204 = new T20("New Zeeland",16,(byte)16,"Dubai",'F',(long)560000,"Aleem Dar");
		T20 t205 = new T20("Australia",28,(byte)16,"UAE",'M',(long)800000);
		
		System.out.println(t20.printAll());
		System.out.println(t201.printAll());
		System.out.println(t202.printAll());
		System.out.println(t203.printAll());
		System.out.println(t204.printAll());
		System.out.println(t205.printAll());
	}
	
}
