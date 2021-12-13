package com.Anusha.stringOperations.temple;

import com.Anusha.stringOperations.temple.Temple;

public class TestTemple {
public static void main(String []args) {
		
		Temple temple = new Temple();
		
		temple.add("Virupaksha Temple");
		temple.add("Meenakshi Temple");
		temple.add("Someshwara Temple");
		temple.add("Shiva Temple");
		temple.add("Mahabaleshwa Temple");
		temple.add("Chennakeshava Temple");
		temple.add("Dharmasthala");
		temple.add("Sai baba Temple");
		temple.add("Gomateshwara");
		temple.add("Kudala Sangama");
		
		
		temple.printAll();
		
		temple.read("Gomateshwara");
		
		temple.update("Virupaksha Temple", "Hampi Virupaksha Temple");
		temple.update("Meenakshi Temple", "Madhurai Meenakshi Temple");
		temple.update("Shiva Temple", "Murudeshwara Shiva Temple");
		temple.update("Mahabaleshwa Temple", "Mahabaleshwa Temple, Gokarna");
		temple.update("Gomateshwara", "The statue of Gomateshwara, Stavana Belagola");
	
		temple.delete("Kudala Sangama");
	}
}
