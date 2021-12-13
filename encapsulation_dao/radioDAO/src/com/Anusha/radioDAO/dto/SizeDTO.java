package com.Anusha.radioDAO.dto;

public class SizeDTO {
	private float height;
	private float length;
	private double width;
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public String toString() {
		return "height=" + height + ", length=" + length + ", width=" + width ;
	}
	
}
