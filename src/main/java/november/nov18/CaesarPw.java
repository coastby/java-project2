package november.nov18;
//[Programmers] 시저 암호
public class CaesarPw {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            char newCh;
            if(ch == ' '){
                newCh = ' ';
            } else if (ch+0 < 97){
                newCh = (char) ((ch + n - 65) % 26 + 65);
            } else {
                newCh = (char) (((ch + n - 97) % 26) + 97);
            }
            answer += newCh;
        }
        return answer;
    }

    public static void main(String[] args) {
        CaesarPw cp = new CaesarPw();
        System.out.println(cp.solution("ZAz", 1));
    }

}
