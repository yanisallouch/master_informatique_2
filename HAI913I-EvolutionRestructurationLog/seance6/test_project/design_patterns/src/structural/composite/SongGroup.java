package structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * a SongGroup concrete class playing the role of Composite 
 * in the Composite Design pattern.<br/>
 * It provides an interface for Song groups.
 * @author anonbnr
 *
 */
public class SongGroup extends SongComponent {
	/* ATTRIBUTES */
	/**
	 * The SongComponent children of this SongGroup.
	 */
	private ArrayList<SongComponent> components = new ArrayList<>();
	
	/**
	 * The name of this SongGroup.
	 */
	private String groupName;
	
	/**
	 * The description of this SongGroup.
	 */
	private String groupDescription;
	
	/* CONSTRUCTOR */
	/**
	 * Creates a SongGroup named groupName and described by
	 * groupDescription.
	 * @param groupName The name of the created SongGroup.
	 * @param groupDescription The description of the created SongGroup.
	 */
	public SongGroup(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}
	
	/* METHODS */
	/**
	 * Gets this SongGroup's name.
	 * @return this SongGroup's name.
	 */
	public String getGroupName() {
		return this.groupName;
	}
	
	/**
	 * Gets this SongGroup's description.
	 * @return this SongGroup's description.
	 */
	public String getGroupDescription() {
		return this.groupDescription;
	}
	
	/**
	 * Adds component of the list of this SongGroup's 
	 * SongComponent children.
	 */
	@Override
	public void add(SongComponent component) {
		components.add(component);
	}
	
	/**
	 * Removes component from the list of this SongGroup's
	 * SongComponent children.
	 */
	@Override
	public void remove(SongComponent component) {
		components.remove(component);
	}
	
	/**
	 * Gets this SongGroup's child SongComponent, indexed
	 * at index in its list of children SongComponents.
	 */
	@Override
	public SongComponent getComponent(int index) {
		return (SongComponent) components.get(index);
	}
	
	@Override
	public String getInfo() {
		StringBuffer buf = new StringBuffer();
		
		buf.append("Genre: " + this.getGroupName());
		buf.append(", Description: " + this.getGroupDescription());
		
		int size = buf.toString().length();
		buf.append("\n");
		
		for (int i = 0; i < size; i++)
			buf.append("=");
		
		buf.append("\n");
		
		Iterator<SongComponent> iterator = components.iterator();
		
		while(iterator.hasNext()) {
			SongComponent component = iterator.next();
			
			if (component instanceof SongGroup)
				buf.append("\n" + component.getInfo());
			else
				buf.append(component.getInfo() + "\n");
		}
		
		return buf.toString();
	}
}
