package com.Anusha.Practice;
import java.lang.Math;
public class MathClass {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		float num3 = 251.895f; 
		
		//to get the minimum value
		System.out.println("minimum value = " + Math.min(num1, num2));
		
		//to get the maximum value
		System.out.println("maximum value = " + Math.max(num1, num2));
		
		//to get the absolute value
		System.out.println("Absolute values = " + Math.abs(num1));
		
		//to get the square root
		System.out.println("Suare root = " + Math.sqrt(num1));
		
		//to get the closest value with decimal as 0
		System.out.println("value = " + Math.ceil(num3));
		
		//to get the closest value without decimal
		System.out.println("round off = " + Math.round(num3));
		
		//to get the cosine of the value
		System.out.println("cosine of 20 = " + Math.cos(num2));
		
		//to decrement the value by one
		System.out.println("decrement of 10 = "+Math.decrementExact(num1));
		
		//value without counting the decimals presence
		System.out.println("value = "+Math.floor(num3));
		
		System.out.println(Math.getExponent(num3));
		
		//incrementing value by 1
		System.out.println("increment of 20 = "+Math.incrementExact(num2));
		
		//log10 value
		System.out.println("log10 251.895"+Math.log10(num3));
		
		//multiplication
		System.out.println(Math.multiplyExact(num1, num2));
		
		System.out.println(Math.nextDown(num3));
		
		System.out.println(Math.nextUp(num3));
		
		//subtract num2-num1
		System.out.println("substract 10-20 = "+Math.subtractExact(num1, num2));
		
		
	}

}
