class State
{
	String name;
	String language;
	CapitalCity capitalCity = new CapitalCity("New Delhi","35 million");
	
	State()
	{
		System.out.println("Created State using no-arg constructor");
	}
	
	State(String name, String language)
	{
		System.out.println("Created State using String and Strings constructor");
		this.name = name;
		this.language = language;
	}
	
	public void details()
	{
		System.out.println("State name : "+name);
		System.out.println("State Language : "+language);
		
		capitalCity.details();
		
	}
	
	












}