package com.Anusha.inheritance.dtoWood;

public class Table extends Wood{
	public String type="Dining";
	public byte chairs=6;
	public float length=215.5f;
	public float width=31.24f;
	public int price=32650;
	
	public Table() {
		System.out.println("Table class");
	}
	
	public String type(String type) {
		return type;
	}
	
	public byte chairs(byte chairs) {
		return chairs;
	}
	
	public float length(float length) {
		return length;
	}
	
	public float width(float width) {
		return width;
	}
	
	public int price(int price) {
		return price;
	}
}
