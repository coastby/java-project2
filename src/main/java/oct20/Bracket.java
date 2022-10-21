package oct20;

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
            } else if (ch == ')'){
                cnt--;
            }
            if (cnt < 0) {
                return answer;
            }
        }
        answer = (cnt == 0);

        return answer;
    }
    boolean solutionMulti(String s) {
        boolean answer = false;
        int cntS = 0;
        int cntM = 0;
        int cntL = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                cntS++;
            } else if (ch == ')') {
                cntS--;
            } else if (ch == '{') {
                cntM++;
            } else if (ch == '}') {
                cntM--;
            } else if (ch == '[') {
                cntL++;
            } else if (ch == ']') {
                cntL--;
            }
            if (cntS < 0 || cntM <0 || cntL < 0) {
                return answer;
            }
        }
        answer = (cntS == 0 && cntM == 0 && cntL == 0);

        return answer;
    }

    //풀리기는 하지만 시간초과 나옴
    boolean solution2 (String s) {
        while (s.contains("()")) {
            s = s.replace("()", "");
        }
        return s.isEmpty();
    }

    boolean solution3 (String s) {
        Stack<Character> stack = new Stack<>();
        boolean ans = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) {ans = true;};
        return ans;
    }

}