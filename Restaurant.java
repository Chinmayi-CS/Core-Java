class Restaurant
{
	
	static double order(String foodName,String addItems)
	{
		double southIndianMeal = 90;
		double iceCream = 25;
		double northIndianMeal = 80;
		if(foodName == "south indian meal" && addItems == "iceCream")
		{
			double total_amount = (southIndianMeal+iceCream);
			
			return total_amount;
		}
		else if(foodName1 == "north indian meal" && addItems1 == "iceCream")
		{
			double total_amount1 = (northIndianMeal+iceCream);
			
			return total_amount1;
		}
		
			return 0;
		
	}
}