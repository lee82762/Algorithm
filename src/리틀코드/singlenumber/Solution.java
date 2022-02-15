package 리틀코드.singlenumber;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();

        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        ArrayList<Integer> temp = new ArrayList<>(map.keySet());
        Collections.sort(temp,(o1, o2) -> map.get(o1).compareTo(map.get(o2)));

        return temp.get(0);

    }
}