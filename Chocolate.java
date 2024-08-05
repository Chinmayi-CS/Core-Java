class Chocolate
{
	String brand = "Cadbury";//literal
	double price;//ref
	String flavour;//const
	String size;//setter method

	Chocolate(String flavour)
	{
		this.flavour = flavour;
	}
	
	public void setSize(String size)
	{
		this.size = size;
	}
	
	public void details()
	{
		System.out.println("Brand is : "+brand);
		System.out.println("Price is : "+price);
		System.out.println("Flavour is : "+flavour);
		System.out.println("Size is : "+size);
	}


}