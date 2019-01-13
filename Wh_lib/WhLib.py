#-*- coding:utf-8 -*
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

        if( isinstance(tree, bt.binTree)):
            return tree.head()
        return None

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
        if tree=="nil":
            return False
        return True
        
    
    def isEqual(self, X, Y):
        equal=True
        tree1=X
        tree2=Y
        if(isinstance(X, str) and isinstance(Y, str)):
            return (X == Y)
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
        res = 0
        tree=X
        while isinstance(tree,bt.binTree) :
            if tree.node=="cons":
                res+=1
            tree=tree.getRight()
            
        return res

    def clean(self,val):
        list_val=val.split(" ")
        #nb=list_val[len(list_val)-1].count(')')
        #for i in range(0,nb):
         #   list_val[len(list_val)-1].replace(")","")
        for i in range(0,len(list_val)-1):
                list_val[i].replace(")","")
        if ("cons" in list_val[0]):       
            del list_val[0] 
        if len(list_val)>=1:
            list_val[len(list_val)-1]="nil"
        else:
            list_val="nil"
        return list_val


    def stringToBinTree(self,val):
        if val.isdigit():
            return WhLib().intToBinTree(int(val))
        if val=="nil":
            return WhLib().cons()
        else:
            if not val=="":
                sentence=WhLib().clean(val)
                for i in range(0,len(sentence)):
                    if("cons" not in sentence[i]) :
                        tmp=sentence
                        del tmp[i]
                        s=""
                        for i in range(0,len(tmp)-1):
                            s+=tmp[i]+" "
                        return WhLib().cons(sentence[i],WhLib().stringToBinTree(s))
                    else:
                        tmp=sentence[i+1]+" "+sentence[i+2]
                        i=i+3
                        return WhLib().stringToBinTree(tmp)
            else:
                return "nil"
    


            
    def toString(self,X) -> str:
        if (not isinstance(X,bt.binTree)):
            return str(X)
        
        else:
            return "(cons " +WhLib.toString(self,X.getLeft())+" " + WhLib.toString(self,X.getRight()) + ")"
    
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