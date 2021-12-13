package com.xwokz.communcation.letter;

import com.xwokz.communcation.letter.Letter;

public class TestLetter {
	public static void main(String []anu) {
		
		com.xwokz.communcation.letter.Letter letter = new com.xwokz.communcation.letter.Letter();
		com.xwokz.communcation.letter.Letter letter1 = new com.xwokz.communcation.letter.Letter("hand written");
		com.xwokz.communcation.letter.Letter letter2 = new com.xwokz.communcation.letter.Letter("hand witten",56);
		com.xwokz.communcation.letter.Letter letter3 = new com.xwokz.communcation.letter.Letter("printed using ink",1669,"clothe",1846);
		com.xwokz.communcation.letter.Letter letter4 = new com.xwokz.communcation.letter.Letter("hand witten",13,"clothe",1813);
		com.xwokz.communcation.letter.Letter letter5 = new com.xwokz.communcation.letter.Letter("printed using ink",96,"paper",1906);
		
		System.out.println(letter.getAll());
		System.out.println(letter1.getAll());
		System.out.println(letter2.getAll());
		System.out.println(letter3.getAll());
		System.out.println(letter4.getAll());
		System.out.println(letter5.getAll());
	}
}
