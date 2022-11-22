package november.nov22;

import java.util.Scanner;

//code up 1854 자리수 합 더하기
public class CU1854 {
    public int plus(long num){
        if(num < 1){
            return 0;
        }
        long sum = num%10 + plus(num/10);
        return (int) sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        CU1854 c = new CU1854();
        System.out.println(c.plus(num));
    }
}
