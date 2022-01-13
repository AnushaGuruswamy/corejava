package com.Anusha.digitalWallet.dto;

import java.util.Objects;

public class DigitalWalletDTO {
	
	public String name;
	public byte noOfTransation;
	public int maxLimit;
	public int currentBalance;
	public boolean internetRequired;
	public byte cashback;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getNoOfTransation() {
		return noOfTransation;
	}
	public void setNoOfTransation(byte noOfTransation) {
		this.noOfTransation = noOfTransation;
	}
	public int getMaxLimit() {
		return maxLimit;
	}
	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}
	public boolean isInternetRequired() {
		return internetRequired;
	}
	public void setInternetRequired(boolean internetRequired) {
		this.internetRequired = internetRequired;
	}
	
	public byte getCashback() {
		return cashback;
	}
	public void setCashback(byte cashback) {
		this.cashback = cashback;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "name :" + name + "noOfTransation :" + noOfTransation + "maxLimit" + maxLimit 
				+ "currentBalance" + currentBalance + "internetRequired" + internetRequired + "cashback" + cashback;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof DigitalWalletDTO)) {
			return false;
		}
		DigitalWalletDTO other = (DigitalWalletDTO) obj;
		return cashback == other.cashback && currentBalance == other.currentBalance
				&& internetRequired == other.internetRequired && maxLimit == other.maxLimit
				&& Objects.equals(name, other.name) && noOfTransation == other.noOfTransation;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,noOfTransation,maxLimit,currentBalance,internetRequired,cashback);
	}
	
} 
	

