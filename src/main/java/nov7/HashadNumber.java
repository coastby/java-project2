package nov7;
//프로그래머스 하샤드 수
public class HashadNumber {
    public boolean solution(int x) {
        boolean answer = false;
        //자리수의 합 구하기
        int tmp = x;
        int sum = 0;
        while (tmp > 0){
            sum += tmp % 10;
            tmp /= 10;
        }
        //나누어지는 지
        if (x%sum == 0){
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        HashadNumber hn = new HashadNumber();
        System.out.println(hn.solution(10));
        System.out.println(hn.solution(12));
        System.out.println(hn.solution(11));
        System.out.println(hn.solution(13));
    }
}
