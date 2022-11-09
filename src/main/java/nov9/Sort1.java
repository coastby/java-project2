package nov9;

import java.util.Arrays;

interface Comperator {
    boolean compare (int a, int b);
}

public class Sort1 {

    public int[] SelectionSort(int[] arr, Comperator comperator){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++){
                if (comperator.compare(arr[j], arr[i])){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = new int[] {2, 7, 4, 9, 10, 223, 111, 23, 1, 3, 39};
        //익명클래스 적용 (내림차순)
        Sort1 sort1 = new Sort1();
        sort1.SelectionSort(arr, new Comperator() {
            @Override
            public boolean compare(int a, int b) {return a > b;}
        });


        //람다 적용 (내림차순)
        Sort1 sort11 = new Sort1();
        sort11.SelectionSort(arr, (a, b) -> a > b);

    }
}
