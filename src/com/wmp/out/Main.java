package com.wmp.out;

import com.wmp.out.tree.Tree;
import com.wmp.out.tree.TreeNode;


public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        TreeNode n7 = tree.makeBT(null,7,null);
        TreeNode n6 = tree.makeBT(null,6, null);
        TreeNode n5 = tree.makeBT(n7,5, null);
        TreeNode n4 = tree.makeBT(n5,4, n6);
        TreeNode n3 = tree.makeBT(n4,3, null);
        TreeNode n2 = tree.makeBT(null,2, null);
        TreeNode n1 = tree.makeBT(n2,1, n3);

        System.out.println(tree.FindMax(n1));


    }
}

