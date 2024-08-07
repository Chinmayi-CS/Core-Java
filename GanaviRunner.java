class GanaviRunner
{
	public static void main(String[] args)
	{
		Clip clip = new Clip("Black","metal");
		
		Ganavi ganavi = new Ganavi("ganavi@gmail.com",clip);
		ganavi.details();
		
		System.out.println("=======================");
		
		Clip clip1 = new Clip("Pink","Plastic");
		
		Ganavi ganavi1 = new Ganavi("chinmayi@gmail.com",clip1);
		ganavi1.details();
		
	}

}