/*
 * generated by Xtext 2.15.0
 */
package org.xtext.comp.generator;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.GeneratorDelegate;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtext.comp.PyStandaloneSetup;
import org.xtext.comp.py.Affect;
import org.xtext.comp.py.Command;
import org.xtext.comp.py.Commands;
import org.xtext.comp.py.Definition;
import org.xtext.comp.py.Expr;
import org.xtext.comp.py.ExprAnd;
import org.xtext.comp.py.ExprCons;
import org.xtext.comp.py.ExprEq;
import org.xtext.comp.py.ExprHd;
import org.xtext.comp.py.ExprList;
import org.xtext.comp.py.ExprNot;
import org.xtext.comp.py.ExprOr;
import org.xtext.comp.py.ExprSimple;
import org.xtext.comp.py.ExprSym;
import org.xtext.comp.py.ExprTl;
import org.xtext.comp.py.For;
import org.xtext.comp.py.Foreach;
import org.xtext.comp.py.FunctionP;
import org.xtext.comp.py.If;
import org.xtext.comp.py.Input;
import org.xtext.comp.py.Nop;
import org.xtext.comp.py.Output;
import org.xtext.comp.py.Program;
import org.xtext.comp.py.While;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Main {
	private static String inputFileName = "test_compilation_nop.wh";
	//	private static String outputFileName = "/projetCompilation/Compilation_projet_ESIR2/whc_result.py";
	private static String outputFileName = "whc_result.py";

	//Map pour conserver l'�tiquettage des fonctions et leurs noms en while
	private static Map<String, String> etiquettesFunction = new HashMap<String, String>();

	private static final String VAR_PREFIXE = "Var";
	private Map<String, FunctionDef> listFunction = new HashMap<String, FunctionDef>();
	private Map<String, String> symboles = new HashMap<String, String>();
	private CodeIntermediaire codeI = new CodeIntermediaire();
	private static Main instance;
	private static int count = 0;
	private static int nbF = 0; //numerotaion des fonctions
	private Translator_Python Translator ;
	//	private Main() {
	//		this.listFunction = new HashMap<String, FunctionDef>();
	//		this.symboles = new HashMap<String, String>();
	//		codeI = new CodeIntermediaire();
	//	}
	/**
	 * Get the singleton instance of the GeneratorAddr
	 * @return The unique instance of the GeneratorAddr
	 */
	public static Main getInstance() {
		if (instance == null) {
			instance = new PyStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(Main.class);
			return instance;
		} else {
			return instance;
		}
	}

	public static void main(String[] args) {
		Main main = Main.getInstance();
		main.runGenerator(args);
	}

	@Inject
	private Provider<ResourceSet> resourceSetProvider;

	@Inject
	private IResourceValidator validator;

	@Inject
	private GeneratorDelegate generator;

	@Inject 
	private JavaIoFileSystemAccess fileAccess;

	protected void runGenerator(String[] args) {
		if(args.length == 1) {
			createSymTable(args[0], outputFileName);
		}
		else if(args.length > 1) {
			createSymTable(args[0], args[1]);
		}
		else {
			createSymTable(inputFileName, outputFileName);
		}
		//		this.Translator.translate();
		//		System.out.println("Le resultat :\n"+Translator.toString());
		System.out.println("Table de correspondance de l'�tiquattage des fonction");
		System.out.println(etiquettesFunction.toString());
		System.out.println("Code generation finished.");
	}



	/**
	 * Initialise la liste des fonctions avec le nom des focntions d�clar�es
	 * @param prog
	 */
	private void discoverFunctions(Program prog) {
		for(FunctionP f : prog.getFunctions()) {
			String namef = f.getName();
			Definition def = f.getDefinition();
			boolean existFunction = listFunction.containsKey(namef);
			if(!existFunction) {
				FunctionDef defFun = new FunctionDef(namef);
				//TODO gestion de la duplication � faire 
				defFun.setInputCount(def.getInput().getVars().size());
				defFun.setOutputCount(def.getOutput().getVars().size());
				this.listFunction.put(namef, defFun);
				System.out.println("contenue " + listFunction.toString());

			}

		}
	}


	public void createSymTable(String inputFilePath, String outputFilePath)
	{
		// Load the resource
		ResourceSet set = resourceSetProvider.get();
		Resource resource = set.getResource(URI.createFileURI(inputFilePath), true);

		// Validate the resource
		List<Issue> list = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
		if (!list.isEmpty()) {
			for (Issue issue : list) {
				System.err.println(issue);
			}
			return;
		}

		// Configure and start the generator
		fileAccess.setOutputPath("./");
		GeneratorContext context = new GeneratorContext();
		context.setCancelIndicator(CancelIndicator.NullImpl);
		//		PyGenerator whil = new PyGenerator();
		//		whil.doGenerate(resource, fileAccess, context);


		TreeIterator<EObject> tree = resource.getAllContents();
		while (tree.hasNext()) {
			EObject next = tree.next(); //AST
			if (next instanceof Program) {
				discoverFunctions((Program) next); // Just read the function's names and inputs / outputs
				compile((Program) next); // Start to discover all the program
			}
		}

		// Translator
		System.out.println("Le code 3 : "+codeI);
		Translator_Python translator = new Translator_Python(codeI);
		translator.translate();
		//		this.Translator = new Translator_Python(codeI);


		displaySymTable(); 		// Print the symbols table
		System.out.println(translator.toString()); //print code python
		//Ecriture du code python dans un fichier
		//		File file = new File(outputFilePath);
		//		System.out.println("chemin :"+ file.getParentFile());
		//		try (PrintWriter out = new PrintWriter(file.getAbsolutePath())) {
		//			out.println(translator.toString());
		//			out.close();
		//		} catch (FileNotFoundException e) {
		//			e.printStackTrace();
		//		}

		//Autre approche
		File fil = new File(outputFilePath);
		FileWriter fr = null;

		try {
			fr = new FileWriter(fil.getAbsolutePath());
			fr.write(translator.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}


	private void compile(Program prog) {
		for(FunctionP f : prog.getFunctions()) {
			compile(f);
		}
	}

	private void compile(FunctionP f) {
		String namef = f.getName();
		codeI.nouvelleEtiquette();
		String etiquetteF = "F"+nbF++;
		if(!etiquettesFunction.containsValue(namef)) {
			codeI.fun(etiquetteF);

			etiquettesFunction.put(etiquetteF, namef);
			compile(f.getDefinition(), listFunction.get(namef));
			codeI.finEtiquette();
		}
		else {
			System.err.println("Les fonctions doivent avoir des noms differents ");
			return;
		}

	}


	private void compile(Definition d, FunctionDef f) {
		//Inputs
		compile(d.getInput(), f);
		compile(d.getCommands(), f);
		compile(d.getOutput(), f);
	}

	private void compile(Output out, FunctionDef f) {
		EList<String> vars = out.getVars();
		for(String v : vars) {
			codeI.write(v);
			f.updateWriteVar(v);
		}
	}
	private void compile(Input in, FunctionDef f) {
		EList<String> inputs = in.getVars();
		for(String i : inputs) {
			f.updateReadVar(i); //ajout � la table des variables
			codeI.read(i);
		}
	}

	private void  compile(Commands com, FunctionDef f) {
		EList<Command> comm = com.getCommands();
		for(Command c : comm) {
			compile(c , f);
		}
	}
	private void compile(Command com, FunctionDef f) {
		EObject obj = com.getCmd();
		if(obj instanceof Affect) {
			compile((Affect) obj, f);
		}
		else if(obj instanceof Nop) {
			codeI.nop();
		}
		else if(obj instanceof For) {
			compile((For) obj, f);
		}
		else if(obj instanceof While) {
			compile((While) obj, f);
		}
		else if(obj instanceof Foreach) {
			compile((Foreach) obj, f);
		}
		else if(obj instanceof If) {
			compile((If) obj, f);
		}
	}



	private boolean isSymbole(String str) {
		if (str == null || str.equals("nil")){ return false; }
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toLowerCase()); // Is lowercase ->
		// Symbole
	}

	private boolean isVariable(String str) {
		if (str == null){ return false;	}
		String firstChar = str.substring(0, 1);
		return firstChar.equals(firstChar.toUpperCase()); // Is uppercase -> Variable
	}

	/**
	 * Ajoute la variable v dans la table de variables locales si v n'existait pas avant
	 * @param f
	 * @param v
	 */
	public void varDeclaration3Addr(FunctionDef f, String v) {
		if(isVariable(v)){
			if (!f.alreadyExisting(v)) {
				if (!f.localVarAlreadyExisting(v)) {
					f.updateVars_local(v);
				}
			}
		}
	}

	private void compile(Affect aff, FunctionDef f) {

		Queue<String> tempVars = new LinkedList<String>(); //Pour stocker les variables temporaires

		EList<String> vars = aff.getVars(); //cote gauche
		EList<Expr> exprs = aff.getExprs(); // cote droit

		Iterator<String> itVars = vars.iterator(); //gauche 
		Iterator<Expr> itExprs = exprs.iterator(); //droit

		String var; //variable temporaire
		String expr; //expression

		//Evaluation du cot� droit d'abord
		while(itExprs.hasNext()) {
			Expr e = itExprs.next();
			//compile(e, f); // compile de l'expression	
			EObject x = e.getExpr();
			if(x instanceof ExprSimple) {
				expr = compile((ExprSimple)x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprCons) {
				expr = compile((ExprCons) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprAnd) {
				expr = compile((ExprAnd) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprOr) {
				expr = compile((ExprOr) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprList) {
				expr = compile((ExprList) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprHd) {
				expr = compile((ExprHd) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprTl) {
				expr = compile((ExprTl) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprSym) {
				expr = compile((ExprSym) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprNot) {
				expr = compile((ExprNot) x, f);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}
			else if(x instanceof ExprEq) {
				expr = compile((ExprEq) x, f);
				System.out.println("dans affectation EQ "+ expr);
				var = VAR_PREFIXE + count++;
				tempVars.offer(var);
				varDeclaration3Addr(f, var);
				codeI.aff(var, expr);
			}

		}
		//gestion du cot� gauche
		while(itVars.hasNext()) {
			var = itVars.next();
			//			var = VAR_PREFIXE + (i++);
			expr = tempVars.poll();
			f.updateWriteVar(var);
			varDeclaration3Addr(f, expr);
			codeI.aff(var, expr);
		}
	}


	private String compile(ExprCons cons, FunctionDef f){
		EList<Expr> eCons = cons.getLexpr().getLexpr();
		int nbExpr = eCons.size();
		nbExpr--;
		Expr temp = eCons.get(nbExpr);
		String tempVar = "";
		Queue<String> tempVars = new LinkedList<String>();
		if(nbExpr > 0) {
			tempVar = compile(temp, f); //resultat de la compile de l'expression
			//			String var = VAR_PREFIXE + count++;
			//			varDeclaration3Addr(f, var);
			//			codeI.cons(var, tempVar, "_");
			tempVars.offer(tempVar); // on stocke toutes les variables contenant le resultat du compile de chaque expression
			nbExpr--;
		}

		while(nbExpr >= 0) {
			temp = eCons.get(nbExpr);
			tempVar = compile(temp, f); //resultat de la compile de l'expression
			String var = VAR_PREFIXE + count++;
			varDeclaration3Addr(f, var);
			//			codeI.cons(var, tempVars.poll(), tempVar);
			codeI.cons(var, tempVar, tempVars.poll());
			tempVars.offer(var);
			nbExpr--;
			if(nbExpr < 0) {
				return var;
			}
		}
		return null;
	}

	//Expr
	private String compile(Expr exp, FunctionDef f) {
		EObject obj = exp.getExpr();

		if(obj instanceof ExprSimple) {
			return compile((ExprSimple)obj, f);
		}
		else if(obj instanceof ExprCons ) {
			return compile((ExprCons) obj, f);
		}
		else if(obj instanceof ExprHd ) {
			return compile((ExprHd) obj, f);
		}
		else if(obj instanceof ExprTl ) {
			return compile((ExprTl) obj, f);
		}
		else if(obj instanceof ExprAnd ) {
			return compile((ExprAnd) obj, f);
		}
		else if(obj instanceof ExprOr ) {
			return compile((ExprOr) obj, f);
		}
		else if(obj instanceof ExprList ) {
			return compile((ExprList) obj, f);
		}
		else if(obj instanceof ExprNot ) {
			return compile((ExprNot) obj, f);
		}
		else if(obj instanceof ExprEq ) {
			System.out.println("Suis dans EQ");
			return compile((ExprEq) obj, f);
		}
		else if(obj instanceof ExprSym ) {
			return compile((ExprSym) obj, f);
		}
		else {
			System.out.println("L'expression n'est pas reconnue : "+ exp);
		}
		return null;
	}

	private String compile(ExprSym exp, FunctionDef f) {
		// TODO Auto-generated method stub
		// Ressemble plutot � l'appel de fonction(cf Py.xtext)
		String arg1 = exp.getArg1();
		EList<Expr> arg2 = exp.getArg2();
		if(arg1 != null) {
			this.symboles.put(arg1, "");
		}

		if(arg2 != null) {
			//TODO
		}

		return null;
	}

	private String compile(ExprNot exp, FunctionDef f) {
		Expr expr = exp.getArg1();
		String tempVar = compile(expr, f);
		String var = VAR_PREFIXE+count++;
		varDeclaration3Addr(f, var);
		codeI.not(var, tempVar);

		return var;
	}

	private String compile(ExprEq exp, FunctionDef f) {

		ExprSimple arg1 = exp.getArg1(); 
		Expr arg2 = exp.getArg2();

		String tempVar1 = compile(arg1, f); 
		String tempVar2 = compile(arg2, f);
//		System.out.println("arg1 " + tempVar1);
//		System.out.println("arg2 " + tempVar2);
		String var = VAR_PREFIXE+count++;
		varDeclaration3Addr(f, var);
		codeI.eq(var, tempVar1, tempVar2);

		return var;

	}

	private String compile(ExprList exp, FunctionDef f) {

		//Doit �tre transformer en plusieurs instructions cons: list  A B C D --> cons(nil D) 
		EList<Expr> eCons = exp.getArg();
		int nbExpr = eCons.size();
		nbExpr--;
		Expr temp = eCons.get(nbExpr);
		String tempVar = "";
		Queue<String> tempVars = new LinkedList<String>();
		if(nbExpr > 0) {
			tempVar = compile(temp, f); //resultat de la compile de l'expression
			//			String var = VAR_PREFIXE + count++;
			//			varDeclaration3Addr(f, var);
			//			codeI.cons(var, tempVar, "_");
			tempVars.offer(tempVar); // on stocke toutes les variables contenant le resultat du compile de chaque expression
			nbExpr--;
		}

		while(nbExpr >= 0) {
			temp = eCons.get(nbExpr);
			tempVar = compile(temp, f); //resultat de la compile de l'expression
			String var = VAR_PREFIXE + count++;
			varDeclaration3Addr(f, var);
			codeI.list(var, tempVars.poll(), tempVar);
			tempVars.offer(var);
			nbExpr--;
			if(nbExpr < 0) {
				return var;
			}
		}

		return null;
	}

	private String compile(ExprOr exp, FunctionDef f) {

		ExprSimple arg1 = exp.getArg1(); //arg1 dans ExprAnd est une ExprSimple
		Expr arg2 = exp.getArg2();
		String tempVar1 = "";
		tempVar1 = compile(arg1, f); 
		String tempVar2 = compile(arg2, f);
		String var = VAR_PREFIXE+count++;
		varDeclaration3Addr(f, var);
		codeI.or(var, tempVar1, tempVar2);

		return var;
	}

	private String compile(ExprAnd exp, FunctionDef f) {
		// TODO Auto-generated method stub
		ExprSimple arg1 = exp.getArg1(); //arg1 dans ExprAnd est une ExprSimple
		Expr arg2 = exp.getArg2();
		String tempVar1 = "";
		tempVar1 = compile(arg1, f); 
		String tempVar2 = compile(arg2, f);
		String var = VAR_PREFIXE+count++;
		varDeclaration3Addr(f, var);
		codeI.and(var, tempVar1, tempVar2);

		return var;
	}

	private String compile(ExprTl exp, FunctionDef f) {
		Expr arg = exp.getArg();
		String temp = compile(arg ,f);
		String var = VAR_PREFIXE+count++;
		varDeclaration3Addr(f, var);
		codeI.tl(var, temp);
		if(arg != null)
			return var;
		return null;
	}

	private String compile(ExprHd exp, FunctionDef f) {

		Expr arg = exp.getArg();
		String temp = compile(arg ,f);
		String var = VAR_PREFIXE+count++;
		varDeclaration3Addr(f, var);
		codeI.hd(var, temp);
		if(arg != null)
			return var;
		return null;
	}

	private String compile(ExprSimple expr, FunctionDef f) {
		String val = expr.getVarSimple(); // variable simple
		String sym = expr.getSym();
		Input call = expr.getVars();  //appel de fonction
		String nil = expr.getStr(); //nil
		String result = "";
		if(val != null) {
			f.updateReadVar(val);
			varDeclaration3Addr(f, val); //ajout dans la table des variables locales
			result = val;

			//System.out.println("dans l'exprS "+ result);
		}
		if(sym != null) {
			symboles.put(sym, ""); //ajout dans la table des symboles
			result = sym;
		}
		if(nil != null) {
			symboles.put(nil, "");
			f.updateReadVar(nil);
			varDeclaration3Addr(f, val);
			result = nil;
		}

		return result;

	}

	//	private void compile(LExpr lexpr, FunctionDef f) {
	//		EList<Expr> exprs = lexpr.getLexpr();
	//		for(Expr e : exprs) {
	//			compile(e, f);
	//		}
	//	}

	/**************************** Structures de contr�les ***************/

	//while
	private void compile(While wh, FunctionDef f) {
		String label = codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		String cond = compile(wh.getExpr(), f); // condition
		if(cond !=null) {
			codeI.decl(cond);
		}
		codeI.finEtiquette();

		codeI.nouvelleEtiquette();
		Commands cmds = wh.getCmds();
		compile(cmds, f); //corps du while
		codeI.finEtiquette();
		codeI.whileLoop(label, codeI.getPreviousEtiquette());
	}

	//For
	private void compile(For fr, FunctionDef f) {
		Expr exp = fr.getExpr();
		if(exp instanceof ExprAnd || exp instanceof ExprOr || exp instanceof ExprEq || exp instanceof ExprNot) {
			System.out.println("Pas d'expression boul�enne comme condition pour la boucle For");
			return;
		}
		String label = codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		String cond = compile(exp, f);
		if(cond != null) {
			codeI.decl(cond);
		}

		codeI.finEtiquette();

		codeI.nouvelleEtiquette();
		Commands cmds = fr.getCmds();
		compile(cmds, f);
		/// une petite partie bizare � revoir
		codeI.finEtiquette();
		codeI.forLoop(label, codeI.getPreviousEtiquette());
	}

	//Foreach
	private void compile(Foreach freach, FunctionDef f) {

		String var = freach.getVar();
		Expr expression = freach.getExpr2();

		if(expression != null) {
			if(expression instanceof ExprAnd || expression instanceof ExprOr || expression instanceof ExprEq || expression instanceof ExprNot) {
				System.err.println("Pas d'expression boul�enne comme expression pour la boucle Foreach");
				return;
			}
		}
		if(var == null) {
			System.err.println("La variable dans la boucle est null ");
			return;
		}
		
		String etiquetteexpr=codeI.getEtiquette();

		codeI.nouvelleEtiquette();
		String expr=compile(expression, f);

		
		codeI.finEtiquette();
		codeI.nouvelleEtiquette();
		
		codeI.aff(var, expr);
		compile(freach.getCmd(),f);
		codeI.finEtiquette();
		codeI.forEachLoop(etiquetteexpr, codeI.getPreviousEtiquette());

	}

	//If
	private void compile(If ifcmd, FunctionDef f) {
		String label = codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		String cond = compile(ifcmd.getExpr(), f);
		if(cond != null) {
			codeI.decl(cond);
		}
		codeI.finEtiquette();

		codeI.nouvelleEtiquette();
		Commands cmds1 = ifcmd.getCommands1();
		compile(cmds1, f);
		String label2 = codeI.getEtiquette();
		//else
		Commands cmds2 = ifcmd.getCommands2();
		if(cmds2 != null) {
			codeI.finEtiquette();
			codeI.nouvelleEtiquette();
			compile(cmds2, f);
			codeI.finEtiquette();
			codeI.ifElseCond(label, label2, codeI.getPreviousEtiquette());
		}
		else {
			codeI.finEtiquette();
			codeI.ifCond(label, codeI.getPreviousEtiquette());
		}
	}


	/*************************** Quelques m�thodes du Main ***************/


	public Map<String, FunctionDef> getFunList() {
		return this.listFunction;
	}

	public Map<String, String> getEtiquettesFunctions(){
		return etiquettesFunction;
	}

	public Map<String, String> getSymbs() {
		return symboles;
	}

	public CodeIntermediaire getCode3Addresses() {
		return codeI;
	}
	public int getCount() {
		return count++;
	}


	private void displaySymTable() {
		System.out.println();
		System.out.println("Symboles globaux : \n" + symboles.keySet() + "\n");
		for (String f : listFunction.keySet()) {
			System.out.println(f + " : " + listFunction.get(f) + "\n");
		}
		System.out.println("Symboles Table correctly generated.");
	}



}
