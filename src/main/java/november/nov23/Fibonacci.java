package november.nov23;

import java.util.Scanner;

//[codeup] 1955 피보나치 수 리턴하기
public class Fibonacci {
    public int fibo (int num){
        if (num <= 2){
            return 1;
        }
        return fibo(--num)+fibo(--num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibo(sc.nextInt()));
    }

}
