package com.Anusha.polymorphism;

public abstract class IndoorGames extends Games{
	
	@Override
	void getEntertained() {
		System.out.println("Indoor games are less entertaining");
	}
	
	abstract void earnMoney(long money);
	
	@Override
	void earnMoney() {
		System.out.println("Can earn less money compared to Outdoor games");
	}
	
}
