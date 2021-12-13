package com.Anusha.radio.dto;

public class RadioDTO {
	String company;
	String color;
	int price;
	byte noOfRS;
	SizeDTO size;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public byte getNoOfRS() {
		return noOfRS;
	}
	public void setNoOfRS(byte noOfRS) {
		this.noOfRS = noOfRS;
	}
	public SizeDTO getSize() {
		return size;
	}
	public void setSize(SizeDTO size) {
		this.size = size;
	}
	
	public String toString() {
		return "RadioDTO [company=" + company + ", color=" + color + ", price=" + price + ", noOfRS=" + noOfRS
				+ ", size=" + size + "]";
	}
	
	
}
