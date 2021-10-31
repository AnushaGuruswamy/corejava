class TestHotel{
	public static void main(String []args){
	
		Hotel htl = new Hotel();
		
		htl.name = "Taj";
		String hotelName = htl.name;
		System.out.println(hotelName);
		
		htl.floor = 10;
		byte floors = htl.floor;
		System.out.println(floors);
		
		htl.worker = 650;
		short workers = htl.worker;
		System.out.println(workers);
		
		htl.room = 25860;
		int rooms = htl.room;
		System.out.println(rooms);
		
		htl.spoon = 56923650;
		long spoons = htl.spoon;
		System.out.println(spoons);
		
		htl.profit = 47.3f;
		float gain = htl.profit;
		System.out.println(gain);
		
		htl.loss = 12.56;
		double losses = htl.loss;
		System.out.println(losses);
		
		htl.parking = true;
		boolean pFacility = htl.parking;
		System.out.println(pFacility);
		
		htl.food = 'V';
		char foodType = htl.food;
		System.out.println(foodType);
	}
}