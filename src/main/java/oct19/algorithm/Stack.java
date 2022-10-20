package oct19.algorithm;

public class Stack {
    private Integer[] arr;
    private int top = -1;
    public Stack() {
        arr = new Integer[10000];
    }
    public Stack(int size) {
        arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(Integer value) {
        this.arr[++top] = value;
    }

    public Integer pop() {
        return this.arr[--this.top];
    }
}
