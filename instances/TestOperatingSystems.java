class TestOperatingSystems{
	public static void main(String []args){
	
		OperatingSystems os = new OperatingSystems();
		
		os.name = "Linux";
		String OsName = os.name;
		System.out.println(OsName);
		
		os.version = 2.5f;
		float OsVersion = os.version;
		System.out.println(OsVersion);
		
		os.price = 1500;
		int OsPrice = os.price;
		System.out.println(OsPrice);
	}
}