package november.nov23;

import java.util.Scanner;

//[codeup] 1856 계단 뛰어 오르기
public class CU1856 {
    public int step(int num){
        if(num == 1) return 1;
        if(num == 2) return 2;
        if(num == 3) return 4;
        return step(num-1) + step(num-2) + step(num-3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CU1856 c = new CU1856();
        System.out.println(c.step(sc.nextInt()));

    }
}
