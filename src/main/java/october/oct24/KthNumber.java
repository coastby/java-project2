package october.oct24;

import java.util.Arrays;
import java.util.PriorityQueue;

//프로그래머스 K번째수

public class KthNumber {
    //런타임 에러??
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0;
        for (int[] command : commands) {
            int[] tmp = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(tmp);
            answer[i++] = tmp[command[2]-1];
        }
        return answer;
    }

    public int[] solution2(int[] array, int[][]commands) {
        int[] answer = new int[commands.length];
        int num = 0;
        for (int[] command : commands) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = command[0]-1; i < command[1]; i++) {
                pq.add(array[i]);
            }
            for(int j = 0; j < command[2]; j++){
                answer[num] = pq.poll();
            }
            num++;
        }
        return answer;
    }

    public static void main(String[] args) {
        KthNumber kn = new KthNumber();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = kn.solution2(array, commands);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
