package org.xtext.compilateur.generator;

public class Function_Python extends Function {
	

	public Function_Python(String name) {
		super(name);
		this.Inparams = "input = [], output = []" ; //� voir !!!!!
		this.type_returns = " ";
		write("inParams = []"); //Liste des param�tres d'entr�e
		write("outParams = []"); //Liste des param�tres d'entr�e
		varsDeclaration();
	}
	
	protected void varsDeclaration() {
		
		Fonction def = Fonction.getInstance();
		write("#variables utilis�es dans le code while");
		
		// initilisation de toutes les variables locales � null par d�faut
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
