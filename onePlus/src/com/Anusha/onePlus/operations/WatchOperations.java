package com.Anusha.onePlus.operations;
import com.Anusha.onePlus.dto.MobileDTO;
import com.Anusha.onePlus.dto.WatchDTO;
public class WatchOperations {
	WatchDTO watches[] = new WatchDTO[5];
	int index=0;
	
	public void add(WatchDTO dto) {
		if(index <watches.length) {
			watches[index] = dto;
		index++;
		}
	}
	
	public void getAll() {
		for(int index=0 ; index < watches.length ; index++) {
			if(watches[index]!=null) {
				System.out.println(watches[index].printAll());
			}
		}
	}
	
	public String updatePrice(String color, int price) {
		for(int index = 0; index < watches.length ; index++) {
			if(watches[index]!=null) {
			if(color.equals(watches[index].color)) {
				watches[index].price = price;
			}
			}
		}
		return "updated";
	}
	
	public String deleteColor(String color) {
		for(int index = 0; index < watches.length ; index++) {
			if(watches[index]!=null) {
			if(color.equals(watches[index].color)) {
				watches[index].color = null;
			}
			}
		}
		return "Deleted";
	} 
}
