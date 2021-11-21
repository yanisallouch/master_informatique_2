package structural.decorator;

import java.util.Scanner;

/**
 * A Test class of the Decorator Design pattern.
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		orderBeverage();
	}
	
	/**
	 * Orders a Beverage, possibly with additional ingredients,
	 * then displays the order and its total cost.
	 */
	public static void orderBeverage() {
		Scanner scanner = new Scanner(System.in);
		Beverage beverage = selectBeverage(scanner);
		beverage = selectAdditionalIngredients(beverage, scanner);
		displayOrder(beverage);
	}
	
	/**
	 * Displays the beverages menu.
	 */
	public static void beveragesMenu() {
		System.out.println("Beverages\n--------------");
		System.out.println("1. <E>: Espresso");
		System.out.println("2. <T>: Tea");
	}

	/**
	 * Allows the client to select a beverage from the beverages
	 * menu.
	 * @param scanner The scanner used to scan user input.
	 * @return The selected Beverage.
	 */
	public static Beverage selectBeverage(Scanner scanner) {
		String choice;
		boolean isValid = false;
		Beverage beverage = null;
		
		while(!isValid) {
			
			beveragesMenu();
			choice = scanner.nextLine();
			
			switch(choice) {
			case "E":
				beverage = new Espresso();
				isValid = true;
				break;
			case "T":
				beverage = new Tea();
				isValid = true;
				break;
			default:
				System.err.println("Your choice is invalid. Please select again");
				isValid = false;
			}
		}
		return beverage;
	}
	
	/**
	 * Displays the menu of the additional ingredients 
	 * that can be added to a selected beverage.
	 */
	public static void additionalIngredientsMenu() {
		System.out.println("Additional Ingredients\n----------------------------");
		System.out.println("1. <C>: Caramel");
		System.out.println("2. <S>: Sugar");
		System.out.println("3. <Enter>: when done");
	}
	
	/**
	 * Allows the client to possibly select an additional ingredient
	 * from the additional ingredients menu to add to beverage. 
	 * @param beverage The Beverage to which we can possibly add
	 * additional ingredients.
	 * @param scanner The scanner used to scan user input.
	 * @return The Beverage, possibly with additional ingredients.
	 */
	public static Beverage selectAdditionalIngredients(Beverage beverage, Scanner scanner) {
		String choice;
		boolean isValid = false;
		
		while(!isValid) {
			
			additionalIngredientsMenu();
			choice = scanner.nextLine();
			
			switch(choice) {
			case "C":
				beverage = new CaramelDecorator(beverage);
				break;
			case "S":
				beverage = new SugarDecorator(beverage);
				break;
			case "":
				isValid = true;
				break;
			default:
				System.out.println("Your choice is invalid. Please select again");
				isValid = false;
			}
		}
		return beverage;
	}
	
	/**
	 * Displays the ordered beverage and its total cost
	 * @param beverage The ordered Beverage
	 */
	public static void displayOrder(Beverage beverage) {
		System.out.println("Your order is: " + beverage.description());
		System.out.println("Total cost: " + beverage.price());
	}
}
