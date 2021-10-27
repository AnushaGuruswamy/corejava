class Bike{

public static void main(String []args){

	short speed = 150;
	char turn = 'L';
	
	System.out.println("Wear helmet before ride");
	System.out.println("Start riding the Bike");
	
	if(speed>80){
	
		System.out.println("Slow down the speed");
	}
	else{
	
		System.out.println("Good riding");
	}
	if(turn == 'L'){
	
		System.out.println("You will reach your friend's home");
	}
	else{
	
		System.out.println("You will reach your cousin's home");
	}
}
}