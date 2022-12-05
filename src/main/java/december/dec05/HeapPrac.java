package december.dec05;

import java.util.Arrays;

public class HeapPrac {
    public static int[] down(int[] arr, int a){
        int par = (a-1)/2;
        int chil = a;
        if (arr[par] < arr[chil]){
            int tmp = arr[chil];
            arr[chil] = arr[par];
            arr[par] = tmp;
            if(a*2+1 < arr.length) arr = down(arr, a*2+1);
            if(a*2+2 < arr.length) arr = down(arr, a*2+2);
        }
        return arr;
    }

    public static int[] heap(int[] arr){
        for (int i = arr.length-1; i > 0; i--){
            arr = down(arr, i);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {5, 6, 7, 8, 2, 3, 6, 1, 8, 0, 4, 10};
        System.out.println(Arrays.toString(heap(arr)));
    }
}
