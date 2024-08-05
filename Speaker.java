class Speaker
{
	String brand = "Boat";//literal
	String size;//ref
	double cost;//const
	String output;//setter method
	
	Speaker(double cost)
	{
		this.cost = cost;
	}
	
	public void setOutput(String output)
	{
		this.output = output;
	}
	public void details()
	{
		System.out.println("Brand is : "+brand);
		System.out.println("Size is : "+size);
		System.out.println("Cost is : "+cost);
		System.out.println("Output is : "+output);
	}



}