class TestGrains{
	public static void main(String []args){
	
	Grains grain = new Grains();
	
	grain.name = "Wheet";
	String gName = grain.name;
	System.out.println(gName);
	
	grain.varients = 20;
	int var = grain.varients;
	System.out.println(var);
	
	grain.countries = 93;
	short country = grain.countries;
	System.out.println(country);
	
	grain.consumption = 1235869;
	int consume = grain.consumption;
	System.out.println(consume);
	
	grain.production = 625893174;
	long produce = grain.production;
	System.out.println(produce);
	
	grain.seedWeight = 0.857f;
	float weight = grain.seedWeight;
	System.out.println(weight);
	
	grain.income = 73.61;
	double money = grain.income;
	System.out.println(money);
	
	grain.multicropping = false;
	boolean cropping = grain.multicropping;
	System.out.println(cropping);
	
	grain.soil = 'B';
	char soilColour = grain.soil;
	System.out.println(soilColour);
	
	
}	
}