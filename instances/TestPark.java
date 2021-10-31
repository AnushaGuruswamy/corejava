class TestPark{
	public static void main(String []args){
	
		Park survey = new Park();
		
		survey.name = "Gayatri Nagar Park";
		String parkName = survey.name;
		System.out.println(parkName);
		
		survey.gates = 4;
		byte gate = survey.gates;
		System.out.println(gate);
		
		survey.games = 380;
		short game = survey.games;
		System.out.println(game);
		
		survey.turns = 67923;
		int turn = survey.turns;
		System.out.println(turn);
		
		survey.plants = 5692357;
		long plant = survey.plants;
		System.out.println(plant);
		
		survey.oxygen = 28.4f;
		float level = survey.oxygen;
		System.out.println(level);
		
		survey.area = 450;
		double coverage = survey.area;
		System.out.println(coverage);
		
		survey.near = true;
		boolean walk = survey.near;
		System.out.println(walk);
		
		survey.pets = 'Y';
		char allow = survey.pets;
		System.out.println(allow);
	}
}