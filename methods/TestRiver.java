class TestRiver{
	public static void main(String []args){
	
		String rn = River.name();
		System.out.println(rn);
		
		River dir = new River();
		boolean d = dir.direction();
		System.out.println(d);
	}
}