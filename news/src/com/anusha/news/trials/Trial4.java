package com.anusha.news.trials;

public class Trial4 {
	public static void main(String []args) {
		String str = "anusha";
		
		char[] a = str.toCharArray();
		for (int index = 0 ; index < a.length ; index++) {
			if(a[index]>=97 && a[index]<=122) {
				a[index] = (char)(a[index] -32);
				
			}
		System.out.print(a[index]);
		}
	}

}
