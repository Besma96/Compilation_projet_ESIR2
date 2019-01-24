package org.xtext.comp.generator;

import java.util.Iterator;
import java.util.Map;

import org.xtext.comp.generator.Function;
import org.xtext.comp.generator.FunctionDef;
import org.xtext.comp.generator.Main;
import org.xtext.comp.generator.Translator;

public class Function_Python extends Function {
	

	public Function_Python(String name) {
		super(name);
		this.Inparams = "input = queue.Queue()\noutput = queue.Queue()" ; //� voir !!!!!
		this.type_returns = " ";
		write("inParams = queue.Queue() #Queue de bintree"); //Liste des param�tres d'entr�e
		write("outParams =queue.Queue() #Queue de bintree"); //Liste des param�tres d'entr�e
		
		varsDeclaration();
	}
	
	protected void varsDeclaration() {
		
		FunctionDef def = Main.getInstance().getFunList().get(name);
		if(def == null) {
			System.out.println("Fonction nulle dans le main ");
			return;
		}
		write(" #Variables utilis�es dans le code While");
		def.getVars().forEach((key, value)->{
			write(key + " = bt(\""+key+"\",None,None)");
		});
		write("");
		
		write(" #Variables temporaires utilis�es par le compiler");
		def.getVars_local().forEach((key) -> {
			write(key + " = bt(\"" + key + "\", None, None)");
			System.out.println(key);
		});
		write("");
	}
	
	public void printFunction(Translator translator) {
		
		newLine();
		
		//translator.write();
		//write("Les param�tres de la fcontion Function_Python");
		translator.write(getParams());   //getParams permet de mettre les param�tres input et output en param�tres de la fonction dans python
		
		write(" #Le corps de la focntion Function_Python");
		translator.write2(body.toString());
		//write("Fin du corps de la  Function_Python");
	}
	
	
}
