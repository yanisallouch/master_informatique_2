package creational.factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		EnemyShipFactory factory = new EnemyShipFactory();
		EnemyShip enemy = null;
		String type = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What type of enemy ships do you wish to create ? (U/R/B)");
		
		if(scan.hasNextLine()) {
			type = scan.nextLine();
			enemy = factory.createEnemyShip(type);
		}
		
		if (enemy != null)
			doStuffEnemy(enemy);
		else
			System.err.println("Unknown type " + type);
			
	}

	private static void doStuffEnemy(EnemyShip enemy) {
		enemy.displayEnemyShip();
		enemy.followHeroShip();
		enemy.enemyShipShoots();
	}
}
