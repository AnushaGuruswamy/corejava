package com.Anusha.metal.platinum;

import com.Anusha.metal.Metal;

public class Platinum extends Metal{
	public String chemicalName = "Pt";
	public byte atomicNum = 78;
	public float atomicMass = 195.084f;
	public int meltingPoint = 1768;
	public int boilingPoint = 1735;
	
	public Platinum() {
		super(5513,"silver",356.2f,"biscuit",255521.35f);
	}
	
	public Platinum(String chemicalName,byte atomicNum,float atomicMass, int meltingPoint, int boilingPoint) {
		super(5513,"silver",356.2f,"biscuit",255521.35f);
		this.chemicalName=chemicalName;
		this.atomicNum=atomicNum;
		this.atomicMass=atomicMass;
		this.meltingPoint=meltingPoint;
		this.boilingPoint=boilingPoint;
	}
}
