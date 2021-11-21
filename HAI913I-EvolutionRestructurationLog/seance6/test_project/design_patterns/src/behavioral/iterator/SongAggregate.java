package behavioral.iterator;

import structural.composite.Song;

/**
 * a SongAggregate interface playing the role of Aggregate
 * in the Iterator Design pattern.<br/>
 * It provides an interface for adding songs into a Song aggregate.
 * It also extends the Iterable<Song> interface to allow its subclasses
 * to return a default Iterator<Song>.
 * @author anonbnr
 *
 */
public interface SongAggregate extends Iterable<Song> {
	
	/* METHODS */
	/**
	 * Adds a Song to the aggregate.
	 * @param songName the Song's name.
	 * @param bandName the Song's band name.
	 * @param releaseYear the Song's release year.
	 */
	void addSong(String songName, String bandName, int releaseYear);
}