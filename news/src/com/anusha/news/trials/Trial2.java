package com.anusha.news.trials;

public class trial2 {
	public static void main(String []args) {
		String s = new String("Harry Potter");
		
		char[] b1 = s.toCharArray();
		 char ch='r';
		for(int index = 0 ; index < b1.length ; index++ ) {
			if (ch == b1[index]) {
				b1[index] = 'R';
				System.out.print(b1[index]);
			}
			else {
				System.out.print(b1[index]);
			}
		
		
		
	}
	}
}
