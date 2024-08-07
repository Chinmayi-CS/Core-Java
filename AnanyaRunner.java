class AnanyaRunner
{
	public static void main(String[] args)
	{
		Knife knife = new Knife("50grams","20cm");
		
		Ananya ananya = new Ananya(8618800816L,knife);
		ananya.details();
	
		System.out.println("======================");

		
		Knife knife1 = new Knife("100grams","40cm");
		
		Ananya ananya1 = new Ananya(8095006478L,knife1);
		ananya1.details();

	
	}


}