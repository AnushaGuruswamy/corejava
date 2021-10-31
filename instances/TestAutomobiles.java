class TestAutomobiles{
	public static void main(String []args){
	
	Automobiles ams = new Automobiles();
	
	ams.company = "TaTa";
	String comp = ams.company;
	System.out.println(comp);
	
	ams.types = 34;
	int type = ams.types;
	System.out.println(type);
	
	ams.branches = 943;
	short branch = ams.branches;
	System.out.println(branch);
	
	ams.price = 802000;
	long cost = ams.price;
	System.out.println(cost);
	
	ams.fuelCapacity = 26.8f;
	float capacity = ams.fuelCapacity;
	System.out.println(capacity);
	
	ams.milage = 17.34;
	double m = ams.milage;
	System.out.println(m);
	
	ams.safetyBag = true;
	boolean sBag = ams.safetyBag;
	System.out.println(sBag);
	
	ams.fuel = 'P';
	char ftype = ams.fuel;
	System.out.println(ftype);
	}	
}