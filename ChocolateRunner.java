class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate = new Chocolate("Strawberry");
		chocolate.price = 40;
		chocolate.setSize("10g");
		chocolate.details();
		
		Chocolate chocolate1 = new Chocolate("blueberry");
		chocolate1.price = 100;
		chocolate1.setSize("30g");
		chocolate1.details();
		
		Chocolate chocolate2 = new Chocolate("Kunafa");
		chocolate2.price = 5000;
		chocolate2.setSize("100g");
		chocolate2.details();
		
	}





}