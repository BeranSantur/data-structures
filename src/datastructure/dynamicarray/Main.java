package datastructure.dynamicarray;

public class Main {
    public static void main(String[] args) {
     /*   ArrayList<Integer> myArrayList2 = new ArrayList<>();

        myArrayList.get();*/

        MyArrayList myArrayList = new MyArrayList(2);
        myArrayList.add(15);
        myArrayList.add(25);
        myArrayList.add(35);
        myArrayList.delete(25);
        myArrayList.print();
        System.out.println("Element index is: " + myArrayList.getIndexByElement(35));
    }
}
