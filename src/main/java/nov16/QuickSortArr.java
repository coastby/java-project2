package nov16;

import java.util.Arrays;

public class QuickSortArr {
    public static void main(String[] args) {
        int[] arr = new int[] {20, 18, 5, 19, 40, 50, 5, 25};
        int pivot = arr.length/2;
        int leftIdx = 0;
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
        System.out.println(Arrays.toString(arr));
    }
}
