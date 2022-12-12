package december.dec12;

import java.util.Arrays;
import java.util.List;

/**
 * 다음과 같이 cost[ m ][ n ]의 행렬(matrix)이 있을 때 (0,0)에서 (2,2)으로 가는 최소 비용을 구해보세요.
 * 표의 각 칸에 써있는 것은 비용입니다.
 * 출발을 (0,0)인 1에서 출발 해서 (2,2)인 4까지 가는 방법 중 비용이 최소로 나오는 경우의 비용을 구하는 알고리즘을 만들어 보세요.
 * 이동하는 방법은 한칸씩 움직여야 하며 오른쪽, 아래쪽 또는 대각선 오른쪽 아래 이렇게 3가지 방법 뿐입니다. 왼쪽으로 가거나 위로 갈수는 없습니다.
 * */

public class MinCostPath {
    public static int minCostPath(int[][] map){
        int[][] result = new int[map.length][map[0].length];        //map과 같은 크기의 배열 만들기
        for(int i = 0; i < map.length; i++){        //왼쪽, 위쪽, 대각선의 값 중 최소값을 가져와서 원래 칸의 비용과 더한다.
            for (int j = 0; j < map[0].length; j++){
                if (i == 0 && j == 0) {
                    result[0][0] = map[0][0];   //(0,0)은 원래 비용이 최소비용
                } else if(i == 0){                //첫번째 행 채우기 : 어차피 위로는 못가므로 왼쪽에서 오는 값만 신경쓴다.
                    result[0][j] = result[0][j-1] + map[0][j];
                } else if (j == 0) {             //첫번째 열 채우기 : 위에서 오는 값만 신경쓴다.
                    result[i][0] = result[i-1][0] + map[i][0];
                } else {
                    List<Integer> par = List.of(result[i-1][j], result[i][j-1], result[i-1][j-1]);
                    result[i][j] = map[i][j] + par.stream().mapToInt(a -> a).min().getAsInt();
                }
            }
        }
//        Arrays.stream(result).map(Arrays::toString).forEach(System.out::println);
        return result[map.length-1][map[0].length-1];
    }


    public static void main(String[] args) {
        int[][] map = new int[][] {{1, 3, 2}, {4, 6, 2}, {1, 2, 4}};
        System.out.println(minCostPath(map));
    }
}
