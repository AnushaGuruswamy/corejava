package com.Anusha.onePlus.dto;

public class WatchDTO {
	public String processor;
	public String color;
	public String series;
	public int price;
	public byte ram;
	
	public WatchDTO() {
	}

	public WatchDTO(String processor, String color, String series, int price, byte ram) {
		this.processor = processor;
		this.color = color;
		this.series = series;
		this.price = price;
		this.ram = ram;
	}
	
	public String printAll() {
		String res = (series +"\t"+ color +"\t"+ processor +"\t"+ price +"\t"+ ram );
		return res;
	}
}
