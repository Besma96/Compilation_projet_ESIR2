import WhLib as wh
import unittest
from binTree import *

########################################################################################################
########################################################################################################
# Test unitaire et fontionnels de la classe WhLib 
########################################################################################################
class WhLibTest(unittest.TestCase) :

    def test_nop(self):
        """test nop --> WhLib().nop()"""
        val=0
        if("a" in "abc"):
            wh.WhLib().nop()
        else:
            val=1
        self.assertNotEqual(val,1)

    def test_nil(self):
        """Test_nil --> whLib().nil()"""
        A=binTree()
        A=wh.WhLib().nil()
        self.assertTrue(A.right is None)
        self.assertIsNone(A.left )
        self.assertEqual(A.node, "nil")
    
    def test_cons_0(self):
        """Test_cons vide --> WhLib().cons()"""
        A=wh.WhLib().cons()
        self.assertEqual(A.getNode(),"nil")
        self.assertTrue(A.right is None)
        self.assertIsNone(A.left )

    def test_cons_1(self):
        """Test_cons 1 element --> WhLib().cons(X)"""
        A=wh.WhLib().cons()
        B=wh.WhLib().cons(A)
        self.assertEqual(A.node,B.node)
        self.assertEqual(A.left,B.left)
        self.assertEqual(A.right,B.right)

    def test_cons_n(self):
        """Test_cons n elements --> WhLib().cons(X1, X2, ..., Xn)"""
        A=wh.WhLib.cons("1", "2", "3", 4, 5)
        self.assertEqual(A.left,"2")
        A=A.right
        self.assertEqual(A.left,"3")
        A=A.right
        self.assertEqual(A.left,4)
        self.assertEqual(A.right,5)

    def test_list_1(self):
        """Test_list_1 --> WhLib().list(t1)"""
        A=wh.WhLib.list(1,2)
        self.assertEqual(A.right,"nil")
        self.assertEqual(A.left,2)

    def test_list_n(self):
        """Test_list_n --> WhLib().list(t1, t2, .., tn)"""
        A=A=wh.WhLib.list(1,2,3,4,5)
        self.assertEqual(A.left,2)
        A=A.right
        self.assertEqual(A.left,3)
        A=A.right
        self.assertEqual(A.left,4)
        A=A.right
        self.assertEqual(A.left,5)
        self.assertEqual(A.right,"nil")

    def test_isTrue(self):
        """test is true ==> cons 3 4"""
        tree=wh.WhLib().cons( "3", "4")
        self.assertTrue(wh.WhLib().isTrue(tree))

    def test_intToBinTree(self):
        """test int to binTree"""
        tree=wh.WhLib().intToBinTree(11)
        i=0
        while i<11:
            if tree.right is not None:
                i+=1
                tree=tree.right
        self.assertEqual(i,11)

    def test_BinTreetoInt(self):
        """test binTRee to Int"""
        self.assertNotEqual((wh.WhLib().binTreeToInt(wh.WhLib().intToBinTree(11))),11)

  

        



unittest.main()