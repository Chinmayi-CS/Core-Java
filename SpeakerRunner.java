class SpeakerRunner
{
	public static void main(String [] args)
	{
		Speaker speaker = new Speaker(1000);
		speaker.size = "Big";
		speaker.setOutput("50DB");
		speaker.details();
		
		Speaker speaker1 = new Speaker(2000);
		speaker1.size = "Small";
		speaker1.setOutput("42DB");
		speaker1.details();
		
		Speaker speaker2 = new Speaker(3000);
		speaker2.size = "medium";
		speaker2.setOutput("45DB");
		speaker2.details();
			
	}


}