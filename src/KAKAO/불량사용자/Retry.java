package KAKAO.불량사용자;

import java.util.ArrayList;
import java.util.Arrays;
class Retry {
    static ArrayList<String>s1=new ArrayList<>();
    static String re[];

    static boolean visit[];
    public int solution(String[] user_id, String[] banned_id) {
        re=new String[banned_id.length];
        visit=new boolean[user_id.length];
        for(int i=0; i<banned_id.length; i++){
            re[i]=banned_id[i].replace("*",".");
        }
        dfs(0,"",user_id);
        return s1.size();
    }
    static void dfs(int dept,String temp,String []user_id){
        if(dept==re.length){
            String a[]=temp.split(",");
            Arrays.sort(a);

            String tm="";
            for(int i=0; i<a.length; i++){
                tm+=a[i];
            }

            if(!s1.contains(tm)){
                s1.add(tm);
            }
            return;
        }


        for(int i=0; i<user_id.length; i++){
            if(visit[i]==false&&user_id[i].matches(re[dept])){
                visit[i]=true;
                dfs(dept+1,temp+","+user_id[i],user_id);
                visit[i]=false;
            }
        }
    }
}
