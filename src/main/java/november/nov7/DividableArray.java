package november.nov7;

import java.util.PriorityQueue;

//프로그래머스 나누어 떨어지는 숫자 배열
public class DividableArray {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                queue.add(arr[i]);
            }
        }
        int N = queue.size();
        if(N==0){
            return new int[] {-1};
        }
        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = queue.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        DividableArray da = new DividableArray();
        System.out.println(da.solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(da.solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(da.solution(new int[]{3,2,6}, 10));
    }
}
