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

	#istrue
	def isTrue(self):
		if self.node == "nil" :
			return False
		return True
	
	## Constructiond d'un arbre binaire en fonction de deux paramètres d'entrer
	##Fonction centrale de la classe binTree car à la base de toute construction
	## param : l = fils gauche
	## param : r : fils droit
	##retour : pas de retour mais création d'un arbre
	def cons(self,l,r):
		bt=binTree()
		#cas ou on a <cons var nil nil> = <nil    > 
		if ((l is None) & (r is None)):
			bt.node = "nil"
			bt.left=None
			bt.right=None
		else:	
			bt.node = "cons"
			bt.left = l
			bt.right = r
		return bt

		
	## construire un arbre binaire à partir d'un arbre binaire revient à renvoyer cet arbre bianaire
	## cf tab de traduction
	def cons_solo(self,X):
		bt=binTree()
		bt.node=X.node
		bt.left=X.left
		bt.right=X.right
		return bt

	## construction d’un binTree à partir d’une file (deque) de binTree
	## parametre : queue (liste d'element)
	##retour :  l'arbre binaire crée à partir de la file d'elmeent de queue 
	def cons_list(self,queue) :
		tree=binTree()
		bl=True
		if (queue.empty): # cas particulier où la liste est vide
			tree=tree.cons(None,None)
		else:
			if(queue.qsize()==1):# sil il n'y a qu'un seul élément dans la liste on réalise un cons avec filsgauche Null
				tree=tree.cons_solo(queue.pop)
			else:
				if(queue.qsize()>=2):# sinon on crée l'arbre de plus bas niveau puis on construit le reste non recursivement (pb python avec recursivité)
					tree=tree.cons(queue.pop,queue.pop)
					while bl:
						if (queue.qsize()>=1):
							tree=tree.cons(queue.pop, tree)
						else:
							bl=False
		return tree	

	## construction d’un binTree à partir d’une file (deque) de binTree représenatnt une liste
	## parametre : queue (liste d'element)
	##retour :  l'arbre binaire crée à partir de la file d'elmeent de queue 
	def list(self,queue) :
		tree=binTree()
		bl=True
		if (queue.qsize()==0): # cas particulier où la liste est vide
			tree=tree.cons(None,None)
		else:
			tree.cons(queue.pop, "nil")
			while bl:
				if (queue.qsize()>=1):
					tree=tree.cons(queue.pop, tree)
				else:
					bl=False
		return tree

	##construction d'un bintree à partir d'un int
	## @param self : binTree
	## @param val : int
	def intToBinTree(self, val):
		res = binTree()
		res=res.cons("nil", "nil")
		if(val != 0):
			i=0
			while i<val:
				res=res.cons("nil", res)
				i=i+1
		return res

	## évalue un binTree en int
	def binTreeToInt(self):
		if self.right is None:## cas où l'arbre est vide (en terme de int)
			return 0

		res = 0
		tree=binTree()
		tree=self.right
		while(tree!="nil"):
			res =res+1
			tree=tree.getRight()
		return res+1

	## Permet de savoir si deux arbres sont égaux

	def isEqual(self,bt):
		if bt.left==self.left:
			if bt.right==self.right:
				return True
			else:
				return False
		else:
			return False

	

	
   	 
	
	
	
