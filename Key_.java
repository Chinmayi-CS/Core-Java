class Key_
{
	double weightInGrams;
	String brand;
	
	Key_(double weightInGrams,String brand)
	{
		System.out.println("Created key using double and String constructor");
		this.weightInGrams = weightInGrams;
		this.brand = brand;
	}
	
	public void details()
	{
		System.out.println("Key weight is : "+this.weightInGrams);
		System.out.println("Key brand is : "+this.brand);
	}

}