package com.Anusha.countryDAO;

import com.Anusha.countryDAO.dao.CountryDAO;
import com.Anusha.countryDAO.dto.AndhraPradeshDTO;
import com.Anusha.countryDAO.dto.CountryDTO;

public class TestCountry {
	public static void main(String[] args) {
		
	CountryDTO dto = new CountryDTO();
	AndhraPradeshDTO adto = new AndhraPradeshDTO();
	CountryDAO dao = new CountryDAO();
	
	dto.setName("India");
	dto.setStates((byte)28);
	dto.setRivers((short)400);
	dto.setHistoricalPlaces(15652);
	
	adto.setCapital("Andhra Pradesh");
	adto.setDistrict((byte)34);
	adto.setHills((byte)37);
	adto.setRivers((byte)94);
	
	System.out.println(dao.add(dto));
	dao.printAll();
	System.out.println(dao.deleteByStates((byte)28));
	dao.printAll();
}
}	
