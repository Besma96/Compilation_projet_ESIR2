package org.xtext.comp.generator;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Function_Python extends Function {

	public Function_Python(String name) {
		super(name);
		this.Inparams = "inputP , outputP " ; //paramètres de la fonction d'initilaisation
		this.type_returns = " ";
		write("inParams = queue.Queue() #Queue de bintree"); //Liste des paramètres d'entrée
		rightShift();
		write("outParams =queue.Queue() #Queue de bintree"); //Liste des paramètres d'entrée utile pour le main
		varsDeclaration();
	}

	protected void varsDeclaration() {
		Map<String, FunctionDef> map = Main.getInstance().getFunList();
		Map<String, String> mapEti = Main.getInstance().getEtiquettesFunctions();

		Iterator<String> name = map.keySet().iterator();
		while(name.hasNext()) {
			String nom = name.next();
			if(mapEti.containsKey(this.name))
				if(mapEti.get(this.name).equals(nom)) {
					FunctionDef defu = map.get(nom);
					write(" #Variables utilisées dans le code While de la fonction : "+defu.getNameFunction());
					defu.getVars().forEach((key, value)->{
//						write(key + " = bt.WhLib().cons(\"nil\", \"nil\")");
						write(key + " = bt.WhLib().cons(None, None)");

					});
					write("");
					write(" #Variables temporaires utilisées par le compiler pour la fonction : "+ defu.getNameFunction());
					defu.getVars_local().forEach((key) -> {
//						write(key + " = bt.WhLib().cons(\"nil\", \"nil\")");
						write(key + " = bt.WhLib().cons(None, None)");
					});
					write("");
					break;
				}
		}
	}

	public void printFunction() {

		newLine();
		write(" #Le corps de la fonction qui doit être appelée dans le programme principal");
		//translator.write();
		//write("Les paramètres de la fcontion Function_Python");
		this.write("def " + getName() + "("+getParams() + ") : ");
		this.rightShift();		
		this.write(body.toString());
		this.leftShift();
		write(" #Fin du corps de la  Function_Python");
	}

	public void printFunction(Translator translator) {

		newLine();
		translator.write("def " + getName() + "("+getParams() + ") : ");
		translator.rightShift();		
		translator.write2(body.toString());
		translator.leftShift();
		write(" #Fin du corps de la  Function_Python");
	}


}
