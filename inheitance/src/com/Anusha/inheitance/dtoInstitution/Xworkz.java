package com.Anusha.inheitance.dtoInstitution;

public class Xworkz extends Institution{
	public String founder="Omkar";
	public byte branches=2;
	public byte aluminies = 100;
	public byte trainers=10;
	public short students = 200;
	
	public Xworkz() {
		System.out.println("Xworkz");
	}
	
	public String founder(String founder) {
		return founder;
	}
	
	public byte branches(byte branches) {
		return branches;
	}
	
	public byte aluminies(byte aluminies) {
		return aluminies;
	}
	
	public byte trainers(byte trainers) {
		return trainers;
	}
	
	public short students(short students) {
		return students;
	} 
}
