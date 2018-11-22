package org.xtext.compilateur.generator;

public class Code3Address {
	private OP operator;
	private String s1;
	private String s2;
	private String s3;
	
		public Code3Address(OP operator,String s1,String s2,String s3)
		{
			this.operator=operator;
			this.s1=s1;
			this.s2=s2;
			this.s3=s3;
		}
		
	public OP getOperator() {
		return this.operator;
	}
	
	public String getFirstArg() {
		return this.s1;
	}
	public String getSecondArg() {
		return this.s2;
	}
	public String getThirdArg() {
		return this.s3;
	}
	
	@Override
	public String toString() {
		return "";
		
	}
}
