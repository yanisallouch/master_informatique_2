package creational.singleton;

public class Test {

	public static void main(String[] args) {
		ExtendedSingleton singleton1 = (ExtendedSingleton) Singleton.getInstance(ExtendedSingleton.class);
		ExtendedSingleton sameSingleton1 = (ExtendedSingleton) Singleton.getInstance(ExtendedSingleton.class);
		
		ExtendedSingleton2 singleton2 = (ExtendedSingleton2) Singleton.getInstance(ExtendedSingleton2.class);
		ExtendedSingleton2 sameSingleton2 = (ExtendedSingleton2) Singleton.getInstance(ExtendedSingleton2.class);
		
		System.out.println("singleton1 = sameSingleton1 : " + (singleton1.hashCode() == sameSingleton1.hashCode()));
		System.out.println("singleton2 = sameSingleton2 : " + (singleton2.hashCode() == sameSingleton2.hashCode()));
		System.out.println("singleton1 = singleton2 : " + (singleton1.hashCode() == singleton2.hashCode()));
	}
}
