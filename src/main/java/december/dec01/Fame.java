package december.dec01;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * [programmers] 명예의 전당
 *
 * k일 까지는 있는 값에서 가장 작은 값
 * k일 이후부터는 k번째 수
 * */


public class Fame {

    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            if (i < k){
                queue.add(score[i]);
            } else{
                if(score[i] > queue.peek()){
                    queue.poll();
                    queue.add(score[i]);
                }
            }
            answer[i] = queue.peek();
        }
        return answer;
    }

}

