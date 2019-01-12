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
	C = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : main
	Var0 = bt.WhLib().cons(None, None)
	Var2 = bt.WhLib().cons(None, None)
	Var3 = bt.WhLib().cons(None, None)
	
	A = inputP.get()
	B = inputP.get()
	Var0 = bt.WhLib().isEqual(A,B)
	if bt.WhLib().isTrue(Var0) : 
		Var2 = bt.WhLib().cons(A,B)
		Var3 = Var2
		C = Var3
	outputP.put(C)


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

 #Affichage des param�tres de sortie
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
