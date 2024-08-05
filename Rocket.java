class Rocket
{
	String country = "India";//literals
	String speed;//ref
	String fuelCapacity;//const
	int noOfThrusters;//setter method
	
	Rocket(String fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}
	
	public void setNoOfThrusters(int noOfThrusters)
	{
		this.noOfThrusters = noOfThrusters;
	}
	public void details()
	{
		System.out.println("Country is : "+country);
		System.out.println("Speed is : "+speed);
		System.out.println("Fuel Capacity is : "+fuelCapacity);
		System.out.println("No. of thrusters is : "+noOfThrusters);	
	}
	
}