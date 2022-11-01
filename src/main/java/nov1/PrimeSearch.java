package nov1;

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

    public static void main(String[] args) {
        PrimeSearch ps = new PrimeSearch();
        System.out.println(ps.solution(10));
        System.out.println(ps.solution(5));
    }
}
