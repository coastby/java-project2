package november.nov9;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

interface Comperator {
    boolean compare (int a, int b);
}

public class Sort1 {
    public int[] SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int min = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = min;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

//    public int[] SelectionSort(int[] arr, Comperator comperator){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++){
//                if (comperator.compare(arr[j], arr[i])){
//                    int tmp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }

    public int[] SelectionSortFunc(int[] arr, BiFunction<Integer, Integer, Boolean> bif){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++){
                if (bif.apply(arr[j], arr[i])){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public int[] SelectionSortPre(int[] arr, BiPredicate<Integer, Integer> bp){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++){
                if (bp.test(arr[j], arr[i])){
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
        Sort1 sort1 = new Sort1();
        sort1.SelectionSort(arr);


//        //??????????????? ?????? (????????????)
//        sort1.SelectionSort(arr, new Comperator() {
//            @Override
//            public boolean compare(int a, int b) {return a > b;}
//        });


        //?????? ?????? (????????????)
//        sort1.SelectionSort(arr, (a, b) -> a > b);

        //Bifunction ??????
        BiFunction<Integer, Integer, Boolean> fn = (a, b) -> a > b;
        sort1.SelectionSortFunc(arr, fn);

        //BiPredicate ??????
        BiPredicate<Integer, Integer> bp = (a, b) -> a > b;
        sort1.SelectionSortPre(arr, bp);

    }
}
