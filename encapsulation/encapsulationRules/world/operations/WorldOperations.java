package encapsulationRules.operations;
import encapsulationRules.dto.World;
public class WorldOperations {
	
	World []elements = new World[10];
	int index=0;
	
	public void add(World dto) {
		if(index <elements.length) {
			elements[index] = dto;
		    index++;
		}
	
	}
	
	public void printAll() {
		for(int index=0;index<elements.length;index++) {
			if(elements[index]!=null) {
			System.out.println(elements[index].getAll());
			}
		}
	}
	
	public String updateTrees(int plants, int trees) {
		for(int index = 0; index < elements.length ; index++) {
			if(elements[index]!=null) {
			if(plants==(elements[index].getPlants())) {
				elements[index].setTrees(trees) ;
			}
			}
		}
		return "updated";
	}
	
	public String deleteAxis(String axis) {
		for(int index = 0; index < elements.length ; index++) {
			if(elements[index]!=null) {
			if(axis.equals(elements[index].getAxis())) {
				elements[index].setAxis(null);
				
			}
			}
		}
		return "Deleted";
	} 
	
}
