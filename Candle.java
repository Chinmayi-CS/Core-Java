class Candle
{
	double length;
	double price;
	String fragrance;
	Candle()
	{
		System.out.println("Created Candle");
	}
	Candle(double length)
	{
		this.length = length;
		System.out.println("Created Candle using double const...");
	}
	Candle(String fragrance,double price)
	{
		this.price = price;
		System.out.println("Created Candle using double const...");
	}
	Candle(String fragrance)
	{
		this.fragrance = fragrance;
		System.out.println("Created Candle using String const...");
	}
	Candle(String fragrance,double length,double price)
	{
		this.fragrance = fragrance;
		this.length = length;
		this.price = price;
		System.out.println("Created Candle using double,String const...");
	}









}