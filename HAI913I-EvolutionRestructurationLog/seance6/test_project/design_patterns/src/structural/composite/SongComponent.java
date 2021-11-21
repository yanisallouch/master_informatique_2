package structural.composite;

/**
 * a SongComponent abstract class playing the role of 
 * Component in the Composite Design pattern.<br/>
 * It provides an interface for all song components.
 * @author anonbnr
 *
 */
public abstract class SongComponent {
	
	/* METHODS */
	/**
	 * For a composite SongComponent, adds component to the 
	 * list of its children. For a leaf SongComponent, it
	 * is unsupported.
	 * @param component The SongComponent to add.
	 */
	public void add(SongComponent component) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * For a composite SongComponent, removes component from
	 * the list of its children, if it is among them. For a leaf
	 * SongComponent, it is unsupported.
	 * @param component The SongComponent to remove.
	 */
	public void remove(SongComponent component) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * For a composite SongComponent, returns the SongComponent
	 * child indexed by index. For a leaf SongComponent, it is
	 * unsupported.
	 * @param index The index of the child SongComponent to get.
	 * @return The SongComponent child indexed by index for composite
	 * SongComponents, or throws an exception otherwise.
	 */
	public SongComponent getComponent(int index) {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * For a leaf SongComponent, returns the name of the song.
	 * For a composite SongComponent, it is unsupported.
	 * @return The name of the song for leaf SongComponents, or
	 * throws an exception otherwise.
	 */
	public String getSongName() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * For a leaf SongComponent, returns the name of the song's
	 * band. For a composite SongComponent, it is unsupported.
	 * @return The name of the song's band for leaf SongComponents,
	 * or throws an exception otherwise.
	 */
	public String getBandName() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * For a leaf SongComponent, returns the release year
	 * of the song. For a composite SongComponent, it is unsupported.
	 * @return The release year of the song for leaf SongComponents,
	 * or throws an exception otherwise.
	 */
	public int getReleaseYear() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Returns the information of this SongComponent
	 */
	public String getInfo() {
		throw new UnsupportedOperationException();
	}
	
	/**
	 * Displays the information of this SongComponent
	 */
	public void displayInfo() {
		System.out.println(this.getInfo());
	}
}
