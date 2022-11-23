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
    public int fiboBottomUp(int num){
        int[] arr = new int[num+1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= num; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return  arr[num];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibo(sc.nextInt()));
        System.out.println(f.fiboBottomUp(sc.nextInt()));
    }

}
