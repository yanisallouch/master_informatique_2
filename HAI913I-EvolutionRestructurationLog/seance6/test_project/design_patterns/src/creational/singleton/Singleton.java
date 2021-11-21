package creational.singleton;

import java.lang.reflect.InvocationTargetException;

/**
 * The Singleton class in the Singleton design pattern structure.
 * Defines a private static instance of itself to contain its singleton.
 * Uses a SingletonRegistry registry to register its instance once 
 * and retrieve it whenever. The registration occurs upon the instantiation
 * of the Singleton class. The key for identifying a Singleton class is defined
 * by the getRegistryKey() method, which defines the key as the Singleton class
 * name.
 * This singleton is accessible by the global access level class method 
 * getInstance(). The Singleton class, whose instance is to be returned by this
 * method, is passed as a parameter and instantiated through reflection
 * to activate its initial registration. Afterwards, the instance is retrieved
 * from the registry and returned to the client.
 * Consequently, any Singleton subclass will have its own singleton instance, 
 * rather than having all Singleton subclasses share the same instance. 
 * 
 * @author anonbnr
 * @see SingletonRegistry
 *
 */
public class Singleton {
	/* ATTRIBUTES */
	/**
	 * the singleton instance
	 */
	private static Singleton instance = null;
	
	/**
	 * The singletons registry
	 */
	protected static SingletonRegistry registry = new SingletonRegistry();
	
	/* CONSTRUCTORS */
	/**
	 * the singleton constructor that should only be accessible
	 * to the class, its subclasses and to the global access level instance
	 * getter 
	 */
	protected Singleton() {
		registry.register(getRegistryKey(this.getClass()), this);
	}
	
	/* METHODS */
	/**
	 * The global access level Singleton getter, that instantiates cls
	 * for the initial registry into the SingletonRegistry registry,
	 * then returns the proper Singleton instance to the client.
	 * @param cls The Singleton class whose instance we wish to retrieve
	 * from the SingletonRegistry registry.
	 * @return the singleton of cls
	 */
	public static Singleton getInstance(Class<? extends Singleton> cls) {
		
		try {
			cls.getDeclaredConstructor().newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		instance = registry.lookup(getRegistryKey(cls));
		
		return instance;
	}
	
	/**
	 * Returns cls' name as the String registry key associated
	 * with its singleton.
	 * @param cls The Singleton class
	 * @return The String registry key associated to cls' singleton,
	 * consisting of its name.
	 */
	private static String getRegistryKey(Class<? extends Singleton> cls) {
		return cls.getName();
	}
}