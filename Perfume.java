class Perfume
{
	String brand;
	double price;
	int quantity;
	public Perfume()
	{
		System.out.println("Created Perfume");
	}
	public Perfume(String brand,double price)
	{
		this.brand = brand;
		this.price = price;
		System.out.println("Created perfume using String double contructor");
	}
	public Perfume(String brand , double price, int quantity)
	{
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		System.out.println("Created Perfume");
	}


}