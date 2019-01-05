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
	A = bt.WhLib().cons(None, None)
	B = bt.WhLib().cons(None, None)
	C = bt.WhLib().cons(None, None)
	D = bt.WhLib().cons(None, None)
	E = bt.WhLib().cons(None, None)
	F = bt.WhLib().cons(None, None)
	G = bt.WhLib().cons(None, None)
	H = bt.WhLib().cons(None, None)
	I = bt.WhLib().cons(None, None)
	G1 = bt.WhLib().cons(None, None)
	J = bt.WhLib().cons(None, None)
	F1 = bt.WhLib().cons(None, None)
	E1 = bt.WhLib().cons(None, None)
	D1 = bt.WhLib().cons(None, None)
	SA = bt.WhLib().cons(None, None)
	nil = bt.WhLib().cons(None, None)
	W = bt.WhLib().cons(None, None)
	DA = bt.WhLib().cons(None, None)
	BA = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var13 = bt.WhLib().cons(None, None)
	Var35 = bt.WhLib().cons(None, None)
	Var12 = bt.WhLib().cons(None, None)
	Var34 = bt.WhLib().cons(None, None)
	Var15 = bt.WhLib().cons(None, None)
	Var37 = bt.WhLib().cons(None, None)
	Var14 = bt.WhLib().cons(None, None)
	Var36 = bt.WhLib().cons(None, None)
	Var17 = bt.WhLib().cons(None, None)
	Var16 = bt.WhLib().cons(None, None)
	Var38 = bt.WhLib().cons(None, None)
	Var19 = bt.WhLib().cons(None, None)
	Var18 = bt.WhLib().cons(None, None)
	Var31 = bt.WhLib().cons(None, None)
	Var30 = bt.WhLib().cons(None, None)
	Var11 = bt.WhLib().cons(None, None)
	Var33 = bt.WhLib().cons(None, None)
	Var32 = bt.WhLib().cons(None, None)
	Var24 = bt.WhLib().cons(None, None)
	Var0 = bt.WhLib().cons(None, None)
	Var23 = bt.WhLib().cons(None, None)
	Var26 = bt.WhLib().cons(None, None)
	Var2 = bt.WhLib().cons(None, None)
	Var25 = bt.WhLib().cons(None, None)
	Var3 = bt.WhLib().cons(None, None)
	Var28 = bt.WhLib().cons(None, None)
	Var4 = bt.WhLib().cons(None, None)
	Var27 = bt.WhLib().cons(None, None)
	Var5 = bt.WhLib().cons(None, None)
	Var6 = bt.WhLib().cons(None, None)
	Var29 = bt.WhLib().cons(None, None)
	Var20 = bt.WhLib().cons(None, None)
	Var22 = bt.WhLib().cons(None, None)
	Var21 = bt.WhLib().cons(None, None)
	Var7 = bt.WhLib().cons(None, None)
	Var9 = bt.WhLib().cons(None, None)
	
	DA = inputP.get()
	SA = inputP.get()
	BA = inputP.get()
	Var0 = nil
	A = Var0
	Var2 = bt.WhLib().cons(SA,DA)
	Var3 = bt.WhLib().cons(nil,Var2)
	Var4 = bt.WhLib().cons(nil,Var3)
	Var5 = bt.WhLib().cons(nil,Var4)
	Var6 = bt.WhLib().cons(nil,Var5)
	Var7 = Var6
	B = Var7
	Var9 = bt.WhLib().cons(nil,nil)
	Var11 = bt.WhLib().cons(nil,Var9)
	Var12 = bt.WhLib().cons(nil,Var11)
	Var13 = bt.WhLib().cons(nil,Var12)
	Var14 = Var13
	C = Var14
	Var15 = bt.WhLib().and_wh(A,B)
	Var16 = Var15
	D = Var16
	Var17 = bt.WhLib().and_wh(B,B)
	Var18 = Var17
	D1 = Var18
	Var19 = bt.WhLib().or_wh(A,B)
	Var20 = Var19
	E = Var20
	Var21 = bt.WhLib().or_wh(A,A)
	Var22 = Var21
	E1 = Var22
	Var23 = bt.WhLib().not_wh(B)
	Var24 = Var23
	F = Var24
	Var25 = bt.WhLib().not_wh(A)
	Var26 = Var25
	F1 = Var26
	Var27 = bt.WhLib().isEqual(A,B)
	Var28 = Var27
	G = Var28
	Var29 = bt.WhLib().isEqual(A,A)
	Var30 = Var29
	G1 = Var30
	Var31 = bt.WhLib().hd(B)
	Var32 = Var31
	H = Var32
	Var33 = bt.WhLib().tail(B)
	Var34 = Var33
	I = Var34
	Var35 = bt.WhLib().tail(I)
	Var36 = Var35
	J = Var36
	if bt.WhLib().isTrue(A) : 
		Var37 = B
		W = Var37
	else : 
		Var38 = C
		W = Var38
	bt.WhLib().nop()
	outputP.put(B);
	outputP.put(C);
	outputP.put(W);


def F1(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilisées dans le code While de la fonction : autre
	A = bt.WhLib().cons(None, None)
	B = bt.WhLib().cons(None, None)
	X = bt.WhLib().cons(None, None)
	Y = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : autre
	Var0 = bt.WhLib().cons(None, None)
	
	X = inputP.get()
	Y = inputP.get()
	Var0 = B
	A = Var0
	bt.WhLib().nop()
	outputP.put(X);
	outputP.put(Y);
	outputP.put(A);


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	DA = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(DA)
else : 
	DA = bt.WhLib().cons(None, None)
	inParams.put(DA)
if(len(sys.argv) > 2) : 
	SA = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(SA)
else : 
	SA = bt.WhLib().cons(None, None)
	inParams.put(SA)
if(len(sys.argv) > 3) : 
	BA = bt.WhLib().intToBinTree(int(sys.argv[3]))
	inParams.put(BA)
else : 
	BA = bt.WhLib().cons(None, None)
	inParams.put(BA)

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
