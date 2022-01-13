package com.Anusha.digitalWallet.dao;

import com.Anusha.digitalWallet.dto.DigitalWalletDTO;

public interface WalletDAO {
	
	public String creatWallet(DigitalWalletDTO digi);
	public int currentBalance(String name);
	public int paid(int paid,String name);
	public int recieved(int recieved,String name);
	public int noOfTransactions(String name);
	public int totalTransactionOfTheDay();
	
	
}
