package november.nov22;

import java.util.Scanner;

//code up 1853 합 리턴하기
public class CU1853 {
    public int plus(int num){
        if (num == 0){
            return num;
        }
        return num+plus(--num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CU1853 c = new CU1853();
        System.out.println(c.plus(num));
    }
}
