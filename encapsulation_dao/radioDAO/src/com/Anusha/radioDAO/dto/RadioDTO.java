package com.Anusha.radioDAO.dto;

public class RadioDTO {
	private String company;
	private String color;
	private int price;
	private byte noOfRS;
	private SizeDTO size;
	
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
		return "company=" + company + ", color=" + color + ", price=" + price + ", noOfRS=" + noOfRS
				+ ", size=" + size;
	}
	
}
