package november.nov11;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0; j < n; j++) {
                if(toBinaryString(arr1[i]).charAt(j)==' ' && toBinaryString(arr1[i]).charAt(j)==' '){
                    str += " ";
                } else {
                    str += "#";
                }
            }
            answer[i] = str;
        }
        return answer;
    }
    public String toBinaryString(int num){
        String str = "";
        while(num > 0){
            if(num%2 == 1){
               str = "#" + str;
            } else {
                str = " " + str;
            }
            num /= 2;
        }
        str = String.format("%s");
        return str;
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
        System.out.println(sm.toBinaryString(9));
    }
}
