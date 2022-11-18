package november.nov18;

//[Programmers] 행렬의 덧셈
public class ArrayPlus {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = arr1;
        for(int j = 0; j < arr1.length; j++){
            for(int i = 0; i < arr1[j].length; i++){
                answer[j][i] = arr1[j][i] + arr2[j][i];
            }
        }
        return answer;
    }
}
