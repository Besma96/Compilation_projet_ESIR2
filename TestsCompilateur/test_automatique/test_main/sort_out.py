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
	A = bt.WhLib().cons()
	B = bt.WhLib().cons()
	C = bt.WhLib().cons()
	D = bt.WhLib().cons()
	E = bt.WhLib().cons()
	G = bt.WhLib().cons()
	H = bt.WhLib().cons()
	I = bt.WhLib().cons()
	J = bt.WhLib().cons()
	K = bt.WhLib().cons()
	L = bt.WhLib().cons()
	nil = bt.WhLib().cons()
	R = bt.WhLib().cons()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : main
	Var13 = bt.WhLib().cons()
	Var34 = bt.WhLib().cons()
	Var15 = bt.WhLib().cons()
	Var14 = bt.WhLib().cons()
	Var17 = bt.WhLib().cons()
	Var16 = bt.WhLib().cons()
	Var19 = bt.WhLib().cons()
	Var18 = bt.WhLib().cons()
	Var31 = bt.WhLib().cons()
	Var30 = bt.WhLib().cons()
	Var11 = bt.WhLib().cons()
	Var33 = bt.WhLib().cons()
	Var10 = bt.WhLib().cons()
	Var32 = bt.WhLib().cons()
	Var24 = bt.WhLib().cons()
	Var23 = bt.WhLib().cons()
	Var1 = bt.WhLib().cons()
	Var26 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	Var25 = bt.WhLib().cons()
	Var28 = bt.WhLib().cons()
	Var4 = bt.WhLib().cons()
	Var27 = bt.WhLib().cons()
	Var5 = bt.WhLib().cons()
	Var29 = bt.WhLib().cons()
	Var20 = bt.WhLib().cons()
	Var22 = bt.WhLib().cons()
	Var21 = bt.WhLib().cons()
	Var7 = bt.WhLib().cons()
	Var8 = bt.WhLib().cons()
	
	G = inputP.get()
	H = inputP.get()
	I = inputP.get()
	J = inputP.get()
	K = inputP.get()
	Var1 = bt.WhLib().cons(K,"nil")
	Var2 = Var1
	L = Var2
	Var4 = bt.WhLib().cons(J,L)
	Var5 = Var4
	L = Var5
	Var7 = bt.WhLib().cons(I,L)
	Var8 = Var7
	L = Var8
	Var10 = bt.WhLib().cons(H,L)
	Var11 = Var10
	L = Var11
	Var13 = bt.WhLib().cons(G,L)
	Var14 = Var13
	L = Var14
	inParams.put(L)
	F3(inParams, outParams)
	Var15 = outParams.get()
	R = Var15
	Varfor0 = bt.WhLib().binTreeToInt(L) 
	for i in range(0, Varfor0) : 
		inParams.put(R)
		F3(inParams, outParams)
		Var16 = outParams.get()
		R = Var16
	Var17 = bt.WhLib().hd(R)
	Var18 = Var17
	A = Var18
	Var19 = bt.WhLib().tail(R)
	Var20 = Var19
	R = Var20
	Var21 = bt.WhLib().hd(R)
	Var22 = Var21
	B = Var22
	Var23 = bt.WhLib().tail(R)
	Var24 = Var23
	R = Var24
	Var25 = bt.WhLib().hd(R)
	Var26 = Var25
	C = Var26
	Var27 = bt.WhLib().tail(R)
	Var28 = Var27
	R = Var28
	Var29 = bt.WhLib().hd(R)
	Var30 = Var29
	D = Var30
	Var31 = bt.WhLib().tail(R)
	Var32 = Var31
	R = Var32
	Var33 = bt.WhLib().hd(R)
	Var34 = Var33
	E = Var34
	outputP.put(A)
	outputP.put(B)
	outputP.put(C)
	outputP.put(D)
	outputP.put(E)


def F1(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : superieur
	nil = bt.WhLib().cons()
	A = bt.WhLib().cons()
	B = bt.WhLib().cons()
	S = bt.WhLib().cons()
	T = bt.WhLib().cons()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : superieur
	Var1 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	Var3 = bt.WhLib().cons()
	Var5 = bt.WhLib().cons()
	Var6 = bt.WhLib().cons()
	Var7 = bt.WhLib().cons()
	Var8 = bt.WhLib().cons()
	
	A = inputP.get()
	B = inputP.get()
	Var1 = bt.WhLib().cons("nil","nil")
	Var2 = Var1
	T = Var2
	Var3 = nil
	S = Var3
	Varfor1 = bt.WhLib().binTreeToInt(B) 
	for i in range(0, Varfor1) : 
		Var5 = bt.WhLib().cons("nil",S)
		Var6 = Var5
		S = Var6
		Var7 = bt.WhLib().isEqual(S,A)
		if bt.WhLib().isTrue(Var7) : 
			Var8 = nil
			T = Var8
	outputP.put(T)


def F2(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : sup
	A = bt.WhLib().cons()
	U = bt.WhLib().cons()
	K = bt.WhLib().cons()
	L = bt.WhLib().cons()
	O = bt.WhLib().cons()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : sup
	Var13 = bt.WhLib().cons()
	Var0 = bt.WhLib().cons()
	Var12 = bt.WhLib().cons()
	Var1 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	Var14 = bt.WhLib().cons()
	Var3 = bt.WhLib().cons()
	Var4 = bt.WhLib().cons()
	Var5 = bt.WhLib().cons()
	Var6 = bt.WhLib().cons()
	Var10 = bt.WhLib().cons()
	Var7 = bt.WhLib().cons()
	Var9 = bt.WhLib().cons()
	
	L = inputP.get()
	Var0 = bt.WhLib().hd(L)
	Var1 = Var0
	K = Var1
	Var2 = bt.WhLib().tail(L)
	Var3 = Var2
	O = Var3
	Var4 = bt.WhLib().hd(O)
	Var5 = Var4
	U = Var5
	inParams.put(K)
	inParams.put(U)
	F1(inParams, outParams)
	Var6 = outParams.get()
	if bt.WhLib().isTrue(Var6) : 
		Var7 = bt.WhLib().tail(O)
		Var9 = bt.WhLib().cons(K,Var7)
		Var10 = Var9
		A = Var10
		Var12 = bt.WhLib().cons(U,A)
		Var13 = Var12
		A = Var13
	else : 
		Var14 = L
		A = Var14
	outputP.put(A)


def F3(inputP , outputP ) : 
	inParams = queue.Queue() #Queue de bintree
	outParams =queue.Queue() #Queue de bintree
	 #Variables utilis�es dans le code While de la fonction : sort
	nil = bt.WhLib().cons()
	T = bt.WhLib().cons()
	L = bt.WhLib().cons()
	O = bt.WhLib().cons()
	
	 #Variables temporaires utilis�es par le compiler pour la fonction : sort
	Var13 = bt.WhLib().cons()
	Var0 = bt.WhLib().cons()
	Var1 = bt.WhLib().cons()
	Var15 = bt.WhLib().cons()
	Var2 = bt.WhLib().cons()
	Var14 = bt.WhLib().cons()
	Var3 = bt.WhLib().cons()
	Var5 = bt.WhLib().cons()
	Var6 = bt.WhLib().cons()
	Var11 = bt.WhLib().cons()
	Var10 = bt.WhLib().cons()
	Var7 = bt.WhLib().cons()
	Var8 = bt.WhLib().cons()
	Var9 = bt.WhLib().cons()
	
	L = inputP.get()
	Var0 = bt.WhLib().tail(L)
	Var1 = Var0
	O = Var1
	Var2 = bt.WhLib().isEqual(O,nil)
	Var3 = Var2
	T = Var3
	if bt.WhLib().isTrue(T) : 
		Var5 = bt.WhLib().hd(L)
		Var6 = bt.WhLib().cons(Var5,"nil")
		Var7 = Var6
		L = Var7
	else : 
		inParams.put(L)
		F2(inParams, outParams)
		Var8 = outParams.get()
		L = Var8
		Var9 = bt.WhLib().tail(L)
		Var10 = Var9
		O = Var10
		inParams.put(O)
		F3(inParams, outParams)
		Var11 = outParams.get()
		Var13 = bt.WhLib().hd(L)
		Var14 = bt.WhLib().cons(Var13,Var11)
		Var15 = Var14
		L = Var15
	outputP.put(L)


########## Partie main ############

inParams = queue.Queue() #Queue de BinTree
outParams = queue.Queue() #Queue de BinTree
if(len(sys.argv) > 1) : 
	G = bt.WhLib().intToBinTree(int(sys.argv[1]))
	inParams.put(G)
else : 
	G = bt.WhLib().cons()
	inParams.put(G)
if(len(sys.argv) > 2) : 
	H = bt.WhLib().intToBinTree(int(sys.argv[2]))
	inParams.put(H)
else : 
	H = bt.WhLib().cons()
	inParams.put(H)
if(len(sys.argv) > 3) : 
	I = bt.WhLib().intToBinTree(int(sys.argv[3]))
	inParams.put(I)
else : 
	I = bt.WhLib().cons()
	inParams.put(I)
if(len(sys.argv) > 4) : 
	J = bt.WhLib().intToBinTree(int(sys.argv[4]))
	inParams.put(J)
else : 
	J = bt.WhLib().cons()
	inParams.put(J)
if(len(sys.argv) > 5) : 
	K = bt.WhLib().intToBinTree(int(sys.argv[5]))
	inParams.put(K)
else : 
	K = bt.WhLib().cons()
	inParams.put(K)

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
