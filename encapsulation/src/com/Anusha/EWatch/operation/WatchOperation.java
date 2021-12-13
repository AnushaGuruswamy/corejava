package com.Anusha.EWatch.operation;
import com.Anusha.EWatch.dto.WatchDTO;
public class WatchOperation {
	WatchDTO poperties[] = new WatchDTO[10];
	int index = 0;
	
	public void add(WatchDTO dto) {
		if(index <poperties.length) {
			poperties[index] = dto;
		    index++;
		}
	}
	
	public void printAll() {
		for(int index=0;index<poperties.length;index++) {
			if(poperties[index]!=null) {
			System.out.println(poperties[index]);
			}
		}
	}
	
	public String updateColor(int battery, String color) {
		for(int index = 0; index < poperties.length ; index++) {
			if(poperties[index]!=null) {
			if(battery==(poperties[index].getBattery())) {
				poperties[index].setColor(color) ;
			}
			}
		}
		return "updated";
	}
	
	public String deleteDisplay(String display) {
		for(int index = 0; index < poperties.length ; index++) {
			if(poperties[index]!=null) {
			if(display.equals(poperties[index].getDisplay())) {
				poperties[index].setDisplay(null);
				
			}
			}
		}
		return "Deleted";
	} 
}
