package KAKAO.메뉴리뉴얼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
class Retry {
    static HashMap<String,Integer>map=new HashMap<>();
    public String[] solution(String[] orders, int[] course) {
        ArrayList<String>anw=new ArrayList<>();
        for(int i=0; i<course.length; i++){
            int r=course[i];
            for(int j=0; j<orders.length; j++){
                String []arr=orders[j].split("");
                boolean []visit=new boolean[arr.length];
                Arrays.sort(arr);
                collect(arr,visit,0,arr.length,r);
            }

            ArrayList<String>s1=new ArrayList<>(map.keySet());
            Collections.sort(s1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));


            for(int k=0; k<s1.size(); k++){
                int re=map.get(s1.get(0));
                int re1=map.get(s1.get(k));
                if(re==re1&&re1>=2){
                    anw.add(s1.get(k));
                }

            }
            map.clear();

        }
        Collections.sort(anw);
        String answer[]=new String[anw.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=anw.get(i);
        }

        return answer;
    }
    static void collect(String []arr,boolean []visit,int start,int n,int r){
        if(r==0){
            String s="";
            for(int i=0; i<n; i++){
                if(visit[i]){
                    s+=arr[i];

                }

            }
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(int i=start; i<n; i++){
            visit[i]=true;
            collect(arr,visit,i+1,n,r-1);
            visit[i]=false;
        }


    }
}