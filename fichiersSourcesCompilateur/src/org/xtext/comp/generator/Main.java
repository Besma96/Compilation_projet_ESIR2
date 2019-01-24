
package org.xtext.compilateur.generator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
import org.xtext.compilateur.GrammarWhileStandaloneSetup;
import org.xtext.compilateur.grammarWhile.Affect;
import org.xtext.compilateur.grammarWhile.Command;
import org.xtext.compilateur.grammarWhile.Commands;
import org.xtext.compilateur.grammarWhile.Definition;
import org.xtext.compilateur.grammarWhile.Expr;
import org.xtext.compilateur.grammarWhile.ExprAnd;
import org.xtext.compilateur.grammarWhile.ExprCons;
import org.xtext.compilateur.grammarWhile.ExprEq;
import org.xtext.compilateur.grammarWhile.ExprHd;
import org.xtext.compilateur.grammarWhile.ExprList;
import org.xtext.compilateur.grammarWhile.ExprNot;
import org.xtext.compilateur.grammarWhile.ExprOr;
import org.xtext.compilateur.grammarWhile.ExprSimple;
import org.xtext.compilateur.grammarWhile.ExprSym;
import org.xtext.compilateur.grammarWhile.ExprTl;
import org.xtext.compilateur.grammarWhile.For;
import org.xtext.compilateur.grammarWhile.Foreach;
import org.xtext.compilateur.grammarWhile.FunctionP;
import org.xtext.compilateur.grammarWhile.If;
import org.xtext.compilateur.grammarWhile.Input;
import org.xtext.compilateur.grammarWhile.Nop;
import org.xtext.compilateur.grammarWhile.Output;
import org.xtext.compilateur.grammarWhile.Program;
import org.xtext.compilateur.grammarWhile.While;
import org.xtext.compilateur.grammarWhile.impl.ExprHdImpl;
import org.xtext.compilateur.grammarWhile.impl.ExprImpl;
import org.xtext.compilateur.grammarWhile.impl.ExprTlImpl;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class Main {
	private static String inputFileName = "test_compilation.wh";
	private static String outputFileName = "./whc_result.py";

	private static final String VAR_PREFIXE = "Var";
	private Map<String, FunctionDef> listFunction = new HashMap<String, FunctionDef>();
	private Map<String, String> symboles = new HashMap<String, String>();
	CodeIntermediaire codeI = new CodeIntermediaire();
	private static Main instance;
	private static int count = 0;
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
			instance = new GrammarWhileStandaloneSetup().createInjectorAndDoEMFRegistration().getInstance(Main.class);
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
	private Translator_Python Translator;

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
		System.out.println("Code generation finished.");
	}
	/**
	 * Initialise la liste des fonctions avec le nom des focntions déclarées
	 * @param prog
	 */
	private void discoverFunctions(Program prog) {
		for(FunctionP f : prog.getFunctions()) {
			String namef = f.getName();
			Definition def = f.getDefinition();
			boolean existFunction = listFunction.containsKey(namef);
			if(!existFunction) {
				FunctionDef defFun = new FunctionDef(namef);
				//TODO gestion de la duplication à faire 
				defFun.setInputCount(def.getInput().getVars().size());
				defFun.setOutputCount(def.getOutput().getVars().size());
				this.listFunction.put(namef, defFun);
				System.out.println("Contenue "+ this.getFunList().keySet());

			}

		}
	}

	//	def doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context,
	//			String name_file,int global_indent,int if_indent,int for_indent,
	//			int while_indent,int foreach_indent
	//)
	//{
	//for(r:resource.allContents.toIterable.filter(Program)){
	//	fsa.generateFile(name_file,r.compile(global_indent,if_indent,for_indent,while_indent
	//		,foreach_indent
	//	))	
	//}
	//}



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
		PyGenerator whil = new PyGenerator();
		whil.doGenerate(resource, fileAccess, context);


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
		this.Translator = new Translator_Python(codeI);


		displaySymTable(); 		// Print the symbols table
		System.out.println(translator.toString()); //print code python
		//Ecriture du code python dans un fichier
		File file = new File(outputFilePath);
		System.out.println("chemin :"+ file.getAbsolutePath());
		try (PrintWriter out = new PrintWriter(file.getAbsolutePath())) {
			out.println(translator.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//		PrintWriter out =null;
		//		try {
		//			 out = new PrintWriter(file.getAbsolutePath());
		//			out.println(translator.toString());
		//		}catch(FileNotFoundException e) {
		//			e.printStackTrace();
		//		}finally {
		//			if(out != null) {
		//				out.close();
		//			}
		//		}
	}


	private void compile(Program prog) {
		for(FunctionP f : prog.getFunctions()) {
			compile(f);
		}
	}

	private void compile(FunctionP f) {
		String namef = f.getName();
		codeI.nouvelleEtiquette();
		codeI.fun(codeI.getEtiquette());
		compile(f.getDefinition(), listFunction.get(namef));
		codeI.finEtiquette();
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
			f.updateReadVar(i); //ajout à la table des variables
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
		if(obj instanceof Nop) {
			codeI.nop();
		}
		if(obj instanceof If) {
			compile((If) obj,f);
		}
		if(obj instanceof While) {
			compile((While)obj,f);
		}
		if(obj instanceof For) {
			compile((For)obj,f);
		}
		if(obj instanceof Foreach) {
			compile((Foreach)obj,f);
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
		//Evaluation du coté droit d'abord
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
		}
		//gestion du coté gauche
		while(itVars.hasNext()) {
			var = itVars.next();
			//			var = VAR_PREFIXE + (i++);
			expr = tempVars.poll();
			f.updateWriteVar(var);
			varDeclaration3Addr(f, expr);
			codeI.aff(var, expr);
		}
	}



	private void compile(If i,FunctionDef f) {
		String etiquetteIf= codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		compile(i.getExpr(),f);
		List<String>list=codeI.inlineExpression(this, f);
		if(list.size()==1) {
			codeI.decl(list.get(0));
		}
		codeI.finEtiquette();
		codeI.nouvelleEtiquette();
		Commands cm1=i.getCommands1();
		compile(cm1,f);
		String etiquetteThen=codeI.getEtiquette();
		Commands cm2=i.getCommands2();
		if(cm2!=null) {
			codeI.finEtiquette();
			codeI.nouvelleEtiquette();
			compile(cm2,f);
			codeI.finEtiquette();
			codeI.ifElseCond(etiquetteIf, etiquetteThen,codeI.getPreviousEtiquette());
		}
		else {
			codeI.finEtiquette();
			codeI.ifCond(etiquetteIf, etiquetteThen);
		}
	}
	
	private void compile(While w,FunctionDef f) {
		String etiquetteWhile=codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		compile(w.getExpr(),f);
		List<String>list=codeI.inlineExpression(this, f);
		if(list.size()==1) {
			codeI.decl(list.get(0));
		}
		codeI.finEtiquette();
		codeI.nouvelleEtiquette();
		
		Commands cms=w.getCmds();
		compile(cms,f);
		codeI.finEtiquette();
		codeI.whileLoop(etiquetteWhile, codeI.getPreviousEtiquette());
	}
	private void compile(For fr,FunctionDef f) {
		Expr exprcond=fr.getExpr();
		if(exprcond instanceof ExprAnd ||exprcond instanceof ExprOr ||exprcond instanceof ExprEq) {
			System.out.println("Erreur d'expression dans la boucle");
			System.exit(1);
		}
		String etiquetteFor=codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		compile(exprcond,f);
		List<String>list=codeI.inlineExpression(this, f);
		if(list.size()==1) {
			codeI.decl(list.get(0));
		}
		codeI.finEtiquette();
		codeI.nouvelleEtiquette();
		Commands cms=fr.getCmds();
		compile(cms,f);
		Expr expression	=new ExprImpl();
		ExprTl expr=new ExprTlImpl();
		expr.setArg(exprcond);
		expression.setExpr(expr);
		compile(expression,f);
		codeI.inlineExpression(this, f);
		codeI.finEtiquette();
		codeI.forLoop(etiquetteFor, codeI.getPreviousEtiquette());
	}
	
	private void compile(Foreach frch,FunctionDef f) {
		Expr expr1Foreach=frch.getExpr();
		String namevar=expr1Foreach.toString();
		Expr expr2Foreach=frch.getExpr2();
		
		if(expr2Foreach instanceof ExprAnd ||expr2Foreach instanceof ExprOr ||expr2Foreach instanceof ExprEq) {
			System.out.println("Erreur d'expression dans la boucle");
			System.exit(1);
		}
		
		if(namevar==null) {
			System.out.println("Erreur d'expression 1");
			System.exit(1);
		}
		
		String etiquetteForeachCond=codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		compile(expr2Foreach,f);
		codeI.inlineExpression(this, f);
		codeI.finEtiquette();
		
		codeI.nouvelleEtiquette();
		Expr expression=new ExprImpl();
		ExprHd expr=new ExprHdImpl(); 
		
		expr.setArg(expr2Foreach);
		expression.setExpr(expr);
		
		compile(expression,f);
		List<String>list=codeI.inlineExpression(this, f);
		codeI.aff(namevar,list.get(0));
		
		Commands cmds=frch.getCmd();
		compile(cmds,f);
		
		Expr expression2=new ExprImpl();
		ExprTl expr2=new ExprTlImpl();
		
		expr2.setArg(expr2Foreach);
		expression2.setExpr(expr2);
		
		compile(expression2,f);
		codeI.inlineExpression(this, f);
		codeI.finEtiquette();
		
		codeI.forEachLoop(etiquetteForeachCond,codeI.getPreviousEtiquette());
			
		
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
			return compile((ExprEq) obj, f);
		}
		else if(obj instanceof ExprSym ) {
			return compile((ExprSym) obj, f);
		}
		else {
			//			compile(exp )
			//System.out.println("L'expression n'est pas reconnue : "+ exp);
		}
		return null;
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
			codeI.cons(var, tempVars.poll(), tempVar);
			tempVars.offer(var);
			nbExpr--;
			if(nbExpr < 0) {
				return var;
			}
		}
		return null;
	}
	
	private String compile(ExprSym exp, FunctionDef f) {
		// TODO Auto-generated method stub
		return null;
	}

	private String compile(ExprNot exp, FunctionDef f) {
		// TODO Auto-generated method stub
		return null;
	}

	private String compile(ExprEq exp, FunctionDef f) {
		// TODO Auto-generated method stub
		return null;
	}

	private String compile(ExprList exp, FunctionDef f) {
		return null;
	}

	private String compile(ExprOr exp, FunctionDef f) {
		return null;
	}

	private String compile(ExprAnd exp, FunctionDef f) {
		// TODO Auto-generated method stub
		return null;
	}

	private String compile(ExprTl exp, FunctionDef f) {
		// TODO Auto-generated method stub
			EList<EObject> contents=exp.getArg().eContents();
			if(contents.size()!=1) {
				System.out.println("nb arguements incorrect");
				System.exit(1);
			}
			String etiquetteTl=codeI.getEtiquette();
			codeI.nouvelleEtiquette();
			compile(exp.getArg(),f);
			codeI.finEtiquette();
			codeI.inlineExpression(this, f);
			codeI.tl(etiquetteTl,codeI.getPreviousEtiquette());
			
			return null;
		
	}

	private String compile(ExprHd exp, FunctionDef f) {
		// TODO Auto-generated method stub
		EList<EObject> contents=exp.getArg().eContents();
		if(contents.size()!=1) {
			System.out.println("nb arguements incorrect");
			System.exit(1);
		}
		String etiquetteTl=codeI.getEtiquette();
		codeI.nouvelleEtiquette();
		compile(exp.getArg(),f);
		codeI.finEtiquette();
		codeI.inlineExpression(this, f);
		codeI.tl(etiquetteTl,codeI.getPreviousEtiquette());
		return null;
	}

	private String compile(ExprSimple expr, FunctionDef f) {
		String val = expr.getVarSimple(); // variable simple
		String sym = expr.getSym();
		Input call = expr.getVars();  //appel de fonction
		String nil = expr.getStr();
		String result = "";
		if(val != null) {
			f.updateReadVar(val);
			varDeclaration3Addr(f, val); //ajout dans la table des variables locales
			result = val;

			//System.out.println("dans l'exprS "+ result);
		}
		if(sym != null) {
			symboles.put(sym, ""); //ajout dans la table des symboles
		}
		if(nil != null) {
			symboles.put(nil, "");
			f.updateReadVar(nil);
			varDeclaration3Addr(f, val);
			result = nil;
}
		return result;

	}

	public Map<String, FunctionDef> getFunList() {
		return this.listFunction;
	}

	public Map<String, String> getSymbs() {
		return symboles;
	}

	public CodeIntermediaire getCode3Addresses() {
		return codeI;
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