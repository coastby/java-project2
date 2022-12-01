package december.dec01;

//[programmers] 기사단원의 무기
public class Templar {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            //약수 갯수 구하기
            int cnt = 0;
            for(int j = 1; j*j <= i; j++){
                if(j*j == i) {
                    cnt++;
                } else if (i%j == 0) {
                    cnt += 2;

                }
            }
            //limit보다 크면 power를 더하기
            if(cnt > limit){
                answer += power;
            } else {
                answer += cnt;
            }
        }
        return answer;
    }
}
