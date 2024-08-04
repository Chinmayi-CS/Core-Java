class RestaurantRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in RestaurantRunner");
		double ref = Restaurant.order("south indian meal","iceCream");
		System.out.println("Name of meal is : south indian meal and iceCream ");
		System.out.println("Price of meal is : "+ref);
		
		double ref1 = Restaurant.order("roti","dal");
		System.out.println("Name of meal is : roti and dal");
		System.out.println("Price of meal is : "+ref1);
		
		double ref2 = Restaurant.order("north indian meal ","iceCream");
		System.out.println("Name of meal is : north indian meal and iceCream");
		System.out.println("Price of meal is : "+ref2);
		
		System.out.println("End main in RestaurantRunner");
	}
}