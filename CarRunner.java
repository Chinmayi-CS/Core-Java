class CarRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in car");
		String car1="Hyundai";
		String car2="Tata Nexon";
		String car3="Ferrari";
		String car4="Mercedes Benz";
		String car5="BMZ";
		String car6="Nano";
		String car7="Mahindra THAR";
		String car8="MG";
		String car9="Hyundai Exter";
		String car10="TATA PUNCH";
		String car11="MAHINDRA XUV700";
		String car12="MAHINDRA SCORPIO";
		String car13="KIA";
		String car14="TOYOTA";
		String car15="CRETA";
		
		String[] cars={car1,car2,car3,car4,car5,car6,car7,car8,car9,car10,car11,car12,car13,car14,car15};
		int carLength=cars.length;
		System.out.println("Car Lemgth :"+carLength);
		System.out.println("Original array");
		
		for(int start_car=0;start_car<cars.length;start_car++)
		{
			System.out.println("Car is : "+cars[start_car]);
		}
		
		System.out.println("Reversed array");
		
		for(int start_car=cars.length-1; start_car>=0;start_car--)
		{
			System.out.println("Car is : "+cars[start_car]);
		}
		System.out.println("End main in cars");
	}
	
}