class Radio{
	public static void main(String []nik){
	
	String buttons = nik[0];
	System.out.println(buttons);
	byte button = Byte.parseByte(buttons);
	System.out.println(button);
	
	String stations = nik[1];
	System.out.println(stations);
	short station = Short.parseShort(stations);
	System.out.println(station);
	
	String companies = nik[2];
	System.out.println(companies);
	int company = Integer.parseInt(companies);
	System.out.println(company);
	
	String rjCodes = nik[3];
	System.out.println(rjCodes);
	long rjCode = Long.parseLong(rjCodes);
	System.out.println(rjCode);
	
	String frequencies = nik[4];
	System.out.println(frequencies);
	float frequency = Float.parseFloat(frequencies);
	System.out.println(frequency);
	
	String coverage = nik[5];
	System.out.println(coverage);
	double cover = Double.parseDouble(coverage);
	System.out.println(cover);
	
	String usbPort = nik[6];
	System.out.println(usbPort);
	boolean usb = Boolean.parseBoolean(usbPort);
	System.out.println(usb);
	}
}