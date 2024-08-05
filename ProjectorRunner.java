class ProjectorRunner
{
	public static void main(String[] args)
	{
		Projector projector = new Projector("White");
		projector.company = "Epson Home Cinema 2150";
		projector.setWeight("3.5kg");
		projector.details();
		
		Projector projector1 = new Projector("Black");
		projector1.company = "Optoma HD28HDR";
		projector1.setWeight("3.3kg");
		projector1.details();
		
		Projector projector2 = new Projector("Blue");
		projector2.company = "BenQ HT2050A";
		projector2.setWeight("2.8kg");
		projector2.details();
		
		
	}

}