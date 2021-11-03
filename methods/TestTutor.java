class TestTutor{
	public static void main(String []args){
	
		byte num = Tutor.programs();
		System.out.println(num);
			
		Tutor t = new Tutor();
		boolean value = t.work();
		System.out.println(value);
	}
}