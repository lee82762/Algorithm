package 문자열.isomorphicstrings;

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            char c1=t.charAt(i);
            if(i==0){
                map.put(c,c1);
            }
            else{
                if(map.containsKey(c)){
                    if(map.get(c)!=c1){
                        return false;
                    }
                }
                else if(map.containsValue(c1)){
                    return false;
                }

            }
            map.put(c,c1);

        }
        return true;
    }
}
