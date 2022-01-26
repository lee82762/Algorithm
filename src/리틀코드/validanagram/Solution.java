package 리틀코드.validanagram;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        String s1[]=s.split("");
        String t1[]=t.split("");
        if(s1.length!=t1.length){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(t1);
        boolean answer=true;
        for(int i=0; i<s1.length; i++){
            if(!s1[i].equals(t1[i])){
                answer=false;
                break;
            }
        }
        return answer;
    }
}
