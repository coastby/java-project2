package november.nov16;

import java.util.Arrays;

public class QuickSortArr {
    public int[] QuickSort(int[] arr, int leftIdx, int rightIdx){
        if((rightIdx-leftIdx) <= 0){
            return arr;
        }
        int pivot = leftIdx;
        int end = rightIdx;
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
        arr = QuickSort(arr, pivot, leftIdx-2);       //여기가 문제인듯
        arr = QuickSort(arr, leftIdx, end);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {20, 18, 5, 19, 40, 150, 50, 5, 25, 100, 200};
        int pivot = 0;
        int leftIdx = 1;
        int rightIdx = arr.length-1;
        while (leftIdx <= rightIdx){
            if(arr[leftIdx] > arr[pivot]) {         //왼쪽 인덱스가 피봇보다 크면
                if (arr[rightIdx] < arr[pivot]) {   //오른쪽 인덱스가 피봇보다 작으면
                    int tmp = arr[leftIdx];         //오른쪽 왼쪽 인덱스 swap
                    arr[leftIdx] = arr[rightIdx];
                    arr[rightIdx] = tmp;
                    leftIdx++;
                }
                rightIdx--;
            } else{
                leftIdx++;
            }
        }
        int tmp = arr[pivot];           //피봇과 왼쪽 인덱스
        arr[pivot] = arr[leftIdx-1];
        arr[leftIdx-1] = tmp;
        System.out.println(leftIdx);
        System.out.println(Arrays.toString(arr));

        QuickSortArr qs = new QuickSortArr();
        System.out.println(Arrays.toString(qs.QuickSort(arr, 0, arr.length-1)));
    }
}
