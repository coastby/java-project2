package october.oct27;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Participants {
    public String solution(String[] participant, String[] completion) {
        Hashtable<String, Integer> ht = new Hashtable<>(participant.length);
        for (String p : participant) {
            if(ht.containsKey(p)){
                ht.replace(p, ht.get(p)+1);
            } else{
                ht.put(p, 1);
            }
        }

        for (String s : completion) {
            ht.replace(s, ht.get(s)-1);
            if(ht.get(s) == 0){
                ht.remove(s);
            }
        }

        String answer = ht.keySet().toArray()[0].toString();
        return answer;
    }
    public String solution2(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> memo = new HashMap<>();
        for (String p : participant) {
            if(!memo.containsKey(p)){
                memo.put(p, 0);
            }
            memo.put(p, memo.get(p)+1);
        }
        for (String c : completion) {
            memo.put(c, memo.get(c)-1);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1){
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Participants com = new Participants();

        String answer1 = com.solution2(new String[] {"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String answer2 = com.solution2(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String answer3 = com.solution2(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}
