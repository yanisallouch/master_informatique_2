package structural.composite;

/**
 * a DiscJockey concrete class playing the role of Client 
 * in the Composite Design pattern.<br/>
 * It provides an interface for a DJ using a SongComponent
 * designating a list of possible Songs or SongGroups.
 * @author anonbnr
 *
 */
public class DiscJockey {
	
	/* ATTRIBUTES */
	/**
	 * The DJ's SongComponent list
	 */
	private SongComponent songList;
	
	/* CONSTRUCTOR */
	/**
	 * Creates a DJ using songList as his SongComponent list
	 * @param songList The SongComponent list to be used by this
	 * DJ
	 */
	public DiscJockey(SongComponent songList) {
		this.songList = songList;
	}
	
	/* METHODS */
	/**
	 * Gets this DJ's SongComponent list
	 * @return this DJ's SongComponent list
	 */
	public SongComponent getSongList() {
		return this.songList;
	}
	
	/**
	 * Displays the information of this DJ's SongComponent list
	 */
	public void displaySongList() {
		songList.displayInfo();
	}
}
