class CoffeePowder
{
	double cost;
	String company;
	double weightIngrams;
	String manufactureDate;
	public CoffeePowder()
	{
		System.out.println("Created CoffeePowder");
	}
	public CoffeePowder(String company)
	{
		this.company = company;
		System.out.println("Created CoffeePowder using String constructor......");
	}
	public CoffeePowder(double weight)
	{
		System.out.println("Created CoffeePowder using double comstructor.....");
	}
	public CoffeePowder(String company,String manufactureDate)
	{
		System.out.println("Created CoffeePowder using String constructor....");
	}
	public CoffeePowder(double cost,double weightIngrams, String company,String manufactureDate)
	{
		this.cost = cost;
		this.weightIngrams = weightIngrams;
		this.company = company;
		this.manufactureDate = manufactureDate;
		System.out.println("Created CoffeePowder using string and double constructor....");
	}
		




}