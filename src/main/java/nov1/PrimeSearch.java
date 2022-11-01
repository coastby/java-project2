package nov1;

import java.util.ArrayList;
import java.util.List;

public class PrimeSearch {
    public boolean isPrime (int num){
        boolean result = true;
        for (int i = 2; i < num; i++) {
            if(num%i == 0){
                result = false;
            }
        }
        return result;
    }




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

    public static void main(String[] args) {
        PrimeSearch ps = new PrimeSearch();
        System.out.println(ps.isPrime(13));
        System.out.println(ps.isPrime(17));
        System.out.println(ps.isPrime(20));
        System.out.println(ps.isPrime(23));

    }
}
