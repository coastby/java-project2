package nov10;

import java.util.*;

public class SameNumber {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.add(-1);
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (stack.peek() != i){
                list.add(i);
                stack.add(i);
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static void main(String[] args) {
        SameNumber sn = new SameNumber();
        sn.solution(new int[] {1,1,3,3,0,1,1});
        sn.solution(new int[] {4,4,4,3,3});
    }

}
