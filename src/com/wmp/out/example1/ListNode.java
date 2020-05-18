package com.wmp.out.example1;

public class ListNode {
    private int data;
    private ListNode next;
    public ListNode(int data)
    {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    int ListLength(ListNode headNode)
    {
        int length = 0;
        ListNode currentNode = headNode;
        while(currentNode != null)
        {
            length++;
            currentNode = headNode.getNext();
        }
        return length;
    }

    ListNode InsertInLinkedList (ListNode headNode, ListNode nodeInsertNode, int position)
    {
        if(headNode == null) //최초로 설정
        {
            return nodeInsertNode;
        }

        int size = ListLength(headNode);
        if(position > size + 1 || position < 1)
        {
            System.out.println("불가능함");
        }

        if(position == 1) //첫 노드를 삽입한다.
        {
            nodeInsertNode.setNext(headNode);
            return nodeInsertNode;
        }
        else
        {
            ListNode previousNode = headNode;
            int count = 1;

            while(count < position - 1)
            {
                previousNode =  previousNode.getNext();
                count++;
            }
            ListNode currentNode = previousNode.getNext();
            nodeInsertNode.setNext(currentNode);
            previousNode.setNext(nodeInsertNode);
            return headNode;
        }
    }

}
