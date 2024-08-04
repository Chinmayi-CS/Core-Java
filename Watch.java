class Watch
{
	String colour = "Pink";//literal
	String brand;//ref
	double price;//constructor
	int quantity;//constructor
	Watch(double priceLocal, int quantityLocal)
	{
		price = priceLocal;
		quantity = quantityLocal;
		System.out.println("Created Watch");
		
	}	
}