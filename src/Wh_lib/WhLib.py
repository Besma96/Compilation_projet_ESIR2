import binTree as bt
import copy
import queue as qu
# se reporter à la table de traduction pour les équivalents while
def nop():
    pass

def nil():
    tree=bt.binTree()
    return tree.cons(None,None)

def cons(*args):
    tree=bt.binTree()
    L=qu.LifoQueue(len(args))

    for i in args:
        L.put(i)    
    
    tree=tree.cons_list(L)
    return tree

def list(*args):
    tree=bt.binTree()
    L=qu.LifoQueue(len(args))

    for i in args:
        L.put(i)
    tree=tree.list(L)
    return tree

def hd(X):
    tree=bt.binTree()
    return tree.head()

def tail(X):
     tree=bt.binTree()
     return tree.tail()




    


