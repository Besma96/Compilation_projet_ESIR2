#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilisés dans le programme while
nil = bt.WhLib().cons()


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : main
	Nil = bt.WhLib().cons()
	nil = bt.WhLib().cons()
	B = bt.WhLib().cons()
	C = bt.WhLib().cons()
	K = bt.WhLib().cons()
	L = bt.WhLib().cons()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var0 = bt.WhLib().cons()
	Var12 = bt.WhLib().cons()
	Var1 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	Var4 = bt.WhLib().cons()
	Var5 = bt.WhLib().cons()
	Var6 = bt.WhLib().cons()
	Var7 = bt.WhLib().cons()
	Var8 = bt.WhLib().cons()
	Var9 = bt.WhLib().cons()
	Var11 = bt.WhLib().cons()
	
	B = inputP.get()
	C = inputP.get()
	inParams.put(B)
	inParams.put(C)
	F1(inParams, outParams)
	Var1 = outParams.get()
	Var2 = outParams.get()
	Var4 = bt.WhLib().cons(Var2,Nil)
	Var5 = bt.WhLib().cons(Var1,Var4)
	Var6 = bt.WhLib().cons("nil",Var5)
	Var7 = Var6
	L = Var7
	inParams.put(B)
	inParams.put(C)
	F1(inParams, outParams)
	Var8 = outParams.get()
	Var9 = outParams.get()
	Var11 = bt.WhLib().cons(Var8,Var9)
	Var12 = Var11
	K = Var12
	outputP.put(B)
	outputP.put(C)
	outputP.put(L)
	outputP.put(K)


def F1(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : autre
	B = bt.WhLib().cons()
	C = bt.WhLib().cons()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : autre
	
	B = inputP.get()
	C = inputP.get()
	bt.WhLib().nop()
	outputP.put(B)
	outputP.put(C)


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	B = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(B)
else : 
	B = bt.WhLib().cons()
	inParams.put(B)
if(len(sys.argv) > 2) : 
	C = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(C)
else : 
	C = bt.WhLib().cons()
	inParams.put(C)

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
