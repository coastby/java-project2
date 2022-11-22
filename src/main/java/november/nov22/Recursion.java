package november.nov22;

public class Recursion {
    public void printTo100(int num){
        if (num > 100){
            return;
        }
        System.out.println(num);
        printTo100(++num);
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        recursion.printTo100(1);
    }
}
