class TestSmartWatch{
	public static void main(String []args){
	
		float t = SmartWatch.series();
		System.out.println(t);
		
		SmartWatch s = new SmartWatch();
		int c = s.steps();
		System.out.println(c);
	}
}