package behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

import structural.composite.Song;

/**
 * a SongArray concrete class that plays the role of ConcreteAggregate
 * in the Iterator Design pattern.<br/>
 * It implements the aggregation as an array addition, and returns
 * an iterator over an equivalent list consisting of the array's elements.
 * @author anonbnr
 *
 */
public class SongArray implements SongAggregate {
	
	/* ATTRIBUTES */
	/**
	 * This SongArray's array of songs.
	 */
	private Song[] songs;
	
	/**
	 * This SongArray's allocated size.
	 */
	private int allocatedSize;
	
	/**
	 * This SongArray currentIndex.
	 */
	private int currentIndex = 0;
	
	/* CONSTRUCTORS */
	/**
	 * Creates a SongArray of size allocatedSize, if allocatedSize
	 * is greater than 10, otherwise creates one of size 10.
	 * @param allocatedSize The memory to allocate for this SongArray.
	 */
	public SongArray(int allocatedSize) {
		if (allocatedSize > 10)
			this.allocatedSize = allocatedSize;
		else
			this.allocatedSize = 10;
		
		songs = new Song[this.allocatedSize];
	}

	/* METHODS */
	/**
	 * Gets the size of the filled part of the SongArray's array of songs.
	 * @return the filled part of the SongArray's array of songs.
	 */
	public int length() {
		return this.currentIndex;
	}
	
	/**
	 * Gets the filled part of the SongArray.
	 * @return the filled part of the SongArray.
	 */
	private Song[] getFilledArray() {
		Song[] filled = new Song[currentIndex];
		
		for (int i = 0; i < this.length(); i++)
			filled[i] = songs[i];
		
		return filled;
	}

	/**
	 * Adds a Song named songName, played by the band named bandName,
	 * and released in releaseYear to this SongArray's array of songs.
	 */
	@Override
	public void addSong(String songName, String bandName, int releaseYear) {
		if (currentIndex < songs.length)
			songs[currentIndex++] = new Song(songName, bandName, releaseYear); 
	}
	
	/**
	 * Transforms this SongArray's filled part into a list
	 * and returns a iterator over it.
	 */
	@Override
	public Iterator<Song> iterator() {
		return Arrays.asList(this.getFilledArray()).iterator();
	}
}