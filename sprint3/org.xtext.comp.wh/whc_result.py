#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilis�s dans le programme while


def K(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : test
	A = binTree()
	B = binTree()
	C = binTree()
	X = binTree()
	Y = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	Var2 = binTree()
	Var3 = binTree()
	Var4 = binTree()
	Var5 = binTree()
	Var6 = binTree()
	


def Var5(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : test
	A = binTree()
	B = binTree()
	C = binTree()
	X = binTree()
	Y = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	Var2 = binTree()
	Var3 = binTree()
	Var4 = binTree()
	Var5 = binTree()
	Var6 = binTree()
	
	A = Var5


def Var6(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : test
	A = binTree()
	B = binTree()
	C = binTree()
	X = binTree()
	Y = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	Var2 = binTree()
	Var3 = binTree()
	Var4 = binTree()
	Var5 = binTree()
	Var6 = binTree()
	
	A = Var6


def test_F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : test
	A = binTree()
	B = binTree()
	C = binTree()
	X = binTree()
	Y = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	Var2 = binTree()
	Var3 = binTree()
	Var4 = binTree()
	Var5 = binTree()
	Var6 = binTree()
	
	X = inputP.get()
	O = inputP.get()
	inParams.put(O)
	inParams.put(X)
	Var0 = bt.WhLib().cons(inParams)
	inParams.put(Var0)
	inParams.put(B)
	Var1 = bt.WhLib().cons(inParams)
	inParams.put(Var1)
	inParams.put(Y)
	Var2 = bt.WhLib().cons(inParams)
	inParams.put(Var2)
	inParams.put(X)
	Var3 = bt.WhLib().cons(inParams)
	Var4 = Var3
	K = Var4
	bt.WhLib().nop()
	bt.WhLib().nop()
	outputP.put(X);
	outputP.put(K);
	outputP.put(Z);


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

test_F0(inParams, outParams)

 #Affichage des param�tres de sortie
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(result)
print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
