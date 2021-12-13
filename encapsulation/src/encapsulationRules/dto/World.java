package encapsulationRules.dto;

public class World {
	private int plants;
	private int trees;
	private int countries;
	private byte continents;
	private int animals;
	private int fishes;
	private long foods;
	private String axis;
	private short vehicles;
	private String materials;
	
	public World() {
	}
	
	public void setPlants(int plants) {
		this.plants=plants;
	}
	
	public int getPlants() {
		return plants;
	}
	
	public void setTrees(int trees) {
		this.trees=trees;
	}
	
	public int getTrees() {
		return trees;
	}
	
	public void setCountries(int countries) {
		this.countries=countries;
	}
	
	public int getCountries() {
		return countries;
	}
	
	public void setContinents(byte continents) {
		this.continents=continents;
	}
	
	public byte getContinents() {
		return continents;
	}
	
	public void setAnimals(int animals) {
		this.animals=animals;
	}
	
	public int getAnimals() {
		return animals;
	}
	
	public void setFishes(int fishes) {
		this.fishes=fishes;
	}
	
	public int getFishes() {
		return fishes; 
	}
	
	public void setFoods(long foods) {
		this.foods=foods;
	}
	
	public long getFoods() {
		return foods;
	} 
	
	public void setAxis(String axis) {
		this.axis=axis;
	}
	
	public String getAxis() {
		return axis;
	}
	
	public void setVehicles(short vehicles) {
		this.vehicles=vehicles;
	}
	
	public short getVehicles() {
		return vehicles;
	}
	
	public void setMaterials(String materials) {
		this.materials=materials;
	}
	
	public String getMaterials() {
		return materials;
	}

	
	public String getAll() {
		String res = ("plants=" + plants +"\n"+ "trees=" + trees +"\n"+ "countries=" + countries +"\n"+ "continents="
				+ continents +"\n"+ "animals=" + animals +"\n"+ "fishes=" + fishes +"\n"+ "foods=" + foods +"\n"+ "axis=" + axis
				+"\n"+ "vehicles=" + vehicles +"\n"+ "materials=" + materials);
		return res;
	}

}
