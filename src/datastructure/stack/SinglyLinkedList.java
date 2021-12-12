package datastructure.stack;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public void addHead(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = head;

        } else {
            newNode.next = head;
            head = newNode;
        }
        size ++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size ++;

    }

    public void removeHead(){
        if(head == null){
            return;
        }else if(head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
        size --;
    }

    public void removeLast(){
        if(head == null){
            return;
        }else if(tail == head){
         head = tail = null;
        }else{
            Node current = head;
            while (current != null){
                if(current.next == tail){
                    current.next = null;
                    tail = current;
                }
                current = current.next;
            }
        }
        size--;
    }

    public void insertSorted(int value){
        if(getSize() == 0){
            return;
        }

        Node current = head;
        while (current != null){
            if(current.data > value){

            }
        }
    }

    public int getSize(){
        return size;
    }

    public void print(){
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void sortElements() {
        for (int lastUnsortedIndex = 0; lastUnsortedIndex < getSize() - 1; lastUnsortedIndex++) {

        }
    }


}
