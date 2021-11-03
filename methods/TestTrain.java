class TestTrain{
	public static void main(String []ags){
	
		int ticket = Train.travel();
		System.out.println(ticket);
		
		Train sot = new Train();
		float sOfT = sot.speed();
		System.out.println(sOfT);
	}
}