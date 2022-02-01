package com.Anusha.radioDAO;
import com.Anusha.radioDAO.dto.RadioDTO;
import com.Anusha.radioDAO.dto.SizeDTO;
import com.Anusha.radioDAO.dao.RadioDAO;
public class RadioTest {
	public static void main(String[] args) {
		
		RadioDTO dto = new RadioDTO();
		SizeDTO sdto = new SizeDTO();
		dto.setColor("Blue");
		dto.setCompany("Sa Re Ga Ma");
		dto.setNoOfRS((byte)20);
		dto.setPrice(2799);
		dto.setSize(sdto);
		sdto.setHeight(14.53f);
		sdto.setLength(23.4f);
		sdto.setWidth(8.3);
		
		RadioDTO dto1 = new RadioDTO();
		SizeDTO sdto1 = new SizeDTO();
		dto1.setColor("Black");
		dto1.setCompany("Sa Re Ga Ma");
		dto1.setNoOfRS((byte)18);
		dto1.setPrice(2599);
		dto1.setSize(sdto1);
		sdto1.setHeight(5.68f);
		sdto1.setLength(61.1f);
		sdto1.setWidth(3.6);
		
		RadioDTO dto2 = new RadioDTO();
		SizeDTO sdto2 = new SizeDTO();
		dto2.setColor("Green");
		dto2.setCompany("Bajaj");
		dto2.setNoOfRS((byte)14);
		dto2.setPrice(2399);
		dto2.setSize(sdto2);
		sdto2.setHeight(36.14f);
		sdto2.setLength(80.1f);
		sdto2.setWidth(20.6);
		
				
		RadioDAO dao = new RadioDAO();
		dao.add(dto);
		dao.add(dto1);
		dao.add(dto2);
		dao.printAll();
		
		System.out.println("updated");
		
		dao.updateColorByPrice("Yellow", 2399);
		dao.updateCompanyByColor("Yamaha", "Blue");
		dao.updatePriceByNoOfRS(2599, (byte)20);
		dao.printAll();
		
		System.out.println("get");
		
		dao.getByCompany("Bajaj");
		dao.getByPrice(2599);
		dao.getByWidth(8.3);
		dao.printAll();
		
		System.out.println("deleted");
		
		String dto3= dao.deleteByLength(23.4f);
		System.out.println(dto3);
		String dto4 = dao.deleteByColor("Green");
		System.out.println(dto4);
		String dto5=dao.deleteByPrice(2599);
		System.out.println(dto5);
	
		
}

}
