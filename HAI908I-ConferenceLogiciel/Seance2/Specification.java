package verification;

class Specification {
	
	/*@ normal_behavior
      @ ensures \result == n || \result == -n;
      @ ensures \result >= 0;
      @*/
	public /*@ pure @*/ static int absoluteValue(int n) {
		if (n < 0) {
			return -n;
		} else {
			return n;
		}
	}
	
	/*@ normal_behavior
	  @ ensures \result >= a;
 	  @ ensures \result >= b;
 	  @ ensures \result == a || \result == b;
	  @*/
	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	/* plusieurs contrats pour définir des cas d'utilisation différents */

	/*@ normal_behavior
      @ requires a != null;
      @ requires (\forall int p; 0 <= p && p < a.length; a[p] != x);
      @ ensures \result == -1;
      @
      @ normal_behavior
      @ requires a != null;
      @ requires (\exists int p; 0 <= p && p < a.length; a[p] == x);
      @ ensures 0 <= \result && \result < a.length;
      @ ensures a[\result] == x;
      @ ensures (\forall int p; 0 <= p && p < \result; a[p] != x);
      @
      @ exceptional_behavior
      @ requires a == null;
      @ signals (IllegalArgumentException e) true;
      @*/
	public /*@ pure @*/ static int positionOf(int[] a, int x) {
		if (a == null) {
			throw new IllegalArgumentException();
		}
		/*@ maintaining 0 <= i && i <= a.length;
          @ maintaining (\forall int p; 0 <= p && p < i; a[p] != x);
          @ decreasing a.length - i;
          @ assignable \strictly_nothing;
          @*/
		for (int i = 0; i < a.length; i++) {  
			if (a[i] == x) return i;
		}
		return -1;
	}
	
	/* utilisation du mot clé \old pour décrire la relation entre la valeur de a avant exécution et après
	 * ce mot clé est nécessaire pour décrire les méthodes qui modifient des objets en place
	 */
	
	/*@ normal_behavior
	  @ requires a != null;
	  @ ensures (\forall int p; 0 <= p && p < a.length; \old(a[p]) == c1 ==> a[p] == c2);
	  @ ensures (\forall int p; 0 <= p && p < a.length; \old(a[p]) != c1 ==> a[p] == \old(a[p]));
	  @ assignable a[*];
	 */
	public static void replaceChar(char [] a, char c1, char c2) {
		/*@ loop_invariant (\forall int p; 0 <= p && p < i; \old(a[p]) == c1 ==> a[p] == c2);
	      @ loop_invariant (\forall int p; 0 <= p && p < i; \old(a[p]) != c1 ==> a[p] == \old(a[p]));
	      @ loop_invariant (\forall int p; i <= p && p < a.length; \old(a[p]) == a[p]);
	      @ loop_invariant 0 <= i && i <= a.length;
	      @ decreases a.length - i;
	      @ assignable a[*];
		  @*/
		for (int i=0; i < a.length; i++) {
			if (a[i] == c1) {
				a[i] = c2;
			}
		}
	}
	
	/* une spécification correcte mais incomplète ouvre la voie à une implémentation
	 * qui ne satisfait pas l'intuition de ce qu'un tri devrait être
	 */
	
	/*@ normal_behavior
	  @ requires a != null;
	  @ ensures (\forall int p; 1 <= p && p < a.length; a[p] >= a[p - 1]);
	  @ modifies a[*];
	  @*/
	public static void badSort(int[] a) {
		/*@ loop_invariant 0 <= i && i <= a.length;
		  @ loop_invariant (\forall int p; 0 <= p && p < i; a[p] == 0);
		  @ modifies a[*];
		  @ decreases a.length - i;
		  @*/
		for (int i = 0; i < a.length; i++) {
			a[i] = 0;	
		}
	}
	
	/* pour compléter la spec, il faut utiliser la notion mathématique de permutation */
	
	/*@ normal_behavior
	  @ ensures (\forall int p; 1 <= p && p < a.length; a[p] > a[p - 1]);
 	  @ ensures \dl_seqPerm(\dl_array2seq(\old(a)), \dl_array2seq(a));
	  @ modifies a[*];
	  @*/
	public static void sort(int[] a) {
		// exercice (avancé): trouver les invariants pour ces deux boucles
		for (int i = 1; i < a.length; i++) {
			int x = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > x) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = x;
		}
	}
	
	/* on peut aussi utiliser l'équivalence avec une implémentation naïve
	 * pour spécifier un programme plus optimisé
	 */

	public /*@ pure @*/ static int fibRec(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibRec(n - 1) + fibRec(n - 2);
		}
	}

	/*@ normal_behavior
      @ requires n >= 0;
      @ ensures \result == fibRec(n);
      @*/
	public /*@ pure @*/ static int fibIter(int n) {
		if (n <= 0) { return 0; }
		int a = 1;
		int b = 0;
		/*@ loop_invariant a == fibRec(i);
		  @ loop_invariant b == fibRec(i - 1);
		  @ loop_invariant n > 0 && 1 <= i && i <= n;
		  @ assignable \strictly_nothing;
		  @ decreasing n - i;
		  @*/
		for (int i = 1; i < n; i++) {
			int c = b;
			b = a;
			a += c;
		}
		return a;
	}
}
