class TestFish{
	public static void main(String []args){
	
		Fish bio = new Fish();
		
		//bio.name = "Nimo";
		//String nameF = bio.name;
		//System.out.println(nameF);
		
		bio.fins = 5;
		int numOfFins = bio.fins;
		System.out.println(numOfFins);
		
		bio.count = 200;
		short num = bio.count;
		System.out.println(num);
		
		bio.bones = 5739;
		int boneCount = bio.bones;
		System.out.println(boneCount);
		
		bio.types = 9667823;
		long varities = bio.types;
		System.out.println(varities);
		
		bio.size = 5.73f;
		float sizeOfFish = bio.size;
		System.out.println(sizeOfFish);
		
		bio.speed = 3.486;
		double swim = bio.speed;
		System.out.println(swim);
		
		bio.sweetWater = true;
		boolean typeOfWater = bio.sweetWater;
		System.out.println(typeOfWater);
		
		bio.stay = 'P';
		char pond = bio.stay;
		System.out.println(pond);
		
	}
}