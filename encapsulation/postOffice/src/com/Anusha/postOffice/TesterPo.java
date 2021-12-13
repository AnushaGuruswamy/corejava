package com.Anusha.postOffice;
import com.Anusha.postOffice.dto.PoDTO;
import com.Anusha.postOffice.dto.AddressDTO;
public class TesterPo {

	public static void main(String[] args) {
	
		PoDTO po = new PoDTO();
		po.setBranchPo(true);
		po.setPlace("Ballari");
		po.setpMName("Raju");
		po.setEmployee((byte)95);
		
		AddressDTO dto = new AddressDTO();
		dto.setStreetName("Gandhi Nagar");
		dto.setArea("Ballai City");
		dto.setPlace("Ballari");
		dto.setPinCode(583102);
		
		po.setAddress(dto);
		
		System.out.println(po);
		
	}

}
