package com.Anusha.metal.silver;

import com.Anusha.metal.Metal;

public class Silver extends Metal{
	public String chemicalName="Ag";
	public float atomicWeight=107.86f;
	public byte atomicNum=47;
	public float meltingPoint=961.8f;
	public byte valanceElectron=3;
	
	public Silver() {
		super(4200,"silver",183.551f,"sheet",22.329f);
		System.out.println("Silver class");
	} 
	
	public Silver(String chemicalName, float atomicWeight, byte atomicNum, float meltingPoint, byte valanceElectron) {
		super(4200,"silver",183.551f,"sheet",22.329f);
		this.chemicalName=chemicalName;
		this.atomicWeight=atomicWeight;
		this.atomicNum=atomicNum;
		this.meltingPoint=meltingPoint;
		this.valanceElectron=valanceElectron;
	}
}
