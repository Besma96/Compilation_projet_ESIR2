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
	Q = binTree()
	A = binTree()
	DA = binTree()
	SA = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var1 = binTree()
	Var2 = binTree()
	
	DA = inputP.get()
	SA = inputP.get()
	Var1 = bt.WhLib().cons(DA,Q)
	Var2 = Var1
	A = Var2
	bt.WhLib().nop()
	outputP.put(A);
	outputP.put(SA);


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	DA = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(DA)
else : 
	DA = binTree()
	inParams.put(DA)
if(len(sys.argv) > 2) : 
	SA = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(SA)
else : 
	SA = binTree()
	inParams.put(SA)

F0(inParams, outParams)

 #Affichage des paramètres de sortie
result = outParams.get()
print(bt.WhLib().toString(result))
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(bt.WhLib().toString(result))
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
