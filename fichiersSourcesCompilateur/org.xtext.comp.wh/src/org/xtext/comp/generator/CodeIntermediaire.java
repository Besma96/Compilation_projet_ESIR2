package org.xtext.comp.generator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Stack;

import org.xtext.comp.generator.OP;
import org.xtext.comp.generator.OPCode;
import org.xtext.comp.generator.QuadPair;

//import test_classes.Generator3Address;

public class CodeIntermediaire {


	private HashMap<String, LinkedList<QuadPair>> code3Addr = new HashMap<String, LinkedList<QuadPair>>();
	private Stack<LinkedList<QuadPair>> stack = new Stack<LinkedList<QuadPair>>();

	private String getEtiquetteName(int i) {
		return "L" + i;
	}

	///Essai de labelisation des structures de controles

	public int getSize(){
		return code3Addr.size();
	}

	//TOUT SUR LES ETIQUETTES

	public String getEtiquette() {
		return getEtiquetteName(code3Addr.size());
	}

	public String getFutureEtiquette() {
		return getEtiquetteName(code3Addr.size() + 1);
	}

	public String getPreviousEtiquette() {
		return getEtiquetteName(code3Addr.size() - 1);
	}

	public void nouvelleEtiquette() {
		stack.push(new LinkedList<QuadPair>());
	}

	public void finEtiquette() {
		code3Addr.put(getEtiquette(), stack.pop());
	}

	//TOUT SUR LE CODE 3@

	public void addIn3Addr(QuadPair q) {
		stack.lastElement().addLast(q);
	}

	public void addIn3Addr(OP op, String label, String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(new QuadPair(new OPCode<OP, String>(op, label), writeAddr, readAddr1, readAddr2));
	}

	//GENERAL

	public void fun(String writeAddr){
		addIn3Addr(OP.FUN, "", writeAddr, "","");
	}

	public void read(String writeAddr){
		addIn3Addr(OP.READ, "", writeAddr, "","");
	}

	public void write(String writeAddr){
		addIn3Addr(OP.WRITE, "", writeAddr, "","");
	}

	public void decl(String writeAddr){
		addIn3Addr(OP.DECL, "", writeAddr, "","");
	}

	public void aff(String writeAddr, String readAddr){
		addIn3Addr(OP.AFF, "", writeAddr, readAddr,"");
	}

	//NATIVE FUNCTION

	public void hd(String writeAddr, String readAddr){
		addIn3Addr(OP.HD, "", writeAddr, readAddr,"");
	}

	public void tl(String writeAddr, String readAddr){
		addIn3Addr(OP.TL, "", writeAddr, readAddr,"");
	}

	public void cons(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.CONS, "", writeAddr, readAddr1,readAddr2);
	}

	public void list(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.LIST, "", writeAddr,readAddr1,readAddr2);
	}

	//LOGIC

	public void not(String writeAddr, String readAddr){
		addIn3Addr(OP.NOT, "", writeAddr, readAddr,"");
	}

	public void and(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.AND, "", writeAddr, readAddr1, readAddr2);
	}

	public void or(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.OR, "", writeAddr, readAddr1, readAddr2);
	}

	public void eq(String writeAddr, String readAddr1, String readAddr2){
		addIn3Addr(OP.EQ, "", writeAddr, readAddr1, readAddr2);
	}

	//FUNCTION

	public void call(String label){
		addIn3Addr(OP.CALL, label, "","","");
	}
	public void push(String readAddr) {
		addIn3Addr(OP.PUSH, "", "",readAddr,"");
	}

	public void pop(String writeAddr) {
		addIn3Addr(OP.POP, "", writeAddr,"","");
	}

	public void nop() {
		addIn3Addr(OP.NOP, "_", "_","_","_");
	}

	//LOOPS
	public void whileLoop(String condition, String body){
		addIn3Addr(OP.WHILE, condition, "", body, "");
	}

	public void forLoop(String condition, String body){
		addIn3Addr(OP.FOR, condition, "", body, "");
	}

	//	public void forEachLoop(String condition, String body){
	//		addIn3Addr(OP.FOREACH, condition, "", body,"");
	//	}
	public void forEachLoop(String expression, String body, String Variable){
		addIn3Addr(OP.FOREACH, expression, "", body, Variable);
	}

	//CONDITION
	public void ifCond(String condition, String body){
		ifElseCond(condition,body,"");
	}

	public void ifElseCond(String condition, String bodyIf, String bodyElse){
		addIn3Addr(OP.IF, condition, "", bodyIf, bodyElse);
	}


	public HashMap<String, LinkedList<QuadPair>> getCode3Addr() {
		return code3Addr;
	}

	public void setCode3Addr(HashMap<String, LinkedList<QuadPair>> code3Addr) {
		this.code3Addr = code3Addr;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<java.util.Map.Entry<String, LinkedList<QuadPair>>> iter = code3Addr.entrySet().iterator();
		while (iter.hasNext()) {
			java.util.Map.Entry<String, LinkedList<QuadPair>> entry = iter.next();

			sb.append(entry.getKey() + ":\t");
			Iterator<QuadPair> iter2 = entry.getValue().iterator();
			if (iter2.hasNext()) {
				sb.append(iter2.next() + "\n");
			}
			while (iter2.hasNext()) {
				sb.append("\t" + iter2.next().toString() + "\n");
			}

			if (iter.hasNext()) {
				sb.append('\n');
			}
		}
		return sb.toString();
	}
}