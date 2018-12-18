#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilis�s dans le programme while


def test_F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : test
	A = binTree()
	C = binTree()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	
	A = inputP.get()
	C = inputP.get()
	bt.WhLib().nop()
	Var0 = C
	Var1 = A
	A = Var0
	C = Var1
	bt.WhLib().nop()
	outputP.put(A);
	outputP.put(C);


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	A = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(A)
else : 
	A = binTree()
	inParams.put(A)
if(len(sys.argv) > 2) : 
	C = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(C)
else : 
	C = binTree()
	inParams.put(C)

test_F0(inParams, outParams)

 #Affichage des param�tres de sortie
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
