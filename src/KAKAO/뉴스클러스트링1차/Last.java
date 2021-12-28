package KAKAO.뉴스클러스트링1차;

import java.util.*;
class Last {
    static HashMap<String,Integer>st1=new HashMap<>();
    static HashMap<String,Integer>st2=new HashMap<>();
    static ArrayList<String>temp=new ArrayList<>();
    public int solution(String str1, String str2) {
        String re="^[a-z]+$";
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        String s[]=str1.split("");
        String s1[]=str2.split("");
        for(int i=0; i<s.length-1; i++){
            String tm=s[i]+s[i+1];
            if(!tm.matches(re)) continue;
            st1.put(tm,st1.getOrDefault(tm,0)+1);
            if(!temp.contains(tm)) {
                temp.add(tm);
            }
        }
        for(int i=0; i<s1.length-1; i++){
            String tm=s1[i]+s1[i+1];
            if(!tm.matches(re)) continue;
            st2.put(tm,st2.getOrDefault(tm,0)+1);
            if(!temp.contains(tm)) {
                temp.add(tm);
            }
        }
        int answer=0;
        if(gu()==0 && hap() ==0){
            answer=65536;
        }
        else if(hap()==0){
            answer=0;
        }
        else {
            double ans = (double) gu() / (double) hap();
            answer = (int) (ans * 65536);
        }
        return answer;
    }
    static public int gu(){
        int re=0;
        for(int i=0; i<temp.size(); i++){
            String vi=temp.get(i);
            int tm=0;
            if(st1.get(vi)!=null && st2.get(vi)!=null){
                //  System.out.println(vi);
                tm=Math.min(st1.get(vi), st2.get(vi));
                re+=tm;
            }
        }
        return  re;
    }
    static public int hap(){
        int re=0;
        for(int i=0; i<temp.size(); i++){
            String vi=temp.get(i);
            int tm=0;
            if(st1.get(vi) != null){
                tm=Math.max(tm,st1.get(vi));
            }

            if(st2.get(vi) != null){
                tm=Math.max(tm,st2.get(vi));
            }
            re+=tm;
        }
        return re;
    }
}
