package com.Anusha.inheritance.dtoPhone;

public class Vivo extends Phone{
	public String company="VIVO";
	public String series = "V9";
	public int price=16000;
	public byte ram=4;
	public byte camera=3;
	
	public Vivo() {
		System.out.println("Vivo class");
	}
	
	public String company(String company) {
		return company;
	}
	
	public String series(String series) {
		return series;
	}
	
	public int price(int price) {
		return price;
	}
	
	public byte ram(byte ram) {
		return ram;
	}
	
	public byte camera(byte camera) {
		return camera;
	}
}
