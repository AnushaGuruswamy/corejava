class Atm{

	public static void main (String []args){
	
		short pin = 1234;
		boolean recipt = true;
		
		System.out.println("Insert the card");
		
		if(pin == 1234){
		
			System.out.println("Display modes of transaction");
			System.out.println("Enter the amount");
			System.out.println("Wait for the transaction");
			System.out.println("Collect the money");
		}
		else{
		
			System.out.println("Incorrect password");
			System.out.println("Decline the request");
		}
		
		if(recipt == true){
		
			System.out.println("Print the recipt");
		}
		
		System.out.println("Don't forget to press cancle everything before leaving");
	}
}