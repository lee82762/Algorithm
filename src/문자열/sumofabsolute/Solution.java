package 문자열.sumofabsolute;
//시간 초과
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int answer[]=new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int a=nums[i];
            int temp=0;
            for(int j=0; j<nums.length; j++){
                temp+=Math.abs(a-nums[j]);
            }
            answer[i]=temp;
        }
        return answer;

    }
}