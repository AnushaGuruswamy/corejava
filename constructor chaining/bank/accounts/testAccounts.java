package com.xworkz.bank.accounts;

public class testAccounts {
	public static void main(String []args) {
		
		
		Accounts holder1 = new Accounts("KarnatakaBank","jhon");
		Accounts holder2 = new Accounts("KarnatakaBank","ram",80799);
		Accounts holder3 = new Accounts("KarnatakaBank","shashi",80798,5679834659l,76765);
		Accounts holder4 = new Accounts("KarnatakabBank","ganga",18720,7634987253l,76920,"DVP1234");
		Accounts holder5 = new Accounts("KarnatakabBank","arjun",18720,7634987253l,76920,"SVP1234","BDA2345",9916073718l);
		Accounts holder6 = new Accounts("KarnatakabBank","Arun",80799,7634987253l,76920,"DUAP1234","BDA2345",8550071423l,962362282676l,"Kodigehalli");
		
	       System.out.println(holder1.printall());	
	       System.out.println(holder2.printall());
	       System.out.println(holder3.printall());
	       System.out.println(holder4.printall());
	       System.out.println(holder5.printall());
	       System.out.println(holder6.printall());
		}

	}

