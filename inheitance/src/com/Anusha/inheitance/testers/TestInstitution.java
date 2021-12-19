package com.Anusha.inheitance.testers;

import com.Anusha.inheitance.dtoInstitution.Institution;
import com.Anusha.inheitance.dtoInstitution.Xworkz;

public class TestInstitution {

	public static void main(String[] args) {
		
		Institution institution = new Institution();
		System.out.println(institution.noOfInstitutions);
		System.out.println(institution.types);
		System.out.println(institution.multiCourse);
		System.out.println(institution.entry);
		System.out.println(institution.stay);
		
		Xworkz xworkz = new Xworkz();
		
		System.out.println(xworkz.noOfInstitutions);
		System.out.println(xworkz.types);
		System.out.println(xworkz.multiCourse);
		System.out.println(xworkz.entry);
		System.out.println(xworkz.stay);
		
		System.out.println(xworkz.founder);
		System.out.println(xworkz.branches);
		System.out.println(xworkz.aluminies);
		System.out.println(xworkz.trainers);
		System.out.println(xworkz.students);

	}

}
