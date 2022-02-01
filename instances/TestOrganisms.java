class TestOrganisms{
	public static void main(String []args){
	
		Organisms org = new Organisms();
		
		org.name = "Elephant";
		String oName = org.name;
		System.out.println(oName);
		
		org.teeth = 10;
		byte numTeeth = org.teeth;
		System.out.println(numTeeth);
		
		org.parts = 264;
		short bodyParts = org.parts;
		System.out.println(bodyParts);
		
		org.organs = 12569;
		int orgns = org.organs;
		System.out.println(orgns);
		
		org.cells = 32585132;
		long cellCount = org.cells;
		System.out.println(cellCount);
		
		org.weight = 189f;
		float weighs = org.weight;
		System.out.println(weighs);
		
		org.sleep = 8.45;
		double avgSleep = org.sleep;
		System.out.println(avgSleep);
		
		org.bodyType = true;
		boolean heavy = org.bodyType;
		System.out.println(heavy);
		
		org.vegetarian = 'Y';
		char veggie = org.vegetarian;
		System.out.println(veggie);
	}
}