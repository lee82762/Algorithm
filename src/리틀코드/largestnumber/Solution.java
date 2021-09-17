package 리틀코드.largestnumber;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        String s[]=new String[nums.length];
        for(int i=0; i<nums.length; i++){
            s[i]=Integer.toString(nums[i]);
        }

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuilder sb=new StringBuilder();
        if(s[0].equals("0")){
            return "0";
        }
        for(String s1:s){
            sb.append(s1);
        }
        return sb.toString();
    }
}
