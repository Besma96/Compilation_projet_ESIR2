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
	A = binTree()
	Var1 = binTree()
	Var2 = binTree()
	C = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var0 = binTree()
	Var3 = binTree()
	
	Var1 = inputP.get()
	Var0 = Var2
	A = Var0
	Var1 = A
	C = Var1
	while bt.WhLib().isTrue(C) : 
		bt.WhLib().nop()
		Var2 = A
		C = Var2
		while bt.WhLib().isTrue(A) : 
			Var3 = C
			A = Var3
	bt.WhLib().nop()
	outputP.put(Var1);
	outputP.put(A);


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	Var1 = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(Var1)
else : 
	Var1 = binTree()
	inParams.put(Var1)

F0(inParams, outParams)

 #Affichage des paramètres de sortie
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
