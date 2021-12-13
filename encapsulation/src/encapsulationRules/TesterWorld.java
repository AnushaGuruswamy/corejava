package encapsulationRules;

import encapsulationRules.dto.World;
import encapsulationRules.operations.WorldOperations;

public class TesterWorld {
	public static void main(String []args) {
		
		WorldOperations operations = new WorldOperations();
		World world = new World();
		
		world.setAnimals(15221);
		world.setAxis("Longitudinal");
		world.setContinents((byte)7);
		world.setCountries(25669);
		world.setFishes(655812);
		world.setFoods(195621235);
		world.setMaterials("Glass");
		world.setPlants(66521);
		world.setTrees(32669);
		world.setVehicles((short)1553);
		
		operations.add(world);
		operations.printAll();
		
		System.out.println(operations.updateTrees(66521,5500));
		operations.printAll();
		
		System.out.println(operations.deleteAxis("Longitudinal"));
		operations.printAll();
	}
}
