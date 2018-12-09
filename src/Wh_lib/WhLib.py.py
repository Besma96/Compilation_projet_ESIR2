#!/usr/bin/env python
# coding: utf-8

# In[1]:


import binTree
import copy

def nop() :
    pass

def nil():
    return new BinTree("nil", None, None)

def cons(val1, val2):
    queue = []
    queue.append(copy.deepcopy(val1))
    queue.append(copy.deepcopy(val2))
    return binTree.cons(queue)

def list(val1, val2):
    queue=[]
    queue.append(copy.deepcopy(val1))
    queue.append(copy.deepcopy(val2))
    return binTree.list(queue)
    
    


# In[ ]:




