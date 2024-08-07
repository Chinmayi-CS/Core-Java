class Clip
{
	String colour;
	String type;
	
	Clip(String colour,String type)
	{
		System.out.println("Created Clip using String and String constructor");
		this.colour = colour;
		this.type = type;
	}
	
	public void details()
	{
		System.out.println("Colour : "+colour);
		System.out.println("Type : "+type);
	}

}