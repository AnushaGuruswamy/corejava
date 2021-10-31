class Water{
	public static void main(String []abc){
	
		String types = abc[0];
		System.out.println(types);
		byte type = Byte.parseByte(types);
		System.out.println(type);
		
		String falls = abc[1];
		System.out.println(falls);
		short numOfFalls = Short.parseShort(falls);
		System.out.println(numOfFalls);
		
		String rivers = abc[2];
		System.out.println(rivers);
		int noOfRivers = Integer.parseInt(rivers);
		System.out.println(noOfRivers);
		
		String dams = abc[3];
		System.out.println(dams);
		long noOfdams = Long.parseLong(dams);
		System.out.println(noOfdams);
		
		String waterLevel = abc[4];
		System.out.println(waterLevel);
		float level = Float.parseFloat(waterLevel);
		System.out.println(level);
		
		String speed = abc[5];
		System.out.println(speed);
		double flowSpeed = Double.parseDouble(speed);
		System.out.println(flowSpeed);
		
		String tastes = abc[6];
		System.out.println(tastes);
		boolean taste = Boolean.parseBoolean(tastes);
		System.out.println(taste);
	}
}