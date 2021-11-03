class TestMilk{
	public static void main(String []args){
	
	String ms = Milk.shake();
	System.out.println(ms);
	
	Milk milk = new Milk();
	byte ic = milk.ice();
	System.out.println(ic);
	}
}