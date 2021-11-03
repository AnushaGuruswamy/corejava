class TestTshirt{
	public static void main(String []args){
	
		byte w = Tshirt.wear();
		System.out.println(w);
		
		Tshirt ts = new Tshirt();
		float s = ts.size();
		System.out.println(s);
		
		Tshirt use = new Tshirt();
		boolean u = use.uses();
		System.out.println(u);
	}
}