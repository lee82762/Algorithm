package 연습문제.소수만들기;

import java.util.ArrayList;
class Solution {
    public int solution(int[] nums) {
        int answer=0;
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    a1.add(nums[i]+nums[j]+nums[k]);
                }
            }

        }
        for(int i=0; i<a1.size(); i++){
            int cnt=0;
            for(int j=1; j<=a1.get(i); j++){

                if(a1.get(i)%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                answer++;
            }
        }

        return answer;
    }
}