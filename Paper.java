class Paper
{
	String thickness = "70-90gsm";//grams per square meter
	String size;//ref
	String quality;//const
	String colour;//setter method
	
	Paper(String quality)
	{
		this.quality = quality;
	}
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public void details()
	{
		System.out.println("Thickness is : "+thickness);
		System.out.println("Size is : "+size);
		System.out.println("Quality is : "+quality);
		System.out.println("Colour is : "+colour);
	}







}