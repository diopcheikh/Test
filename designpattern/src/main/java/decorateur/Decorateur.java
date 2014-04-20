package decorateur;

import designpattern.Standart;

/**
 * D�finit l'interface du d�corateur.
 */
public abstract class Decorateur implements Abstraction {
	protected Abstraction abstraction;

	/**
	 * Le constructeur du "Decorateur" re�oit un objet "Abstraction"
	 * 
	 * @param pAbstraction
	 */
	public Decorateur(final Abstraction pAbstraction) {
		abstraction = pAbstraction;
	}
}
