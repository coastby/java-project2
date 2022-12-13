package december.dec13;

import java.util.Arrays;

/**
 * 어제와 같은 문제
 * */

class Pair{     //dp에 쓸 클래스 만들기
    int left;   //나의 카드 합
    int right;  //상대방 카드 합

    @Override
    public String toString() {
        return "("+ left + ", " + right + ')';  //(1, 1) 모양
    }

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public static Pair better(Pair p1, Pair p2){    //나에게 유리한 경우 찾기
        if (p1.left > p2.left){
            return p1;
        } else if (p1.left < p2.left) {
            return p2;
        } else {        //나의 값이 같다면 상대방이 더 작은거 고르기
            return p1.right > p2.right ? p2 : p1;
        }
    }
}

public class OptimalStrategy {
    public static void main(String[] args) {
        int[] cards = new int[] {2, 7, 40, 19};
        int n = cards.length;
        Pair[][] dp = new Pair[n][n];       //dp 만들기

        //1. 대각선 채우기
        for (int i = 0; i < n; i++) {
            dp[i][i] = new Pair(cards[i], 0);
        }
        //2. 로직 실행하기
        for (int i = 1; i < n; i++) {           //i : 0, 1, 2, 3, ..n
            for (int j = 0; j < n-i; j++) {     //j : 0, 1, .. n-i
                Pair p1 = new Pair(cards[j]+dp[j+1][j+i].right, dp[j+1][j+i].left);           //앞(행)의 카드를 골랐을 때
                Pair p2 = new Pair(cards[j+i]+dp[j][j+i-1].right, dp[j][j+i-1].left);           //뒤(열)의 카드를 골랐을 때
                dp[j][j+i] = Pair.better(p1, p2);
            }
        }

        Arrays.stream(dp).map(Arrays::toString).forEach(System.out::println);   //dp 전체 출력
        System.out.println(dp[0][n-1].left);        //최적의 경우 출력
    }
}
