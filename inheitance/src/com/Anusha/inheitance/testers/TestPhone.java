package com.Anusha.inheitance.testers;

import com.Anusha.inheitance.dtoPhone.Phone;
import com.Anusha.inheitance.dtoPhone.Vivo;

public class TestPhone {

	public static void main(String[] args) {
		
		Phone phone = new Phone();
		System.out.println(phone.brands);
		System.out.println(phone.proccessors);
		System.out.println(phone.features);
		System.out.println(phone.radio);
		System.out.println(phone.type);
		
		Vivo vivo = new Vivo();
		System.out.println(vivo.brands);
		System.out.println(vivo.proccessors);
		System.out.println(vivo.features);
		System.out.println(vivo.radio);
		System.out.println(vivo.type);
		
		System.out.println(vivo.company);
		System.out.println(vivo.series);
		System.out.println(vivo.price);
		System.out.println(vivo.ram);
		System.out.println(vivo.camera);
	}

}
