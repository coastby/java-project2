package nov7;

import java.util.PriorityQueue;

//프로그래머스 나누어 떨어지는 숫자 배열
public class DivadableArray {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i : arr) {
            if(i%divisor==0){
                queue.add(i);
            }
        }
        if(queue.size()==0){
            return new int[]{-1};
        }
        int[] answer = new int[queue.size()];
        for(int i = 0; i < queue.size(); i++){
            answer[i] = queue.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        DivadableArray da = new DivadableArray();
        System.out.println(da.solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(da.solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(da.solution(new int[]{3,2,6}, 10));
    }
}
