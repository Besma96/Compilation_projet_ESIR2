class binTree:
<<<<<<< HEAD
	#constructeur
	#Le constructeur est vide car on construira l'arbre grace aux methode list, cons, etc...
	#Utilisation : appeler le constructeur de la class ebibTRee consiste seulement à initialier reserver la place pour l'arbre qu dsera crée après
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
		if self.right is not None :
			return self.right
		return None

=======
    #constructeur
    # #Le constructeur est vide car on construira l'arbre grace aux methode list, cons, etc...
    # #Utilisation : appeler le constructeur de la class ebibTRee consiste seulement à initialier reserver la place pour l'arbre qu dsera crée après
    def __init__(self):
        self.node = None
        self.left = None
        self.right = None

  #  def __init__(self, data, leftTree, rightTree):
   #     self.node=data
   #     if self.node == "nil":
    #        self.left = None
    #        self.right = None
     #   else:
      #      self.left = leftTree
       #     self.right = rightTree

        
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
        #tree = binTree()
        if((l is None) & (r is None)):
            self.node = "nil"
            self.left = None
            self.right = None
        else :
            self.node = "cons"
            self.left = l
            self.right = r
        return self

    ## construction d'un binTree à partir d'un binTree passé en paramètre
    def cons_solo(self, X):
        self.node = X.node
        self.left = X.left
        self.right = X.right
        return self

    ##construction d'un bintree à partir d'une liste
    def cons_list(self, L):
        b1=True
        if len(L)==0:
            self.cons(None, None)
        elif len(L)==1:
            i=L.pop(len(L)-1)
            try:
                self.cons_solo(i)
            except:
                self.cons(None, i)
        elif len(L)>=2:
            self.cons(L.pop(len(L)-2), L.pop(len(L)-1))
            while b1:
                if len(L)>=1:
                    self.cons(L.pop(len(L)-1), self)
                else:
                    b1 = False
        return self


    def list(self, L):
        b1=True
        if len(L)==0:
            self.cons(None, None)
        else:
            self.cons(L.pop(len(L)-1), "nil")
            while b1:
                if len(L)>=1:
                    self.cons(L.pop(len(L)-1), self)
                else:
                    b1= False
        return self
    
    

    
>>>>>>> 2b36d6fc4e132181690bd0d584a08b9207a0cbc9

	
