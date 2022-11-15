package nov15;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50};
        //1. 기준갑 뽑는 로직 구현
        int start = 0;
        int end = arr.length;
        int mid = (start + end)/2;
        int pivot = arr[mid];

        //2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = start; i < end; i++) {
            if(i != mid){
                if(arr[i] < pivot){
                    left.add(arr[i]);
                } else{
                    right.add(arr[i]);
                }
            }
        }
    }
}
