package com.Anusha.EWatch.dto;

public class WatchDTO {
	private int battery;
	private String color;
	private String series;
	private byte ram;
	private byte warranty;
	private float weight;
	private boolean waterResistance;
	private String os;
	private String display;
	private float bTVersion;
	
	public WatchDTO() {
		
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public byte getWarranty() {
		return warranty;
	}

	public void setWarranty(byte warranty) {
		this.warranty = warranty;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isWaterResistance() {
		return waterResistance;
	}

	public void setWaterResistance(boolean waterResistance) {
		this.waterResistance = waterResistance;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public float getbTVersion() {
		return bTVersion;
	}

	public void setbTVersion(float bTVersion) {
		this.bTVersion = bTVersion;
	}

	
	public String toString() {
		return "WatchDTO [battery=" + battery + ", color=" + color + ", series=" + series + ", ram=" + ram
				+ ", warranty=" + warranty + ", weight=" + weight + ", waterResistance=" + waterResistance + ", os="
				+ os + ", display=" + display + ", bTVersion=" + bTVersion + "]";
	}
	
	
	
}
