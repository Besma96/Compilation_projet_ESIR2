package org.xtext.comp.generator;

import java.util.HashMap;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.xtext.comp.py.Expr;

public class FunctionDef {
	private int in, out; // nb de variables d'entr�e et de sortie
	private String NameFunction;
	HashMap<String, VarCounter> vars;
	HashMap<String,EList<Expr>> calls; //gestion des appels
	HashSet<String> Vars_local;
	private static final String VAR_PREFIXE = "Var";
	private int count;

//	private static FunctionDef instance;
	public FunctionDef(String nameFunction){
		NameFunction = nameFunction;
		in = 0;
		out = 0;
		vars = new HashMap<String,VarCounter>();
		calls = new HashMap<String,EList<Expr>>();
		Vars_local = new HashSet<String>();
		this.count = 0;
	}
	
	public String getNewVar() {
		return VAR_PREFIXE+ this.count++;
	}
	
	/**
	 * Ajoute une variable dans la table des variables selon qu'elle soit utlis�e � gauche
	 * @param var
	 */
	public void updateReadVar(String var){
		if(alreadyExisting(var)){
			vars.put(var,vars.get(var).incrRC());
		} 
		else {
			vars.put(var,new VarCounter(1, 0));
		}
	}
	
	public void updateWriteVar(String var){
		if(alreadyExisting(var)){
			vars.put(var,vars.get(var).incrWC());
		} else {
			vars.put(var,new VarCounter(0, 1));
		}
	}

	public void updateCalls(String symb, EList<Expr> exprs){
		calls.put(symb,exprs);
	}

	public boolean alreadyExisting(String var){
		return vars.containsKey(var);
	}
	
	public boolean localVarAlreadyExisting(String var){
		return Vars_local.contains(var);
	}
	
	public void updateVars_local(String var){
		Vars_local.add(var);
	}

	@Override
	public String toString(){
		return "Input: "+in+", Output: "+out+"\nVariables: "+vars.keySet().toString();
	}

	/* GETTERS & SETTERS */

	public String getNameFunction() {
		return NameFunction;
	}

	public void setNameFunction(String NameFunction) {
		this.NameFunction = NameFunction;
	}

	public int getInputCount() {
		return in;
	}

	public void setInputCount(int in) {
		this.in = in;
	}

	public int getOutputCount() {
		return out;
	}

	public void setOutputCount(int out){
		assert out > 0 : "Il faut au moins une variable en sortie";
		this.out = out;
	}

	public HashMap<String, VarCounter> getVars() {
		return vars;
	}
	
	public HashSet<String> getVars_local() {
		return Vars_local;
	}

	public HashMap<String, EList<Expr>> getCalls() {
		return calls;
	}

}