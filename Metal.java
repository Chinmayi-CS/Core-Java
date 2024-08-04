class Metal
{
	String name;
	double cost;
	public Metal()
	{
		System.out.println("Created Metal");
	}
	public Metal(String name)
	{
		this.name = name;
		System.out.println("Created Metal using String constructor....");
	}
	public Metal(double cost)
	{
		this.cost = cost;
		System.out.println("Created Metal using double constructor....");
	}
	public Metal(String name,double cost)
	{
		this.name = name;
		this.cost = cost;
		System.out.println("Created Metal using String and double constructor....");
	}
}