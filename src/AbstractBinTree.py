#!/usr/bin/env python
# coding: utf-8

# In[12]:


## classe binTree
## représentation interne du type binTree (arbre binaire)

## paramètres 
### node : noeud de l'arbre (racine)
### left : fils gauche 
### right : fils droit

## interprétation de l'arbre
### paramètres à none --> nil
### right & left à none --> symbole
### right & left != none --> cons


import abc

class binTree :
    __metaclass__ = ABCMeta
    
    #constructeur
    @abc.abstractmethod
    def __init__(node, left, right):
        self.node = node
        self.left = left
        self.right = right
  
    #getter de la racine
    @abc.abstractmethod
    def node(self):
        return self.node
    
    #getter du fils gauche (head)
    @abc.abstractmethod
    def hd(self):
        return self.left
    
    #getteur du fils droit (tail)
    @abc.abstractmethod
    def tl(self):
        return self.right
    
    #booléen : l'arbre à un fils gauche
    def hasLeft(self):
        return self.left != None

    #booléen : l'arbre a un fils droit
    def hasRight(self):
        return self.right != None
        
    @abc.abstractmethod
    def binTreeToInt(self):
        return ("not implemented yet")
    
    @abc.abstractmethod
    def intToBinTree(n):
        return ("not implemented yet")
    
    @abc.abstractmethod
    def stringToBinTree(s):
         return ("not implemented yet")
        
    @abc.abstractmethod
    def toString(self):
        return ("not implemented yet")
    
    def isNil(self) :
        if (self.left == None & self.right == None) :
            return (self.node == None)
        return false
    
    def isSymbol(self):
        return (self.node !=None & self.left == None & self.right == None)
    
#binTree.register(nilTree)


# In[ ]:


class exprTree(binTree):
    
    
    
    def intToBinTree
    
    def binTreeToInt
    
    def 


# In[20]:


import abc

class nilTree(binTree):
    
    def __init__(self) :
        super().__init__(None, None, None)
    
    #utile ?
    def nilToTree() :
        return nilTree()
        
        
    


# In[21]:


import abc

class symbolTree(binTree) :
    
    def __init__(val):
        assert(isInstance(val, str)), "wrong input : not a symbol"
        super().__init__(val, None, None)
    
    #utile ?
    def symbolToTree(symb):
        return symbolTree(symb)


# In[22]:


import abc 

class consTree(binTree) :
    
    def __init__(val, fg, fd):
        super().__init__(val, fg, fd)
    


# In[ ]:




