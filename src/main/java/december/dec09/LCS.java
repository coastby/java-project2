package december.dec09;

import java.util.Scanner;

//[codeup] 2699 사투리
public class LCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int[][] dp = new int[str2.length()+1][str1.length()+1];

        for (int i = 1; i <= str2.length(); i++) {
            for (int j = 1; j <= str1.length(); j++) {
                if (str1.charAt(j-1) == str2.charAt(i-1)){
                    dp[i][j] = dp[i-1][j-1] +1 ;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[str2.length()][str1.length()]);
    }
}
