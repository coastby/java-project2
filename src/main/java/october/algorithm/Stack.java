package october.algorithm;

import java.util.EmptyStackException;

public class Stack<T> {
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

    //
    public Integer pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[this.top--];

    }

    public boolean isEmpty() {
        boolean isEmpty = (this.top == -1);
        return isEmpty;
    }

    public Integer peek() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.arr[top];
    }
}
