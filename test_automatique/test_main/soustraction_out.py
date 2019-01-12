#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilis�s dans le programme while


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : main
	A = bt.WhLib().cons(None, None)
	B = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : main
	Var0 = bt.WhLib().cons(None, None)
	Var1 = bt.WhLib().cons(None, None)
	
	A = inputP.get()
	B = inputP.get()
	Varfor0 = bt.WhLib().binTreeToInt(B) 
	for i in range(0, Varfor0) : 
		Var0 = bt.WhLib().tail(A)
		Var1 = Var0
		A = Var1
	outputP.put(A)


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	A = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(A)
else : 
	A = bt.WhLib().cons(None, None)
	inParams.put(A)
if(len(sys.argv) > 2) : 
	B = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(B)
else : 
	B = bt.WhLib().cons(None, None)
	inParams.put(B)

F0(inParams, outParams)

#  #Affichage des param�tres de sortie
# result = outParams.get()
# if not (result==True or result==False or result == None ) : 
# 	resultInt = bt.WhLib().binTreeToInt(result) 
# 	if resultInt < 250 : 
# 		print(bt.WhLib().toString(result))
# 	else : 
# 		print("Arbre trop grand pour l'affichage")
# 	print("Son Equivalent en entier : " , 	resultInt)
# else : 
# 	print("Son Equivalent en boolean : " , 	result)

print(bt.WhLib().binTreeToInt(outParams.get()))