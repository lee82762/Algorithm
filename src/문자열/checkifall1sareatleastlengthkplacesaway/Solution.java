package 문자열.checkifall1sareatleastlengthkplacesaway;

class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean answer=true;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                if(!check(i,k,nums)){
                    answer=false;
                    break;
                }

            }
        }
        return answer;

    }
    static boolean check(int i,int k,int []nums){
        for(int j=i+1; j<=i+k; j++){
            if(j<nums.length) {
                if (nums[j] == 1) {
                    return false;
                }
            }
        }
        return true;

    }
}