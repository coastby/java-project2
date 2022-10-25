package oct25;

import java.util.HashSet;
import java.util.Hashtable;

public class Phonekemon {
    public int solution(int[] nums) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for (int num : nums) {
            if(ht.containsKey(num)){
                ht.put(num, ht.get(num)+1);
            } else {
                ht.put(num, 1);
            }
        }
        int answer = (ht.size() > nums.length/2) ? nums.length : ht.size();
        return answer;
    }

    public int solution2(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for(int i =0; i<nums.length;i++) {
            hs.add(nums[i]);
        }

        if(hs.size()>nums.length/2)
            return nums.length/2;

        return hs.size();
    }

    public static void main(String[] args) {
        Phonekemon pk = new Phonekemon();
        System.out.println(pk.solution(new int[]{3,1,2,3}));
        System.out.println(pk.solution(new int[]{3,3,3,2,2,4}));
        System.out.println(pk.solution(new int[]{3,3,3,2,2,2}));
    }
}
