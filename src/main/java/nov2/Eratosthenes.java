package nov2;

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
        for (int i = 2; i <= 50; i++) {
            nums.add(i);
        }

        //2. 만든 리스트에서 2를 제외한 모든 2의 배수 지우기
        for (int i = 2; i <= 50/2; i++) {
            nums.remove(nums.indexOf(i*2));
        }
        //3. 리스트에 있는 원소의 개수와 원소 출력해보기 - 잘 지워졌는 지 확인
        //System.out.println(nums.size());
        //nums.forEach((num) -> System.out.println(num));

        //4. 배수들 지우기
        for(int j = 2; j <= 50; j++){
            for (int i = j; i <= 50/j; i++) {
                if(nums.indexOf(i*j) != -1) {
                    nums.remove(nums.indexOf(i * j));
                }
            }
        }
        System.out.println(nums.size());
        nums.forEach((num) -> System.out.println(num));
    }
}
