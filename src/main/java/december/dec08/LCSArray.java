package december.dec08;

import java.util.Arrays;

public class LCSArray {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        int[][] dp = new int[str2.length()][str1.length()];

        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < str1.length(); j++) {
                int x = 0;
                int y = 0;
                if (i != 0 && j != 0) {
                    x = dp[i][j - 1];
                    y = dp[i - 1][j];
                }
                dp[i][j] = Math.max(y, x);

                if (str1.charAt(j) == str2.charAt(i)){
                    dp[i][j]++;
                }
            }
        }
        Arrays.stream(dp).map(Arrays::toString).forEach(System.out::println);
    }
}
