package datastructure.doublylinkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();


        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addLast(15);
        doublyLinkedList.addLast(25);
        doublyLinkedList.addLast(35);
        doublyLinkedList.addLast(45);
        doublyLinkedList.addLast(55);

        doublyLinkedList.swapTwoElements(15, 35);
        doublyLinkedList.print();

    }
}
