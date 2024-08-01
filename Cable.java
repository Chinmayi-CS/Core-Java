class Cable
{ 
	String colour = "White";
	String brand;
	String type;//sheilded cable
	double price;
	Cable(String typeLocal, double priceLocal)
	{
		type = typeLocal;
		price = priceLocal;
		System.out.println("Created Cable");
	}
}