package org.xtext.comp.generator;

import java.util.Iterator;
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
		Iterator<String> name = map.keySet().iterator();
		while(name.hasNext()) {
			FunctionDef defu = map.get(name.next());
			write(" #Variables utilisées dans le code While");
			defu.getVars().forEach((key, value)->{
				write(key + " = binTree()");
			});
			write("");
			write(" #Variables temporaires utilisées par le compiler");
			defu.getVars_local().forEach((key) -> {
				write(key + " = binTree()");
				System.out.println(key);
			});
			write("");
		}
	}
	
	public void printFunction(Translator translator) {
		
		newLine();
		write(" #Le corps de la fonction qui doit être appelée dans le programme principal");
		//translator.write();
		//write("Les paramètres de la fcontion Function_Python");
		translator.write("def " + getName() + "("+getParams() + ") : ");
		translator.rightShift();		
		translator.write(body.toString());
		translator.leftShift();
		write(" #Fin du corps de la  Function_Python");
	}
	
	
}
