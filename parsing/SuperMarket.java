class SuperMarket{
	public static void main (String []sm){
	
		String doors = sm[0];
		System.out.println(doors);
		byte door = Byte.parseByte(doors);
		System.out.println(door);
		
		String shelves = sm[1];
		System.out.println(shelves);
		short count = Short.parseShort(shelves);
		System.out.println(count);
		
		String companies = sm[2];
		System.out.println(companies);
		int c = Integer.parseInt(companies);
		System.out.println(c);
		
		String items = sm[3];
		System.out.println(items);
		long things = Long.parseLong(items);
		System.out.println(things);
		
		String tax = sm[4];
		System.out.println(tax);
		float gst = Float.parseFloat(tax);
		System.out.println(gst);
		
		String size = sm[5];
		System.out.println(size);
		double area = Double.parseDouble(size);
		System.out.println(area);
		
		String floors = sm[6];
		System.out.println(floors);
		boolean floor = Boolean.parseBoolean(floors);
		System.out.println(floor);
	}
}