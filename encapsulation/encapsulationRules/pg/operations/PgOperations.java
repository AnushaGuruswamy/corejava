package com.Anusha.encapsulation.operations;

import com.Anusha.encapsulation.dto.PgDTO;

public class PgOperations {

	PgDTO []elements = new PgDTO[10]; 
	int index=0;
	
	public void add(PgDTO dto) {
		if(index<elements.length) {
			elements[index]=dto;
			index++;
		}
	}
	
	public void printAll() {
		for(int index=0;index<elements.length;index++) {
			if(elements[index]!=null) {
			System.out.println(elements[index].getAll());
			}
		}
	}
	
	public String updateChairs(int rent, long chairs) {
		for(int index = 0; index < elements.length ; index++) {
			if(elements[index]!=null) {
			if(rent==(elements[index].getRent())) {
				elements[index].setChairs(chairs) ;
			}
			}
		}
		return "updated";
	}
	
	public String deleteBeds(int beds) {
		for(int index = 0; index < elements.length ; index++) {
			if(elements[index]!=null) {
			if(beds==(elements[index].getBeds())) {
				elements[index].setBeds(1);
				return "delete";
			
				}
			}
		}
		return "Deleted";
	} 
	
}
