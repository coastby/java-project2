package oct28;

import java.util.*;
public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> hs = new HashSet<>();
        for (String s : phone_book) {
            hs.add(s);
        }
        for (String s : phone_book) {
            for (int i = 1; i < s.length(); i++) {
                if(hs.contains(s.substring(0,i))){
                    return false;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        System.out.println(pb.solution(new String[] {"119", "97674223", "1195524421"}));
        System.out.println(pb.solution(new String[] {"123","456","789"}));
        System.out.println(pb.solution(new String[] {"12","123","1235","567","88"}));
    }
}
