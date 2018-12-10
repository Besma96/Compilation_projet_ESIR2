import binTree as bt
import copy
import queue as qu

class WhLib:
    # se reporter à la table de traduction pour les équivalents while
    def __init__(self):
        self.tree=bt.binTree()

    def nop(self):
        pass

    def nil(self):
        return self.cons(None,None)

    def cons(self,*args):
        L=qu.LifoQueue(len(args))

        for i in args:
            L.put(i)    

        return self.cons_list(L)

    def list(self,*args):
        L=qu.LifoQueue(len(args))

        for i in args:
            L.put(i)
        self.tree=self.list_intermediaire(L)
        return self.tree

    def hd(self,X):
        return X.head()

    def tail(self,X):
        return X.tail()
        
    #istrue
    def isTrue(self,X): 
        if X.node == "nil" :
            return False
        return True


    ##construction d'un bintree à partir d'un int
    ## @param self : binTree
    ## @param val : int
    def intToBinTree(self,val):
        res = bt.binTree()
        res=self.cons_intermediaire("nil", "nil")
        if(val != 0):
            i=0
            while i<val:
                res=self.cons_intermediaire("nil", res)
                i=i+1
        return res

    ## évalue un binTree en int
    def binTreeToInt(self,X):
        if X.right is not None:## cas où l'arbre est vide (en terme de int)
            return 0

        res = 0
        tree=bt.binTree()
        tree=X.right
        while(tree!="nil"):
            res =res+1
            tree=tree.getRight()
        return res+1

    ## Permet de savoir si deux arbres sont égaux
    def isEqual(self,X,Y):
        if X.left==Y.left:
            if X.right==Y.right:
                return True
            else:
                return False
        else:
            return False

    def isNotEqual(self,X,Y):
        return not self.isEqual(X,Y)

    def StringToBinTree(self,abc):
        L=qu.LifoQueue(len(abc))
        for i in range (0,len(abc)+1):
            L.put(abc[i])# on lit chaque caractère qu'on stock dans la chaine L
        
        return self.cons_list(L)

    def BinTreeToInt(self,tree):
        chaine=""
        tl=True
        while tl:
            if tree.left is not None:
                chaine+=tree.left
                tree=tree.right
            else:
                tl=False
        return chaine


    ###########################################################################################################################
    ###########################################################################################################################
    #fonction intermediaire servant aux fonctions plus haut
    ###########################################################################################################################
    ###########################################################################################################################

    ## Constructiond d'un arbre binaire en fonction de deux paramètres d'entrer
    ##Fonction centrale de la classe binTree car à la base de toute construction
    ## param : l = fils gauche
    ## param : r : fils droit
    ##retour : pas de retour mais création d'un arbre
    def cons_intermediaire(self,l,r):
        #cas ou on a <cons var nil nil> = <nil    > 
        if ((l is None) & (r is None)):
            self.tree.node = "nil"
            self.tree.left=None
            self.tree.right=None
        else:	
            self.tree.node = "cons"
            self.tree.left = l
            self.tree.right = r
        return self.tree

        
    ## construire un arbre binaire à partir d'un arbre binaire revient à renvoyer cet arbre bianaire
    ## cf tab de traduction
    def cons_solo(self,X):
        tree=bt.binTree()
        tree.node=X.node
        tree.left=X.left
        tree.right=X.right
        return tree

    ## construction d’un binTree à partir d’une file (deque) de binTree
    ## parametre : queue (liste d'element)
    ##retour :  l'arbre binaire crée à partir de la file d'elmeent de queue 
    def cons_list(self,queue) :
        tree=bt.binTree()
        bl=True
        if (queue.empty): # cas particulier où la liste est vide
            tree=self.cons_intermediaire(None,None)
        else:
            if(queue.qsize()==1):# sil il n'y a qu'un seul élément dans la liste on réalise un cons avec filsgauche Null
                tree=self.cons_solo(queue.pop)
            else:
                if(queue.qsize()>=2):# sinon on crée l'arbre de plus bas niveau puis on construit le reste non recursivement (pb python avec recursivité)
                    tree=self.cons_intermediaire(queue.pop,queue.pop)
                    while bl:
                        if (queue.qsize()>=1):
                            tree=self.cons_intermediaire(queue.pop, tree)
                        else:
                            bl=False
        return tree	

    ## construction d’un binTree à partir d’une file (deque) de binTree représenatnt une liste
    ## parametre : queue (liste d'element)
    ##retour :  l'arbre binaire crée à partir de la file d'elmeent de queue 
    def list_intermediaire(self,queue) :
        tree=bt.binTree()
        bl=True
        if (queue.qsize()==0): # cas particulier où la liste est vide
            tree=self.cons_intermediaire(None,None)
        else:
            self.cons_intermediaire(queue.pop, "nil")
            while bl:
                if (queue.qsize()>=1):
                    tree=self.cons_intermediaire(queue.pop, tree)
                else:
                    bl=False
        return tree









