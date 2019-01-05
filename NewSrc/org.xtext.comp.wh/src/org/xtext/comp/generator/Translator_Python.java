package org.xtext.comp.generator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.xtext.comp.generator.Translator;

public class Translator_Python extends Translator {

	private String nameMainFonction;
	private CodeIntermediaire code;
	private final static String imports = "#-*- coding:utf-8 -*\nfrom binTree import * \nimport WhLib as bt\nimport sys \nimport queue as queue";
	private final static String partieMain = "########## Partie main ############";
	public Translator_Python(CodeIntermediaire code) {
		super(code);
		this.code = code;
	}

	public void iterateCode() {
		System.out.println("Taille de la map codeI :"+code.getSize());
		int taille = code.getSize();
		//		for(int i =taille-1; i>=0; i--) {
		//			iterateCode("F" + i);
		//		}
		for(int i =0; i<taille; i++){
			iterateCode("L" + i);
		}
	}

	private void iterateCode(String string) {
		HashMap<String, LinkedList<QuadPair>> map = code.getCode3Addr();
		LinkedList<QuadPair> list = map.get(string);
		//gestion des erreurs si list==null
		Iterator<QuadPair> it = list.iterator();

		//Gestion de plusieurs fonctions à la fois présentes dans le programme while
		while(it.hasNext()) {
			QuadPair q = it.next();
			String Opname = q.getWrite();
			System.out.println("opname "+ Opname);
			Map<String, FunctionDef> mapF= Main.getInstance().getFunList();
			Map<String, String> mapEti = Main.getInstance().getEtiquettesFunctions();
			Function_Python f = new Function_Python(Opname);

			if(mapF.containsKey(mapEti.get(Opname)) && !this.funcList.contains(f)) {
				//du fait de la definition des etiquettes dans Code3@ il y a risque de conflit avec la gestion des structures de controles et les fonctions à la traduction
				this.funcList.add(f);
				if(inMainFunction && mapF.containsKey(mapEti.get(Opname)) && mapEti.get(Opname).equals("main")) {
					nameMainFonction = q.getWrite();
				}
				// Autres choses à ajouter, voir la classe
				operatorManager(it, f);
			}
		}
	}



	public  void translate() {

		write(imports);
		newLine();

		writeSymbs();
		newLine();

		iterateCode();
		writeFunction();
		CodePrincipal();
	}


	@Override
	protected void translate_affectation(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = " +quad.getRead1());
	}

	@Override
	protected void translate_nop(Function f) {
		f.write("bt.WhLib().nop()");
	}

	@Override
	protected void translate_cons(QuadPair quad, Function f) {

		if(quad.getRead2() != null && !quad.getRead2().equals("")) {
			f.write(quad.getWrite() + " = bt.WhLib().cons(" +quad.getRead1() +"," + quad.getRead2()+")");
		}
		else {
			//			f.write(quad.getWrite() + " = bt.WhLib().cons(" +quad.getRead1() +", bt.WhLib().nil())");
			//			f.write(quad.getWrite() + " = bt.WhLib().cons(" +quad.getRead1() +", None)");
			f.write(quad.getWrite() + " = bt.WhLib().cons( None, " +quad.getRead1() + ")" );

		}
	}

	protected void writeFunction() {
		for(Iterator<Function_Python> iterator = funcList.iterator(); iterator.hasNext();) {
			Function_Python pf = (Function_Python) iterator.next();
			pf.printFunction(this);
		}
	}


	@Override
	protected void writeSymbs() {
		write(" # Les symboles utilisés dans le programme while");
		//write("nil = bt()");

		Main.getInstance().getSymbs().forEach((key, value)->{
//			write(key + " = binTree()");
			write(key + " = bt.WhLib().cons(None, None)");
			System.out.println("Symbole : "+key);
		});
		write("");
	}


	public void CodePrincipal() {
		assert nameMainFonction != null : "Il faut au moins une fonction portant le nom (main) dans le programme";
		Iterator<String> itR = reads.iterator();
		int nbParams = 1;
		//write(" #Partie code principal ");
		write(partieMain);
		newLine();
		write("inParams = queue.Queue() #Queue de BinTree" );
		write("outParams = queue.Queue() #Queue de BinTree");
		while(itR.hasNext()) {
			String s = itR.next();
			write("" +"if(len(sys.argv) > "+ nbParams +") : ");
			rightShift(); //Indentation
			write(""+ s + " = bt.WhLib().intToBinTree(int(sys.argv["+nbParams+"]))");
			write("inParams.put("+ s + ")");
			leftShift();
			write("else : ");
			rightShift();
//			write("" + s+ " = binTree()" );
			write("" + s+ " = bt.WhLib().cons(None, None)" );

			write("inParams.put("+ s + ")");
			leftShift();
			nbParams++;
		}

		newLine();
		write(nameMainFonction + "(inParams, outParams)");
		newLine();
//		System.out.println("Suis avant le for et nbwrites vaut : "+nbWrites);
		write(" #Affichage des paramètres de sortie");
		for(int i = 0; i <nbWrites; i++) {
			write("result = outParams.get()");
			write("print(bt.WhLib().toString(result))");
			write("if not (result==True or result==False or result == None ) : ");
			rightShift();
			write("print(\"Son Equivalent en entier : \" , 	bt.WhLib().binTreeToInt(result))");
			leftShift();
		}
	}

	@Override
	protected void translate_function(QuadPair quad) {
		funcList.add(new Function_Python(quad.getWrite()));
	}

	@Override
	protected void translate_and(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = bt.WhLib().and_wh(" + quad.getRead1() + ","+ quad.getRead2() + ")");
	}

	@Override
	protected void translate_or(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = bt.WhLib().or_wh(" + quad.getRead1() + ","+ quad.getRead2() + ")");
	}

	@Override
	protected void translate_eq(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = bt.WhLib().isEqual(" + quad.getRead1() + ","+ quad.getRead2() + ")");

	}

	@Override
	protected void translate_pop(QuadPair quad, Function f) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void translate_call(QuadPair quad, Function f) {
		f.write(quad.getEtiquette() + "(inParams, outParams)");
		inMainFunction = false;
	}

	@Override
	//A supprimer
	protected void translate_list(QuadPair quad, Function f) {
		f.write("inParams.put("+ quad.getRead1()+")");
		f.write("inParams.put("+ quad.getRead2()+")");
		f.write(quad.getWrite() + " = bt.WhLib().list(inParams)");
	}

	@Override
	protected void translate_hd(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = bt.WhLib().hd("+ quad.getRead1() + ")");
	}

	@Override
	protected void translate_tl(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = bt.WhLib().tail("+ quad.getRead1() + ")");

	}

	@Override
	protected void translate_foreach(QuadPair quad, Function f) {
		// TODO Auto-generated method stub
		operatorManager(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);

		f.write("for " + quad.getRead2() + " in bt.WhLib().all_nodes("+ code.getCode3Addr().get(quad.getEtiquette()).getLast().getWrite() + ") : ");
		f.rightShift();
		operatorManager(code.getCode3Addr().get(quad.getRead1()).iterator(), f);
		//f.write(code.getCode3Addr().get(quad.getRead1()).getLast().getRead1() + " = "+ code.getCode3Addr().get(quad.getRead1()).getLast().getWrite());
		f.leftShift();
	}

	@Override
	protected void translate_if(QuadPair quad, Function f) {
		operatorManager(code.getCode3Addr().get(quad.getEtiquette()).iterator(), f);
		f.write("if bt.WhLib().isTrue("+ code.getCode3Addr().get(quad.getEtiquette()).getLast().getWrite() + ") : ");
		f.rightShift();
		//f.write("");
		operatorManager(code.getCode3Addr().get(quad.getRead1()).iterator(), f);
		f.leftShift();
		//On verifie l'exitance du else
		LinkedList<QuadPair> cmds2= code.getCode3Addr().get(quad.getRead2());
		if(cmds2 != null && quad.getRead2() != null ) {
			f.write("else : ");
			f.rightShift();
			operatorManager(code.getCode3Addr().get(quad.getRead2()).iterator(), f);
			f.leftShift();
		}
	}

	@Override
	protected void translate_while(QuadPair quadruplet, Function f) {
		// TODO Auto-generated method stub
		operatorManager(code.getCode3Addr().get(quadruplet.getEtiquette()).iterator(), f);
		f.write("while bt.WhLib().isTrue("+ code.getCode3Addr().get(quadruplet.getEtiquette()).getLast().getWrite() +") : " );
		f.rightShift();
		operatorManager(code.getCode3Addr().get(quadruplet.getRead1()).iterator(), f);
		operatorManager(code.getCode3Addr().get(quadruplet.getEtiquette()).iterator(), f);
		f.leftShift();
	}

	@Override
	protected void translate_for(QuadPair quadruplet, Function f) {
		// TODO Auto-generated method stub
		int numeroVarExpressionFor = Main.getInstance().getCount(); 
		operatorManager(code.getCode3Addr().get(quadruplet.getEtiquette()).iterator(), f);
		//Interpretation de l'expression du for en int
		f.write("Var"+ numeroVarExpressionFor+ " = bt.WhLib().binTreeToInt("+ code.getCode3Addr().get(quadruplet.getEtiquette()).getLast().getWrite() +") ");
		//Ecriture du for

		f.write("for i in range(0, "+"Var"+ numeroVarExpressionFor +") : ");
		f.rightShift();
		operatorManager(code.getCode3Addr().get(quadruplet.getRead1()).iterator(), f);
		operatorManager(code.getCode3Addr().get(quadruplet.getEtiquette()).iterator(), f);
		f.leftShift();
	}

	@Override
	protected void translate_not(QuadPair quad, Function f) {
		// TODO Auto-generated method stub
		f.write(quad.getWrite() + " = bt.WhLib().not_wh("+ quad.getRead1() + ")");
	}


}
