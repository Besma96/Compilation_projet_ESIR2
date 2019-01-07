#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilisés dans le programme while
nil = bt.WhLib().cons(None, None)


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : main
	nil = bt.WhLib().cons(None, None)
	A = bt.WhLib().cons(None, None)
	B = bt.WhLib().cons(None, None)
	C = bt.WhLib().cons(None, None)
	D = bt.WhLib().cons(None, None)
	F = bt.WhLib().cons(None, None)
	X = bt.WhLib().cons(None, None)
	Y = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var13 = bt.WhLib().cons(None, None)
	Var12 = bt.WhLib().cons(None, None)
	Var1 = bt.WhLib().cons(None, None)
	Var15 = bt.WhLib().cons(None, None)
	Var2 = bt.WhLib().cons(None, None)
	Var14 = bt.WhLib().cons(None, None)
	Var3 = bt.WhLib().cons(None, None)
	Var4 = bt.WhLib().cons(None, None)
	Var16 = bt.WhLib().cons(None, None)
	Var5 = bt.WhLib().cons(None, None)
	Var6 = bt.WhLib().cons(None, None)
	Var10 = bt.WhLib().cons(None, None)
	Var8 = bt.WhLib().cons(None, None)
	Var9 = bt.WhLib().cons(None, None)
	
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
	Var8 = bt.WhLib().cons(nil,nil)
	Var9 = bt.WhLib().cons(nil,Var8)
	Var10 = Var9
	A = Var10
	Var12 = bt.WhLib().cons(nil,nil)
	Var13 = bt.WhLib().cons(nil,Var12)
	Var14 = Var13
	B = Var14
	Var15 = bt.WhLib().isEqual(A,B)
	Var16 = Var15
	F = Var16
	bt.WhLib().nop()
	outputP.put(F)


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
