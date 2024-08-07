class Ganavi
{
	String email;
	Clip clip;
	
	Ganavi(String email,Clip clip)
	{
		System.out.println("Created Ganavi using String and Clip constructor");
		this.email = email;
		this.clip = clip;
	}
	
	public void details()
	{
		System.out.println("Email : "+email);
		clip.details();
	}

}