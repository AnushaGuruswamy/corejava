package com.Anusha.digitalWallet;

import com.Anusha.digitalWallet.dao.WalletDAO;
import com.Anusha.digitalWallet.dao.WalletDAOImpl;
import com.Anusha.digitalWallet.dto.DigitalWalletDTO;

public class Tester {
	
	public static void main(String[] args) {
		
		DigitalWalletDTO dto1 = new DigitalWalletDTO();
		DigitalWalletDTO dto2 = new DigitalWalletDTO();
		DigitalWalletDTO dto3 = new DigitalWalletDTO();
		
		dto1.setName("G-pay");
		dto1.setNoOfTransation((byte)10);
		dto1.setMaxLimit(20000);
		dto1.setCurrentBalance(65000);
		dto1.setInternetRequired(true);
		dto1.setCashback((byte)2);
		
		dto2.setName("PhonePe");
		dto2.setNoOfTransation((byte)10);
		dto2.setMaxLimit(10000);
		dto2.setCurrentBalance(15000);
		dto2.setInternetRequired(true);
		dto2.setCashback((byte)0);
		
		dto3.setName("amazon");
		dto3.setNoOfTransation((byte)5);
		dto3.setMaxLimit(10000);
		dto3.setCurrentBalance(5000);
		dto3.setInternetRequired(true);
		dto3.setCashback((byte)0);
		
		WalletDAO dao = new WalletDAOImpl();
		System.out.println("creating wallet of G-pay -> "+dao.creatWallet(dto1));
		System.out.println("current balance in G-pay -> "+dao.currentBalance("G-pay"));
		System.out.println("balance after payment of 220 -> "+dao.paid(220, "G-pay"));
		System.out.println("balance after recieving of 10000 -> "+dao.recieved(10000, "G-pay"));
		System.out.println("No. of transactions left -> "+dao.noOfTransactions("G-pay"));
		
		System.out.println("\n"+"creating wallet of PhonePe -> "+dao.creatWallet(dto2));
		System.out.println("current balance in PhonePe -> "+dao.currentBalance("PhonePe"));
		System.out.println("balance after payment of 2200 -> "+dao.paid(2200, "PhonePe"));
		System.out.println("balance after payment of 3000 -> "+dao.paid(3000, "PhonePe"));
		System.out.println("balance after payment of 1000 -> "+dao.paid(1000, "PhonePe"));
		System.out.println("No. of transactions left -> "+dao.noOfTransactions("PhonePe"));
		
		System.out.println("\n"+"creating wallet of PhonePe -> "+dao.creatWallet(dto3));
		System.out.println("current balance in amazon -> "+dao.currentBalance("amazon"));
		System.out.println("balance after recieving of 1500 -> "+dao.recieved(1500, "amazon"));
		System.out.println("balance after payment of 1000 -> "+dao.paid(1000, "amazon"));
		System.out.println("No. of transactions left -> "+dao.noOfTransactions("amazon"));
		
		System.out.println("\n"+"total transactions of the day (paid an recieved) -> "+dao.totalTransactionOfTheDay());
		
		
	}
	
}
																			