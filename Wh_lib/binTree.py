class binTree:
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


	
	
