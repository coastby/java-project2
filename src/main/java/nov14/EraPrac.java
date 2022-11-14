package nov14;

import java.util.Arrays;

//에라토스테네스의 체 연습
public class EraPrac {
    public static void main(String[] args) {
        int N = 50;
        //1. 2~50 배열
        int[] nums = new int[N-1];
        for (int i = 2; i <= N; i++){
            nums[i-2] = i;
        }
        //2. 2를 제외한 2의 배수 지우기
        for (int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && nums[i] != 2){
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
