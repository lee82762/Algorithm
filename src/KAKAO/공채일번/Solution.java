package KAKAO.공채일번;

import java.util.HashMap;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        HashMap<String, String>map=new HashMap<>();
        HashMap<String,Integer>map1=new HashMap<>();
        int answer[]=new int[id_list.length];

        for(int i=0; i<report.length; i++){
            String s[]=report[i].split(" ");
            String s2="";
            if(map.containsKey(s[0])){
                if(!map.get(s[0]).contains(s[1])) {
                    s2 = map.get(s[0]) +","+ s[1];
                    map.put(s[0], s2);
                    map1.put(s[1],map1.getOrDefault(s[1],0)+1);
                }


            }
            else{
                map.put(s[0],s[1]);
                map1.put(s[1],map1.getOrDefault(s[1],0)+1);
            }

        }

        for(int i=0; i<id_list.length; i++){
            String tm=id_list[i];
            //System.out.println(map.get(tm));
            if(map.get(tm)==null){
                answer[i]=0;

            }
            else{
                String tm1[]=map.get(tm).split(",");
                for(int j=0; j<tm1.length; j++){
                    if(map1.get(tm1[j])>=k){
                        answer[i]+=1;
                    }
                }
            }

        }
        return answer;
    }
}
