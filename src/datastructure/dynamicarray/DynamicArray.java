package datastructure.dynamicarray;

/**
 Author: Beran Santur
 */
public class DynamicArray {
    private int count;
    private int[] array;

    public DynamicArray(int size) {
        array = new int[size];
    }

    public DynamicArray() {
        array = new int[10];
    }


    public int insert(int item) {
        resizeArrayIfItsFull();
        array[count] = item;
        count++;
        return item;
    }

    public void remove(int item){
        int foundIndex = findIndexOfGivenItem(item);

        if(foundIndex != -1){
            removeAtGivenPosition(foundIndex);
        }
    }

    public void traverseAndPrint(){
          for (int i = 0; i < count; i++) {
              System.out.print(array[i] + " ");
        }
    }

    public int insertAtGivenPosition(int index, int item){
        resizeArrayIfItsFull();
        for (int i = count; i > index ; i--) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        count++;
        return item;
    }

    public void removeAtGivenPosition(int index){

        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    private void resizeArrayIfItsFull() {
        if (this.count == array.length) {
            int[] resizedArray = new int[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                resizedArray[i] = array[i];
            }

            array = resizedArray;
        }
    }

    private int findIndexOfGivenItem(int item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }
        return -1;
    }
}
