package december.dec07;

//[programmmers] Level.2 더 맵게
/**
 * 가장 맵지 않은 + (두번째 맵지 않은 음식 * 2)
 * 섞어야하는 최소 횟수
 * */
import java.util.*;
import java.util.stream.Collectors;

public class Hotter {
    public int solution(int[] scoville, int K) {
//        PriorityQueue<Integer> queue = Arrays.stream(scoville).boxed().collect(Collectors.toCollection(PriorityQueue::new));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int s : scoville){
             queue.add(s);
        }
        int answer = 0;
        while (queue.peek() < K){
            if (queue.size() >= 2){
                int a = queue.poll();
                int b = queue.poll();
                answer++;
                queue.add(a + 2*b);
            } else {
                return -1;
            }
        }
        return answer;
    }
}
