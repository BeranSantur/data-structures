package datastructure.stack;

public class ArrayStack {
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        stackArray = new int[size];
        top = 0;
    }

    public void push(int item){

        if(stackArray.length == top){
            int[] newArray = new int[stackArray.length * 2];
            for (int i = 0; i < top; i++) {
                newArray[i] = stackArray[i];
            }
            stackArray = newArray;
        }

        stackArray[top] = item;
        top++;
    }

    public void pop(){
        top--;
    }

    public int peek(){
        return stackArray[top - 1];
    }

    public void print(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        for (int i = 0; i < top; i++) {
            stringBuilder.append(stackArray[i]);
            if(i != top - 1 ){
             stringBuilder.append(", ");
            }
        }
        stringBuilder.append(" ]");
        System.out.println(stringBuilder.toString());
    }



}
