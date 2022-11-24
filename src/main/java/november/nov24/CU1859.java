package november.nov24;

import java.util.Scanner;

public class CU1859 {
    public static void printStar(int num, String star) {
        if (num < star.length()) {
            return;
        }
        System.out.println(star);
        printStar(num, star+"*");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printStar(num, "*");
    }

}
