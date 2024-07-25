class SnacksRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in Snacks");
		String snack1="Chips";
		String snack2="pizza";
		String snack3="burger";
		String snack4="sandwich";
		String snack5="maggie";
		String snack6="dry fruits";
		String snack7="juice";
		String snack8="lays";
		String snack9="apple cake";
		String snack10="cream bun";
		String snack11="bread jam";
		String snack12="jam bun";
		String snack13="chocolate cake";
		String snack14="cookies";
		String snack15="chocolates";
		String snack16="chocos";
		String snack17="soup";
		String snack18="corn flakes";
		String snack19="roasted nuts";
		String snack20="biscuits";
		
		String[] snacks={snack1,snack2,snack3,snack4,snack5,snack6,snack7,snack8,snack9,snack10,snack11,snack12,snack13,snack14,snack15,snack16,snack17,snack18,snack19,snack20};
		int ref=snacks.length;
		System.out.println("Length : "+ref);
		
		System.out.println("Original array");
		for(int start_snack=0;start_snack<snacks.length;start_snack++)
		{
			System.out.println("Snack is :"+snacks[start_snack]);
		}
		
		System.out.println("Reversed array");
		for(int start_snack=snacks.length-1; start_snack>=0; start_snack--)
		{
			System.out.println("Snack is :"+snacks[start_snack]);
		}
		System.out.println("End main in snacks");
		
		
		
	}

}