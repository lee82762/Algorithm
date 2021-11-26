package KAKAO.메뉴리뉴얼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
class Last {
    static HashMap<String,Integer>map=new HashMap<>();
    static ArrayList<String>answer=new ArrayList<>();
    static boolean visit[];
    public String[] solution(String[] orders, int[] course) {
        for(int i=0; i<course.length; i++){
            int r=course[i];
            for(int j=0; j<orders.length; j++){
                String s[]=orders[j].split("");
                Arrays.sort(s);
                visit=new boolean[s.length];
                dfs(s,visit,0,r);
            }
            ArrayList<String>re=new ArrayList<>(map.keySet());
            Collections.sort(re,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
            int result=map.get(re.get(0));
            if(result<2) continue;
            for(String tm:re){
                if(map.get(tm)==result){
                    answer.add(tm);
                }
                else{
                    break;
                }
            }
            map.clear();
        }
        Collections.sort(answer);
        String answer1[]=new String[answer.size()];
        for(int i=0; i<answer1.length; i++){
            answer1[i]=answer.get(i);
        }
        return answer1;

    }

    static public void dfs(String s[],boolean []viist,int dept,int r){
        String temp="";

        if(r==0){
            for(int i=0; i<s.length; i++){
                if(visit[i]==true){
                    temp+=s[i];
                }
            }
            map.put(temp,map.getOrDefault(temp,0)+1);
            return;
        }

        for(int i=dept; i<s.length; i++){
            visit[i]=true;
            dfs(s,visit,i+1,r-1);
            visit[i]=false;
        }
    }
}
