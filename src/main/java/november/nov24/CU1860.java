package november.nov24;

import java.util.Scanner;

//[codeup] 1860 수 삼각형 출력하기
public class CU1860 {
    public void triangle(int num){
        if(num == 0) return;
        triangle(num-1);
        line(num);
        System.out.println();
    }
    public void line(int num){
        if(num == 0) return;
        line(num-1);
        System.out.print(num+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CU1860 c = new CU1860();
        c.triangle(sc.nextInt());

    }
}
