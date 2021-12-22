package com.xworkz.cricket.test;

public class TestTest {
	public static void main (String []anu) {
		
			Test test = new Test("India","Kapil Dev","Australia",(byte)3,(byte)0,(byte)0,(byte)3,1985); 
			Test test1 = new Test("India","Ravi Shastri","West Indies",(byte)1,(byte)1,(byte)0,(byte)0,1987); 
			Test test2 = new Test("India","Mohamma Azharuddin","New Zeeland",(byte)3,(byte)1,(byte)0,(byte)2,1995); 
			Test test3 = new Test("India","Sachin Tendulkar","South Africa",(byte)3,(byte)0,(byte)2,(byte)1,1996); 
			Test test4 = new Test("India","Sourav Ganguly","Pakistan",(byte)1,(byte)1,(byte)0,(byte)0,2003); 
			Test test5 = new Test("India","Rahul Dravid","England",(byte)3,(byte)1,(byte)1,(byte)1,2005);
			Test test6 = new Test("India","Virender Sehwag","Sri Lanka",(byte)1,(byte)1,(byte)0,(byte)0,2005);
			Test test7 = new Test("India","Anil Kumble","Austarlia",(byte)4,(byte)1,(byte)2,(byte)1,200);
			Test test8 = new Test("India","MS Dhoni","Australia",(byte)4,(byte)4,(byte)0,(byte)0,2012);
			Test test9 = new Test("India","Virat Kohli","PakistanWest Indies",(byte)2,(byte)2,(byte)0,(byte)0,2019);
			
			System.out.println(test.printAll());
			System.out.println(test1.printAll());
			System.out.println(test2.printAll());
			System.out.println(test3.printAll());
			System.out.println(test4.printAll());
			System.out.println(test5.printAll());
			System.out.println(test6.printAll());
			System.out.println(test7.printAll());
			System.out.println(test8.printAll());
			System.out.println(test9.printAll());
}
}
