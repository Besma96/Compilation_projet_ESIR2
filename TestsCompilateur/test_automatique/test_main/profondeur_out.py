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
	nil = bt.WhLib().cons()
	A = bt.WhLib().cons()
	C = bt.WhLib().cons()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var1 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	
	A = inputP.get()
	Varfor0 = bt.WhLib().binTreeToInt(A) 
	for i in range(0, Varfor0) : 
		Varfor1 = bt.WhLib().binTreeToInt(A) 
		for i in range(0, Varfor1) : 
			Varfor2 = bt.WhLib().binTreeToInt(A) 
			for i in range(0, Varfor2) : 
				Varfor3 = bt.WhLib().binTreeToInt(A) 
				for i in range(0, Varfor3) : 
					Var1 = bt.WhLib().cons("nil",C)
					Var2 = Var1
					C = Var2
	outputP.put(C)


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	A = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(A)
else : 
	A = bt.WhLib().cons()
	inParams.put(A)

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
