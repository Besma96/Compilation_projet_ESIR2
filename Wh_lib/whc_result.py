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
	B = bt.WhLib().cons(None, None)
	C = bt.WhLib().cons(None, None)
	D = bt.WhLib().cons(None, None)
	X = bt.WhLib().cons(None, None)
	Y = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var1 = bt.WhLib().cons(None, None)
	Var2 = bt.WhLib().cons(None, None)
	Var3 = bt.WhLib().cons(None, None)
	Var4 = bt.WhLib().cons(None, None)
	Var5 = bt.WhLib().cons(None, None)
	Var6 = bt.WhLib().cons(None, None)
	
	X = inputP.get()
	Y = inputP.get()
	Var1 = bt.WhLib().cons(X,Y)
	Var2 = Var1
	B = Var2
	Var3 = bt.WhLib().hd(B)
	Var4 = Var3
	C = Var4
	Var5 = bt.WhLib().tail(B)
	Var6 = Var5
	D = Var6
	bt.WhLib().nop()
	outputP.put(X);
	outputP.put(Y);
	outputP.put(B);
	outputP.put(C);
	outputP.put(D);


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
print(bt.WhLib().toString(result))
if not (result==True or result==False or result == None ) : 
	print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(bt.WhLib().toString(result))
if not (result==True or result==False or result == None ) : 
	print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(bt.WhLib().toString(result))
if not (result==True or result==False or result == None ) : 
	print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(bt.WhLib().toString(result))
if not (result==True or result==False or result == None ) : 
	print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
result = outParams.get()
print(bt.WhLib().toString(result))
if not (result==True or result==False or result == None ) : 
	print("Son Equivalent en entier : " , 	bt.WhLib().binTreeToInt(result))
