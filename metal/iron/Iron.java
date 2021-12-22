package com.Anusha.metal.iron;

import com.Anusha.metal.Metal;

public class Iron extends Metal{
	public String chemicalName="Fe";
	public float density=7.8f;
	public byte atomicNum=26;
	public int meltingPoint=1536;
	public int boilingPoint=2861;
	
	public Iron() {
		super(5300,"red",215.5f,"cube",261.9f);
		System.out.println("Iron class");
	}
	
	public Iron(String chemicalName, float density, byte atomicNum, int meltingPoint, int boilingPoint) {
		super(5300,"red",215.5f,"cube",261.9f);
		this.chemicalName=chemicalName;
		this.density=density;
		this.atomicNum=atomicNum;
		this.meltingPoint=meltingPoint;
		this.boilingPoint=boilingPoint;
	}
}
