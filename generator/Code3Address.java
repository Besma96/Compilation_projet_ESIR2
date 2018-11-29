package org.xtext.compilateur.generator;

import java.util.ArrayList;
import java.util.List;
import org.xtext.compilateur.generator.Quadruplet;

public class Code3Address {

	private List<Quadruplet> listcode;
	private int nbElements;
	public Code3Address()
	{
		listcode=new ArrayList<Quadruplet>();
		nbElements=0;
	}

	public void Add(Quadruplet q) {
		listcode.add(q);
		nbElements+=1;
	}
	public void Remove(Quadruplet q) {
		listcode.remove(q);
		nbElements--;
	}
	public Quadruplet getQuadruplet(int index) {
		return listcode.get(index);
	}
	public int getSize() {
		return nbElements;
	}
	
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<this.getSize();i++) {
			result.append(this.listcode.get(i).toString()+"\n");
		}
		//System.out.println("Code 3 @ : "+result.toString()	);
		return result.toString();
	}

}
