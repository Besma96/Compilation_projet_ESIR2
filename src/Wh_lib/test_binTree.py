import binTree as bt
import unittest
import queue as qu

class binTreeTest(unittest.TestCase) :
  	 
	def test_constructor_vide(self):
		"""test constructeur vide""" 
		tree = bt.binTree()
		self.assertTrue(tree.node is None)
		
	def test_cons_normal(self):
		"""test cons A B """
		A=bt.binTree()
		A=A.cons("A","B")
		self.assertEqual(A.left,'A')
		self.assertEqual(A.right,'B')

	def test_cons_solo(self):
		"""test cons X """
		A=bt.binTree()
		A=A.cons("A","B")
		tree=A.cons_solo(A)
		self.assertTrue(A.isEqual(tree))
	
	def test_cons_list(self):
		"""test cons X1 X2 ... X3"""
		L=qu.LifoQueue(11)
		for i in range (1,12):
			L.put(i)
		tree=bt.binTree()
		tree=tree.cons_list(L)
		for i in range ( 11, 1):
			self.assertEqual(tree.left,i)
			tree=tree.right
	
	def test_cons_list_vide(self):
		"""test cons [ ]"""
		L=qu.LifoQueue(11)
		tree=bt.binTree()
		tree=tree.cons_list(L)
		self.assertEqual(tree.node,"nil")

		
	def test_isTrue(self):
		"""test is true ==> cons 3 4"""
		tree = bt.binTree()
		tree=tree.cons( "3", "4")
		self.assertTrue(tree.isTrue())
	
	def test_intToBinTree(self):
		"""test int to binTree"""
		tree=bt.binTree()
		tree=tree.intToBinTree(11)
		i=0
		while i<11:
			if tree.right is not None:
				i+=1
				tree=tree.right
		self.assertEqual(i,11)
			
	def test_BinTreetoInt(self):
		"""test binTRee to Int"""
		A=bt.binTree()
		self.assertNotEqual((A.intToBinTree(11)).binTreeToInt,11)


unittest.main()
