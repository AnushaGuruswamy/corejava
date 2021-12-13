package com.Anusha.crud.dto;

public class DtoCricket {

	Cricketdto[] cdto = new Cricketdto[5];
	int index = 0;

	public void add(Cricketdto info) {
		if (index < cdto.length) {

			cdto[index] = info;
			index++;

		}
	}

	public void getAll() {
		for (index = 0; index < cdto.length; index++) {
			if (cdto[index] != null) {
				System.out.println(cdto[index].getAll());
			}
		}
	}

	public Cricketdto updateNameByContact(long contact, String name) {
		Cricketdto dto = null;
		for (int index = 0; index < cdto.length; index++) {
			if (cdto[index] != null) {
				if (contact == (cdto[index].contact)) {
					cdto[index].name = name;
					dto = cdto[index];
				}
			}
		}
		return dto;
	}
}
