class Syringe
{
	String colour = "white";
	double price;
	int quantity;
	String brand;
	Syringe(double priceLocal, int quantityLocal)
	{
		price = priceLocal;
		quantity = quantityLocal;
		System.out.println("Created Syringe");
	}
}