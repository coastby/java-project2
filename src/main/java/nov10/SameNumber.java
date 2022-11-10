package nov10;

import java.util.*;

// [programmers] 같은 숫자는 싫어
public class SameNumber {
    /*
    * Stack 쓰고
    * */
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if (stack.isEmpty() || stack.peek() != i){
                stack.add(i);
            }
        }
        int[] answer = new int[stack.size()];
        for (int i = stack.size()-1; i >= 0; i--){
            answer[i] = stack.pop();
        }

        System.out.println(Arrays.toString(answer));
        return answer;
    }

    /*
     * Stack 안 쓰고
     * */
    public int[] solution2(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i : arr) {
            if (i != list.get(list.size() - 1)){
                list.add(i);
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
        sn.solution2(new int[] {1,1,3,3,0,1,1});
        sn.solution2(new int[] {4,4,4,3,3});
    }

}
