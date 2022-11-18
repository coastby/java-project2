package november.nov18;

//[Programmers] 행렬의 곱셈
/*
* 행렬의 곱셈
* A (m X k) * B (K * n) 일 때,
* 행렬A의 i행의 각 성분과 행렬 j열의 각 성분을 곱하여 더한 것을 (i, j) 로 하는 행렬(m X n)
*     k              n
*  -------         ------------
* m
*  -------       k
*                  ------------
*
**/
public class ArrayMultiple {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int n = arr2[0].length;
        int s = arr2.length;
        int[][] answer = new int[arr1.length][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = 0;
                for (int k = 0; k < s; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}
