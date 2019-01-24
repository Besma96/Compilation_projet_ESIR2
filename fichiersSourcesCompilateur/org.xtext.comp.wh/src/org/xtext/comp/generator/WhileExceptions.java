package org.xtext.comp.generator;

/**
 * Classe destinée à la gestion des erreurs
 * @author Barry
 *
 */
@SuppressWarnings("serial")
public class WhileExceptions extends Exception {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 7105169382077658142L;
	public WhileExceptions(String error) {
		super("ERROR : "+ error);
	}
}
