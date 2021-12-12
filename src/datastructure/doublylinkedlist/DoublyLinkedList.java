package datastructure.doublylinkedlist;

public class DoublyLinkedList {
    private static class Node {
        private int data;
        private Node next;
        private Node previous;

        protected Node(int data) {
            this.data = data;
        }

    }

    private Node head;
    private Node tail;
    private int count;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        count++;
    }

    public void swapTwoElements(int firstElement, int secondElement) {
        Node firstNode = head;
        while (firstNode != null && firstNode.data != firstElement) {
            firstNode = firstNode.next;
        }

        Node secondNode = head;

        while (secondNode != null && secondNode.data != secondElement) {
            secondNode = secondNode.next;
        }
        if (firstNode == null || secondNode == null) {
            return;
        }

        if (firstNode.previous != null) {
            firstNode.previous.next = secondNode;
        } else {
            head = secondNode;
        }
        if (firstNode.next != null) {
            firstNode.next.previous = secondNode;
        } else {
            tail = secondNode;
        }

        if (secondNode.previous != null) {
            secondNode.previous.next = firstNode;
        } else {
            head = firstNode;
        }
        if (secondNode.next != null) {
            secondNode.next.previous = firstNode;
        } else {
            tail = firstNode;
        }
        Node firstNodeNext = firstNode.next;
        Node firstNodePrevious = firstNode.previous;

        firstNode.next = secondNode.next;
        firstNode.previous = secondNode.previous;

        secondNode.next = firstNodeNext;
        secondNode.previous = firstNodePrevious;
    }

    public int get(int index) {

        Node current = head;

        for (int i = 0; i < index && current != null; i++) {
            current = current.next;
        }
        if (current != null)
            return current.data;
        return -1;
    }

    public int indexOf(int data) {
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == data) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public boolean delete(int data) {
        Node current = head;

        while (current != null) {

            if (head.data == data) {
                head = head.next;
                return true;
            } else if (tail.data == data) {
                tail.previous.next = null;
                tail = tail.previous;
                return true;
            } else if (current.data == data) {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
