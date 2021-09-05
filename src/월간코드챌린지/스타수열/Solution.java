package 월간코드챌린지.스타수열;

import java.util.*;
class Solution {
    public int solution(int[] a) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int answer=0;
        for(int i=0; i<a.length; i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        ArrayList<Integer>a1=new ArrayList<>(map.keySet());
        for(int keys:a1){
            if(map.get(keys)*2<=answer) continue;
            int star=0;
            for(int j=0; j<a.length-1; j++){
                if((a[j]==keys || a[j+1] ==keys) && (a[j]!=a[j+1])){
                    star+=2;
                    j++;
                }
            }
            answer=Math.max(answer,star);
        }
        return answer;
    }
}
