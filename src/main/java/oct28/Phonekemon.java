package oct28;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

//프로그래머스 폰켓몬
/*
* 1. N/2 마리 가져간다.
* 2. 최대한 다양한 포켓몬
*
*
* 리스트를 set으로 :
* 1) Set<String> set = new HashSet<>(list)
* 2) Set<String> set = Set.copyOf(list) >>> Unmodifiable
*
* array를 set으로 :
* 1) Set<Integer> set = new HashSet<Integer>(Arrays.asList(arr)) : int배열로 받아서 적용 어려움
* 2) Set<T> set = Set.of(array);
* 3) var set = Set.of(array); : 제네릭 타입을 배열로 유추 (자바 10이상)
* 4) Collections.addAll(items, arr)
* */

public class Phonekemon {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        answer = Math.min(nums.length/2, set.size());
        return answer;
    }

    public static void main(String[] args) {
        Phonekemon pk = new Phonekemon();
        System.out.println(pk.solution(new int[] {3,1,2,3}));
        System.out.println(pk.solution(new int[] {3,3,3,2,2,4}));
        System.out.println(pk.solution(new int[] {3,3,3,2,2,2}));
    }
}
