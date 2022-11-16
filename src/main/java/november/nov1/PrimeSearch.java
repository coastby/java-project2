package november.nov1;

import java.util.ArrayList;
import java.util.List;

public class PrimeSearch {
    public int solution(int n) {
        List<Integer> primes = new ArrayList<>();
        int[] pool = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            if(i > 1 && pool[i]==0) {
                primes.add(i);
                for (int j = 1; j <= (n/i); j++) {
                    pool[j*i] = 1;
                }
            }
        }
        int answer = primes.size();
        return answer;
    }

    public boolean isPrime (int num, MaxMaker maxMaker){
        boolean result = true;
        for (int i = 2; maxMaker.maxIs(num, i); i++) {
            if(num%i == 0){
                result = false;
            }
        }
        return result;
    }

    public boolean callBackPrac1(int num){
        return isPrime(num, (a, b)-> a*a<b);
    }

    interface MaxMaker{
        boolean maxIs(int num, int i);
    }


    public int solution2(int n){
        int answer = 0;
        for (int i = 2; i < n+1; i++) {
            if(isPrime(i, (a, b) -> a*a <= b)){
                answer++;
            }
        }
        return answer;
    }





    public static void main(String[] args) {
        PrimeSearch ps = new PrimeSearch();
        System.out.println(ps.solution2(10));
        System.out.println(ps.solution2(5));
    }
}
