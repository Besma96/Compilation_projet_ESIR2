package org.xtext.compilateur.generator;

public class Quadruplet {

//	private static OP ope; //opérateur
//	private static String write; // adresse d'écriture
//
//	//adresses de lecture
//	private static String read1;
//	private static String read2;
	
	private OP ope; //opérateur
	private String write; // adresse d'écriture

	//adresses de lecture
	private String read1;
	private String read2;

	public Quadruplet(OP ope, String write, String r1, String r2) {
		this.ope = ope; 
		this.write = write;
		this.read1 = r1;
		this.read2 = r2;
	}

	public OP getOpe() {
		return this.ope;
	}
	
	public void setOpe(OP op) {
		this.ope = op;
	}

	public String getWrite() {
		return this.write;
	}
	
	public void setWrite(String write) {
		this.write = write;
	}

	public String getRead1() {
		return this.read1;
	}
	
	public void setRead1(String r1) {
		this.read1 = r1;
	}

	public String getRead2() {
		return this.read2;
	}

	public void setRead2(String r2) {
		this.read2 = r2;	
	}
	public String toString() {
		StringBuilder str = new StringBuilder();
		return str.append("<" + ope + " , " + write + " , " + read1 + " , " + read2 +">").toString();
	}

}


