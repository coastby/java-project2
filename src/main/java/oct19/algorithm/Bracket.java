package oct19.algorithm;

import java.util.Stack;

//프로그래머스 올바른 괄호
public class Bracket {
    boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt < 0) {
                return answer;
            }
        }
        answer = (cnt == 0);

        return answer;
    }

}