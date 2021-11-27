package KAKAO.후보키;

import java.util.ArrayList;
class Retry {
    static int array[];
    static boolean visit[];
    static ArrayList<String>ans=new ArrayList<>();
    public int solution(String[][] relation) {
        array=new int[relation[0].length];
        visit=new boolean[relation[0].length];
        for(int i=0; i<relation[0].length; i++){
            array[i]=i;
        }
        for(int i=1; i<=relation[0].length; i++){
            dfs(0,i,relation);
        }
        return ans.size();
    }
    static public void dfs(int dept,int r,String relation[][]){
        String tm="";
        if(r==0){
            for(int i=0; i<array.length; i++){
                if(visit[i]){
                    tm+=array[i];
                }
            }
            if(check(tm,relation)){
                ans.add(tm);
            }
            return;
        }
        for(int i=dept; i<array.length; i++){
            visit[i]=true;
            dfs(i+1,r-1,relation);
            visit[i]=false;
        }
    }
    static public boolean check(String tm,String [][]relation){
        if(ans.contains(tm)){
            return false;
        }
        String s1[]=tm.split("");
        for(int i=0; i<ans.size(); i++){
            String s[]=ans.get(i).split("");
            int cnt=s.length;
            int cnt1=0;
            for(int j=0; j<s1.length; j++){
                for(int k=0; k<s.length; k++){
                    if(s1[j].equals(s[k])){
                        cnt1++;
                    }
                }
            }
            if(cnt==cnt1){
                return false;
            }
        }
        ArrayList<String>temp=new ArrayList<>();
        for(int i=0; i<relation.length; i++){
            String s="";
            for(int j=0; j<s1.length; j++){
                s+=relation[i][Integer.parseInt(s1[j])];
            }
            if(temp.contains(s)){
                return false;
            }
            else{
                temp.add(s);
            }
        }
        return true;
    }
}
