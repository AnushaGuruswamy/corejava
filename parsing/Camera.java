class Camera{
	public static void main(String []anu){
	
	String price = anu[0];
	System.out.println(price);
	System.out.println(anu[1]);
	System.out.println(anu[2]);
	System.out.println(price);
	
	int mrp = Integer.parseInt(price);
	System.out.println(mrp);
	
	float newMrp = Float.parseFloat(price);
	System.out.println(newMrp);
}	
}