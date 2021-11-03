class TestBank{
	public static void main(String []args){
	
		int money = Bank.store();
		System.out.println(money);
		
		Bank g = new Bank();
		double w = g.gold();
		System.out.println(w);
	} 
}