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
	B = binTree()
	Var2 = binTree()
	C = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var0 = binTree()
	Var3 = binTree()
	Var4 = binTree()
	Var5 = binTree()
	Var6 = binTree()
	Var7 = binTree()
	
	Var1 = inputP.get()
	Var0 = Var2
	A = Var0
	Var1 = A
	C = Var1
	Var2 = bt.WhLib().cons(A,B)
	for i in Var2 : 
		C = Var2
		Var3 = B
		A = Var3
		Var3 = A
	Var4 = bt.WhLib().cons(B,C)
	Var5 = bt.WhLib().cons(A,Var4)
	Var6 = bt.WhLib().not(Var5)
	Var7 = Var6
	A = Var7
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
