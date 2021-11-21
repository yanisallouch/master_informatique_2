package behavioral.iterator;

/**
 * Basic song object of the Aggregate role in the Iterator design pattern
 * @author anonbnr
 *
 */
public class Song {
	
	/* ATTRIBUTES */
	private String songName;
	private String bandName;
	private int yearReleased;
	
	/* CONSTRUCTOR*/
	public Song(String songName, String bandName, int yearReleased) {
		this.songName = songName;
		this.bandName = bandName;
		this.yearReleased = yearReleased;
	}
	
	/* METHODS */
	public String getSongName() {
		return songName;
	}
	
	public String getBandName() {
		return bandName;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		
		buf.append("Title: " + songName + "\n");
		buf.append("Band: " + bandName + "\n");
		buf.append("Release year: " + yearReleased + "\n");
		
		return buf.toString();
	}
	
}
