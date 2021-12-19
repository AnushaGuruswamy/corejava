package com.Anusha.inheitance.dtoCosmetic;

public class Cosmetic {
	public byte types = 7;
	public short brands = 1253;
	public int things = 216523;
	public boolean safe;
	public byte productionCountries = 62;
	
	public Cosmetic() {
		System.out.println("Cosmetic class");
	}
	
	public byte types(byte types) {
		return types;
	}
	
	public short brands(short brands) {
		return brands;
	}
	
	public int things(int things) {
		return things;
	}
	
	public boolean safe(boolean safe) {
		return safe;
	}
	
	public byte productionCountries(byte productionCountries) {
		return productionCountries;
	}
}
