package com.Anusha.onePlus.dto;

public class MobileDTO {
	
	public String processor;
	public String color;
	public byte camera;
	public byte pxl;
	public String series;
	public int price;
	public byte ram;
	
	public MobileDTO() {
	}

	public MobileDTO(String processor, String color, byte camera, byte pxl, String series, int price, byte ram) {
		this.processor = processor;
		this.color = color;
		this.camera = camera;
		this.pxl = pxl;
		this.series = series;
		this.price = price;
		this.ram = ram;
	}
	
	public String printAll() {
		String res = (series +"\t"+ color +"\t"+ processor +"\t"+ camera +"\t"+ price +"\t"+ ram +"\t"+ pxl);
		return res;
	}
}
