package com.Anusha.inheitance.testers;

import com.Anusha.inheitance.dtoDeveloper.Developer;
import com.Anusha.inheitance.dtoDeveloper.Employ;

public class TestEmploy {
	public static void main(String []args) {
		
		Employ employ = new Employ();
		System.out.println(employ.typesOfEmploye);
		System.out.println(employ.fields);
		System.out.println(employ.BankPayment);
		System.out.println(employ.insurance);
		System.out.println(employ.documentsNeeded);
		
		Developer developer = new Developer();
		System.out.println(developer.typesOfEmploye);
		System.out.println(developer.fields);
		System.out.println(developer.BankPayment);
		System.out.println(developer.insurance);
		System.out.println(developer.documentsNeeded);
		System.out.println(developer.designition);
		System.out.println(developer.salary);
		System.out.println(developer.company);
		System.out.println(developer.bondYear);
		System.out.println(developer.laptopProvided);
	}
}
