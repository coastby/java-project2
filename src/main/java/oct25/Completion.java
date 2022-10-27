package oct25;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

//프로그래머스 완주하지 못한 선수
public class Completion {
    public String solution(String[] participant, String[] completion) {
        Hashtable<String, Integer> ht = new Hashtable<>(participant.length);
        for (int i = 0; i < participant.length; i++) {
            if(ht.containsKey(participant[i])){
                ht.replace(participant[i], ht.get(participant[i])+1);
            } else{
                ht.put(participant[i], 1);
            }
        }
        for (String s : completion) {
            if(ht.get(s) == 1){
                ht.remove(s);
            } else if (ht.get(s) > 1) {
                ht.replace(s, ht.get(s)-1);
            }
        }
        String answer = ht.keySet().toArray()[0].toString();
        return answer;
    }



    public static void main(String[] args) {
        Completion com = new Completion();

        String answer1 = com.solution(new String[] {"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String answer2 = com.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"});
        String answer3 = com.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}
