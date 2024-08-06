class Country
{
	String name;
	String continent;
	State state = new State("Karnataka","Kannada");
	
	Country()
	{
		System.out.println("Created Country using no-arg constructor");
	}
	
	Country(String name,String continent)
	{
		System.out.println("Created Country using String and String constructor");
		this.name = name;
		this.continent = continent;
	}
	
	public void details()
	{
		System.out.println("Country name is : "+name);
		System.out.println("Country Continent is : "+continent);
		
		state.details();
	}













}