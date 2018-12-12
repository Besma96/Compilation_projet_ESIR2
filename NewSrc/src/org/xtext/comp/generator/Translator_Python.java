package org.xtext.comp.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.xtext.comp.generator.Translator;

public class Translator_Python extends Translator {
	
	private String nameMainFonction;
	private CodeIntermediaire code;
	private List<Function_Python> funcList = new ArrayList<Function_Python>();
	private final static String imports = "#-*- coding:utf-8 -*\nfrom binTree import * \nimport WhLib as bt\nimport sys \nimport queue as queue";
	private final static String partieMain = "########## Partie main ############";
	public Translator_Python(CodeIntermediaire code) {
		super(code);
		this.code = code;
	}
	
	public void iterateCode() {
		iterateCode("F" + (code.getSize()-1));
	
	}
	
	private void iterateCode(String string) {
		HashMap<String, LinkedList<QuadPair>> map = code.getCode3Addr();
		 LinkedList<QuadPair> list = map.get(string);
		Iterator<QuadPair> it = list.iterator();
		QuadPair q = it.next();
		String Opname = q.getWrite();
		//System.out.println("Opname : "+Opname);
		Function_Python f = new Function_Python(Opname);
		this.funcList.add(f);
		if(inMainFunction) {
			nameMainFonction = q.getWrite();
		}
		// Autres choses à ajouter, voir la classe
		operatorManager(it, f);
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
//		f.write(quad.getWrite() + " = bt(\""+ quad.getRead1()+"\", None, None)");
		f.write(quad.getWrite() + " = " +quad.getRead1());

	}

	@Override
	protected void translate_nop(Function f) {
		//f.write("bt.nop()");
		f.write("bt.WhLib().nop()");
	}
	
	@Override
	protected void translate_cons(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = bt.WhLib().cons(inParams)");
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
			write(key + " = binTree()");
			System.out.println("Symbole : "+key);
		});
		write("");
	}
	
	
	public void CodePrincipal() {
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
				write("" + s+ " = binTree()" );
				write("inParams.put("+ s + ")");
				leftShift();
				nbParams++;
			}
		
			newLine();
			write(nameMainFonction + "(inParams, outParams)");
			newLine();
			System.out.println("Suis avant le for et nbwrites vaut : "+nbWrites);
			write(" #Affichage des paramètres de sortie");
		for(int i = 0; i <nbWrites; i++) {
			write("result = outParams.get()");
			write("print(result)");
			write("print(\"Son Equivalent en entier : \" , 	bt.WhLib().binTreeToInt(result))");
		}
		
		
	}

	
}
