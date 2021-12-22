package com.Anusha.metal;

public class Metal {
	public int price;
	public String color;
	public float thickness;
	public String type;
	public float weight;
	
	public Metal() {
		System.out.println("Metal class");
	}
	
	public Metal(int price,String color,float thickness,String type,float weight) {
		this.price=price;
		this.color=color;
		this.thickness=thickness;
		this.type=type;
		this.weight=weight;
	}
}
