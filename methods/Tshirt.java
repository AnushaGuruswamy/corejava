class Tshirt{
	static byte wear(){
		System.out.println("wear in two ways");
		return 2;
	}
	float size(){
		System.out.println("tshirt size");
		float s = 34.5f;
		return s;
	}
	boolean uses(){
		
		boolean newTshirt = false; 
		
		if(newTshirt == true){
			System.out.println("wear it");
		}
		else{
			System.out.println("make it a mop");
		}
		return true;
	}
}