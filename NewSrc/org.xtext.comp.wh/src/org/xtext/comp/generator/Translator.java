package org.xtext.comp.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Classe qui permet de traduire un code 3 adresse en code python
 * @author Barry
 *
 */
public abstract class Translator {

	protected List<Function_Python> funcList = new ArrayList<Function_Python>();
	protected CodeIntermediaire code;
	private StringBuilder stb = new StringBuilder();
	private int numberTabulation = 0;
	protected int nbWrites = 0;
	protected List<String> reads = new ArrayList<String>();

	protected boolean inMainFunction = true; // permet de savoir si les éléments concernés sont dans le main du While
	private final static String newLine = "\n";
	private final static String tab = "\t";

	public Translator(CodeIntermediaire code) {
		this.code = code;
	}

	public abstract void translate();

	protected abstract void translate_affectation(QuadPair quad, Function f);
	protected abstract void translate_function(QuadPair quad);
	protected abstract void translate_nop(Function f);
	protected abstract void translate_cons(QuadPair quad, Function f) ;
	protected abstract void translate_and(QuadPair quad, Function f);

	protected abstract void translate_or(QuadPair quad, Function f);

	protected abstract void translate_eq(QuadPair quad, Function f);

	protected abstract void translate_pop(QuadPair quad, Function f);

	protected abstract void translate_call(QuadPair quad, Function f);
	protected abstract void translate_list(QuadPair quad, Function f);

	protected abstract void translate_hd(QuadPair quad, Function f);

	protected abstract void translate_tl(QuadPair quad, Function f);
	protected abstract void translate_foreach(QuadPair quad, Function f);
	protected abstract void translate_if(QuadPair quad, Function f);
	protected abstract void translate_while(QuadPair quadruplet, Function f);
	protected abstract void translate_for(QuadPair quadruplet, Function f);
	protected abstract void translate_not(QuadPair quad, Function f);
	protected abstract void translate_push(QuadPair quad, Function f) ;


	protected abstract void writeSymbs();
	protected abstract void writeFunction();
	
	protected boolean isInMainFunction(Function f) {
		String nam = f.getName(); //correspond au nom de l'etiquette correspondant au nom de la fonction
		Map<String, String> map = Main.getInstance().getEtiquettesFunctions();
		
		if(map.get(nam).equals("main"))
			return true;
		return false;
	}
	
	protected void operatorManager(Iterator<QuadPair> it, Function f) {
		if(it != null) {
			while(it.hasNext()) {
				QuadPair quadruplet = it.next();

				switch(quadruplet.getOpe().getOpe()) {
				case READ:
					f.write(""+ quadruplet.getWrite() + " = inputP.get()"); // on récupère l'élément de tête
					if(isInMainFunction(f)) {
						reads.add(quadruplet.getWrite());
					}
					break;

				case WRITE:
					f.write("outputP.put(" + quadruplet.getWrite() + ")");
					if(isInMainFunction(f)) {
						nbWrites++;
					}
					break;
				case NOP:
					translate_nop(f);
					break;

				case AFF:
					translate_affectation(quadruplet, f);
					break;

				case AND:
					translate_and(quadruplet, f);
					break;

				case CALL:
					translate_call(quadruplet, f);
					break;

				case CONS:
					translate_cons(quadruplet, f);
					break;

				case DECL:
					break;

				case EQ:
					translate_eq(quadruplet, f);
					break;

				case FOR:
					translate_for(quadruplet, f);
					break;

				case FOREACH:
					translate_foreach(quadruplet, f);
					break;

				case FUN:
					translate_function(quadruplet);
					break;

				case HD:
					translate_hd(quadruplet, f);
					break;

				case IF:
					translate_if(quadruplet, f);
					break;

				case LIST:
					translate_list(quadruplet, f);
					break;

				case NOT:
					translate_not(quadruplet, f);
					break;

				case OR:
					translate_or(quadruplet, f);
					break;

				case TL:
					translate_tl(quadruplet, f);
					break;

				case WHILE:
					translate_while(quadruplet, f);
					break;
				case PUSH:
					translate_push(quadruplet, f);
					break;
				case POP:
					translate_pop(quadruplet, f);
					break;

				default:
					break;
				}

			}
		}
	}


	protected  void write(String s) {
		tab(numberTabulation);
		stb.append(s);
		newLine();
	}

	protected void write2(String s) {
		tab(numberTabulation);
		stb.append(s);
		newLine();
	}

	protected void newLine() {
		stb.append(newLine);
	}

	private void tab(int j) {
		for (int i = 0; i < j; i++) {
			tab();
		}
	}

	private void tab() {
		stb.append(tab);
	}

	protected void leftShift() {
		numberTabulation--;
	}

	protected void rightShift() {
		numberTabulation++;
	}

	@Override
	public String toString() {
		return stb.toString();
	}

	public List<Function_Python> getListFunctionsPython(){
		return this.funcList;
	}


}
