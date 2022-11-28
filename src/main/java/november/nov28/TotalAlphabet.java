package november.nov28;

public class TotalAlphabet {
    public static void main(String[] args) {
        //A-Z
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }
        //AA-ZZ
        for(char ch = 'A'; ch <= 'Z'; ch++){
            for(char cha = 'A'; cha <='Z'; cha++){
                System.out.print(ch);
                System.out.println(cha);

            }
        }
    }
}
