package november.nov24;

import java.util.Scanner;

//[codeup] 1904 두 수 사이의 홀수 출력하기
public class CU1904 {
    public void step(int s, int e){
        if(s > e) return;
        if (s%2 !=0){
            System.out.print(s + " ");
            step(s+2, e);
        } else{
            step(s+1, e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CU1904 c = new CU1904();
        c.step(sc.nextInt(), sc.nextInt());

    }
}
