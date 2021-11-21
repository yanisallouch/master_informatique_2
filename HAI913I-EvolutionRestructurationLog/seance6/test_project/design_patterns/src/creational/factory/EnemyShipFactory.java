package creational.factory;

/**
 * The Creator class in the Factory design pattern structure.
 * In this case, we're providing an enemy ship creational.factory having
 * a parameterized creational.factory method that can create different
 * kinds of enemy ships, and that can be overriden (if needed) 
 * by more specific enemy ship factories 
 * 
 * @author anonbnr
 *
 */
public class EnemyShipFactory {
	public EnemyShip createEnemyShip(String type) {
		
		switch(type) {
			case "U":
				return new UFOEnemyShip();
			case "R":
				return new RocketEnemyShip();
			case "B":
				return new BigUFOEnemyShip();
			default:
				return null;
		}
	}
}
