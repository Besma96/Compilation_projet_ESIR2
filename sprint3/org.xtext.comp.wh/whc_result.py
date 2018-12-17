#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilisés dans le programme while
a = binTree()


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : test
	P = binTree()
	B = binTree()
	X = binTree()
	Y = binTree()
	Z = binTree()
	K = binTree()
	O = binTree()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : test
	Var0 = binTree()
	Var1 = binTree()
	Var2 = binTree()
	Var3 = binTree()
	Var4 = binTree()
	Var5 = binTree()
	Var6 = binTree()
	Var7 = binTree()
	Var8 = binTree()
	Var9 = binTree()
	Var11 = binTree()
	Var10 = binTree()
	
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
	inParams.put(P)
	inParams.put(K)
	Var5 = bt.WhLib().cons(inParams)
	Var6 = Var5
	P = Var6
	Var7 = bt.WhLib().hd(Y)
	inParams.put(a)
	inParams.put(Var7)
	Var8 = bt.WhLib().cons(inParams)
	Var9 = bt.WhLib().tail(X)
	inParams.put(Var8)
	inParams.put(Var9)
	Var10 = bt.WhLib().cons(inParams)
	Var11 = Var10
	Z = Var11
	bt.WhLib().nop()
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
