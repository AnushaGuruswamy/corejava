class MakeupKit{

	public static void main(String []args){
	
	String []colours = {"Pink","Brown","Peach","Red","Blue","Black"};
	char shade1 = 'B';
	char shade2 = 'N';
	char shade3 = 'W';
	
	if(shade1 == 'W'){
		System.out.println("Take the lighter shade");
	}	
	else if(shade2 == 'K'){
		System.out.println("Put nude shade");
	}
	else if(shade3 == 'W'){
		System.out.println("Put some powder");
	}
	
	for(int num = 0; num < colours.length; num++){
		System.out.println(colours[num]);
	}
	int size = colours.length;
		System.out.println(size);
	}
}