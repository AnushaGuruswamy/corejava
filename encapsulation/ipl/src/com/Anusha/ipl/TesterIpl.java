package com.Anusha.ipl;
import com.Anusha.ipl.dto.IplDTO;
import com.Anusha.ipl.dto.LeaderDTO;
public class TesterIpl {
	public static void main(String[] args) {
		
		IplDTO ipl = new IplDTO();
		ipl.setTeam("Chennai Super Kings");
		ipl.setPlace("Chennai");
		ipl.setPlayers((byte)16);
		ipl.setOwner("India Cements");
		
		LeaderDTO dto = new LeaderDTO();
		dto.setName("Dhoni");
		dto.setAge((byte)40);
		dto.setExperience((byte)16);
		
		ipl.setLeader(dto);
		
		System.out.println(ipl);
	}
}
