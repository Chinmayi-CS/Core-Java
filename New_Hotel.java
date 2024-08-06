class New_Hotel
{
	String name = "Kavimane Resto Cafe";
	Owner owner = new Owner("Chinmayi",22,'F');
	
	New_Hotel()
	{
		System.out.println("Created Hotel using no-arg constructor");
	}
	
	public void getDetails()
	{
		System.out.println("Name of Hotel : "+name);
		owner.getDetails();
	}

}