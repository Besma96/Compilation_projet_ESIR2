class binTree:
	#constructeur
	def __init__(self, data, leftTree=None, rightTree=None):
		self.node = data
		if data != "nil":
			self.left = leftTree
			self.right = rightTree
		else :
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
		if self.node != "nil" :
			self.left = leftTree
	   	 
	def setRight(self, rightTree):
		if self.node != "nil" :
			self.right = rightTree
	
	def head(self):
		if self.left != None :
			return self.left
		return None

	def tail(self):
		if self.right != None :
			return self.right
		return None

	#ToString
	# Affiche l'abre binaire 
	def ToString(self, bn):
		print( "(%s , %s , %s)" % (bn.node,self.ToString(bn.left),self.ToString(bn.right)))

	#istrue
	def isTrue(self):
		if self.node == "nil" :
			return False
		return True
	


	##construction d'un bintree à partir d'un int
	## @param self : binTree
	## @param val : int
	def intToBinTree(self, val):
		res = binTree("nil", None, None)
		if(val != 0):
			i=0
			while i<val:
				nil = binTree("nil", None, None)
				res = binTree("cons", nil, res)
				i=i+1
		return res

	## évalue un binTree en int
	def binTreeToInt(self,bt):
		res = 0
		if(bt.getRight != None) :
			if(bt.getNode == "cons" ):
				res = res +1
				res = res + self.binTreeToInt(bt.getRight)
		return res

	## construction d’un binTree à partir d’une file (deque) de binTree
	## Si la file est vide on renvoi None
	## Sinon on retourne l'arbre binaire constitué des élément de la file en entrée
	def cons(self,queue) :
		if(queue != None):
			
			if(len(queue) == 0) :
				return binTree("cons", None, None)
				
			tree = queue.pop()
			if(len(queue) <=0):
				return tree
			else :
				return binTree("cons", tree, self.cons(queue))
		return None
	
	## construction d’un binTree à partir d’une file (deque) de binTree représenatnt une liste
	## Si la file est vide on renvoi None
	## Sinon on retourne l'arbre binaire (représentant la liste) constitué des élément de la file en entrée
	def list(self,queue) :
		if(queue != None):
			
			if(len(queue) == 0) :
				return binTree("nil", None, None)
				
			tree = queue.pop()
			if(len(queue) <=0):
				return tree
			else :
				return binTree("list", tree, self.list(queue))
		return None






	
   	 
	
	
	
