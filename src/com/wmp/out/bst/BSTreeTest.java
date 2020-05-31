package com.wmp.out.bst;

public class BSTreeTest {
    public static void main(String[] args) {
        BSTree bst = new BSTree();
        bst.inserTBST('G');
        bst.inserTBST('I');
        bst.inserTBST('H');
        bst.inserTBST('D');
        bst.inserTBST('B');
        bst.inserTBST('M');
        bst.inserTBST('N');
        bst.inserTBST('A');
        bst.inserTBST('J');
        bst.inserTBST('E');
        bst.inserTBST('Q');

        System.out.println("\n Binary Tree >>>> ");
        bst.printTree();

        System.out.println("Is Thee \"A\" ? >>>");
        BSTNode p1 = bst.searchBST('A');
        if(p1 != null)
        {
            System.out.printf("Searching Success! Searched key : %c \n", p1.data);
        }
        else
        {
            System.out.printf("Searching False! There is no %c \n", p1.data);
        }

        System.out.println("Is there \"Z\" ? >>>");
        BSTNode p2 = bst.searchBST('Z');
        if (p2 != null)
        {
            System.out.printf("Searching Success! Searched key : %c \n", p1.data);
        }
        else
        {
            System.out.printf("Searching False! There is no %c \n", p1.data);
        }

    }
}
