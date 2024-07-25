class BusNoRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in BusNo");
		String bus1="KA 09 G 8888";
		String bus2="KA 17 D 7898";
		String bus3="KA 17 H 3657";
		String bus4="KA 17 T 7685";
		String bus5="KA 18 G 5674";
		String[] buses={bus1,bus2,bus3,bus4,bus5};
		int ref = buses.length;
		System.out.println("Length is :"+ref);
		
		System.out.println("Original array");
		
		for(int start_busnum=0;start_busnum<buses.length;start_busnum++)
		{
			System.out.println("Bus no. is : "+buses[start_busnum]);
		}
		
		System.out.println("Reversed array");
		
		for(int start_busnum=buses.length-1; start_busnum>=0; start_busnum--)
		{
			System.out.println("Bus no. is : "+buses[start_busnum]);
		}
		System.out.println("End main in BusNo");
	}  

}






  
  