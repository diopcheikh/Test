package decorateur;

/**
 * Impl�mente un d�corateur
 */
public class ImplDecorateurB extends Decorateur {

	public ImplDecorateurB(final Abstraction pAbstraction) {
		super(pAbstraction);
	}

	/**
	 * Impl�mentation de la m�thode pour la d�coration de "ImplDecorateurB".
	 */
	public void operation() {
		System.out.println("ImplDecorateurB avant");
		abstraction.operation();
		System.out.println("ImplDecorateurB apres");
	}
}
