package KAKAO.보석쇼핑;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
class Retry {
    public int[] solution(String[] gems) {
        int answer[]=new int[2];
        HashMap<String,Integer> map =new HashMap<>();
        for(int i=0; i<gems.length; i++){
            map.put(gems[i],map.getOrDefault(gems[i],0)+1);
        }
        int len=map.size();
        int start=0;
        int recnt=0;
        int end=gems.length;
        map.clear();
        Queue<String> queue=new LinkedList<>();
        for(int i=0; i<gems.length; i++){
            map.put(gems[i],map.getOrDefault(gems[i],0)+1);
            queue.add(gems[i]);
            while (!queue.isEmpty()){
                String temp=queue.peek();
                int cnt=map.get(temp);

                if(cnt>=2){
                    queue.poll();
                    map.put(temp,map.getOrDefault(temp,0)-1);
                    recnt++;
                }
                else{
                    break;
                }
            }

            if(len==map.size() && end>queue.size()){
                start=recnt;
                end=queue.size();
            }
        }
        answer[0]=start+1;
        answer[1]=end+start;
        return answer;
    }
}
