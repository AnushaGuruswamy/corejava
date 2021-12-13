package com.xwokz.communcation.mobile;

public class TestMobile {
	public static void main(String []anu) {
		
		com.xwokz.communcation.mobile.Mobile mob = new com.xwokz.communcation.mobile.Mobile();
		com.xwokz.communcation.mobile.Mobile mob1 = new com.xwokz.communcation.mobile.Mobile("keypad");
		com.xwokz.communcation.mobile.Mobile mob2 = new com.xwokz.communcation.mobile.Mobile("screen touch","Samsung");
		com.xwokz.communcation.mobile.Mobile mob3 = new com.xwokz.communcation.mobile.Mobile("Android","MI","Redmi Y1",11000,true);
		com.xwokz.communcation.mobile.Mobile mob4 = new com.xwokz.communcation.mobile.Mobile("iOs","Apple","12",60000,true);
		
		System.out.println(mob.getAll());
		System.out.println(mob1.getAll());
		System.out.println(mob2.getAll());
		System.out.println(mob3.getAll());
		System.out.println(mob4.getAll());
	}
}
