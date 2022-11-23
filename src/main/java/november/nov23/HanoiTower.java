package november.nov23;

import java.util.Scanner;

//[codeup] 3420 하노이 탑1
public class HanoiTower {
    public void hanoi (int num, String from, String to){
        if(num == 1){
            System.out.printf("Disk %d : %s to %s\n", num, from, to);
            return;
        }
        String str = "ABC".replace(from, "").replace(to, "");
        hanoi(num-1, from, str);
        System.out.printf("Disk %d : %s to %s\n", num, from, to);
        hanoi(num-1, str, to);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HanoiTower h = new HanoiTower();
        h.hanoi(sc.nextInt(), "A", "C");
    }
}
