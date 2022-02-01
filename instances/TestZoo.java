class TestZoo{
	public static void main(String []args){
	
	Zoo zoo = new Zoo();
	
	zoo.name = "Mysore Zoo";
	String zooName = zoo.name;
	System.out.println(zooName);
	
	zoo.types = 106;
	byte animal = zoo.types;
	System.out.println(animal);
	
	zoo.prisons = 385;
	short boxes = zoo.prisons;
	System.out.println(boxes);
	
	zoo.animals = 54678;
	int count = zoo.animals;
	System.out.println(count);
	
	zoo.plants = 98742098;
	long plant = zoo.plants;
	System.out.println(plant);

	zoo.area = 7895.0f;
	float covers = zoo.area;
	System.out.println(covers);
	
	zoo.meat = 65.4;
	double food = zoo.meat;
	System.out.println(food);
	
	zoo.ticket = true;
	boolean entry = zoo.ticket;
	System.out.println(entry);

	
	}
}