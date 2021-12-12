package datastructure.dynamicarray;

import java.util.ArrayList;

public class MyArrayList {
    private int[] myStaticArray;
    private int count;

    public MyArrayList(){
        myStaticArray = new int[10];
    }

    public MyArrayList(int length){
        myStaticArray = new int[length];
    }

    public void add(int data){
        if(count == myStaticArray.length){
            int[] temp = new int[myStaticArray.length * 2];
            for (int i = 0; i < myStaticArray.length; i++) {
                temp[i] = myStaticArray[i];
            }
            myStaticArray = temp;
        }

        myStaticArray[count++] = data;
    }

    public int getElementByIndex(int index){
        if(index >= 0)
         return myStaticArray[index];
        return -1;
    }

    public int getIndexByElement(int data){

        for (int i = 0; i < count; i++) {
            if(myStaticArray[i] == data){
                return i;
            }
        }
        return -1;
    }

    public void delete(int item){

        for (int i = getIndexByElement(item); i < count; i++) {
            myStaticArray[i] = myStaticArray[i + 1];
        }
    }

    public void print(){
        for (int i = 0; i < myStaticArray.length; i++) {
            System.out.println(myStaticArray[i]);
        }
    }

}
