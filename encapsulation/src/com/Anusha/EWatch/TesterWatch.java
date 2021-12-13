package com.Anusha.EWatch;
import com.Anusha.EWatch.dto.WatchDTO;
import com.Anusha.EWatch.operation.WatchOperation;
public class TesterWatch {
	public static void main(String []args) {
		
		WatchDTO dto = new WatchDTO();
		WatchOperation operation = new WatchOperation();
		
		dto.setBattery(2000);
		dto.setbTVersion(5.2f);
		dto.setColor("Black");
		dto.setDisplay("Amoled");
		dto.setOs("wearOS");
		dto.setRam((byte)1);
		dto.setSeries("seriesR");
		dto.setWarranty((byte)1);
		dto.setWaterResistance(true);
		dto.setWeight(85.46f);
		
		operation.add(dto);
		operation.printAll();
		
		operation.updateColor(2000, "Blue");
		operation.printAll();
		
		operation.deleteDisplay("Amoled");
		operation.printAll();
	}
}
