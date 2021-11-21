package verification;

public class Termination {
	
	/* ni a ni b ne diminuent strictement à chaque itération,
	 * par contre c'est le cas pour l'expression a + b qui fournit donc une mesure de terminaison
	 */
	
	/*@ requires n >= 0 && m >= 0;
	  @ ensures \result == n + m;
	  @*/
	public /*@ pure @*/ static int add(int n, int m) {
		int c = 0;
		int a = n;
		int b = m;
		/*@ loop_invariant a + b + c == n + m;
		  @ loop_invariant a >= 0 && b >= 0;
		  @ decreases a + b;
		 */
		while (a > 0 || b > 0) {
			if (a > 0) {
				a--;
			} else {
				b--;
			}
			c++;
		}
		return c;
	}
	
	/* dans l'algorithme d'Euclide, présenté traditionellement sur des entiers positifs,
	 * la valeur de b diminue à chaque appel récursif
	 */

	/*@ normal_behavior
      @ requires a >= 0;
      @ requires b >= 0;
      @ ensures a % \result == 0;
      @ ensures b % \result == 0;
      @ measured_by b;
      @*/
	public /*@ pure @*/ static int gcd_positive(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
	
	/* si on modifie la fonction pour fonctionner sur tous les entiers, l'argument b n'est pas toujours décroissant
	 * exemple:
	 * 
	 *   gcd(-15, -9)
	 * = gcd(-9, -6)
	 * = gcd(-6, -3)
	 * = gcd(-3, 0)
	 * = 3
	 */

	/*@ normal_behavior
      @ ensures a % \result == 0;
      @ ensures b % \result == 0;
      @ measured_by Specification.absoluteValue(b);
      @*/
	public /*@ pure @*/ static int gcd(int a, int b) {
		if (b == 0) {
			return a >= 0 ? a : -a ;
		} else {
			return gcd(b, a % b);
		}
	}
	
	/* on peut aussi spécifier qu'une méthode ne termine jamais */
	
	/*@ normal_behavior
	  @ ensures false;
	  @ diverges true;
	  @*/
	public /*@ pure @*/ static void nonTerminating() {
		int i = 0;
		/*@ loop_invariant i >= 0;
		  @*/
		while (i >= 0) {
			i++;
		}
	}
	
	/* ou bien préciser sous quelles conditions elle ne termine pas */
	
	/*@ normal_behavior
	  @ diverges n < 0;
	  @*/
	public /*@ pure @*/ static void sometimesNonTerminating(int n) {
		/*@ loop_invariant n >= 0 ==> 0 <= i && i <= n;
		  @ loop_invariant n < 0 ==> i < 0;
		  @ decreases i;
		  @*/
		int i = n;
		while (i != 0) {
			i--;
		}
	}

}
