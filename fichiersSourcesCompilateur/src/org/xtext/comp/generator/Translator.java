package org.xtext.comp.generator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	private String nameMainFonction;

	protected boolean inMainFunction = true; // permet de savoir si quelue chose est dans le main

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
	protected abstract void writeSymbs();
	protected abstract void writeFunction();
	protected void operatorManager(Iterator<QuadPair> it, Function_Python f) {
		while(it.hasNext()) {
			QuadPair quadruplet = it.next();

			switch(quadruplet.getOpe().getOpe()) {
			case READ:
				f.write(""+ quadruplet.getWrite() + " = inputP.get()"); // on récupère l'élément de tête
				if(inMainFunction) {
					reads.add(quadruplet.getWrite());
				}
				break;

			case WRITE:
				nbWrites++;
				f.write("outputP.put(" + quadruplet.getWrite() + ");");
				if(inMainFunction || f.name.equals(nameMainFonction)){
					inMainFunction=true;
				}

				break;
			case NOP:
				translate_nop(f);
				break;

			case AFF:
				translate_affectation(quadruplet, f);
				break;

			case AND:
				break;

			case CALL:
				break;

			case CONS:
				translate_cons(quadruplet, f);
				break;

			case DECL:
				break;

			case ELSE:
				break;

			case EQ:
				break;

			case FOR:
				break;

			case FOREACH:
				break;

			case FUN:
					translate_function(quadruplet);
//					funcList.add(new Function_Python(quadruplet.getWrite()));
				break;

			case HD:
				break;

			case IF:
				break;

			case LIST:
				break;

			case NOT:
				break;

			case OR:
				break;

			case TL:
				break;

			case WHILE:
				break;

			default:
				break;
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


}
