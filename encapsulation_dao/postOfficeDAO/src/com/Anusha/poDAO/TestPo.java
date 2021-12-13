package com.Anusha.poDAO;

import com.Anusha.poDAO.dao.PoDAO;
import com.Anusha.poDAO.dto.AddressDTO;
import com.Anusha.poDAO.dto.PoDTO;

public class TestPo {
	public static void main(String[] args) {
		
		PoDTO dto = new PoDTO();
		AddressDTO adto = new AddressDTO();
		
		dto.setIsBranchPo(false);
		dto.setEmployee((byte)48);
		dto.setPlace("Mysor");
		dto.setpMName("Manikantha Huligeri");
		dto.setAddress(adto);
		adto.setArea("Kuvempu nagar");
		adto.setStreetName("2nd main");
		adto.setPlace("Mysor");
		adto.setPinCode(156984);
		
		PoDTO dto1 = new PoDTO();
		AddressDTO adto1 = new AddressDTO();
		
		dto1.setIsBranchPo(true);
		dto1.setEmployee((byte)40);
		dto1.setPlace("Chamarajanagar");
		dto1.setpMName("Ratna kumari");
		dto1.setAddress(adto1);
		adto1.setArea("Arsikere");
		adto1.setStreetName("8th main");
		adto1.setPlace("Chamarajanagar");
		adto1.setPinCode(156844);
		
		PoDTO dto2 = new PoDTO();
		AddressDTO adto2 = new AddressDTO();
		
		dto2.setIsBranchPo(false);
		dto2.setEmployee((byte)20);
		dto2.setPlace("Hospet");
		dto2.setpMName("RaviKumar");
		dto2.setAddress(adto2);
		adto2.setArea("Hospet city");
		adto2.setStreetName("Vijayanagar 6th Block");
		adto2.setPlace("Hospet");
		adto2.setPinCode(583109);
		
		PoDAO dao = new PoDAO();
		dao.add(dto);
		dao.add(dto1);
		dao.add(dto2);
		dao.printAll();
		
		System.out.println("get");
		
		dao.getByPlace("Hospet");
		dao.getByEmployee((byte)48);
		dao.getByPinCode(156984);
		dao.printAll();
		
		System.out.println("updated");
		
		dao.updatePlaceByPMName("Mysor","Ratna Kumari");
		dao.updatePMNameByEmloyee((byte)40,"Manikantha Huligeri");
		dao.updateIsBanchByEmployee(true, (byte)20);
		dao.printAll();
		
		System.out.println("deleted");
		
		System.out.println(dao.deleteByEmployee((byte)48));
		System.out.println(dao.deleteByPMName("Manikantha Huligeri"));
		System.out.println(dao.deleteByArea("Hospet"));
	}
}
