class PaperRunner
{
	public static void main(String[] args)
	{
		Paper paper = new Paper("good");
		paper.size = "216*279mm";
		paper.setColour("White");
		paper.details();
		
		Paper paper1 = new Paper("bad");
		paper1.size = "210*297mm";
		paper1.setColour("Brown");
		paper1.details();
		
		Paper paper2 = new Paper("Best");
		paper2.size = "148*210mm";
		paper2.setColour("Yellow");
		paper2.details();
		
		
	}


}