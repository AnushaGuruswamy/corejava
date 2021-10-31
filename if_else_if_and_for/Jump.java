class Jump{
	public static void main(String []args){
	
		byte count = 50;
		
		if(count == 60){
			
			System.out.println("Reached Target");
		}
		
		else if(count == 50){
			
			System.out.println("10 more");
		}
		
		else if(count == 40){
			
			System.out.println("20 more");
		}
		
		int []counts = {10,20,30,40,50,60};
		
		for(int index = 0; index < counts.length; index++){
			
			System.out.println(counts[index]);
		}
	}
}