package december.dec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

import java.util.*;

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

    public int[] solution2(int k, int[] score){
        int[] answer = new int[score.length];
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(i < k){
                nums.add(score[i]);
            } else {
                if(score[i] > answer[i-1]){
                    nums.remove(nums.indexOf(answer[i-1]));
                    nums.add(score[i]);
                }
            }
            answer[i] = Collections.min(nums);
        }
        return answer;
    }
}

