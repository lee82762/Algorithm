package 문자열.arraypartitioni;

import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int answer=0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                answer+=nums[i];
            }
        }
        return answer;
    }
}
