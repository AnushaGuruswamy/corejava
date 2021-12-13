package com.Anusha.country;
import com.Anusha.country.dto.CountryDTO;
import com.Anusha.country.dto.KarnatakaDTO;
public class TesterCountry {
	public static void main(String[] args) {
		
		CountryDTO country = new CountryDTO();
		country.setName("India");
		country.setStates((byte)28);
		country.setRivers((short)400);
		country.setHistoricalPlaces(15652);
		
		KarnatakaDTO dto = new KarnatakaDTO();
		dto.setCapital("Bengaluru");
		dto.setDistrict((byte)31);
		dto.setHills((byte)123);
		dto.setRivers((byte)86);
		
		country.setState(dto);
		
		System.out.println(country);
	}
}
