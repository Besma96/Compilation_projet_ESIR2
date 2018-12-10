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
        A=A.right
        L=[1,2,3,4,5,2,1]
        for i in range (0,len(L)-1):
            self.assertEqual(A.left,L[i])


        



unittest.main()