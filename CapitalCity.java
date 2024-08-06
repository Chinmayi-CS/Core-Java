class CapitalCity
{
	String name;
	String population;
	
	CapitalCity()
	{
		System.out.println("Created CapitalCity using no-arg constructor");
	}
	
	CapitalCity(String name,String population)
	{
		System.out.println("Created CapitalCity using String and String constructor");
		this.name = name;
		this.population = population;
	}
	
	public void details()
	{
		System.out.println("Capital City name is : "+name);
		System.out.println("capitalcity population : "+population);
		
	}

}