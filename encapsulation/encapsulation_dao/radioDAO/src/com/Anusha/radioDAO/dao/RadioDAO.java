package com.Anusha.radioDAO.dao;

import com.Anusha.radioDAO.dto.RadioDTO;

public class RadioDAO {

	RadioDTO radio[] = new RadioDTO[3];
	int index = 0;

	public void add(RadioDTO dto) {
		if (index < radio.length) {
			radio[index] = dto;
		}
		index++;
	}

	public void printAll() {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				System.out.println(radio[index].toString());
			}
		}
	}

	public RadioDTO updateCompanyByColor(String company, String color) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (color.equals(radio[index].getColor())) {
					radio[index].setCompany(company);
				}
			}
		}
		return radio[index];
	}

	public RadioDTO updateColorByPrice(String color, int price) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (color.equals(radio[index].getColor())) {
					radio[index].setPrice(price);
				}
			}
		}
		return radio[index];
	}

	public RadioDTO updatePriceByNoOfRS(int price, byte noOfRS) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (price == radio[index].getPrice()) {
					radio[index].setNoOfRS(noOfRS);
				}
			}
		}
		return radio[index];
	}

	public RadioDTO getByCompany(String company) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (company.equals(radio[index].getCompany())) {
					return radio[index];
				}
			}
		}
		return radio[index];
	}

	public RadioDTO getByPrice(int price) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (price == radio[index].getPrice()) {
					return radio[index];
				}
			}
		}
		return radio[index];
	}

	public RadioDTO getByWidth(double width) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (width == radio[index].getSize().getWidth()) {
					if (radio[index] != null) {
						return radio[index];
					}
				}
			}
		}
		return radio[index];
	}

	public String deleteByPrice(int price) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (price == radio[index].getPrice()) {
					radio[index] = null;
					return null;
				}
			}
		}
		return "Not deleted";
	}

	public String deleteByColor(String color) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (color == radio[index].getColor()) {
					radio[index] = null;
					return "deleted";
				}
			}
		}
		return "Not deleted";
	}

	public String deleteByLength(float length) {
		for (int index = 0; index < radio.length; index++) {
			if (radio[index] != null) {
				if (length == radio[index].getSize().getLength()) {
					radio[index] = null;
					return "deleted";
				}
			}
		}
		return "Not deleted";
	}

}
