class Projector
{
	String company;//ref
	String type = "DLP projector";//literal
	String colour;//const
	String weight;//setter method
	
	Projector(String colour)
	{
		this.colour = colour;
	}
	
	public void setWeight(String weight)
	{
		this.weight = weight;
	}
	
	public void details()
	{
		System.out.println("Company is : "+company);
		System.out.println("Type is : "+type);
		System.out.println("Colour is : "+colour);
		System.out.println("Weight is : "+weight);
	}







}