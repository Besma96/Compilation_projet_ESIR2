import java.util.HashMap;
/** 
 *  Cette classe est la table des variables.
 * Donc une liste HashMap de l'ensemble des variables du programme 
 * elle pourra renseigner le type de variable que c'est
*/


public class VariableTable{

    //enumère les différents types de variables
    public enum varType {input, output, local};
    public enum varTreeType{nil};
    
    private HashMap varTab;
    private static VariableTable L_varTab;

    // les variables ont toujours une structure nil en arbre binaire à leur initialisation
    private VariableTable(){
        this.varTab=new HasMap<String, varTreeType.nil >();

    }
    // montre la liste des variables déjà implémenté
    public static VariableTable getInstance(){
        return L_varTab;
    }
    // si la variable à déja été rencontré il y a deux possibilités 
    //soit elle se retrouve affecté d'une nouvelle valeure
    //soit sa valeur sert à implémenté d'autre variable
    public void addVariable(String variable, HashSet<String> hs){
        if(!containsVariable(variable)){
            this.varTab.add(variable);
	    hs.add(variable);
        }
    }

    public boolean containsVariable(String variable) {
		return this.varTab.contains(variable);
	}

}
