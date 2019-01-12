#-*- coding:utf-8 -*
from binTree import * 
import WhLib as bt
import sys 
import queue as queue

 # Les symboles utilis�s dans le programme while
nil = bt.WhLib().cons()


def F0(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : main
	nil = bt.WhLib().cons()
	A = bt.WhLib().cons()
	R = bt.WhLib().cons()
	S = bt.WhLib().cons()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : main
	Var1 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	Var3 = bt.WhLib().cons()
	Var5 = bt.WhLib().cons()
	Var6 = bt.WhLib().cons()
	Var7 = bt.WhLib().cons()
	
	A = inputP.get()
	Var1 = bt.WhLib().cons("nil","nil")
	Var2 = Var1
	R = Var2
	Var3 = nil
	S = Var3
	Varfor0 = bt.WhLib().binTreeToInt(A) 
	for i in range(0, Varfor0) : 
		Var5 = bt.WhLib().cons("nil",S)
		Var6 = Var5
		S = Var6
		inParams.put(S)
		inParams.put(R)
		F1(inParams, outParams)
		Var7 = outParams.get()
		R = Var7
	outputP.put(R)


def F1(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : mult
	nil = bt.WhLib().cons()
	A = bt.WhLib().cons()
	B = bt.WhLib().cons()
	C = bt.WhLib().cons()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : mult
	Var1 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	
	A = inputP.get()
	B = inputP.get()
	Varfor1 = bt.WhLib().binTreeToInt(A) 
	for i in range(0, Varfor1) : 
		Varfor2 = bt.WhLib().binTreeToInt(B) 
		for i in range(0, Varfor2) : 
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
