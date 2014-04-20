package decorateur;

/**
 * Impl�mente un d�corateur
 */
public class ImplDecorateurA extends Decorateur {

	public ImplDecorateurA(final Abstraction pAbstraction) {
		super(pAbstraction);
	}

	/**
	 * Impl�mentation de la m�thode pour la d�coration de "ImplDecorateurA". Des
	 * op�rations sont effectu�es avant et apr�s l'appel � la m�thode de l'objet
	 * "Abstraction" pass� au constructeur. La m�thode ignore si cet objet est
	 * un autre d�corateur ou l'impl�mentation
	 */
	public void operation() {
		System.out.println("ImplDecorateurA avant");
		abstraction.operation();
		System.out.println("ImplDecorateurA apres");
	}
}
