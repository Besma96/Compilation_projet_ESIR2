package org.xtext.compilateur.generator;

import java.util.ArrayList;
import java.util.List;

public class Code3Address {
	
	private List<Quadruplet>listcode;
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
		String result="";
		for(int i=0;i<this.getSize();i++) {
			result+=this.listcode.get(i).toString()+"\n";
		}
		return result;
	}
			
}
