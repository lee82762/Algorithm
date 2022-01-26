package 리틀코드.maximizesumofarrayafterknegations;

import java.util.Arrays;

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int idx=0;
        while (k!=0){
            nums[idx]*=-1;
            k--;
            if(idx+1<nums.length && nums[idx]>nums[idx+1])
                idx++;
        }

        int answer=0;
        for(int a : nums){
            answer+=a;
        }
        return answer;
    }
}
