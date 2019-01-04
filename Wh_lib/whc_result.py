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
	Z = bt.WhLib().cons(None, None)
	DA = bt.WhLib().cons(None, None)
	BA = bt.WhLib().cons(None, None)
	
	 #Variables temporaires utilisées par le compiler pour la fonction : main
	Var13 = bt.WhLib().cons(None, None)
	Var12 = bt.WhLib().cons(None, None)
	Var34 = bt.WhLib().cons(None, None)
	Var15 = bt.WhLib().cons(None, None)
	Var37 = bt.WhLib().cons(None, None)
	Var14 = bt.WhLib().cons(None, None)
	Var36 = bt.WhLib().cons(None, None)
	Var17 = bt.WhLib().cons(None, None)
	Var39 = bt.WhLib().cons(None, None)
	Var16 = bt.WhLib().cons(None, None)
	Var38 = bt.WhLib().cons(None, None)
	Var19 = bt.WhLib().cons(None, None)
	Var18 = bt.WhLib().cons(None, None)
	Var31 = bt.WhLib().cons(None, None)
	Var30 = bt.WhLib().cons(None, None)
	Var11 = bt.WhLib().cons(None, None)
	Var33 = bt.WhLib().cons(None, None)
	Var10 = bt.WhLib().cons(None, None)
	Var32 = bt.WhLib().cons(None, None)
	Var24 = bt.WhLib().cons(None, None)
	Var46 = bt.WhLib().cons(None, None)
	Var0 = bt.WhLib().cons(None, None)
	Var23 = bt.WhLib().cons(None, None)
	Var45 = bt.WhLib().cons(None, None)
	Var26 = bt.WhLib().cons(None, None)
	Var2 = bt.WhLib().cons(None, None)
	Var25 = bt.WhLib().cons(None, None)
	Var3 = bt.WhLib().cons(None, None)
	Var28 = bt.WhLib().cons(None, None)
	Var4 = bt.WhLib().cons(None, None)
	Var27 = bt.WhLib().cons(None, None)
	Var5 = bt.WhLib().cons(None, None)
	Var29 = bt.WhLib().cons(None, None)
	Var40 = bt.WhLib().cons(None, None)
	Var20 = bt.WhLib().cons(None, None)
	Var42 = bt.WhLib().cons(None, None)
	Var22 = bt.WhLib().cons(None, None)
	Var44 = bt.WhLib().cons(None, None)
	Var21 = bt.WhLib().cons(None, None)
	Var43 = bt.WhLib().cons(None, None)
	Var7 = bt.WhLib().cons(None, None)
	Var9 = bt.WhLib().cons(None, None)
	
	DA = inputP.get()
	SA = inputP.get()
	BA = inputP.get()
	Var0 = nil
	A = Var0
	Var2 = bt.WhLib().cons(nil,nil)
	Var3 = bt.WhLib().cons(nil,Var2)
	Var4 = bt.WhLib().cons(nil,Var3)
	Var5 = Var4
	B = Var5
	Var7 = bt.WhLib().cons(nil,nil)
	Var9 = bt.WhLib().cons(nil,Var7)
	Var10 = bt.WhLib().cons(nil,Var9)
	Var11 = bt.WhLib().cons(nil,Var10)
	Var12 = Var11
	C = Var12
	Var13 = bt.WhLib().and_wh(A,B)
	Var14 = Var13
	D = Var14
	Var15 = bt.WhLib().and_wh(B,B)
	Var16 = Var15
	D1 = Var16
	Var17 = bt.WhLib().or_wh(A,B)
	Var18 = Var17
	E = Var18
	Var19 = bt.WhLib().or_wh(A,A)
	Var20 = Var19
	E1 = Var20
	Var21 = bt.WhLib().not_wh(B)
	Var22 = Var21
	F = Var22
	Var23 = bt.WhLib().not_wh(A)
	Var24 = Var23
	F1 = Var24
	Var25 = bt.WhLib().isEqual(A,B)
	Var26 = Var25
	G = Var26
	Var27 = bt.WhLib().isEqual(A,A)
	Var28 = Var27
	G1 = Var28
	Var29 = bt.WhLib().hd(B)
	Var30 = Var29
	H = Var30
	Var31 = bt.WhLib().tail(B)
	Var32 = Var31
	I = Var32
	Var33 = bt.WhLib().tail(I)
	Var34 = Var33
	J = Var34
	while bt.WhLib().isTrue(B) : 
		Var36 = bt.WhLib().cons(nil,W)
		Var37 = bt.WhLib().cons(nil,Var36)
		Var38 = Var37
		W = Var38
		Var39 = bt.WhLib().tail(B)
		Var40 = Var39
		B = Var40
	Var47 = bt.WhLib().binTreeToInt(C) 
	for i in range(0, Var47) : 
		Var42 = bt.WhLib().cons(Z,Z)
		Var43 = bt.WhLib().cons(Z,Var42)
		Var44 = bt.WhLib().cons(nil,Var43)
		Var45 = bt.WhLib().cons(nil,Var44)
		Var46 = Var45
		Z = Var46
	bt.WhLib().nop()
	outputP.put(A);
	outputP.put(B);
	outputP.put(H);
	outputP.put(I);
	outputP.put(J);
	outputP.put(W);


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
