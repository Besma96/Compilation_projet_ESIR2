package org.xtext.comp.generator;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Function_Python extends Function {
	

	public Function_Python(String name) {
		super(name);
		this.Inparams = "input , output " ; //param�tres de la fonction d'initilaisation
		this.type_returns = " ";
		write("inParams = queue.Queue() #Queue de bintree"); //Liste des param�tres d'entr�e
		write("outParams =queue.Queue() #Queue de bintree"); //Liste des param�tres d'entr�e utile pour le main
		
		varsDeclaration();
	}
	
	protected void varsDeclaration() {
		Map<String, FunctionDef> map = Main.getInstance().getFunList();
		Iterator<String> name = map.keySet().iterator();
		while(name.hasNext()) {
			FunctionDef defu = map.get(name.next());
			write(" #Variables utilis�es dans le code While");
			defu.getVars().forEach((key, value)->{
				write(key + " = bt(\""+key+"\",None,None)");
			});
			write("");
			write(" #Variables temporaires utilis�es par le compiler");
			defu.getVars_local().forEach((key) -> {
				write(key + " = bt(\"" + key + "\", None, None)");
				System.out.println(key);
			});
			write("");
		}

	}
	
	public void printFunction(Translator translator) {
		
		newLine();
		write(" #Le corps de la fonction Function_Python");
		//translator.write();
		//write("Les param�tres de la fcontion Function_Python");
		translator.write("def " + getName() + "("+getParams() + ") : ");
		translator.rightShift();		
		translator.write2(body.toString());
		translator.leftShift();
		write(" #Fin du corps de la  Function_Python");
	}
	
	
}
