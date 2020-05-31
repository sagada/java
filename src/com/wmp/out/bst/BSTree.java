package com.wmp.out.bst;

public class BSTree {

    private BSTNode root = new BSTNode();

    public BSTNode insertKey(BSTNode root, char x)
    {
        BSTNode p = root;
        BSTNode newNode = new BSTNode();
        newNode.data = x;
        newNode.left = null;
        newNode.right = null;

        if(p == null)
        {
            return newNode;
        }
        else if(newNode.data < p.data)
        {
            p.left = insertKey(p.left, x);
            return p;
        }
        else if(newNode.data > p.data)
        {
            p.right = insertKey(p.right, x);
            return p;
        }
        else
        {
            return p;
        }
    }

    public void inserTBST(char x)
    {
        root = insertKey(root, x);
    }

    public BSTNode searchBST(char x)
    {
        BSTNode p = root;
        while (p != null)
        {
            if(x < p.data)
                p = p.left;
            else if(x > p.data)
                p = p.right;
            else
                return p;
        }
        return p;
    }

    public void inOrder(BSTNode root)
    {
        if(root != null)
        {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public void printTree()
    {
        inOrder(root);
        System.out.println();
    }


}
class BSTNode
{
    char data;
    BSTNode left;
    BSTNode right;
}
