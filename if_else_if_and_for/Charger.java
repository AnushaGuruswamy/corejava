class Charger{

	public static void main (String []args){
	
		short price = 500;
		
		if(price <= 200){
		
			System.out.println("Buy a low quality charger");
		}
		/*if else(price = 500){
		
			System.out.println("Buy a normal charger");
		}
		if else(price = 600){
		
			System.out.println("Buy a good quality chager");
		}*/
		else{
			System.out.println("Buy a good quality chager");
		}
		char []brands = {'S','N','A','O','R','M'};
		
		for(int index = 0; index < brands.length ; index++){
			
			System.out.println(brands[index]);
		}
		
		if(brands[0] == 'S'){
			System.out.println("Samsung");
		}
		/*if else(brands[1] == 'N'){
			System.out.println("Nokia");
		}
		if else(brands[2] == 'A'){
			System.out.println("Apple");
		}*/
	}
}