package november.nov30;

//[programmers] 문자열 내 p와 y의 개수
public class NumPY {
    boolean solution(String s) {
        int cnt = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                cnt++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                cnt--;
            }
        }
        return (cnt == 0);
    }
}
