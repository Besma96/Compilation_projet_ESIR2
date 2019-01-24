#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilisés dans le programme while


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : main
	A = bt.WhLib().cons(None, None)
	B = bt.WhLib().cons(None, None)
	C = bt.WhLib().cons(None, None)
	T = bt.WhLib().cons(None, None)
	F = bt.WhLib().cons(None, None)
	G = bt.WhLib().cons(None, None)
	X = bt.WhLib().cons(None, None)
	Y = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var1 = bt.WhLib().cons(None, None)
	Var2 = bt.WhLib().cons(None, None)
	Var3 = bt.WhLib().cons(None, None)
	Var5 = bt.WhLib().cons(None, None)
	Var6 = bt.WhLib().cons(None, None)
	Var8 = bt.WhLib().cons(None, None)
	Var9 = bt.WhLib().cons(None, None)
	Var10 = bt.WhLib().cons(None, None)
	
	X = inputP.get()
	Y = inputP.get()
	Var1 = bt.WhLib().cons(F,G)
	Var2 = bt.WhLib().cons(T,Var1)
	inParams.put(X)
	F1(inParams, outParams)
	Var3 = outParams.get()
	Var5 = bt.WhLib().cons(Var3,Var2)
	Var6 = Var5
	A = Var6
	Var8 = bt.WhLib().cons(B,C)
	Var9 = bt.WhLib().cons(A,Var8)
	Var10 = Var9
	B = Var10
	bt.WhLib().nop()
	outputP.put(A)


def F1(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : autre
	A = bt.WhLib().cons(None, None)
	B = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : autre
	
	A = inputP.get()
	B = inputP.get()
	bt.WhLib().nop()
	outputP.put(A)


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
