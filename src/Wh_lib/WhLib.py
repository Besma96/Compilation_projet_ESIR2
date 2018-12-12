import binTree as bt
import copy
import queue as qu

class WhLib:
    # se reporter à la table de traduction pour les équivalents while

    def nop(self):
        pass

    def nil(self):
        return self.cons_intermediaire(None,None)

    def cons(self,queue):
        L=[]
        while queue.empty():
            L.append(queue.get())
        return WhLib.cons_list(self,L)

    def list(self,queue):
        L=[]
        while queue.empty():
            L.append(queue.get())
        
        return WhLib.list_intermediaire(self,L)

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
        res=WhLib.cons_intermediaire(self,"nil", "nil")
        if(val != 0):
            i=0
            while i<val:
                res=WhLib.cons_intermediaire(self,"nil", res)
                i=i+1
        return res

    ## évalue un binTree en int
    def binTreeToInt(self,X):
        if X.right is None:## cas où le fils droit est vide (en terme de int)
            return 0
        res = 0
        tree=bt.binTree()
        tree=X.right
        while(tree!="nil"):
            res =res+1
            tree=tree.getRight()
        return res

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
        L=[]
        for i in range (0,len(abc)):
            L.append(abc[i])# on lit chaque caractère qu'on stock dans la chaine L
        
        return self.cons_list(L)

    def BinTreeToStr(self,tree):
        chaine=""
        tl=True
        while tl:
            try : 
                chaine+=tree.left
                tree=tree.right
            except:
                tl=False
        chaine+=tree
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
        tree=bt.binTree()
        #cas ou on a <cons var nil nil> = <nil    > 
        if ((l is None) & (r is None)):
            tree.node = "nil"
            tree.left=None
            tree.right=None
        else:	
            tree.node = "cons"
            tree.left = l
            tree.right = r
        return tree

        
    ## construire un arbre binaire à partir d'un arbre binaire revient à renvoyer cet arbre bianaire
    ## cf tab de traduction
    def cons_solo(self,X):
        tree=bt.binTree()
        tree.node=X.node
        tree.left=X.left
        tree.right=X.right
        return tree

    ## construction d’un binTree à partir d’une file (deque) de binTree
    ## parametre : LISTE D'element 
    ##retour :  l'arbre binaire crée à partir de la file d'elmeent de queue 
    def cons_list(self,L) :
        tree=bt.binTree()
        bl=True
        if (len(L)==0): # cas particulier où la liste est vide*
            tree=WhLib.cons_intermediaire(self,None,None)
        else:
            if(len(L)==1):# sil il n'y a qu'un seul élément dans la liste on réalise un retourne le parametre d'entré
                i=L.pop(len(L)-1)
                try:
                    tree=WhLib.cons_solo(self,i)
                except:
                    tree=WhLib.cons_intermediaire(self,None,i)
            else:
                if(len(L)>=2):# sinon on crée l'arbre de plus bas niveau puis on construit le reste non recursivement (pb python avec recursivité)
                    tree=WhLib.cons_intermediaire(self,L.pop(len(L)-2),L.pop(len(L)-1))
                    while bl:
                        if (len(L)>=1):
                            tree=WhLib.cons_intermediaire(self,L.pop(len(L)-1), tree)
                        else:
                            bl=False
        return tree	

    ## construction d’un binTree à partir d’une file (deque) de binTree représenatnt une liste
    ## parametre : queue (liste d'element)
    ##retour :  l'arbre binaire crée à partir de la file d'elmeent de queue 
    def list_intermediaire(self,L) :
        tree=bt.binTree()
        bl=True
        if (len(L)==0): # cas particulier où la liste est vide
            print("null")
            tree=WhLib.cons_intermediaire(self,None,None)
        else:
            tree=WhLib.cons_intermediaire(self,L.pop(len(L)-1), "nil")
            while bl:
                if (len(L)>=1):
                    tree=WhLib.cons_intermediaire(self,L.pop(len(L)-1), tree)
                else:
                    bl=False
        return tree









