package com.Anusha.postOffice.dto;

public class PoDTO {
	String place;
	String pMName;
	boolean isBranchPo;
	byte employee;
	AddressDTO address;
	
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getpMName() {
		return pMName;
	}
	public void setpMName(String pMName) {
		this.pMName = pMName;
	}
	public boolean isBranchPo() {
		return isBranchPo;
	}
	public void setBranchPo(boolean isBranchPo) {
		this.isBranchPo = isBranchPo;
	}
	public byte getEmployee() {
		return employee;
	}
	public void setEmployee(byte employee) {
		this.employee = employee;
	}
	public AddressDTO getAddress() {
		return address;
	}
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	
	public String toString() {
		return "PoDTO [place=" + place + ", pMName=" + pMName + ", isBranchPo=" + isBranchPo + ", employee=" + employee
				+ ", address=" + address + "]";
	}
	
	
	
	
}
