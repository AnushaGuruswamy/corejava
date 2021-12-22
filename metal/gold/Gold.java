package com.Anusha.metal.gold;

import com.Anusha.metal.Metal;

public class Gold extends Metal{
	public String chemicalName="Au";
	public float atomicWeight=196.6f;
	public byte atomicNum=79;
	public float meltingPoint=1064.665f;
	public byte valanceElectron=1; 
	
	public Gold() {
		super(42000,"gold",12.056f,"wire",26.359f);
		System.out.println("Gold class");
	}
	
	public Gold(String chemicalName,float atomicWeight,byte atomicNum,float meltingPoint,byte valanceElectron,String color, float weight, String type, float thickness, int price) {
		
		this.chemicalName=chemicalName;
		this.atomicWeight=atomicWeight;
		this.atomicNum=atomicNum;
		this.meltingPoint=meltingPoint;
		this.valanceElectron=valanceElectron;
	
	}
}
