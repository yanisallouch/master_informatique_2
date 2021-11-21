package creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * A registry class that stores singletons, and gets queried by
 * a singleton class to retrieve its sole instance. It uses
 * a Map to store singleton instances with their corresponding keys.
 * The key is a String that is defined by the Singleton class.
 * Upon the instantiation of a Singleton class or any of its subclasses, 
 * its instance gets registered in the registry, 
 * only if it hadn't already been registered.
 * As a result, every Singleton class can retrieve its proper instance 
 * from the singleton registry.
 * This allows every Singleton class to have its own singleton instance,
 * rather than having all Singleton classes share the same instance. 
 * 
 * @author anonbnr
 * @see Singleton
 *
 */
public class SingletonRegistry {
	/* ATTRIBUTES */
	
	/**
	 * The Map storing the singletons and their String ids.
	 */
	private Map<String, Singleton> registry = new HashMap<>();
	
	/* METHODS */
	/**
	 * Registers the couple <key: String, singleton: Singleton> 
	 * in the Map, only if key isn't already defined as an id 
	 * for an associated Singleton instance.
	 * @param key The key of the Singleton instance to register
	 * @param singleton The Singleton instance to register
	 */
	public void register(String key, Singleton singleton) {
		if (!registry.containsKey(key))
			registry.put(key, singleton);
	}
	
	/**
	 * Looks up the Singleton instance identified by key,
	 * and returns it if it exists, otherwise returns null.
	 * @param key The key of the Singleton instance to look up
	 * @return The Singleton instance identified by key, if its exists,
	 * null otherwise
	 */
	public Singleton lookup(String key) {
		return registry.get(key);
	}
}
