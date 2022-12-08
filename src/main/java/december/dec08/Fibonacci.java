package december.dec08;

public class Fibonacci {
    static int[] dp;

    public static int fibonacci(int n){
        if (n < 2) {
            dp[n] = n;
            return n;
        } else {
            if (dp[n] > 0) return dp[n];
            else return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        dp = new int[n+1];
        System.out.println(fibonacci(n));
    }
}
