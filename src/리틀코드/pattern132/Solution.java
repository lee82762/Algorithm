package 리틀코드.pattern132;

import java.util.Stack;

class Solution {
    public boolean find132pattern(int[] nums) {
        boolean answer=false;
        int min[]=nums.clone();


        for(int i=1; i<nums.length; i++){
            min[i]=Math.min(min[i-1],min[i]);
        }

        Stack<Integer> st=new Stack<>();
        for(int i=nums.length-1; 0<i; i--){
            if(nums[i]>min[i]){

                while (0<st.size()&&st.get(st.size()-1)<=min[i]){
                    st.pop();
                }


                if(0<st.size() && st.get(st.size()-1) <nums[i]){
                    answer=true;
                    break;
                }
                st.add(nums[i]);
            }
        }
        return answer;

    }
}
