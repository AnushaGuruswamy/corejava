class TestMammals{
	public static void main(String []args){
	
	Mammals mms = new Mammals();
	
	mms.kingdom = "Animalia";
	String name = mms.kingdom;
	System.out.println(name);
	
	mms.classes = 51;
	byte cls = mms.classes;
	System.out.println(cls);
	
	mms.count = 6789;
	short num = mms.count;
	System.out.println(num);
	
	mms.groups = 353114;
	int group = mms.groups;
	System.out.println(group);
	
	mms.age = 65000000;
	long evolution = mms.age;
	System.out.println(evolution);
	
	mms.reproduction = true;
	boolean rep = mms.reproduction;
	System.out.println(rep);
	
	mms.life = 'Y';
	char living = mms.life;
	System.out.println(living);
	}	
}