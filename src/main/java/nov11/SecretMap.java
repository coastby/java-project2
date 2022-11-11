package nov11;

import java.util.Arrays;
import java.util.Scanner;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0; j < n; j++) {
                if(toBinary(n,arr1[i]).charAt(j)== ' ' && toBinary(n,arr2[i]).charAt(j) == ' '){
                    str += " ";
                } else {
                    str += "#";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
    public String toBinary(int n, int num){
        String result = "";
        for (int i = n-1; i >= 0; i--) {
            if((int) (num/Math.pow(2, i)) == 1){
                result += "#";
                num %= Math.pow(2, i);
            } else {
                result += " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SecretMap sm = new SecretMap();
        System.out.println(sm.toBinary(5, 9));
    }
}
