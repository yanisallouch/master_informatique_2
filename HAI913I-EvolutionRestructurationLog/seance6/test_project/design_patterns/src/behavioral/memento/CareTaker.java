package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * a CareTaker concrete class that plays the role of CareTaker in
 * the Memento Design pattern.<br/>
 * It defines an object that stores a list of an Originator's
 * produced Mementos, in order to preserve different checkpoints
 * of its internal state for later state restoration by said Originator.
 * @author anonbnr
 */
public class CareTaker {
	/* ATTRIBUTES */
	/**
	 * The list of an Originator's produced Mementos that
	 * are cared for by this CareTaker.
	 */
	List<Memento> mementos = new ArrayList<>();
	
	/* METHODS */
	/**
	 * Adds memento to the list of Mementos cared for by this
	 * CareTaker.
	 * @param memento The Memento to add to the list of Mementos 
	 * cared for by this CareTaker.
	 */
	public void addMemento(Memento memento) {
		mementos.add(memento);
	}
	
	/**
	 * Gets the Memento indexed by index in the list of 
	 * Mementos cared for by this CareTaker.
	 * @param index The index of the Memento to retrieve.
	 * @return the Memento indexed by index in the list of 
	 * Mementos cared for by this CareTaker.
	 */
	public Memento get(int index) {
		return mementos.get(index);
	}
}