package com.anusha.news.trials;

public class trial3 {
	public static void main(String []args) {
		String str = "ANUSHA";
		
		char[] a = str.toCharArray();
		for (int index = 0 ; index < a.length ; index++) {
			if(a[index]>=65 && a[index]<=90) {
				a[index] = (char)(a[index] +32);
				
			}
		System.out.print(a[index]);
		}
	}
}
