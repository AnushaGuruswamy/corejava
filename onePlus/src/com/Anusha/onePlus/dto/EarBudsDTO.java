package com.Anusha.onePlus.dto;

public class EarBudsDTO {
	
	public String color;
	public String series;
	public int price;
	public String type;
	
	public EarBudsDTO() {
	}

	public EarBudsDTO(String color,  String series, int price, String type) {
		
		this.color = color;
		this.series = series;
		this.price = price;
		this.type=type;
	}
	
	public String printAll() {
		String res = (series +"\t"+ color +"\t"+ price +"\t"+ type);
		return res;
	}
}
