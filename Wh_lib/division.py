#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue 
import re

 # Les symboles utilisés dans le programme while
nil = bt.WhLib().cons()


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : main
	nil = bt.WhLib().cons()
	A = bt.WhLib().cons()
	Q = bt.WhLib().cons()
	B = bt.WhLib().cons()
	R = bt.WhLib().cons()
	C = bt.WhLib().cons()
	S = bt.WhLib().cons()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var13 = bt.WhLib().cons()
	Var24 = bt.WhLib().cons()
	Var0 = bt.WhLib().cons()
	Var12 = bt.WhLib().cons()
	Var15 = bt.WhLib().cons()
	Var26 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	Var25 = bt.WhLib().cons()
	Var3 = bt.WhLib().cons()
	Var17 = bt.WhLib().cons()
	Var16 = bt.WhLib().cons()
	Var27 = bt.WhLib().cons()
	Var5 = bt.WhLib().cons()
	Var6 = bt.WhLib().cons()
	Var18 = bt.WhLib().cons()
	Var20 = bt.WhLib().cons()
	Var22 = bt.WhLib().cons()
	Var10 = bt.WhLib().cons()
	Var21 = bt.WhLib().cons()
	Var7 = bt.WhLib().cons()
	Var8 = bt.WhLib().cons()
	Var9 = bt.WhLib().cons()
	
	A = inputP.get()
	B = inputP.get()
	Var0 = A
	R = Var0
	Var2 = bt.WhLib().cons("nil","nil")
	Var3 = Var2
	C = Var3
	Varfor0 = bt.WhLib().binTreeToInt(B) 
	for i in range(0, Varfor0) : 
		Var5 = bt.WhLib().cons("nil",S)
		Var6 = Var5
		S = Var6
		Var7 = bt.WhLib().isEqual(S,R)
		if bt.WhLib().isTrue(Var7) : 
			Var8 = nil
			C = Var8
	Var9 = bt.WhLib().isEqual(R,B)
	if bt.WhLib().isTrue(Var9) : 
		Var10 = nil
		R = Var10
		Var12 = bt.WhLib().cons("nil","nil")
		Var13 = Var12
		Q = Var13
	while bt.WhLib().isTrue(C) : 
		Var15 = bt.WhLib().cons("nil",Q)
		Var16 = Var15
		Q = Var16
		Varfor1 = bt.WhLib().binTreeToInt(B) 
		for i in range(0, Varfor1) : 
			Var17 = bt.WhLib().tail(R)
			Var18 = Var17
			R = Var18
		Var20 = bt.WhLib().cons("nil","nil")
		Var21 = Var20
		C = Var21
		Var22 = nil
		S = Var22
		Varfor2 = bt.WhLib().binTreeToInt(B) 
		for i in range(0, Varfor2) : 
			Var24 = bt.WhLib().cons("nil",S)
			Var25 = Var24
			S = Var25
			Var26 = bt.WhLib().isEqual(S,R)
			if bt.WhLib().isTrue(Var26) : 
				Var27 = nil
				C = Var27
	outputP.put(R)
	outputP.put(Q)


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	A = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(A)
else : 
	A = bt.WhLib().cons()
	inParams.put(A)
if(len(sys.argv) > 2) : 
	B = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(B)
else : 
	B = bt.WhLib().cons()
	inParams.put(B)

F0(inParams, outParams)

 #Affichage des paramètres de sortie
result = outParams.get()
if not (result==True or result==False or result == None ) : 
	resultInt = bt.WhLib().binTreeToInt(result) 
	if resultInt < 250 : 
		print(bt.WhLib().toString(result))
	else : 
		print("Arbre trop grand pour l'affichage")
	print("Son Equivalent en entier : " , 	resultInt)
else : 
	print("Son Equivalent en boolean : " , 	result)
result = outParams.get()
if not (result==True or result==False or result == None ) : 
	resultInt = bt.WhLib().binTreeToInt(result) 
	if resultInt < 250 : 
		print(bt.WhLib().toString(result))
	else : 
		print("Arbre trop grand pour l'affichage")
	print("Son Equivalent en entier : " , 	resultInt)
else : 
	print("Son Equivalent en boolean : " , 	result)
