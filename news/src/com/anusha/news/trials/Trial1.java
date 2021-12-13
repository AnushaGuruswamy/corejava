package com.anusha.news.trials;

public class Trials {
	public static void main(String []anu) {
		
		String a = new String("Hello everyone");
		
		char[] b = a.toCharArray();
		System.out.println(b);
		
		char c = 'e';
		for(int index = 0 ; index < a.length() ; index++) {
			if(c == b[index]) {
				System.out.println(index);
			}
		}
	}
}	
	

