package november.nov2;

import java.util.ArrayList;
import java.util.List;

public class Eratosthenes {
    public int solution(int n) {
        int answer = 0;
        int[] pool = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            if(i > 1 && pool[i]==0) {
                answer++;
                for (int j = i; j <= (n/i); j++) {
                     pool[j*i] = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        int N = 50;        // 50 미만의 소수 구하기
        //1. 2부터 50까지 숫자가 들어있는 49칸 List 만들기
        List<Integer> nums = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            nums.add(i);
        }

        //2. 만든 리스트에서 2를 제외한 모든 2의 배수 지우기
        for (int i = 2; i <= N/2; i++) {
            nums.remove(nums.indexOf(i*2));
        }
        //3. 리스트에 있는 원소의 개수와 원소 출력해보기 - 잘 지워졌는 지 확인

        //4. 배수들 지우기 : 리스트를 지우고
        for(int j = 2; j <= N; j++){
            for (int i = j; i <= N/j; i++) {
                if(nums.indexOf(i*j) != -1) {
                    nums.remove(nums.indexOf(i * j));
                }
            }
        }

        //5. 속도 개선을 위해 checks 이용하기
        boolean[] checks = new boolean[N+1];
        for(int i = 2; i*i<= N; i++){
            if(checks[i] == false)
            for(int j = i; j <= N/i; j++){
                if(checks[i*j] == false){
                    checks[i*j] = true;
                }
            }
        }
    }
}
