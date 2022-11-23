package november.nov23;

import java.util.Scanner;

//[codeup] 1912 팩토리얼
public class Factorial {
    public int factorial (int num){
        if (num == 1){
            return 1;
        }
        return num*factorial(--num);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println(f.factorial(sc.nextInt()));
    }
}
