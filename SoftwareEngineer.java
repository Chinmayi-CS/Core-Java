class SoftwareEngineer
{
	String name;
	String experience;
	String designation;
	double salary;
	
	SoftwareEngineer()
	{
		System.out.println("Created SoftwareEngineer using no-arg constructor");
	}
	
	SoftwareEngineer(String name,String experience,String designation,double salary)
	{
		System.out.println("Created SoftwareEngineer using String , String, String and double Constructors");
		 this.name = name;
		 this.experience = experience;
		 this.designation = designation;
		 this.salary = salary;
	}
	
	public void details()
	{
		System.out.println("Name is : "+this.name);
		System.out.println("Experience is : "+this.experience);
		System.out.println("Designation is : "+this.designation);
		System.out.println("Salary is : "+this.salary);
			
	}

}