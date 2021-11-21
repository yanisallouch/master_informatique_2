package structural.composite;

/**
 * Test class of the Composite Design pattern
 * a song list generator that generates a SonComponent structure
 * and tests a DiscJockey instance that uses the structure as his song list
 * @author anonbnr
 *
 */
public class SongListGenerator {

	public static void main(String[] args) {
		// List of Music genres
		SongComponent industrial = new SongGroup("Industrial",
				"is a genre of music that draws on harsh, transgressive or provocative sounds and themes");
		SongComponent heavyMetal = new SongGroup("\nHeavy Metal",
				"is a genre of rock music that includes a group of related styles that are intense, virtuosic, and powerful");
		SongComponent dubstep = new SongGroup("\nDubstep",
				"is a genre of electronic dance music that originated in South London in the late 1990s");

		// List of all songs and their genres
		SongComponent songGenres = new SongGroup("Song List", "of every song available");

		// Industrial is a music genre
		songGenres.add(industrial);

		// Adding Industrial music songs
		industrial.add(new Song("Head Like a Hole", "NIN", 1990));
		industrial.add(new Song("Headhunter", "Front 242", 1988));

		// Dubstep is a sub-genre of Industrial
		industrial.add(dubstep);

		// Adding Dubstep music songs
		dubstep.add(new Song("Centipede", "Knife Party", 2012));
		dubstep.add(new Song("Tetris", "Doctor P", 2011));

		// Heavy Metal is a music genre
		songGenres.add(heavyMetal);

		// Adding Heavy Metal music songs
		heavyMetal.add(new Song("War Pigs", "Black Sabbath", 1970));
		heavyMetal.add(new Song("Ace of Spades", "Motorhead", 1980));

		// A DiscJockey will us a song list with different genres for his parties
		DiscJockey crazyLarry = new DiscJockey(songGenres);

		// What kind of music do you have on you Larry?
		crazyLarry.displaySongList();
	}
}
