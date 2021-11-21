package behavioral.iterator;

import structural.composite.Song;

/**
 * a DiscJockey concrete class that plays the role of Client
 * in the Iterator Design pattern.<br>
 * It uses a SongAggregate to store aggregation of songs and
 * its corresponding iterator to display these songs.
 * @author anonbnr
 *
 */
public class DiscJockey {
	
	/* ATTRIBUTES */
	/**
	 * This DJ's aggregation of songs.
	 */
	private SongAggregate songs;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a DJ with songs as its aggregation of songs.
	 * @param songs The aggregation of songs of the DJ to create.
	 */
	public DiscJockey(SongAggregate songs) {
		this.songs = songs;
	}
	
	/* METHODS */
	/**
	 * Displays the songs in this DJ's aggregation of songs.
	 */
	public void displaySongs() {
		for (Song song: songs)
			song.displayInfo();
	}
}