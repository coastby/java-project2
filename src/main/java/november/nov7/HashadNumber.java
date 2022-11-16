package november.nov7;

import java.util.Arrays;

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

    //아직 미완
    public boolean solution2(int x){
        String strX = x+"";
        int sum = 0;
        System.out.println(Arrays.toString(strX.toCharArray()));
        for(char ch : strX.toCharArray()){
            sum += ch;
            System.out.println(ch);
            System.out.println(sum);
        }
        return x%sum==0;

    }

    public static void main(String[] args) {
        HashadNumber hn = new HashadNumber();
        System.out.println(hn.solution2(10));
        System.out.println(hn.solution2(12));
        System.out.println(hn.solution2(11));
        System.out.println(hn.solution2(13));
    }
}
