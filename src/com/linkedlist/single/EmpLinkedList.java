package com.linkedlist.single;

public class EmpLinkedList {

    private EmpNode head;
    private int size;

    public void addFront(Employee employee)
    {
        EmpNode node = new EmpNode(employee);
        node.setNext(head);
        head = node;
        size++;

    }

    public EmpNode removedFrontNode()
    {
        if(isEmpty())
        {
            return null;
        }
        EmpNode removed = head;
        head = head.getNext();
        size--;
        removed.setNext(null);
        return removed;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public int getSize()
    {
        return size;
    }
    public void printList()
    {
        EmpNode current = head;
        System.out.print("Head ->");
        while (current != null)
        {
            System.out.print(current);
            System.out.print(" ->");
            current = current.getNext();
        }

        System.out.println("null");
    }

}
