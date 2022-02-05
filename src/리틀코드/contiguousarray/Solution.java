package 리틀코드.contiguousarray;

import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        map.put(0,-1);
        for(int i=0; i<nums.length; i++){
            int start = nums[i]*2 -1;
            sum+=start;
            if(map.containsKey(sum)){
                int startindex=map.get(sum);
                max=Math.max(max,i-startindex);
            }
            else{
                map.put(sum,i);
            }
        }
        return max;

    }
}
