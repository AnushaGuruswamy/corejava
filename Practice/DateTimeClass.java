package com.Anusha.Practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeClass {

	public static void main(String[] args) {
		
		//current date
		System.out.println("current date = "+LocalDate.now());
		
		//current time
		System.out.println("current time = "+LocalTime.now());
		
		//current date and time
		System.out.println(LocalDateTime.now());
		
		LocalDate date1 = LocalDate.of(1999,04,13);
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.parse("2000-05-08");
		System.out.println(date2);
		
		//DateFormat sourceFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);
	    //DateFormat targetFormat = new SimpleDateFormat("13/04/1999");
	    //System.out.println(sourceFormat);
	    //System.out.println(targetFormat);
	    
	    
	    LocalDate date15 = LocalDate.now();
	    System.out.println(date15);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/uuuu");
	    String strDate= formatter.format(date15);
	    System.out.println(strDate);
	    }
	}