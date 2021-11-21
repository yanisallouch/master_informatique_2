package structural.composite;

/**
 * a Test class for the Composite Design pattern.
 * @author anonbnr
 */
public class Test {
	public static void main(String[] args) {
		// List of all songs and their genres
		SongComponent songGenres = new SongGroup("Song List", "Every song available");
				
		// Industrial Music genre
		SongComponent industrial = new SongGroup("Industrial",
				"A genre of music that draws on harsh, transgressive or provocative sounds and themes");
		
		// Adding Industrial music songs
		industrial.add(new Song("Head Like a Hole", "NIN", 1990));
		industrial.add(new Song("Headhunter", "Front 242", 1988));
		
		// Adding the Industrial music genre to the list of all genres
		songGenres.add(industrial);
		
		// Dubstep Music genre
		SongComponent dubstep = new SongGroup("Dubstep",
				"A genre of electronic dance music that originated in South London in the late 1990s");
		
		// Dubstep is a sub-genre of Industrial
		industrial.add(dubstep);
		
		// Adding Dubstep music songs
		dubstep.add(new Song("Centipede", "Knife Party", 2012));
		dubstep.add(new Song("Tetris", "Doctor P", 2011));
		
		// Heavy Metal Music genre
		SongComponent heavyMetal = new SongGroup("Heavy Metal",
				"A genre of rock music that includes a group of related styles that are intense, virtuosic, and powerful");
		
		// Adding Heavy Metal music songs
		heavyMetal.add(new Song("War Pigs", "Black Sabbath", 1970));
		heavyMetal.add(new Song("Ace of Spades", "Motorhead", 1980));
		
		// Adding the Heavy Metal music genre to the list of all genres
		songGenres.add(heavyMetal);
		
		// A DiscJockey will use a song list with different genres for his parties
		DiscJockey crazyLarry = new DiscJockey(songGenres); 
		
		crazyLarry.displaySongList();
	}
}