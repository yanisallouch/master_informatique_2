package behavioral.iterator;

import java.util.Hashtable;
import java.util.Iterator;

import structural.composite.Song;

/**
 * a SongHashtable concrete class that plays the role of ConcreteAggregate
 * in the Iterator Design pattern.<br/>
 * It implements the aggregation as a Hashtable key/value addition,
 * and returns an iterator over the hash table's collection of values.
 * @author anonbnr
 *
 */
public class SongHashtable implements SongAggregate {
	
	/* ATTRIBUTES */
	/**
	 * This SongHashtable's hash table of songs.
	 */
	private Hashtable<Integer, Song> table = new Hashtable<>();
	
	/**
	 * The current hash key value used to store a Song in this SongHashtable's
	 * hash table of songs.
	 */
	private int hashKey = 0;

	/* METHODS */
	/**
	 * Adds a Song named songName, played by the band named bandName,
	 * and released in releaseYear to this SongHashtable's hash table of songs.
	 */
	@Override
	public void addSong(String songName, String bandName, int releaseYear) {
		table.put(hashKey++, new Song(songName, bandName, releaseYear));
	}

	/**
	 * Returns an iterator over this SongHashtable's hash table's collection of songs.
	 */
	@Override
	public Iterator<Song> iterator() {
		return table.values().iterator();
	}
}