package KAKAO.신고결과받기;

import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int K) {
        HashMap<String,String> map =new HashMap<>();
        HashMap<String,Integer> map1 = new HashMap<>();



        for(int i=0; i<id_list.length; i++){
            map1.put(id_list[i],0);
        }

        HashSet<String> set1=new HashSet<>();
        for(int i=0; i<report.length; i++){
            String s[]=report[i].split(" ");
            if(map.get(s[1])==null){
                map.put(s[1],s[0]);
                set1.add(s[1]+s[0]);
            }
            else{
                if(set1.contains(s[1]+s[0])){
                    continue;
                }
                else{
                    set1.add(s[1]+s[0]);
                }
                String tm=map.get(s[1]);
                tm+=" "+s[0];
                map.put(s[1],tm);
            }
        }


        for(int i=0; i<id_list.length; i++){
            if(map.get(id_list[i])!=null){
                String tm[]=map.get(id_list[i]).split(" ");
                map1.put(id_list[i],tm.length);
            }
        }

        HashMap<String,Integer> map3= new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<report.length; i++){
            String s[]=report[i].split(" ");

            if(!set.contains(s[0]+s[1])) {
                set.add(s[0] + s[1]);
            }
            else{
                continue;
            }
            if(map1.get(s[1])>=K){
                map3.put(s[0],map3.getOrDefault(s[0],0)+1);
            }
        }

        int answer[]=new int[id_list.length];
        for(int i=0; i<id_list.length; i++){
            if(map3.get(id_list[i])!=null){
                answer[i]=map3.get(id_list[i]);
            }
        }
        return answer;
    }
}
