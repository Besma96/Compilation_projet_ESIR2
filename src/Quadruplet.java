package sprint2;

public class Quadruplet {

	private static Op ope; //opérateur
	private static String write; // adresse d'écriture
	
	//adresses de lecture
	private static String read1;
	private static String read2;
	
	public Quadruplet(Op ope, String write, String r1, String r2) {
		this.ope = ope; 
		this.write = write;
		this.read1 = r1;
		this.read2 = r2;
	}
	
	public Op getOpe() {
		return this.ope;
	}
	
	public String getWrite() {
		return this.write;
	}
	
	public String getRead1() {
		return this.read1;
	}
	
	public String getRead2() {
		return this.read2;
	}
	
	public String toString() {
		return new String("<" + ope + ", " + write + ", " + read1 + ", " + read2 +">");
	}
	
	public void nop() {
		
	}
	
}
