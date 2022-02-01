package com.Anusha.inheritance.testers;

import com.Anusha.inheritance.dtoAirlines.Airlines;
import com.Anusha.inheritance.dtoAirlines.Indigo;

public class TestAirlines {
	public static void main(String []args) {
		
		Airlines airlines = new Airlines();
		System.out.println(airlines.count);
		System.out.println(airlines.no1Airline);
		System.out.println(airlines.safety);
		System.out.println(airlines.compartments);
		System.out.println(airlines.foodFacility);
		
		
		Indigo indigo = new Indigo();
		System.out.println(indigo.count);
		System.out.println(indigo.no1Airline);
		System.out.println(indigo.safety);
		System.out.println(indigo.compartments);
		System.out.println(indigo.foodFacility);
		System.out.println(indigo.owner);
		System.out.println(indigo.headOffice);
		System.out.println(indigo.since);
		System.out.println(indigo.nationalFlights);
		System.out.println(indigo.InterNationalFlights);
		}
}
