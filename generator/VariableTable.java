package org.xtext.compilateur.generator;

import java.util.HashMap;
import java.util.HashSet;

public class VariableTable {
//	  public enum varType {input, output, local};
	   // public enum varTreeType{nil, cons, tail, head};
	    
	    private HashMap<String, VarType> varTab;
	    private VariableTable L_varTab;
	    private static VariableTable instance;

	    // les variables ont toujours une structure nil en arbre binaire à leur initialisation
	    private VariableTable(){
	        this.varTab=new HashMap<String, VarType >();
	    }
	    // montre la liste des variables déjà implémenté
	    public static VariableTable getInstance(){
	    	if(instance == null) {
				instance = new VariableTable(); 
				return instance;
			}
			return instance;
	    }
	    
		public void addVariable(String iD, HashSet<String> vars) {
			
		}
}
