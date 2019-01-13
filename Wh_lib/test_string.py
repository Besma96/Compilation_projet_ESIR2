#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue 
import re

 # Les symboles utilisés dans le programme while


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : main
	A = bt.WhLib().cons()
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	
	A = inputP.get()
	bt.WhLib().nop()
	outputP.put(A)


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	A = bt.WhLib().stringToBinTree(sys.argv[1])
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
