package nov11;

import java.util.Scanner;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }
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
