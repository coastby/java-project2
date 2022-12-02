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


/**
 * 다른 답
 * public class Main {
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *         long num = scanner.nextLong();
 *         long temp = num;
 *         long answer=1L;
 *
 *         for (long div = 2L; div * div < num; div++) { // 반복문 범위를 제곱근으로 줄였습니다.
 *             while (temp % div == 0L) { // 나머지 없이 딱 나누어 떨어진다면
 *                 temp /= div; // 몫으로 덮어쓰고
 *                 answer = div; // 나눈 값을 저장합니다.
 *             }
 *         }
 *         // 반복문의 범위를 제곱근으로 제한해두다보니
 *         // 58 같이 제곱근 범위 밖에 소수가 남는 경우가 있었습니다.
 *         // 따라서 temp에 남은 소수와 answer를 비교하여 큰 수를 출력하게 했습니다.
 *         System.out.println(Math.max(answer, temp));
 *     }
 * }
 * */