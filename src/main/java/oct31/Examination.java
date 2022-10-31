package oct31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//프로그래머스 모의고사
public class Examination {
    public int[] solution(int[] answers) {
        List<Integer> arr = new ArrayList<>();
        int[] ran1 = {1, 2, 3, 4, 5}; //(answers.length%ran1.length)
        int[] ran2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ran3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[][] rans = {ran1, ran2, ran3};
        int max = -1;
        for(int i = 0; i < 3; i++){
            if(max <= correct(answers, rans[i])){
                System.out.println(correct(answers, rans[i]));
                max = correct(answers, rans[i]);
                arr.add(i+1);
            }
        }
        int answer[] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).intValue();
        }
        return answer;
    }
    public int correct(int[] answers, int[] ran){
        int result = 0;
        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == ran[i%ran.length]){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Examination exam = new Examination();
        int[] ans1 = exam.solution(new int[]{1,2,3,4,5});
        int[] ans2 = exam.solution(new int[]{1,3,2,4,2});
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
    }

}
