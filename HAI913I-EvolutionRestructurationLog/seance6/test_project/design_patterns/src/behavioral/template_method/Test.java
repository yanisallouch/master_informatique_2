package behavioral.template_method;

/**
 * a Test class for the Template Method Design pattern.
 * @author anonbnr
 */
public class Test {

	public static void main(String[] args) {
		Game game = new Football();
		game.play();
		
		System.out.println();
		
		game = new Basketball();
		game.play();
	}
}