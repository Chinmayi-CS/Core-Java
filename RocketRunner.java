class RocketRunner
{
	public static void main(String[] args)
	{
		Rocket rocket = new Rocket("320,000Kg");//Polar Satellite Launch Vehicle
		rocket.speed = "27,000km/h";
		rocket.setNoOfThrusters(7);
		rocket.details();
		
		Rocket rocket1 = new Rocket("414,000Kg");//Geosynchronous Satellite Launch Vehicle Mark 11 
		rocket1.speed = "10,200m/s";
		rocket1.setNoOfThrusters(3);
		rocket.details();
	
		Rocket rocket2 = new Rocket("640,000Kg");
		rocket2.speed = "10,200m/s";
		rocket2.setNoOfThrusters(3);
		rocket.details();	
		
	}







}