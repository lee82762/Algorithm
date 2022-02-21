package 리틀코드.majorityelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {
        int a =  (int) Math.ceil((double)nums.length/2);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int tm : nums){
            map.put(tm,map.getOrDefault(tm,0)+1);
        }
        ArrayList<Integer> a1 =new ArrayList<>(map.keySet());
        Collections.sort(a1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int answer=0;
        if(map.get(a1.get(0))>=a){
            answer=a1.get(0);
        }
        return answer;


    }
}
