package symbolTable;

import java.util.HashMap;
import java.util.HashSet;

public class VariableTable {
	  public enum varType {input, output, local};
	    public enum varTreeType{nil, cons, tail, head};
	    
	    private HashMap<String, varType> varTab;
	    private static VariableTable L_varTab;

	    // les variables ont toujours une structure nil en arbre binaire à leur initialisation
	    private VariableTable(){
	        this.varTab=new HashMap<String, varType >();
	    }
	    // montre la liste des variables déjà implémenté
	    public static VariableTable getInstance(){
	        return L_varTab;
	    }
		public void addVariable(String iD, HashSet<String> vars) {
			
		}
}
