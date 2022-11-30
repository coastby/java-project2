package november.nov30;

import java.util.Scanner;

/**
 * codeup 1936
 * 1
 * 23
 * 4567
 * 89101112131415
 *
 * */

public class CU1936 {
    public static int distance(int a, int b, int dist){
        if(a == b){
            return dist;
        } else if (a > b) {
            return distance(a/2, b, ++dist);
        } else {
            return distance(a, b/2, ++dist);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(distance(sc.nextInt(), sc.nextInt(), 0));

    }
}
