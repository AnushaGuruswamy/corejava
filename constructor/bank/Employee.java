package com.xworkz.bank;

public class Employee {
		
		String name;
		byte id;
		int salary;
		String designation;
		long phNum;
		byte workingHours;
		String city;
		
		public Employee(String name) {
			
			this.name = name;
		}

		public Employee(String name, byte id) {
			
			this(name); 
			this.id = id;
		}

		public Employee(String name, byte id, int salary, String designation) {
			this(name,id);
			this.salary = salary;
			this.designation = designation;
		}

		public Employee(String name, byte id, int salary, String designation,long phNum, byte workingHours) {
			this(name,id,salary,designation);
			this.phNum = phNum;
			this.workingHours = workingHours;
			
		}

		public Employee(String name, byte id, int salary, String designation, long phNum, byte workingHours, String city) {
			this(name,id,salary,designation,phNum,workingHours);
			this.city = city;
		}
		
		
		public String printAll() {
			String res ="name :" +name + "\n" +"id :"+ id + "\n" +"salary :"+ salary + "\n" +"designation :" +designation + "\n" +"Phone number :"+ phNum + "\n" +"Working hours :"+ workingHours + "\n" +"City :"+ city;
			return res;
		}
	}

