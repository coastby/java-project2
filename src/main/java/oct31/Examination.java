package oct31;

//프로그래머스 모의고사
public class Examination {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] ran1 = {1, 2, 3, 4, 5}; //(answers.length%ran1.length)
        int[] ran2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] ran3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[][] rans = {ran1, ran2, ran3};
        int max = 0;
        for(int i = 0; i < 3; i++){
            if(max <= correct(answers, rans[i])){
                answer[i] = i;
            }
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

}
