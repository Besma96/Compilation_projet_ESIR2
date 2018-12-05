package org.xtext.compilateur.generator;

public class Function_Python extends Function {
	

	public Function_Python(String name) {
		super(name);
		this.Inparams = "input = [], output = []" ; //à voir !!!!!
		this.type_returns = " ";
		write("inParams = []"); //Liste des paramètres d'entrée
		write("outParams = []"); //Liste des paramètres d'entrée
		varsDeclaration();
	}
	
	protected void varsDeclaration() {
		
		Fonction def = Fonction.getInstance();
		write("#variables utilisées dans le code while");
		
		// initilisation de toutes les variables locales à null par défaut
//		def.getVars_local().forEach((key, value) -> {
//			write(key + " = bt(\"" + key + "\", None, None)");
////			System.out.println(key);
//		});
		SymbolTable.getInstance().getSymbs().forEach((key, value) -> {
			write(key + " = bt(\"" + key + "\", None, None)");
			System.out.println(key);
		});
		write("");
	}
	
	public void printFunction(Translator translator) {
		
		newLine();
		translator.write(""+ getParams());
		translator.write2(body.toString());
	}
	
	
}
