class CountryRunner
{
	public static void main(String[] args)
	{
		
		 CapitalCity capitalCity = new CapitalCity();
		 capitalCity.details();
		 
		 State state = new State();
		 state.details();
		 
		 Country country = new Country("India","Asia");
		 country.details();
		
	}

}