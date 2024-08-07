class Knife
{
	String weight;
	String height;
	
	Knife(String weight,String height)
	{
		this.weight = weight;
		this.height = height;
		System.out.println("Created Knife using String and String constructor");
	}
	
	public void details()
	{
		System.out.println("Weight : "+this.weight);
		System.out.println("Height : "+this.height);
	}
	
}