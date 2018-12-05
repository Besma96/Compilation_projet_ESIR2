package org.xtext.compilateur.generator;

public class Function {
	String name;
	protected String Inparams;
	protected String type_returns;
	protected StringBuilder body;
	protected int k = 2;
	private final static String newLine = "\n";
	private final static String tab = "\t";

	public Function(String name) {
		this.name = name;
		body = new StringBuilder();
	}

	void write(String s) {
		tab(k);
		body.append(s);
		newLine();
	}
	
	private void tab(int j) {
		for (int i = 0; i < j; i++) {
			tab();
		}
	}

	private void tab() {
		body.append(tab);
	}

	protected void newLine() {
		body.append(newLine);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getParams() {
		return Inparams;
	}

	public void setParams(String params) {
		this.Inparams = params;
	}

	public String getReturns() {
		return type_returns;
	}

	public void setReturns(String returns) {
		this.type_returns = returns;
	}

	public StringBuilder getBody() {
		return body;
	}

	public void setBody(StringBuilder body) {
		this.body = body;
	}

	void leftShift() {
		k--;
	}

	void rightShift() {
		k++;
	}
}



