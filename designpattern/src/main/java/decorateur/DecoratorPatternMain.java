package decorateur;

public class DecoratorPatternMain {

	public static void main(String[] args) {
		
		I a = new B();
		System.out.println("I a = new B() "+getTest(a));
		I b = new A();
		System.out.println("I b = new A() "+getTest(b));
		A aa = new A();
		System.out.println("A aa = (A)(new B()); "+getTest(aa));

		
		
		// Cr�ation de l'implementation et des d�corateurs
//		final Implementation lImpl = new Implementation();
//		final ImplDecorateurB lImplDecB = new ImplDecorateurB(lImpl);
//		final ImplDecorateurA lImplDecA = new ImplDecorateurA(lImplDecB);
//
//		// Appel de la m�thode du d�corateur "conteneur"
//		lImplDecA.operation();

		// Affichage :
		// ImplDecorateurA avant
		// ImplDecorateurB avant
		// Implementation
		// ImplDecorateurB apres
		// ImplDecorateurA apres
	}
	
	public static int getTest(I b){
		return b.getI();
	}
}
