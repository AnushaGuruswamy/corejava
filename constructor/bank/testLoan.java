package com.xworkz.bank.loan;

public class testLoan {
public static void main(String[]a) {
		
		Loan loan1=new Loan("canara","goldloan",2345,"Raghu",8073343646.0,"hd963877873",54645.87f);
		System.out.println(loan1.printAll());
		Loan loan2=new Loan("canara","homeloan",2346,"Karthik",8073348645.0,"he963877873",54666.87f);
		System.out.println(loan1.printAll());
		Loan loan3=new Loan("canara","homeloan",2345,"Shilpa",8550071423.0,"hp963877873",67645.87f);
		System.out.println(loan1.printAll());
		Loan loan4=new Loan("canara","bikeloan",2845,"Keerti",8075643646.0,"hy963877873",54855.87f);
		System.out.println(loan1.printAll());
		Loan loan5=new Loan("canara","Studyloan",2895,"Subbu",80789343646.0,"hd9638567873",546455.87f);
		System.out.println(loan1.printAll());
		Loan loan6=new Loan("canara","Studyloan",2895);
	}

}
