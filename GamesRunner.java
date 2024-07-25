class GamesRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in Games");
		String game1="POKEMON GO";
		String game2="SUBWAY SURFERS";
		String game3="TEMPLE RUN";
		String game4="WORLD OF NUTS";
		String game5="MINECRAFT";
		String game6="Coin Master";
		String game7="Candy Crush";
		String game8="wood screw puzzle";
		String game9="Ludo King";
		String game10="Words of wonder";
		
		String[] games={game1,game2,game3,game4,game5,game6,game7,game8,game9,game10};
		int ref = games.length;
		System.out.println("Length :"+ref);
		System.out.println("Original array");
		
		for(int start_games=0;start_games<games.length;start_games++)
		{
			System.out.println("game is : "+games[start_games]);
		}
		
		System.out.println("Reversed array");
		
		for(int start_games=games.length-1; start_games>=0; start_games--)
		{
			System.out.println("game is : "+games[start_games]);
		}
		System.out.println("End main in Games");	
	}

}