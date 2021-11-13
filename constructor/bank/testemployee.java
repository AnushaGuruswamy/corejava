package com.xworkz.bank.employee;

import com.xworkz.bank.Employee;

public class testemployee {
	public static void main(String []ags) {
		
		Employee employee = new Employee ("Canara Bank");
		//System.out.println(employee.printAll());
		Employee employee1 = new Employee ("Canara Bank", (byte)12);
		//System.out.println(employee1.printAll());
		Employee employee2 = new Employee ("Canara Bank",(byte)12,(int)5000,"Attender");
		//System.out.println(employee2.printAll());
		Employee employee3 = new Employee ("Canara Bank",(byte)12,(int)5000,"Attender",(long)985756914,(byte)8);
		//System.out.println(employee3.printAll());
		Employee employee4 = new Employee ("Canara Bank",(byte)12,(int)5000,"Attender",(long)985756914,(byte)8,"Ballari");
		System.out.println(employee4.printAll());
		
		
	}
}
