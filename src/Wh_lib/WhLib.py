import binTree as bt
import copy
import queue as qu

class WhLib:
    # se reporter à la table de traduction pour les équivalents while

    def nop(self):
        pass

    def nil(self):
        return bt.binTree().cons(None, None)

    def hd(self, tree):
        return tree.head()

    def tail(self, tree):
        return tree.tail()

    def isTrue(self, tree):
        if tree.node=="nil":
            return False
        return True
        
    
    def isEqual(self, X, Y):
        return X.isEqual(Y)

    def cons(self, l=None, r=None):
        if( l is None and isinstance(r,bt.binTree)):
            return bt.binTree().cons_solo(r)
        if( r is None and isinstance(l,bt.binTree)):
            return bt.binTree().cons_solo(l)
        else:
            return bt.binTree().cons(l,r)

    def intToBinTree(self, val):
        if (val==0):
            return WhLib().cons()
        else:
            tree=WhLib().cons("nil","nil")
            val-=1
            while(val!=0):
                tree=WhLib().cons("nil",tree)
                val-=1
        return tree



    def binTreeToInt(self, X):
        if X.getRight() is None:
            return 0
        res = 1
        tree = bt.binTree()
        tree = X.getRight()
        while isinstance(tree,bt.binTree) :
            res = res+1
            tree = tree.getRight()
        return res

    def toString(self,X) -> str:
        if (not isinstance(X,bt.binTree)):
            return str(X)
        else:
            return "(  " +WhLib.toString(self,X.getLeft())+" cons " + WhLib.toString(self,X.getRight()) + ")"
    
    def and_wh(self,X,Y):
        return (WhLib.isTrue(self,X) and WhLib.isTrue(self,Y))

    def or_wh(self,X,Y):
        tmp=WhLib().isTrue(X) or WhLib().isTrue(Y)
        return tmp

    def not_wh(self,X):
        tmp=not(WhLib().isTrue(X))
        return tmp