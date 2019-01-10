#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilisés dans le programme while
nil = bt.WhLib().cons(None, None)


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : main
	nil = bt.WhLib().cons(None, None)
	C = bt.WhLib().cons(None, None)
	S = bt.WhLib().cons(None, None)
	X = bt.WhLib().cons(None, None)
	Y = bt.WhLib().cons(None, None)
	Z = bt.WhLib().cons(None, None)
	L = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var1 = bt.WhLib().cons(None, None)
	Var2 = bt.WhLib().cons(None, None)
	Var4 = bt.WhLib().cons(None, None)
	Var5 = bt.WhLib().cons(None, None)
	Var7 = bt.WhLib().cons(None, None)
	Var8 = bt.WhLib().cons(None, None)
	Var9 = bt.WhLib().cons(None, None)
	
	X = inputP.get()
	Y = inputP.get()
	Z = inputP.get()
	Var1 = bt.WhLib().cons(nil,nil)
	Var2 = bt.WhLib().cons(nil,Var1)
	for C in bt.WhLib().all_nodes(Var2) : 
		Var4 = bt.WhLib().cons(nil,C)
		Var5 = Var4
		S = Var5
	Var7 = bt.WhLib().cons(Y,Z)
	Var8 = bt.WhLib().cons(X,Var7)
	Var9 = Var8
	L = Var9
	outputP.put(X)
	outputP.put(Y)
	outputP.put(Z)
	outputP.put(L)
	outputP.put(S)


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	X = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(X)
else : 
	X = bt.WhLib().cons(None, None)
	inParams.put(X)
if(len(sys.argv) > 2) : 
	Y = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(Y)
else : 
	Y = bt.WhLib().cons(None, None)
	inParams.put(Y)
if(len(sys.argv) > 3) : 
	Z = bt.WhLib().intToBinTree(int(sys.argv[3]))
	inParams.put(Z)
else : 
	Z = bt.WhLib().cons(None, None)
	inParams.put(Z)

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
