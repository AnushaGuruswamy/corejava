package com.Anusha.encapsulation;
import com.Anusha.encapsulation.dto.PgDTO;
import com.Anusha.encapsulation.operations.PgOperations;
public class TesterPg {
	public static void main(String []args) {
		
		PgOperations operations = new PgOperations();
		PgDTO dto = new PgDTO();
		
		dto.setBeds(12569);
		dto.setBranches((byte)3);
		dto.setChairs(15988651);
		dto.setDoors(26984);
		dto.setName("Kushi Pg");
		dto.setRent(56122);
		dto.setRooms((short)6405);
		dto.setSwitches(69865165);
		dto.setWindows(5665);
		dto.setWorkers((byte)64);
		
		operations.add(dto);
		operations.printAll();
		
		operations.updateChairs(56122,186);
		operations.printAll();
		
		operations.deleteBeds(12569);
		operations.printAll();
	}
}
