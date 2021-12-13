package com.Anusha.iplDAO.dao;

import com.Anusha.iplDAO.dto.IplDTO;

public class IplDAO {
	IplDTO ipl[] = new IplDTO[5];
	int index = 0;
	
	public boolean add(IplDTO dto) {
		if(index<ipl.length) {
			ipl[index]=dto;
			return true;
			
		}index++;
		return false;
	}
	
	
	public String deleteByPlayers(byte players) {
		for(int index = 0; index < ipl.length ; index++) {
			if(ipl[index]!=null) {
			if(players==ipl[index].getPlayers()) {
				ipl[index]=null;
				return "deleted";
			}
			}
		}
		return "Not deleted";
	}
	
	public String deleteByAge(byte age) {
		for(int index = 0; index < ipl.length ; index++) {
			if(ipl[index]!=null) {
				if(age==ipl[index].getCaptain().getAge()) {
				if(ipl[index]!=null) {
				ipl[index]=null;
				return "deleted";
			}
				}
			}
		}
		return "Not deleted";
	}

	public void printAll() {
		for(int index = 0; index < ipl.length; index++) {
			
			System.out.println(ipl[index]);
		}
		
	}
}
