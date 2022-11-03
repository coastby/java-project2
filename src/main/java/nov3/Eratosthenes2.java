package nov3;

import nov1.PrimeSearch;

import java.util.Arrays;

public class Eratosthenes2 {
    public int solution (int n){
        int answer = 0;
        boolean[] checks = new boolean[n+1];
        for (int i =2; i<=n; i++){
            if (checks[i] == false){
                answer++;
                for (int j = i; j <= n/i; j++) {
                    checks[i*j] = true;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int N = 100;
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);

        for(int i = 0; i < nums.length; i++){
            nums[i] = i+2;
        }

        for (int i = 2; i <= N/2; i++) {
            checks[2*i-2] = false;
        }
        for (int i = 0; i < checks.length; i++) {
            if(checks[i] == true){
                System.out.println(nums[i]);
            }
        }
    }

}
