package datastructure.stack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(14);
        singlyLinkedList.addHead(15);
        singlyLinkedList.addHead(25);
        singlyLinkedList.addHead(35);
        singlyLinkedList.addHead(45);


        singlyLinkedList.removeHead();
        singlyLinkedList.print();

    }

}
