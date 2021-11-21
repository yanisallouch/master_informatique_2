package structural.composite;

/**
 * a Song concrete class playing the role of Leaf 
 * in the Composite Design pattern.<br/>
 * It provides the interface for songs.
 * @author anonbnr
 *
 */
public class Song extends SongComponent {
	/* ATTRIBUTES */
	/**
	 * The Song's name
	 */
	private String songName;
	
	/**
	 * The Song's band name
	 */
	private String bandName;
	
	/**
	 * The Song's release year
	 */
	private int releaseYear;
	
	/* CONSTRUCTOR */
	/**
	 * Creates a Song named songName, by the band named bandName,
	 * released in releaseYear.
	 * @param songName The Song's name
	 * @param bandName The Song's band name
	 * @param releaseYear The Song's release year
	 */
	public Song(String songName, String bandName, int releaseYear) {
		this.songName = songName;
		this.bandName = bandName;
		this.releaseYear = releaseYear;
	}
	
	/* METHODS */
	/**
	 * Gets the Song's name
	 */
	@Override
	public String getSongName() {
		return this.songName;
	}
	
	/**
	 * Gets the Song's band's name
	 */
	@Override
	public String getBandName() {
		return this.bandName;
	}
	
	/**
	 * Gets the Song's release year
	 */
	@Override
	public int getReleaseYear() {
		return this.releaseYear;
	}
	
	@Override
	public String getInfo() {
		StringBuilder buf = new StringBuilder();
		
		buf.append("Song: " + this.getSongName());
		buf.append(", Band: " + this.getBandName());
		buf.append(", Year: " + this.getReleaseYear());
		
		return buf.toString();
	}
}