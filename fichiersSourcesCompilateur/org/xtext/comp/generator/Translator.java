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

	protected abstract void translate_nop(Function f);
	protected abstract void translate_cons(QuadPair quad, Function f) ;
	protected abstract void writeSymbs();

	protected void operatorManager(Iterator<QuadPair> it, Function_Python f) {
		while(it.hasNext()) {
			QuadPair quadruplet = it.next();

			switch(quadruplet.getOpe().getOpe()) {
			case READ:
				
				f.write(""+ quadruplet.getWrite() + " = input.get()"); // on récupère l'élément de tête
				if(inMainFunction) {
					reads.add(quadruplet.getWrite());
				}
				break;

			case WRITE:
				nbWrites++;
				f.write("output.put(" + quadruplet.getWrite() + ");");
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

	protected void write(String s) {
		tab(numberTabulation);
		stb.append(s);
		newLine();
	}

	protected void write2(String s) {
		stb.append(s);
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
