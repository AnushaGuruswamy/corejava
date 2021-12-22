package com.xworkz.animal.rabbit;

public class TestRabbit {
	public static void main (String []args) {
		
		com.xworkz.animal.rabbit.Rabbit rabbit = new com.xworkz.animal.rabbit.Rabbit();
		com.xworkz.animal.rabbit.Rabbit rabbit1 = new com.xworkz.animal.rabbit.Rabbit("Dwarf");
		com.xworkz.animal.rabbit.Rabbit rabbit2 = new com.xworkz.animal.rabbit.Rabbit("Holland Lop",'B');
		com.xworkz.animal.rabbit.Rabbit rabbit3 = new com.xworkz.animal.rabbit.Rabbit("Mini Lop",'b',(long)25556932,3);
		com.xworkz.animal.rabbit.Rabbit rabbit4 = new com.xworkz.animal.rabbit.Rabbit("Rex",'W',(long)556913615,36,2.4);
		com.xworkz.animal.rabbit.Rabbit rabbit5 = new com.xworkz.animal.rabbit.Rabbit("American Fuzzy Lop",'G',(long)1289653,10,3.21);
		
		System.out.println(rabbit.getAll());
		System.out.println(rabbit1.getAll());
		System.out.println(rabbit2.getAll());
		System.out.println(rabbit3.getAll());
		System.out.println(rabbit4.getAll());
		System.out.println(rabbit5.getAll());
	}
}
