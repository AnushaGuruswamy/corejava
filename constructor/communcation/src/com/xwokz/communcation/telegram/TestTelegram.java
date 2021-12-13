package com.xwokz.communcation.telegram;

import com.xwokz.communcation.telegram.Telegram;

public class TestTelegram {
	public static void main (String []anu) {
		
		com.xwokz.communcation.telegram.Telegram telegram = new com.xwokz.communcation.telegram.Telegram();
		com.xwokz.communcation.telegram.Telegram telegram1 = new com.xwokz.communcation.telegram.Telegram("wired");
		com.xwokz.communcation.telegram.Telegram telegram2 = new com.xwokz.communcation.telegram.Telegram("wired","wire");
		com.xwokz.communcation.telegram.Telegram telegram3 = new com.xwokz.communcation.telegram.Telegram("wired","wire","Morse code");
		com.xwokz.communcation.telegram.Telegram telegram4 = new com.xwokz.communcation.telegram.Telegram("wired","wire","Morse code",1832);
		
		System.out.println(telegram.getAll());
		System.out.println(telegram1.getAll());
		System.out.println(telegram2.getAll());
		System.out.println(telegram3.getAll());
		System.out.println(telegram4.getAll());
	}
}
