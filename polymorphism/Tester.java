package com.Anusha.polymorphism;

public class Tester {
	
	public static void main(String[] args) {
		
		Games games = new OutdoorGames();
		games.earnMoney();
		games.getEntertained();
		
		IndoorGames ig = new OutdoorGames();
		ig.earnMoney();
		ig.getEntertained();
		ig.earnMoney(23165521l);
		
	}
	
}
