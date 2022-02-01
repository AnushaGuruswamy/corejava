package com.Anusha.radio;

import com.Anusha.radio.dto.RadioDTO;
import com.Anusha.radio.dto.SizeDTO;

public class TesterRadio {

	
		public static void main(String[] args) {
			RadioDTO properties = new RadioDTO();
			properties.setCompany("Sa Re Ga Ma");
			properties.setColor("Blue");
			properties.setPrice(2799);
			properties.setNoOfRS((byte)10);
			
			SizeDTO dto = new SizeDTO();
			dto.setHeight(15.48f);
			dto.setLength(26.42f);
			dto.setWidth(8.34);
			properties.setSize(dto);
			
			System.out.println(properties);
			

	}

}
