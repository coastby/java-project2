package november.nov25;

import java.util.Scanner;

// [codeup] 2623 최대공약수 구하기
public class CU2623 {
    public int gcd(int a, int b){
        if (a < b){
            int tmp = a;
            a = b;
            b = tmp;
        } else if (a == b) {
            return a;
        }
        return gcd(a - b, b);

    }


    public static void main(String[] args) {
        CU2623 c = new CU2623();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.gcd(sc.nextInt(), sc.nextInt()));
    }
}
