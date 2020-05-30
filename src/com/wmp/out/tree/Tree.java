package com.wmp.out.tree;

public class Tree {
    private TreeNode root;

    public TreeNode makeBT(TreeNode bt1, int data, TreeNode bt2)
    {
        TreeNode root = new TreeNode();

        root.data = data;
        root.left = bt1;
        root.right = bt2;
        return root;
    }

    public int FindMax(TreeNode root)
    {
        int root_val, left, right, max = Integer.MIN_VALUE;
        if(root != null)
        {
            root_val = root.data;
            left = FindMax(root.left);
            right = FindMax(root.right);

            if(left > right)
            {
                max = left;
            }
            else
                max = right;

            if(max < root_val)
                max = root_val;
        }
        return max;
    }

    public void preOrder(TreeNode root)
    {
        if(root != null)
        {
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void inOdrder(TreeNode root)
    {

    }

    public void postOrder(TreeNode root)
    {

    }


}
