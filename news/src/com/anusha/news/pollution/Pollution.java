package com.anusha.news.pollution;

public class Pollution {
	public static void main(String []args) {
		String p = new String("Air pollution : Thermal plants closed, Trucks can't enter Delhi");
		
		char c = p.charAt(10); 
		System.out.println(c);
		
		boolean c1 = p.contains(p);
		System.out.println(c1);
		
		String h = " Headlines";
		String c2 = p.concat(h);
		System.out.println(c2);
		
		String h1 = "Headlines";
		boolean c3 = h.equals(h1);
		System.out.println(c3);
		
		int c4 = p.indexOf('A');
		System.out.println(c4);
		
		String h2 = new String();
		boolean c5 = h2.isEmpty();
		System.out.println(c5);
		
		String c6 = p.replace("pollution","Pollution");
		System.out.println(c6);
		
		String[] c7 = p.split(":");
		System.out.println(c7);
		
		char[] c8 =h1. toCharArray();
		System.out.println(c8);
		
		String c9 = h1.toLowerCase();
		System.out.println(c9);
		
		String c10 = h1.toUpperCase();
		System.out.println(c10);
	}
}
