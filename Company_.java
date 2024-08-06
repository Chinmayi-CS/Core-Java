class Company_
{
	String id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer = new SoftwareEngineer("Chinmayi","1 year","software developer",35000);
	
	Company_()
	{
		System.out.println("Created Company using no-arg constructor");
	}
	
	Company_(String id,String name,String location)
	{
		System.out.println("Created Company_ using String , String and String Constructors");
		this.id = id;
		this.name = name;
		this.location = location;
	}
	
	public void getDetails()
	{
		System.out.println("Id is : "+id);
		System.out.println("Name is : "+name);
		System.out.println("Location is : "+location);
		
		softwareEngineer.details();
	}


}