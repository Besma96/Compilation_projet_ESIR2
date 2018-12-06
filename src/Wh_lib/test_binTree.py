import binTree as bt
import unittest

class binTreeTest(unittest.TestCase) :
  	 
	def test_constructor_vide(self):
		"""test constructeur vide"""
		tree = bt.binTree("nil")
		self.assertEqual(tree.left,None)
		self.assertEqual(tree.right,None)
		
	def test_constructor_normal(self):
		"""test constructeur normal"""
		tree = bt.binTree("cons",'A', 'B')
		self.assertEqual(tree.left,'A')
		self.assertEqual(tree.right,'B')

		
	def test_isTrue(self):
		"""test is true"""
		tree = bt.binTree("nil", "3", "4")
		self.assertFalse(tree.isTrue())
		self.assertTrue(tree.getLeft()==None)
		self.assertTrue(tree.getLeft()!="3")
	
	def test_intToBinTree(self):
		"""test int to binTree"""
		tree=bt.binTree("nil")
		tree=tree.intToBinTree(11)
		i=0
		while i<11:
			if tree.right!=None:
				i+=1
				tree=tree.right
		self.assertEqual(i,11)
			
	def test_BinTreetoInt(self):
		"""test binTRee to Int"""
		tree=bt.binTree("cons")
		tree=tree.intToBinTree(11)
		i=tree.binTreeToInt(tree)
		self.assertNotEqual(i,11)


unittest.main()
