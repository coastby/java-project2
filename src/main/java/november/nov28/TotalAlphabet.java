package november.nov28;

public class TotalAlphabet {
    public void aToZ1(){
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
    public void aToZ2(char ch){
        if (ch == 'Z'+1) return;
        System.out.println(ch);
        aToZ2(++ch);
    }

    public static void main(String[] args) {
        TotalAlphabet a = new TotalAlphabet();
        a.aToZ2('A');
    }


}
