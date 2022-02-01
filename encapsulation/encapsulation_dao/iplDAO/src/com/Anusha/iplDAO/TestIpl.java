package com.Anusha.iplDAO;

import com.Anusha.iplDAO.dto.CaptainDTO;
import com.Anusha.iplDAO.dto.IplDTO;
import com.Anusha.iplDAO.dao.IplDAO;

public class TestIpl {
public static void main(String[] args) {
		
		IplDTO ipl = new IplDTO();
		ipl.setTeam("Chennai Super Kings");
		ipl.setPlace("Chennai");
		ipl.setPlayers((byte)16);
		ipl.setOwner("India Cements");
		
		IplDTO ipl1 = new IplDTO();
		ipl.setTeam("Royal Challengers");
		ipl.setPlace("Banglore");
		ipl.setPlayers((byte)16);
		ipl.setOwner("abcd");
		
		CaptainDTO dto = new CaptainDTO();
		dto.setName("Dhoni");
		dto.setAge((byte)40);
		dto.setExperience((byte)16);
		ipl.setCaptain(dto);
		
		CaptainDTO dto1 = new CaptainDTO();
		dto.setName("Virat");
		dto.setAge((byte)38);
		dto.setExperience((byte)12);
		
		IplDAO dao = new IplDAO();
		
		System.out.println(dao.add(ipl));
		dao.printAll();
		System.out.println(dao.add(ipl1));
		dao.printAll();
		System.out.println(dao.deleteByPlayers((byte)16));
		dao.printAll();
		System.out.println(dao.deleteByAge((byte)38));
		dao.printAll();
		
	}
}
