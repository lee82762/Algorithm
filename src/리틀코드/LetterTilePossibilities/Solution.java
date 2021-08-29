package 리틀코드.LetterTilePossibilities;

import java.util.HashSet;

class Solution {
    HashSet<String> a1=new HashSet<>();
    public int numTilePossibilities(String titles) {
        String s[]=titles.split("");

        for(int i=1; i<=s.length; i++) {
            String output[]=new String[s.length];
            boolean visit[]=new boolean[s.length];
            dfs(s, output, visit, i, 0);
        }
        return a1.size();
    }
    public void  dfs(String s[],String []output,boolean visit[],int r,int dept){
        String answer="";
        if(dept==r){
            for(int i=0; i<r; i++){
                answer+=output[i];
            }
            a1.add(answer);
            return;
        }

        for(int i=0; i<s.length; i++){
            if(visit[i]==false){
                output[dept]=s[i];
                visit[i]=true;
                dfs(s,output,visit,r,dept+1);
                visit[i]=false;
            }
        }
    }
}