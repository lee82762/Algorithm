package 문자열.majorityelement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int len=nums.length/3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> a1=new ArrayList<>(map.keySet());
        List<Integer>answer=new ArrayList<>();
        for(int i=0; i<a1.size(); i++){
            int tm=a1.get(i);

            if(map.get(tm)>len){
                answer.add(tm);
            }
        }
        return answer;
    }
}
