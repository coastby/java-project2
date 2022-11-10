package nov10;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//[programmers] 기능개발
/**
 * PriorityQueue
 *
 * day =0
 * progress = -1
 *  while(다 100이 될때까지)
 *      day ++
 *      forI - length
 *         if arr + arr > 100
*               if Queue.peak == i-1
 *                  Queue.add i
 *                  progress++
*
 *
 *
 * max
 * forI - length
 *      Math.ceiling((100-pro)/speeds)
 *
 *
 * */


public class DevelopFunction {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        int max = (int) Math.ceil((100-progresses[0])/speeds[0]);
        int idx = 0;
        for (int i = 0; i < progresses.length; i++) {
            int due = (int) Math.ceil((100-progresses[i])/speeds[i]);
            if (due <= max){
                result.set(idx, result.get(idx) + 1);
            } else {
                max = due;
                idx++;
                result.add(1);
            }
        }
        int[] answer = result.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        DevelopFunction df = new DevelopFunction();
        df.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5});
        df.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1});
    }
}
