package november.nov15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public int[] quick (int[] arr){
        if(arr.length == 1 || arr.length == 0){
            return arr;
        }
        int[] result = new int[arr.length];
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

        result[left.size()] = pivot;
        int[] leftArr = left.stream().mapToInt(i -> i).toArray();
        leftArr = quick(leftArr);
        for (int i = 0; i < left.size(); i++) {
            result[i] = leftArr[i];
        }
        int[] rightArr = right.stream().mapToInt(i -> i).toArray();
        rightArr = quick(rightArr);
        for (int i = 0; i < right.size(); i++){
            result[i+left.size()+1] = rightArr[i];
        }
        return result;
    }

    public List<Integer> quickSortList(List<Integer> arr){
        if(arr.size() <= 1){
            return arr;
        }
        //1. 기준갑 뽑는 로직 구현
        int mid = arr.size()/2;
        int pivot = arr.get(mid);

        //2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if(i != mid){
                if(arr.get(i) < pivot){
                    left.add(arr.get(i));
                } else{
                    right.add(arr.get(i));
                }
            }
        }
        left = quickSortList(left);
        right = quickSortList(right);

        List<Integer> result = new ArrayList<>();
        result.addAll(left);
        result.add(pivot);
        result.addAll(right);

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {20, 18, 5, 19, 5, 25, 40, 50, 1, 100};
        List<Integer> nums = List.of(20, 18, 5, 19, 5, 25, 40, 50, 1, 100);
        QuickSort qs = new QuickSort();
        System.out.println(Arrays.toString(qs.quick(arr)));
        System.out.println(qs.quickSortList(nums));
    }
}
