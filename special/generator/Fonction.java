package org.xtext.compilateur.generator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Fonction {
	private String name; // nom de la fonction
	private HashSet<String> var_inputs;
	private HashSet<String> var_outputs;
//	private HashSet<String> var_local;
	private HashMap<String, String> var_local;
	private int in, out;
	private int numeroVar;

//	private VariableTable var_tab = VariableTable.getInstance();
	//Table des variables avec une hashMap pour generer de nouvelle variable
	
//	public Fonction(String nameFonction int nb_variables_in, int nb_variables_out) {
//		this.var_inputs = new HashSet<String>(nb_variables_in);
//		this.var_outputs = new HashSet<String>(nb_variables_out);
//		this.var_local = new HashSet<String>();
//		//this.name = nameFonction;
//	}
	private static Fonction instance;
	
	private Fonction() {
		this.var_inputs = new HashSet<String>();
		this.var_outputs = new HashSet<String>();
//		this.var_local = new HashSet<String>();
		this.var_local = new HashMap<String, String>();
		//this.numeroVar = 0;
//		this.name = nameFonction;
	}
	
	public static Fonction getInstance() {
		if(instance == null) {
			return new Fonction();
		}
		else {
			return instance;
		}
	}
	/**
	 * 
	 * @return l'ensemble des variables d'entrée
	 */
	public HashSet<String> getVars_inputs(){
		return this.var_inputs;
	}
	
	/**
	 * 
	 * @return
	 */
	public HashSet<String> getVars_outputs(){
		return this.var_outputs;
	}
	
	/**
	 * 
	 * @return
	 */
	public HashMap<String, String> getVars_local(){
		return this.var_local;
	}
//	public String getName() {
//		return this.name;
//	}
	
	/**
	 * retourne le nombre de variables d'entrées
	 */
	public int getSizeVarInputs() {
		return this.var_inputs.size();
	}

	/**
	 * retourne le nombre de variables de sorties
	 */
	public int getSizeVarOutputs() {
		return this.var_outputs.size();
	}
	
	/**
	 * Ajout d'une variable dans une fonction donnée
	 * @param ID : ID de la variable
	 * @param varCat : catégorie de la variable (input, output, local)
	 */
	public void addVariable(String ID, VarType varCat) {
		
		switch(varCat){
		
		case input:
			this. var_inputs.add(ID);
			//this.var_tab.addVariable(ID, var_inputs);
			break;
		case output: 
//			this.var_tab.addVariable(ID, var_outputs);
			this. var_outputs.add(ID);
			break;
		case local:
			//this.var_tab.addVariable(ID, var_local);
			this. var_local.put(ID, "Var"+this.numeroVar);
			this.numeroVar++;
			break;
		default:
			break;
		}
	}
	
	/**
	 * Affichage des variable d'entrées
	 */
	public String affichageVariablesEntrees() {
		StringBuilder str = new StringBuilder();
		Iterator<String> it = this.var_inputs.iterator();
		while(it.hasNext()) {
			str.append("Paramètres d'entrée: \r\n");
			str.append(it.next());
			if(it.hasNext()) str.append(", ");
		}
		//System.out.println(str.toString());
		return str.toString();
	}
	
	/**
	 * Affichage des variable d'entrées
	 */
	public String affichageVariablesSortie() {
		StringBuilder str = new StringBuilder();
		Iterator<String> it = this.var_outputs.iterator();
		str.append("Paramètres de sortie: \r\n");
		while(it.hasNext()) {
			str.append(it.next());
			if(it.hasNext()) str.append(", ");
		}
		//System.out.println(str.toString());
		return str.toString();
	}
	
	/**
	 * Affichage des variable local
	 */
	public String affichageVariablesLocales() {
		StringBuilder str = new StringBuilder();
		Iterator<String> it = this.var_local.keySet().iterator();
		str.append("Variables Locales: \r\n");
		while(it.hasNext()) {
			String var = it.next();
			str.append(var + "\r\n");
		}
//		System.out.println("Nombre de variable local : "+ str.toString());
		return str.toString();
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("	  IN\r\n");
		for(String var : this.var_inputs)
			str.append("    	" + var + "\r\n");
		
		str.append("	  OUT\r\n");
		for(String var : this.var_outputs)
			str.append("    	" + var + "\r\n");
		
		str.append("	  LOCAL\r\n");
		for(String var : this.var_local.keySet())
			str.append("    	" + var +"->"+ this.var_local.get(var) +"\r\n");
		//System.out.println("Les différentes variables du programme : "+ str.toString());
		return str.toString();
}

}
