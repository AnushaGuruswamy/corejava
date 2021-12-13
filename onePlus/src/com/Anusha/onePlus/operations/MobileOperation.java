package com.Anusha.onePlus.operations;
import com.Anusha.onePlus.dto.MobileDTO;
public class MobileOperation {
	
	MobileDTO mobiles[] = new MobileDTO[5];
	int index=0;
	
	public void add(MobileDTO dto) {
		if(index <mobiles.length) {
		mobiles[index] = dto;
		index++;
		}
	}
	
	public void getAll() {
		for(int index=0 ; index < mobiles.length ; index++) {
			if(mobiles[index]!=null) {
				System.out.println(mobiles[index].printAll());
			}
		}
	}
	
	public String updatePrice(String color, int price) {
		for(int index = 0; index < mobiles.length ; index++) {
			if(mobiles[index]!=null) {
			if(color.equals(mobiles[index].color)) {
				mobiles[index].price = price;
			}
			}
		}
		return "updated";
	}
	
	public String deleteColor(String color) {
		for(int index = 0; index < mobiles.length ; index++) {
			if(mobiles[index]!=null) {
			if(color.equals(mobiles[index].color)) {
				mobiles[index].color = null;
			}
			}
		}
		return "Deleted";
	} 
}
