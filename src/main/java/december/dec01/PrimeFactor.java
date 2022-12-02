package december.dec01;

import java.util.Scanner;

//[codeup] 2203 소인수 구하기
public class PrimeFactor {
    public static boolean isPrime(long n){
        for (long i = 2; i*i <= n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long result = 0;
        for (long i = 1; i*i <= num; i++) {
            if(num%i == 0){
                if(isPrime(i)){
                    result = Math.max(i, result);
                }
                if(isPrime(num/i)){
                    result = Math.max(result, num/i);
                }
            }
        }
        System.out.println(result);
    }
}
