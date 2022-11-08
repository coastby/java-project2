package nov8;

import java.util.Scanner;

public class BinarySearchPrac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int start = 0;
        int end = nums.length;
        while (start < end){
            int mid = (start+end)/2;
            if (nums[mid] == k){
                System.out.println(mid);
                break;
            } else if (k < nums[mid]) {
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
    }
}
