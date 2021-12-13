package com.Anusha.radio.dto;

public class SizeDTO {
	float height;
	float length;
	double width;
	
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
		return "SizeDTO [height=" + height + ", length=" + length + ", width=" + width + "]";
	}
	
	
}
