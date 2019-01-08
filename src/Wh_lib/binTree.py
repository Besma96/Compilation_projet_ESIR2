import queue as qu
import WhLib as wh

class binTree:
    #constructeur
    # #Le constructeur est vide car on construira l'arbre grace aux methode list, cons, etc...
    # #Utilisation : appeler le constructeur de la class ebibTRee consiste seulement à initialier reserver la place pour l'arbre qu dsera crée après
    def __init__(self):
        self.node = None
        self.left = None
        self.right = None

        
    #getteur
    def getNode(self):
        return self.node
    
    def getLeft(self):
        return self.left
    
    def getRight(self):
        return self.right
        
    #setteur
    def setLeft(self, leftTree):
        self.left = leftTree
    
    def setRight(self, rightTree):
        self.right = rightTree
    
    def head(self):
        if self.left is not None :
            return self.left
        return None
    
    def tail(self):
        if self.right is not None:
            return self.right
        return None

    def isTrue(self):
        if self.node == "nil":
            return False
        return True
        
    def isNil(self):
        b1 = (self.node=="nil") and (self.left is None) and (self.right is None)
        b2 = (self == "nil")
        return (b1 or b2)

    def isEqual(self, X):
        if self.right == X.right:
            if self.left == X.left:
                return True
            else :
                return False
        else:
            return False


    ## construction d'un binTree à partir de deux paramètres fils droit et fils gauche
    def cons(self, l, r):
        tree = binTree()
        if((l is None) & (r is None)):
            tree.node = "nil"
            tree.left = None
            tree.right = None
        else :
            tree.node = "cons"
            tree.left = l
            tree.right = r
        return tree

    ## construction d'un binTree à partir d'un binTree passé en paramètre
    def cons_solo(self, X):
        self.node = X.node
        self.left = X.left
        self.right = X.right
        return self

    def all_nodes(self):
        liste_nodes=[]
        nodes = qu.Queue()
        nodes.put(self)
        while nodes.qsize() > 0 :
            node = nodes.get()
            if node is not None and isinstance(node, binTree):
                if ((node not in liste_nodes) ):  
                    liste_nodes.append(node)
                    nodes.put(node.head())
                    nodes.put(node.tail())
        return liste_nodes

