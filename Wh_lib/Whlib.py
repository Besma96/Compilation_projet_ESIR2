import binTree as bt
import copy
import queue as qu

class WhLib:
    # se reporter à la table de traduction pour les équivalents while

    def nop(self):
        pass

    def nil(self):
        tree = bt.binTree()
        return tree.cons(None, None)

    def hd(self, tree):
        return tree.head()

    def tail(self, tree):
        return tree.tail()

    def isTrue(self, tree):
        return tree.isTrue()
    
    def isEqual(self, X, Y):
        return X.isEqual(Y)

    def cons(self, l, r):
        tree = bt.binTree()
        return tree.cons(l, r)

    def cons_solo(self, X):
        tree=bt.binTree()
        return tree.cons_solo(X)

    def cons_list(self, L):
        liste=[]
        tree = bt.binTree()
        while not L.empty():
            liste.append(L.get())
        return tree.cons_list(liste)

    def list(self, L):
        liste=[]
        tree=bt.binTree()
        while not L.empty():
            liste.append(L.get())
        return tree.list(liste)

    def intToBinTree(self, val):
        res=bt.binTree()
        res.cons("nil", "nil")
        if(val != 0):
            i=0
            while i<val:
                res.cons("nil", res)
                i=i+1
        return res
    
    def binTreeToInt(self, X):
        if X.getRight() is None:
            return 0
        res = 0
        tree = bt.binTree()
        tree = X.getRight()
        while not tree.isNil() :
            res = res+1
            tree = tree.getRight()
        return res
    
   





    








