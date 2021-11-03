class TestShip{
	public static void main(String []args){
	
		String a = Ship.use();
		System.out.println(a);
		
		Ship b = new Ship();
		long c = b.weight();
		System.out.println(c);
	}
}