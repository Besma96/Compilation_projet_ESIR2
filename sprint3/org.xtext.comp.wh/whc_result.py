#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilisés dans le programme while
nil = binTree()


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : p
	Q = binTree()
	B = binTree()
	Z = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : p
	
	 #Variables utilisées dans le code While de la fonction : test
	nil = binTree()
	X = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	
	X = inputP.get()
	O = inputP.get()
	inParams.put(nil)
	inParams.put(nil)
	print(inParams.qsize())
	Var0 = bt.WhLib().cons(inParams)
	Var1 = Var0
	K = Var1
	bt.WhLib().nop()
	bt.WhLib().nop()
	outputP.put(X);
	outputP.put(K);
	outputP.put(Z);

	 #Le corps de la fonction qui doit être appelée dans le programme principal

def F1(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : p
	Q = binTree()
	B = binTree()
	Z = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : p
	
	 #Variables utilisées dans le code While de la fonction : test
	nil = binTree()
	X = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	
	B = inputP.get()
	Z = inputP.get()
	bt.WhLib().nop()
	outputP.put(Q);

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
if(len(sys.argv) > 3) : 
	B = bt.WhLib().intToBinTree(int(sys.argv[3]))
	inParams.put(B)
else : 
	B = binTree()
	inParams.put(B)
if(len(sys.argv) > 4) : 
	Z = bt.WhLib().intToBinTree(int(sys.argv[4]))
	inParams.put(Z)
else : 
	Z = binTree()
	inParams.put(Z)

F1(inParams, outParams)

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
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))

