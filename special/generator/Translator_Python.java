package org.xtext.compilateur.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Translator_Python extends Translator {

	// Attributs
	private CodeIntermediaire code;
	//private StringBuilder stb = new StringBuilder();
	//private int k = 0;
	private List<Function_Python> funcList = new ArrayList<Function_Python>();
	//private List<String> reads = new ArrayList<String>();
	//private boolean inMainFunction = true;
	//private int nbWrites = 0;
	//private String nameMainFonction;
	
	// Imports
	private final static String imports = "import BinTree as bt";

	// Variables globales utiles
//	private final static String newLine = "\n";
//	private final static String tab = "\t";

	public Translator_Python(CodeIntermediaire code) {
		super(code);
		this.code = code;
	}
	
	public void iterateCode() {
		iterateCode("L" + (code.getSize()-1));
	
	}
	
	private void iterateCode(String string) {
		HashMap<String, LinkedList<QuadPair>> map = code.getCode3Addr();
		 LinkedList<QuadPair> list = map.get(string);
		Iterator<QuadPair> it = list.iterator();
		QuadPair q = it.next();
		String Opname = q.getWrite();
		Function_Python f = new Function_Python(Opname);
		this.funcList.add(f);
		// Autres choses à ajouter, voir la classe
		operatorManager(it, f);
	}

	public  void translate() {
		
		write(imports);
		newLine();
		
		writeSymbs();
		
		iterateCode();
		
		writeFunction();
		CodePrincipal();
	}

	@Override
	protected void translate_affectation(QuadPair quad, Function f) {
		f.write(quad.getWrite() + " = "+ quad.getRead1());
	}

	@Override
	protected void translate_nop(Function f) {
		f.write("pass");
	}

	protected void writeFunction() {
		for(Iterator<Function_Python> iterator = funcList.iterator(); iterator.hasNext();) {
			Function_Python pf = (Function_Python) iterator.next();
			pf.printFunction(this);
		}
	}
	
	@Override
	protected void writeSymbs() {
		write(" # Les symboles utilisés dans le code while");
		write("nil = bt(\"None\", None, None)");
		Fonction.getInstance().getVars_local().forEach((key, value) -> {
			write("" + key + " = bt(\"" + key + "\", None, None)");
		});
		write("");
	}
	
	
	public void CodePrincipal() {
		Iterator<String> itR = reads.iterator();
		write("");
		while(itR.hasNext()) {
			String it = itR.next();
			write("" + it + " = bt(\""+it+"\", None, None)");
			write("inParams.append( "+ it + " )");
		}
		for(int i = 0; i < reads.size(); i++) {
			write("resTree = outParams[0]");
			write("del outParams[0]");
		}
		
		
	}
	// source : https://github.com/Kapcash/Compilation/blob/master/esir.compilation/src/sprint3/CS_Translator3.java

	
}
