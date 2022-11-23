package november.nov23;

import java.util.Scanner;

//code up 1852 재귀로 1부터 n까지 한 줄로 출력하기
public class CU1852 {
    public void star(int num){
        if (num == 0){
            return;
        }
        star(num-1);
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CU1852 c = new CU1852();
        c.star(num);
    }
}
