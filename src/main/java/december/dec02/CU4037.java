package december.dec02;

import java.util.Scanner;

//[codeup] 4037 소인수분해
public class CU4037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            while (num%i == 0){
                num /= i;
                System.out.print(i+" ");
            }
        }
    }
}
