class  Owner
{
	String name;
	double age;
	char gender;
	
	Owner()
	{
		System.out.println("Created Owner using no-arg constructor");
	}
	
	Owner(String name,double age,char gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void getDetails()
	{
		System.out.println("Name is : "+this.name);
		System.out.println("Age is : "+this.age);
		System.out.println("Gender is : "+this.gender);
		
	}

}