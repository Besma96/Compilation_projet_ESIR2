package org.xtext.compilateur.generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class SymbolTable {
	
	private HashMap<String, Fonction> fonction;
	private HashSet<String> symboles;
	private static SymbolTable instance; //singleton
	private SymbolTable() {
		this.fonction = new HashMap<String, Fonction>();
		this.symboles = new HashSet<String>();
	}
	
	/**
	 * La table des symboles n'apparaît q'une seule fois dans le program
	 */
	public static SymbolTable getInstance() {
		if(instance == null) {
			instance = new SymbolTable(); 
			return instance;
		}
		return instance;
	}
	/**
	 * ajoute un symbole dans la table des symboles si ce dernier n'est pas déjà présent
	 * @param constante
	 */
	public void addSymbol(String symbole) {
		if(!symboles.contains(symbole)) {
			this.symboles.add(symbole);
		}
	}
	
	/**
	 * Vérifie les présence d'une constante dans l'ensemble des constantes
	 * @param constante
	 * @return vrai si la constante est présente dans l'ensemble des symbole et faux sinon
	 */
	public boolean constainsSymbol(String symbole) {
		return this.symboles.contains(symbole);
	}
	
	/******************************* Partie Fonctions ******************/
	
//	/**
//	 * Permet d'ajouter une fonction dans la table des symboles
//	 * @param nameFonction
//	 * @param nb_variables_in : nombre de variables d'entrée
//	 * @param nb_variables_out :nombre de variables de sortie
//	 */
//	public void addFonction(String nameFonction, int nb_variables_in, int nb_variables_out) {
//		
//		if(!containsFunction(nameFonction, nb_variables_in)) {
//			Fonction f = new Fonction( nb_variables_in, nb_variables_out);
//			this.fonction.put(nameFonction, f);
//		}
//		else {
//			System.out.println("La table contient déjà la fonction : "+ nameFonction);
//		}
//	}
	
	/**
	 * Permet d'ajouter une fonction dans la table des symboles
	 * @param nameFonction
	 * @param nb_variables_in : nombre de variables d'entrée
	 * @param nb_variables_out :nombre de variables de sortie
	 */
	public void addFonction(String nameFonction, int nb_variables_in, int nb_variables_out) {
		
		if(!containsFunction(nameFonction, nb_variables_in)) {
			Fonction f = new Fonction();
			this.fonction.put(nameFonction, f);
		}
		else {
			System.out.println("La table contient déjà la fonction : "+ nameFonction);
		}
	}
	
	/**
	 * La fonction est-elle presente dans la table ou pas
	 * @param fonction
	 * @return vrai si la fonction est contenue dans la table, faux sinon
	 */
	public boolean containsFunction(String namefonction, int var_inputs_size) {
		// si le nom de la fonction et le nombre de variables d'entrées sont identiques, on considère que la fonction est déjà présente
		
		return (this.fonction.containsKey(namefonction) && fonction.get(namefonction).getSizeVarInputs() == var_inputs_size);
	}
	
	/**
	 * Retourne une fonction contenue dans la table
	 * @param nameFonction : nom de la fonction
	 */
	public Fonction getFonction(String nameFonction) {
		return fonction.get(nameFonction);
	}
	
	/**
	 * Pour l'affichage des symboles et des fonctions
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Table des Symboles\r\n");
		str.append("Symboles\r\n");
		for(String symbol: this.symboles) {
			str.append(" "+ symbol +"\r\n");
		}
		str.append("Le nombre de symboles lus : "+this.symboles.size()+ "\r\n");
		str.append("\r\n Fonctions\r\n");
		Iterator<String> it = this.fonction.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			str.append(" "+ tmp + ":\r\n"+ this.fonction.get(tmp).toString() + "\r\n");
		}
		System.out.println("Le nombre de symboles lus : "+this.symboles.size());
		return str.toString();
	}
}	
