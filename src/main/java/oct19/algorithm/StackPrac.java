package oct19.algorithm;

import java.util.Stack;

public class StackPrac {
    private int[] arr;
    private int pointer = 0;


    public StackPrac() {
        arr = new int[10000];
    }

    public StackPrac(int size) {
        arr  = new int[size];
    }
    public int[] getStack(){
        return this.arr;
    }
    public void push(int value){
        arr[pointer++] = value;
    }
}
