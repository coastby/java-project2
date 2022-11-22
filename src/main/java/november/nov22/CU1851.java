package november.nov22;

import java.util.Scanner;

//code up 1851 별찍기
public class CU1851 {
    public void star(int num){
        if (num == 0){
            return;
        }
        System.out.print("*");
        star(--num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        CU1851 c = new CU1851();
        c.star(num);
    }
}
