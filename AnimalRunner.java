class AnimalRunner
{
	public static void main(String[] args)
	{
		System.out.println("start main in Animal");
		String animal1="Lion";
		String animal2="Tiger";
		String animal3="Mouse";
		String animal4="Donkey";
		String animal5="Monkey";
		String animal6="Yak";
		String animal7="Zebra";
		String animal8="Bear";
		String animal9="Kangroo";
		String animal10="Cat";
		String animal11="Dog";
		String animal12="Dinosaurus";
		String animal13="Elephant";
		String animal14="Hippo";
		String animal15="Deer";
		String animal16="Cow";
		String animal17="Horse";
		String animal18="Fox";
		String animal19="Ox";
		String animal20="Bison";
		String[] animals={animal1,animal2,animal3,animal4,animal5,animal6,animal7,animal8,animal9,animal10,animal11,animal12,animal13,animal14,animal15,animal16,animal17,animal18,animal19,animal20};
		int ref=animals.length;
		System.out.println("Length is : "+ref);
		System.out.println("Original array");
		
		for(int start_animal=0;start_animal<animals.length;start_animal++)
		{
			System.out.println("Animal name is : "+animals[start_animal]);
		}
		
		System.out.println("Reversed array");
		
		for(int start_animal=animals.length-1; start_animal>=0; start_animal--)
		{
			System.out.println("Animal name is : "+animals[start_animal]);
		}
		
		System.out.println("End main in Animals");
		
	}

}