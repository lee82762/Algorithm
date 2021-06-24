package KAKAO.불량사용자;

import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    static ArrayList<String>s1=new ArrayList<>();
    static String re[];

    static boolean visit[];
    public int solution(String[] user_id, String[] banned_id) {
        re=new String[banned_id.length];
        visit=new boolean[user_id.length];

        for(int i=0; i<banned_id.length; i++){
            re[i]=banned_id[i].replace("*",".");
        }

        String temp="";
        dfs(0,temp,user_id);
        return s1.size();
    }
    static void dfs(int x,String temp,String []user){
        if(x==re.length){
            String []ar=temp.split(",");
            Arrays.sort(ar);
            String tem="";
            for(int i=0; i<ar.length; i++){
                tem+=ar[i];
            }
            if(!s1.contains(tem)) {
                s1.add(tem);
            }
            return;
        }

        for(int i=0; i<user.length; i++){
            if(visit[i]==false && user[i].matches(re[x])){
                visit[i]=true;
                dfs(x+1,temp+","+user[i],user);
                visit[i]=false;
            }
        }

    }
}