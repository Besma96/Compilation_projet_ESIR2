#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilisés dans le programme while


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While
	A = binTree()
	B = binTree()
	X = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilisées par le compiler
	Var0 = binTree()
	Var1 = binTree()
	Var2 = binTree()
	Var3 = binTree()
	
	X = inputP.get()
	O = inputP.get()
	Var0 = B
	Var1 = X
	A = Var0
	Z = Var1
	Var2 = bt.WhLib().cons(inParams)
	Var3 = Var2
	K = Var3
	bt.WhLib().nop()
	bt.WhLib().nop()
	outputP.put(X);
	outputP.put(K);
	outputP.put(Z);

	 #Le corps de la fonction qui doit être appelée dans le programme principal

########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	X = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(X)
else : 
	X = binTree()
	inParams.put(X)
if(len(sys.argv) > 2) : 
	O = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(O)
else : 
	O = binTree()
	inParams.put(O)

F0(inParams, outParams)

 #Affichage des paramètres de sortie
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))

