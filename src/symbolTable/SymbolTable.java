package symbolTable;

import java.util.HashMap;
import java.util.HashSet;

public class SymbolTable {
	//enum�re les diff�rents types de variables
	public enum varType {input, output, local};
	
	private HashMap<String, Fonction> fonction;
	private HashSet<String> symboles;
	private static SymbolTable instance; //singleton
	
	private SymbolTable() {
		this.fonction = new HashMap<String, Fonction>();
		this.symboles = new HashSet<String>();
	}
	
	/**
	 * Un symbole n'appara�t q'une seule fois dans le program
	 */
	public static SymbolTable getInstance() {
		if(instance == null) {
			return new SymbolTable();
		}
		return instance;
	}
	/**
	 * ajoute un symbole dans la table des symboles si ce dernier n'est pas d�j� pr�sent
	 * @param constante
	 */
	public void addSymbol(String symbole) {
		if(!symboles.contains(symbole)) {
			this.symboles.add(symbole);
		}
	}
	
	/**
	 * V�rifie les pr�sence d'une constante dans l'ensemble des constantes
	 * @param constante
	 * @return vrai si la constante est pr�sente dans l'ensemble des symbole et faux sinon
	 */
	public boolean constainsSymbol(String symbole) {
		return this.symboles.contains(symbole);
	}
	
	/******************************* Partie Fonctions ******************/
	
	/**
	 * Permet d'ajouter une fonction dans la table des symboles
	 * @param nameFonction
	 * @param nb_variables_in : nombre de variables d'entr�e
	 * @param nb_variables_out :nombre de variables de sortie
	 */
	public void addFonction(String nameFonction, int nb_variables_in, int nb_variables_out) {
		
		if(!this.fonction.containsKey(nameFonction)) {
			Fonction f = new Fonction(nb_variables_in, nb_variables_out);
			this.fonction.put(nameFonction, f);
		}
		else {
			System.out.println("La table contient d�j� la focntion : "+ nameFonction);
		}
	}
	/**
	 * La fonction fonction est-elle presente dans la table ou pas
	 * @param fonction
	 * @return
	 */
	public boolean containsFunction(Fonction fonction) {
		return this.fonction.containsKey(fonction);
	}
}
