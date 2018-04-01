package com.linkedlist.single;

public class EmpList2 {

    public static void main(String args[])
    {


        Employee sanghaDavane= new Employee("Sangha", "Davane", 101);
        Employee RanghaTavane= new Employee("Rangha", "Tavane", 101);
        Employee tarTavane= new Employee("Tarangha", "Tavane", 101);
        Employee MalighaRava= new Employee("Maligha", "Ravane", 101);

        EmpLinkedList list = new EmpLinkedList();
        System.out.println(list.isEmpty());
        list.addFront(sanghaDavane);
        list.addFront(RanghaTavane);
        list.addFront(tarTavane);
        list.addFront(MalighaRava);

        list.printList();
        System.out.println(list.getSize());

        list.removedFrontNode();
        System.out.println(list.getSize());
        list.printList();






    }
}
