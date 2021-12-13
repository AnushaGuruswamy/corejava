package com.Anusha.onePlus.operations;
import com.Anusha.onePlus.dto.EarBudsDTO;
import com.Anusha.onePlus.dto.MobileDTO;
public class EarBudsOperations {
	
	EarBudsDTO earphones[] = new EarBudsDTO[5];
	int index=0;
	
	public void add(EarBudsDTO dto) {
		if(index <earphones.length) {
			earphones[index] = dto;
		index++;
		}
	}
	
	public void getAll() {
		for(int index=0 ; index < earphones.length ; index++) {
			if(earphones[index]!=null) {
				System.out.println(earphones[index].printAll());
			}
		}
	}
	
	public String updatePrice(String color, int price) {
		for(int index = 0; index < earphones.length ; index++) {
			if(earphones[index]!=null) {
			if(color.equals(earphones[index].color)) {
				earphones[index].price = price;
			}
			}
		}
		return "updated";
	}
	
	public String deleteColor(String color) {
		for(int index = 0; index < earphones.length ; index++) {
			if(earphones[index]!=null) {
			if(color.equals(earphones[index].color)) {
				earphones[index].color = null;
			}
			}
		}
		return "Deleted";
	} 
}
