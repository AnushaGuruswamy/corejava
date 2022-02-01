package com.Anusha.countryDAO.dao;

import com.Anusha.countryDAO.dto.CountryDTO;


public class CountryDAO {
	CountryDTO country[] = new CountryDTO[3];
	int index = 0;
	
	public boolean add(CountryDTO dto) {
		if(index<country.length) {
			country[index]=dto;
			return true;
			
		}index++;
		return false;
	}
	
	
	public String deleteByStates(byte states) {
		for(int index = 0; index < country.length ; index++) {
			if(country[index]!=null) {
			if(states==country[index].getStates()) {
				country[index]=null;
				return "deleted";
			}
			}
		}
		return "Not deleted";
	}

	public void printAll() {
		for(int index = 0; index < country.length; index++) {
			System.out.println(country[index]);
		}
	}
}
