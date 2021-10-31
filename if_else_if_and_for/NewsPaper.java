class NewsPaper{

	public static void main (String []args){
	
		char language = 'K';
		
		if(language == 'E'){
		
			System.out.println("Times of India");
		}
		else if(language == 'K'){
		
			System.out.println("Praja Vaani");
		}
		else if(language == 'T'){
		
			System.out.println("Dinamalar");
		}
		
	String []names = {"Praja Vaani","Times of India","Dinamalar","The Hindu"};
		
		for(int index = 0;index < names.length;index++){
			
			System.out.println(names[index]);
		}
	}
}