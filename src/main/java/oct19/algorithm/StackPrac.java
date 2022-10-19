package oct19.algorithm;

public class StackPrac {
    private int[] arr;
    private int pointer = 0;


    public StackPrac() {
        arr = new int[10000];
    }

    public StackPrac(int size) {
        arr  = new int[size];
    }
    public int[] getArr(){
        return this.arr;
    }
    public void push(int value){
        arr[pointer++] = value;
    }

    public int pop(){
        //push를 하면 pointer가 마지막 값의 위의 인덱스를 가리키고 있어서 pointer-1이 현재의 값일 것이다.
        int p = arr[pointer-1];
        --pointer;
        return p;
    }
}
