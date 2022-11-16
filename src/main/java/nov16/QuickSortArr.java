package nov16;

import nov15.QuickSort;

import java.util.Arrays;

public class QuickSortArr {
    public int[] QuickSort(int[] arr, int leftIdx, int rightIdx){
        if((rightIdx-leftIdx) <= 1){
            return arr;
        }
        int pivot = leftIdx;
        leftIdx++;
        while (leftIdx <= rightIdx){
            if(arr[leftIdx] > arr[pivot]) {
                if (arr[rightIdx] <= arr[pivot]) {
                    int tmp = arr[leftIdx];
                    arr[leftIdx] = arr[rightIdx];
                    arr[rightIdx] = tmp;
                    leftIdx++;
                }
                rightIdx--;
            } else{
                leftIdx++;
            }
        }
        int tmp = arr[pivot];
        arr[pivot] = arr[leftIdx-1];
        arr[leftIdx-1] = tmp;
        QuickSort(arr, 0, leftIdx-2);       //여기가 문제인듯
        QuickSort(arr, leftIdx, arr.length-1);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {20, 18, 5, 19, 40, 150, 50, 5, 25, 100, 200};
        int pivot = 0;
        int leftIdx = 1;
        int rightIdx = arr.length-1;
        while (leftIdx <= rightIdx){
            if(arr[leftIdx] > arr[pivot]) {
                if (arr[rightIdx] < arr[pivot]) {
                    int tmp = arr[leftIdx];
                    arr[leftIdx] = arr[rightIdx];
                    arr[rightIdx] = tmp;
                    leftIdx++;
                }
                rightIdx--;
            } else{
                leftIdx++;
            }
        }
        int tmp = arr[pivot];
        arr[pivot] = arr[leftIdx-1];
        arr[leftIdx-1] = tmp;
        System.out.println(leftIdx);
        System.out.println(Arrays.toString(arr));

        QuickSortArr qs = new QuickSortArr();
//        System.out.println(qs.QuickSort(arr, 0, arr.length-1));
    }
}
