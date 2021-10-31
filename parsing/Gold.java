class Gold{
	public static void main(String []anu){
	
		String items = anu[0];
		System.out.println(items);
		byte item = Byte.parseByte(items);
		System.out.println(item);
		
		String types = anu[1];
		System.out.println(types);
		short type = Short.parseShort(types);
		System.out.println(type);
		
		String prices = anu[2];
		System.out.println(prices);
		int price = Integer.parseInt(prices);
		System.out.println(price);
		
		String ids = anu[3];
		System.out.println(ids);
		long id = Long.parseLong(ids);
		System.out.println(id);
		
		String weights = anu[4];
		System.out.println(weights);
		float weight = Float.parseFloat(weights);
		System.out.println(weight);
		
		String metalIds = anu[5];
		System.out.println(metalIds);
		double metalId = Double.parseDouble(metalIds);
		System.out.println(metalId);
		
		String purity = anu[6];
		System.out.println(purity);
		boolean pure = Boolean.parseBoolean(purity);
		System.out.println(pure);
	}
}