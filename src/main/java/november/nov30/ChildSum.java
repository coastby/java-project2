package november.nov30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//[programmers] 약수의 합
public class ChildSum {
    public int solution(int n) {
        Set<Integer> child = new HashSet<>();
        for(int i = 1; i*i <= n; i++){
            if(n%i == 0){
                child.add(i);
                child.add(n/i);
            }
        }
        int answer = child.stream().mapToInt(i -> i).sum();
        return answer;
    }
}
