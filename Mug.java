class Mug
{
	String type = "Ceramic";
	String name;
	double price;
	int quantity;
	Mug(double priceLocal , int quantityLocal)
	{
		price = priceLocal;
		quantity = quantityLocal;
		System.out.println("Created Mug");
	}
}