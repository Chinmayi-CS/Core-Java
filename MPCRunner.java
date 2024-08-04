class MPCRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in MPCRunner");
		Metal metal = new Metal();
		System.out.println("Metal name : "+metal.name);
		System.out.println("Metal cost : "+metal.cost);
		
		Metal metal1 = new Metal(50000);
		System.out.println("Metal cost : "+metal1.cost);
		
		Metal metal2 = new Metal("Gold",45000);
		System.out.println("Metal cost : "+metal2.name);
		System.out.println("Metal cost : "+metal2.cost);
		
		Perfume perfume = new Perfume();
		System.out.println("Brand is : "+perfume.brand);
		System.out.println("Price is : "+perfume.price);
		System.out.println("Quantity is : "+perfume.quantity);
		
		Perfume perfume1 = new Perfume("Eva",500);
		System.out.println("Brand is : "+perfume1.brand);
		System.out.println("Price is : "+perfume1.price);
		System.out.println("Quantity is : "+perfume1.quantity);
		
		Perfume perfume2 = new Perfume("Eva",500,1);
		System.out.println("Brand is : "+perfume2.brand);
		System.out.println("Price is : "+perfume2.price);
		System.out.println("Quantity is : "+perfume2.quantity);
		
		CoffeePowder coffeepowder = new CoffeePowder();
		System.out.println("Cost : "+coffeepowder.cost);
		System.out.println("Company : "+coffeepowder.company);
		System.out.println("Weight in grams : "+coffeepowder.weightIngrams);
		System.out.println("Manufacture Date : "+coffeepowder.manufactureDate);
		
		CoffeePowder coffeepowder1 = new CoffeePowder("Nescafe");
		System.out.println("Cost : "+coffeepowder1.cost);
		System.out.println("Company : "+coffeepowder1.company);
		System.out.println("Weight in grams : "+coffeepowder1.weightIngrams);
		System.out.println("Manufacture Date : "+coffeepowder1.manufactureDate);
		
		CoffeePowder coffeepowder2 = new CoffeePowder(50);
		System.out.println("Cost : "+coffeepowder2.cost);
		System.out.println("Company : "+coffeepowder2.company);
		System.out.println("Weight in grams : "+coffeepowder2.weightIngrams);
		System.out.println("Manufacture Date : "+coffeepowder2.manufactureDate);
		
		CoffeePowder coffeepowder3 = new CoffeePowder("Bru","1st August 2024");
		System.out.println("Cost : "+coffeepowder3.cost);
		System.out.println("Company : "+coffeepowder3.company);
		System.out.println("Weight in grams : "+coffeepowder3.weightIngrams);
		System.out.println("Manufacture Date : "+coffeepowder3.manufactureDate);
		
		CoffeePowder coffeepowder4 = new CoffeePowder(100,100,"Bru Instant","3rd August 2024");
		System.out.println("Cost : "+coffeepowder4.cost);
		System.out.println("Company : "+coffeepowder4.company);
		System.out.println("Weight in grams : "+coffeepowder4.weightIngrams);
		System.out.println("Manufacture Date : "+coffeepowder4.manufactureDate);
		
		System.out.println("End main in MPCRunner");
	}






}