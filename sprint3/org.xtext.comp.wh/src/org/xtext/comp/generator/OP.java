package org.xtext.comp.generator;

public enum OP {
	NOP, 
	//Structure de controle
	IF, ELSE, 
	//Boucle
	WHILE, FOR, FOREACH,
	//Declaration
	DECL,
	//Affectation
	AFF,
	//Definition fonction
	FUN, READ, WRITE,
	//Expression
	CONS, HD, TL, LIST,
	//Expression booleennes
	AND, OR, EQ, NOT,
	//Appel de fonction
	CALL
}
