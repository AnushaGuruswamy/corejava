package com.Anusha.poDAO.dao;

import com.Anusha.poDAO.dto.PoDTO;


public class PoDAO {
	PoDTO po[] = new PoDTO[3];
	int index = 0;
	
	public boolean add(PoDTO dto) {
		if(index<po.length) {
			po[index]=dto;
			return true;
			
		}index++;
		return false;
	}
	
	public PoDTO updatePlaceByPMName(String place, String pMName) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (pMName.equals(po[index].getpMName())) {
					po[index].setPlace(place);
				}
			}
		}
		return po[index];
	}

	public PoDTO updatePMNameByEmloyee( byte employee,String pMName) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (employee==po[index].getEmployee()) {
					po[index].setpMName(pMName);
				}
			}
		}
		return po[index];
	}

	public PoDTO updateIsBanchByEmployee(boolean isBranchPo, byte employee) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (employee == po[index].getEmployee()) {
					po[index].setIsBranchPo(isBranchPo);
				}
			}
		}
		return po[index];
	}

	public PoDTO getByPlace(String place) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (place.equals(po[index].getPlace())) {
					return po[index];
				}
			}
		}
		return po[index];
	}

	public PoDTO getByEmployee(byte employee) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (employee == po[index].getEmployee()) {
					return po[index];
				}
			}
		}
		return po[index];
	}

	public PoDTO getByPinCode(int pinCode) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (pinCode == po[index].getAddress().getPinCode()) {
					if (po[index] != null) {
						return po[index];
					}
				}
			}
		}
		return po[index];
	}

	public String deleteByEmployee(byte employee) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (employee == po[index].getEmployee()) {
					po[index] = null;
					return null;
				}
			}
		}
		return "Not deleted";
	}

	public String deleteByPMName(String pMName) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (pMName == po[index].getpMName()) {
					po[index] = null;
					return "deleted";
				}
			}
		}
		return "Not deleted";
	}

	public String deleteByArea(String area) {
		for (int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				if (area == po[index].getAddress().getArea()) {
					po[index] = null;
					return "deleted";
				}
			}
		}
		return "Not deleted";
	}
	
		public void printAll() {
		for(int index = 0; index < po.length; index++) {
			if (po[index] != null) {
				System.out.println(po[index].toString());
			}
		}
	}
	
}
