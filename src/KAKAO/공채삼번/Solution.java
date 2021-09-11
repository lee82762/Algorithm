package KAKAO.공채삼번;

import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {

        HashMap<String,String>map=new HashMap<>();
        HashMap<String,String>map1=new HashMap<>();
        HashMap<String,Integer>map3=new HashMap<>();

        for(int i=0; i<records.length; i++){
            String s[]=records[i].split(" ");
            if(map.containsKey(s[1])){
                if(s[2].equals("OUT")){
                    int last=0;
                    if(map3.get(s[1])!=null) {
                        last = map3.get(s[1]);
                    }
                    int h=0;
                    int m=0;
                    String tm[]=s[0].split(":");
                    String tm1[]=map.get(s[1]).split(":");
                    h=Integer.parseInt(tm[0])-Integer.parseInt(tm1[0]);
                    m=Integer.parseInt(tm[1])-Integer.parseInt(tm1[1]);
                    int time=0;
                    time=(h*60)+m;
                    time+=last;
                    map3.put(s[1],time);
                }
                else{
                    map.put(s[1],s[0]);
                    map1.put(s[1],s[2]);
                }

            }
            else{
                map.put(s[1],s[0]);
                map1.put(s[1],s[2]);
                map3.put(s[1],0);
            }
            map.put(s[1],s[0]);
            map1.put(s[1],s[2]);

            //System.out.println(Arrays.toString(s));
        }

        ArrayList<String>a1=new ArrayList<>(map3.keySet());


        for(int i=0; i<a1.size(); i++){
            if(map1.get(a1.get(i)).equals("IN")){
                int time=0;
                String rat="23:59";
                String tm[]=rat.split(":");
                String tm1[]=map.get(a1.get(i)).split(":");
                int h=0;
                int m=0;
                h=Integer.parseInt(tm[0])-Integer.parseInt(tm1[0]);
                m=Integer.parseInt(tm[1])-Integer.parseInt(tm1[1]);
                time=(h*60)+m;
                int last=map3.get(a1.get(i));
                time+=last;
                map3.put(a1.get(i),time);

            }
        }
        ArrayList<String>a2=new ArrayList<>(map3.keySet());
        Collections.sort(a2);
        int answer[]=new int[a2.size()];
        for(int i=0; i<a2.size(); i++){
            int my=map3.get(a2.get(i));
            if(fees[0]<=my){
                int a= (int) Math.ceil((double)(my-fees[0])/(double)fees[2]);
                answer[i]=fees[1]+(a*fees[3]);
            }
            else{
                answer[i]+=fees[1];
            }
        }
        return answer;
    }
}
