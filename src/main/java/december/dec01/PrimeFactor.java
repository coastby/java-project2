package december.dec01;

import java.util.Scanner;

public class PrimeFactor {
    public static boolean isPrime(int n){
        boolean result = true;
        for (int i = 2; i*i < n; i++) {
            if(n%i == 0){
                result = false;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long result = 0;
        for (int i = 2; i <= num; i++) {
            if(isPrime(i) && num%i == 0){
                result = i;
            }
        }
        System.out.println(result);
    }
}
