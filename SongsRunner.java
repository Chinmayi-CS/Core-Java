class SongsRunner
{
	public static void main(String[] args)
	{
		System.out.println("Start main in Songs");
		String song1="Imagine";
		String song2="Shape of you";
		String song3="Rolling in the deep";
		String song4="Hotel California";
		String song5="Blinding lights";
		String song6="Smells like teen spirit";
		String song7="Hey jude";
		String song8="Uptown Funk";
		String song9="Levitating";
		String song10="Someone like you";
		
		String[] songs={song1,song2,song3,song4,song5,song6,song7,song8,song9,song10};
		int ref=songs.length;
		System.out.println("Length :"+ref);
		System.out.println("Original array");
	    
		for(int start_songs=0; start_songs<songs.length;start_songs++)
		{
			System.out.println("Songs name :"+songs[start_songs]);
		}
		System.out.println("Reversed array");
		for(int start_songs=songs.length-1;start_songs>=0;start_songs--)
		{
			System.out.println("Songs name :"+songs[start_songs]);
		}
		System.out.println("End main in songs");
	}
}