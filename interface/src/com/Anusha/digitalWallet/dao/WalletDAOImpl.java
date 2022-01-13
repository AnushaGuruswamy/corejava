package com.Anusha.digitalWallet.dao;

import com.Anusha.digitalWallet.dto.DigitalWalletDTO;

public class WalletDAOImpl implements WalletDAO{
	
	DigitalWalletDTO dtos[] = new DigitalWalletDTO[5];
	int index=0;
	static int count = 0;
	static int countMoney = 0; 
	
	@Override
	public String creatWallet(DigitalWalletDTO digi) {
		dtos[index]=digi;
		index++;
		return "Wallet created";
	}
	
	@Override
	public int currentBalance(String name) {
		for(int index = 0; index < dtos.length ; index++) {
			if(name!=null) {
				if(name.equals(dtos[index].getName())) {
					return dtos[index].getCurrentBalance();
				}
			}else {
				System.out.println("invalid name");
			}
		}return 0; 
	}
	
	@Override
	public int paid(int paid,String name) {
		int balance = 0; 
		for(int index = 0 ; index < dtos.length ; index++ ) {
			if(name!=null && paid != 0) {
				if(name.equals(dtos[index].getName())) {
					balance = dtos[index].getCurrentBalance() - paid;
					count++;
					countMoney += paid;
					return balance;
				}
			}else {
				System.out.println("name cannot be null");
			}
		}return balance;
	}
	
	@Override
	public int recieved(int recieved,String name) {
		int balance = 0;
		for(int index = 0 ; index < dtos.length ; index++) {
			if(name != null && recieved!=0) {
				if(name.equals(dtos[index].getName())) {
					balance = dtos[index].currentBalance + recieved;
					countMoney += recieved;
					return balance;
				}
			}else {
				System.out.println("name cannot be null");
			}
		}return balance;
	}
	
	@Override
	public int noOfTransactions(String name) {
		int leftover = 0;
		for(int index = 0 ; index < dtos.length ; index++) {
			if(name!= null) {
				if(name.equals(dtos[index].getName())) {
					leftover = dtos[index].getNoOfTransation()-count;
					return leftover;
				}
			}else {
				System.out.println("name cannot be null"); 
			}
		}return leftover;
	}
	
	public int totalTransactionOfTheDay() {
		return countMoney;
	}
		
}
