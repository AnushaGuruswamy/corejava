package com.Anusha.metal.copper;

import com.Anusha.metal.Metal;

public class Copper extends Metal{
	public String chemicalName = "Cu";
	public byte atomicNum = 29;
	public float density = 8.96f;
	public int meltingPoint = 1083;
	public int boilingPoint = 2567;
	
	public Copper() {
		super(1236,"copper",25123.5f,"wire",21812.58f);
	}
	
	public Copper(String chemicalName,byte atomicNum,float density, int meltingPoint, int boilingPoint) {
		super(1236,"copper",25123.5f,"wire",21812.58f);
		this.chemicalName=chemicalName;
		this.atomicNum=atomicNum;
		this.density=density;
		this.meltingPoint=meltingPoint;
		this.boilingPoint=boilingPoint;
	}
}
