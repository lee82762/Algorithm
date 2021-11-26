package KAKAO.후보키;

import java.util.ArrayList;
class Solution {
    static boolean visit[];
    static String member[];
    static ArrayList<String>answer=new ArrayList<>();
    public int solution(String[][] relation) {
        member=new String[relation[0].length];
        visit=new boolean[member.length];
        for(int i=0; i<member.length; i++){
            member[i]=Integer.toString(i);
        }

        for(int i=1; i<=member.length; i++) {
            dfs(0, member, i,relation);
        }
        return answer.size();
    }
    static public void dfs(int dept,String []data,int r,String [][]relation){
        String tm="";
        if(r==0){
            for(int i=0; i<data.length; i++){
                if(visit[i]==true){
                    tm+=data[i];
                }
            }
            if(check(tm,relation)==true){
                answer.add(tm);
            }
            return;
        }
        for(int i=dept; i<member.length; i++){

            visit[i]=true;
            dfs(i+1,data,r-1,relation);
            visit[i]=false;

        }
    }
    static public boolean check(String tm,String [][]relation){

        String s[]=tm.split("");
        for(int i=0; i<answer.size(); i++){
            int cnt=0;
            String re[]=answer.get(i).split("");
            int re1=re.length;
            for(int j=0; j<s.length; j++){
                for(int k=0; k<re.length; k++){
                    if(s[j].equals(re[k])){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt==re1){
                return false;
            }

        }
        ArrayList<String>s1=new ArrayList<>();

        for(int i=0; i<relation.length; i++){
            String temp="";
            for(int j=0; j<s.length; j++){
                temp+=relation[i][Integer.parseInt(s[j])];
            }
            if(s1.contains(temp)){
                return false;
            }
            else{
                s1.add(temp);
            }
        }
        return true;
    }
}
