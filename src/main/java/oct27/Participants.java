package oct27;

import java.util.Hashtable;

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

}
