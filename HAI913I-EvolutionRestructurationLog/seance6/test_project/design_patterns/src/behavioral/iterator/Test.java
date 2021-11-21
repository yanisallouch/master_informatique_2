package behavioral.iterator;

/**
 * a Test class for the Iterator Design pattern.
 * @author anonbnr
 *
 */
public class Test {

	public static void main(String[] args) {
		SongAggregate songs = new SongList();
		songs.addSong("Imagine", "John Lennon", 1971);
		songs.addSong("American Pie", "Don McLean", 1971);
		songs.addSong("I Will Survive", "Gloria Gyanor", 1979);
		
		DiscJockey DJ = new DiscJockey(songs);
		System.out.println("Songs in a SongList");
		DJ.displaySongs();
		System.out.println();
		
		songs = new SongArray(3);
		songs.addSong("Roam", "B52s", 1989);
		songs.addSong("Cruel Summer", "Bananarama", 1984);
		songs.addSong("Head over Heels", "Tears for Fears", 1985);
		
		DJ = new DiscJockey(songs);
		System.out.println("Songs in a SongArray");
		DJ.displaySongs();
		System.out.println();
		
		songs = new SongHashtable();
		songs.addSong("Losing My Religion", "REM", 1991);
		songs.addSong("Creep", "Radiohead", 1993);
		songs.addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);
		
		DJ = new DiscJockey(songs);
		System.out.println("Songs in a SongHashtable");
		DJ.displaySongs();
		System.out.println();
	}
}