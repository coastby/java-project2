package november.nov25;

import java.util.Scanner;

// [codeup] 2623 최대공약수 구하기
public class CU2623 {
    public int gcd(int a, int b){
        if (a < b){
//            int tmp = a;
//            a = b;
//            b = tmp;
            return gcd(a, b - a);
        } else if (a == b) {
            return a;
        }
        return gcd(a - b, b);
    }
    public int gcd2(int a, int b){
        while(a != b){
            if (a < b){
                b -= a;
            } else {
                a -= b;
            }
        }
        return a;
    }


    public static void main(String[] args) {
        CU2623 c = new CU2623();
        Scanner sc = new Scanner(System.in);
        System.out.println(c.gcd2(sc.nextInt(), sc.nextInt()));
    }
}
