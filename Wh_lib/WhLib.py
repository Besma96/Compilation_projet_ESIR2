import binTree as bt
import copy
import queue as qu

class WhLib:
    # se reporter à la table de traduction pour les équivalents while

    def nop(self):
        pass

    def nil(self):
        return bt.binTree().cons("nil", "nil")

    def hd(self, tree):
        return tree.head()

    def tail(self, tree):
        #print(type(tree.tail()))
        if( isinstance(tree, bt.binTree)):
            return tree.tail()
        return None

    def isTrue(self, tree):
        if tree==True:
            return True
        else:
            if tree==False or tree==None:
                return False
        if tree.node=="nil":
            return False
        return True
        
    
    def isEqual(self, X, Y):
        equal=True
        tree1=X
        tree2=Y
        while(isinstance(tree1,bt.binTree) and isinstance(tree2,bt.binTree)):
            #if(tree1.getLeft() not None and tree2.getLeft() not None):
            equal=(tree1.getLeft()==tree2.getLeft())
            if (not equal ) :
                return False
            tree1=tree1.getRight()
            tree2=tree2.getRight()
        equal=(tree1==tree2)
        return equal

    def cons(self, l=None, r=None):
        if( l is None and isinstance(r,bt.binTree)):
            return bt.binTree().cons_solo("nil")
        if( r is None and isinstance(l,bt.binTree)):
            return bt.binTree().cons_solo("nil")
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
        res = 0
        tree=X
        while isinstance(tree,bt.binTree) :
            if(tree.node=="cons"):
                res+=1
            tree=tree.getRight()
            
        return res

    def toString(self,X) -> str:
        if (not isinstance(X,bt.binTree)):
            return str(X)
        else:
            return "( cons " +WhLib.toString(self,X.getLeft())+" " + WhLib.toString(self,X.getRight()) + ")"
    
    def and_wh(self,X,Y):
        return (WhLib.isTrue(self,X) and WhLib.isTrue(self,Y))

    def or_wh(self,X,Y):
        tmp=WhLib().isTrue(X) or WhLib().isTrue(Y)
        return tmp

    def not_wh(self,X):
        tmp=not(WhLib().isTrue(X))
        return tmp

    def all_nodes(self, tree):
        if tree is not None:
            return tree.all_nodes() 
