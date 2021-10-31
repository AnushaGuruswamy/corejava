class Tractor{
	public static void main(String []mm){
	
		String gears = mm[0];
		System.out.println(gears);
		byte gear = Byte.parseByte(gears);
		System.out.println(gear);
		
		String kms = mm[1];
		System.out.println(kms);
		short km = Short.parseShort(kms);
		System.out.println(km);
		
		String rcNum = mm[2];
		System.out.println(rcNum);
		int rc = Integer.parseInt(rcNum);
		System.out.println(rc);
		
		String rotations = mm[3];
		System.out.println(rotations);
		long rotation = Long.parseLong(rotations);
		System.out.println(rotation);
		
		String weight = mm[4];
		System.out.println(weight);
		float w = Float.parseFloat(weight);
		System.out.println(w);
		
		String diameter = mm[5];
		System.out.println(diameter);
		double d = Double.parseDouble(diameter);
		System.out.println(d);
		
		String petrol = mm[6];
		System.out.println(petrol);
		boolean fuel = Boolean.parseBoolean(petrol);
		System.out.println(fuel);
	}
}