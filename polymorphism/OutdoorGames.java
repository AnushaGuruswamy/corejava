package com.Anusha.polymorphism;

public class OutdoorGames extends IndoorGames{
	
	@Override
	void getEntertained() {
		System.out.println("Outdoor games are more entertaining");
	}
	
	@Override
	void earnMoney() {
		System.out.println("can earn lot of money by Outdoor games");
	}
	
	@Override
	void earnMoney(long money) {
		System.out.println("money earned = " + money);
	}
}
