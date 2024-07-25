class MovieRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in Movie");
		String movie1="Matinee";
		String movie2="Vedha";
		String movie3="vikrama";
		String movie4="good newz";
		String movie5="Pushpa";
		String movie6="Pushpa 2";
		String movie7="Anabelle";
		String movie8="Anabelle 2";
		String movie9="Lucky";
		String movie10="Ondhu motteya kathe";
		String movie11="Shakhahaari";
		String movie12="Tatsama Tadbhava";
		String movie13="Mother India";
		String movie14="Like stars on earth";
		String movie15="Harry potter";
		String movie16="Gandadhagudi";
		String movie17="Devil";
		String movie18="3 idiots";
		String movie19="Saina";
		String movie20="kung fu panda 4";
		
		String[] movies={movie1,movie2,movie3,movie4,movie5,movie6,movie7,movie8,movie9,movie10,movie11,movie12,movie13,movie14,movie15,movie16,movie17,movie18,movie19,movie20};
		
		int LengthOfMovies=movies.length;
		System.out.println("Length of array :"+LengthOfMovies);
		System.out.println("Original array");
		for(int start_movie=0;start_movie<movies.length;start_movie++)
		{
			System.out.println("Movies names : "+movies[start_movie]);
		}
		
		System.out.println("reversed array ");
		
		for(int start_movie=movies.length-1;start_movie>=0;start_movie--)
		{
			System.out.println("movie names : "+movies[start_movie]);
		}
		System.out.println("End main in Movie");
	}

}