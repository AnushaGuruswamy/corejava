class Stove{

	public static void main(String []args){
	
		boolean boiled = false;
		byte time = 10;
		
		System.out.println("Turn on the stove");
		System.out.println("Keep egg for boiling");
		
		if(boiled == true){
		
			System.out.println("Turn off the stove");
			System.out.println("Enoy the boiled egg");
		}
		else{
		
			System.out.println("Wait till the egg boiles");
		}
		if(time<12){
		
			System.out.println("The egg can be served as half boiled");
		}
		else{
		
			System.out.println("The egg can be served fully boiled");
		}
	}
}