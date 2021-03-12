package KAKAO.보석쇼핑;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int[] solution(String[] gems) {
        HashMap<String,Integer>map=new HashMap<>();

        for(int i=0; i<gems.length; i++){
            map.put(gems[i],map.getOrDefault(gems[i],0)+1);

        }
        int len=map.size();
        int start=0;
        int recnt=0;
        int end=gems.length;
        map.clear();
        Queue<String>q1=new LinkedList<>();
        for(int i=0; i<gems.length; i++){
            map.put(gems[i],map.getOrDefault(gems[i],0)+1);
            q1.add(gems[i]);
            while (!q1.isEmpty()){
                String left=q1.peek();
                int cnt=map.get(left);

                if(cnt>=2){
                    q1.poll();
                    map.put(left,map.getOrDefault(left,0)-1);
                    start++;
                }
                else{
                    break;
                }
            }

            if(map.size()==len&&end>q1.size()){
                end=q1.size();
                recnt=start;
            }
        }

        int answer[]={recnt+1,recnt+end};
        return answer;
    }
}
