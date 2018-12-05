package org.xtext.compilateur.generator;

import java.util.ArrayList;
import java.util.List;
import org.xtext.compilateur.generator.Quadruplet;

public class Code3Address {

	private List<Quadruplet> listcode;
//	private int nbElements;
	public Code3Address()
	{
		listcode=new ArrayList<Quadruplet>();
//		nbElements=0;    
	}

	public void Add(Quadruplet q) {
		listcode.add(q);
//		nbElements+=1;
	}
	public void Remove(Quadruplet q) {
		listcode.remove(q);
//		nbElements--;
	}
	public Quadruplet getQuadruplet(int index) {
		return listcode.get(index);
	}
	public int getSize() {
		return this.listcode.size();
	}
	
	public List<Quadruplet> getCode3Addr(){
		return this.listcode;
	}
	
	public void read(String writeAddr) {
		listcode.add(new Quadruplet(OP.READ, writeAddr, "", ""));
	}
	
	public void write(String writeAddr) {
		listcode.add(new Quadruplet(OP.WRITE, writeAddr, "", ""));
	}
	
	public void declaration(String writeAddr) {
		listcode.add(new Quadruplet(OP.DECL, writeAddr, "", ""));
	}
	
	public void affectation(String writeAddr, String readAddr) {
		listcode.add(new Quadruplet(OP.AFF, writeAddr, readAddr, ""));
		System.out.println();
	}

	
	public void hd(String writeAddr, String readAddr) {
		listcode.add(new Quadruplet(OP.HD, writeAddr, readAddr, ""));
	}
	
	public void tl(String writeAddr, String readAddr) {
		listcode.add(new Quadruplet(OP.TL, writeAddr, readAddr, ""));
	}
	
	public void cons(String writeAddr) {
		listcode.add(new Quadruplet(OP.CONS, writeAddr, "", ""));
	}
	
	public void list(String writeAddr) {
		listcode.add(new Quadruplet(OP.LIST, writeAddr, "", ""));
	}
	
	// LOGIC
	
	public void not(String writeAddr, String readAddr) {
		listcode.add(new Quadruplet(OP.NOT, writeAddr, readAddr, ""));
	}
	
	public void and(String writeAddr, String readAddr1, String readAddr2) {
		listcode.add(new Quadruplet(OP.AND, writeAddr, readAddr1, readAddr2));
	}
	
	public void or(String writeAddr, String readAddr1, String readAddr2) {
		listcode.add(new Quadruplet(OP.OR, writeAddr, readAddr1, readAddr2));
	}
	
	public void eq(String writeAddr, String readAddr1, String readAddr2) {
		listcode.add(new Quadruplet(OP.EQ, writeAddr, readAddr1, readAddr2));
	}
	

	public void nop() {
		listcode.add(new Quadruplet(OP.NOP, "_", "_", "_"));
	}
	
	// les boucles à venir : voir sur git le projet https://github.com/Kapcash/Compilation/blob/master/esir.compilation/src/sprint2/ThreeAddressCode.java
	
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<this.listcode.size();i++) {
			result.append(this.listcode.get(i).toString()+"\n");
		}
		System.out.println("Code 3 @ : "+result.toString()	);
		return result.toString();
	}

}
