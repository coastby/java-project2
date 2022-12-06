package december.dec06;

import java.util.Arrays;

public class Heap2 {
    public static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    public static int[] heapSort (int[] arr){
        int last = arr.length-1;
        while (last > 0) {
            for (int i = last; i > 0; i--){
                int par = (i-1)/2;
                if (arr[i] > arr[par]){
                    swap(arr, i , par);
                }
            }
            swap(arr, 0, last);
            last--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {5, 6, 7, 8, 2, 3, 6, 1, 8, 0, 4, 10};
        System.out.println(Arrays.toString(heapSort(arr)));
    }
}
