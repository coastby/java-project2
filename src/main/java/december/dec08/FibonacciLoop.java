package december.dec08;

public class FibonacciLoop {
    static int[] dp;

    public static int fibonacci(int n){
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;
        dp = new int[n+1];
        System.out.println(fibonacci(n));
    }
}
