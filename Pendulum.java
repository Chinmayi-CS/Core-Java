class Pendulum
{
	String type = "Clock";
	String colour;
	double price;
	int quantity;
	Pendulum(double priceLocal, int quantityLocal)
	{
		price = priceLocal;
		quantity = quantityLocal;
		System.out.println("Created Pendulum");
	}
}