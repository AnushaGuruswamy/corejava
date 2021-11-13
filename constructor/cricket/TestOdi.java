package com.xworkz.cricket.odi;

public class TestOdi {
	public static void main (String []anu) {
		
		Odi odi = new Odi((byte)1,"New Zeeland",(byte)17,(byte)121,(byte)50,(short)2054,354,374,1973);
		Odi odi1 = new Odi((byte)2,"England",(byte)32,(byte)119,(byte)50,(short)3793,384,339,1971);
		Odi odi2 = new Odi((byte)3,"Australia",(byte)28,(byte)116,(byte)50,(short)3244,581,334,1971);
		Odi odi3 = new Odi((byte)4,"India",(byte)32,(byte)113,(byte)50,(short)3624,518,428,1974);
		Odi odi4 = new Odi((byte)5,"South Africa",(byte)25,(byte)98,(byte)50,(short)2549,388,221,1991);
		Odi odi5 = new Odi((byte)6,"Pakistan",(byte)27,(byte)93,(byte)50,(short)2524,490,417,1973);
		Odi odi6 = new Odi((byte)7,"Bangladesh",(byte)30,(byte)91,(byte)50,(short)2740,136,245,1986);
		Odi odi7 = new Odi((byte)8,"West Indies",(byte)30,(byte)84,(byte)50,(short)2523,405,386,1973);
		Odi odi8 = new Odi((byte)9,"Sri Lanka",(byte)32,(byte)83,(byte)50,(short)2657,393,431,1975);
		Odi odi9 = new Odi((byte)10,"Afghanistan",(byte)17,(byte)62,(byte)50,(short)1054,62,63,2009);
		
		System.out.println(odi.printAll());
		System.out.println(odi1.printAll());
		System.out.println(odi2.printAll());
		System.out.println(odi3.printAll());
		System.out.println(odi4.printAll());
		System.out.println(odi5.printAll());
		System.out.println(odi6.printAll());
		System.out.println(odi7.printAll());
		System.out.println(odi8.printAll());
		System.out.println(odi9.printAll());
	}
}
