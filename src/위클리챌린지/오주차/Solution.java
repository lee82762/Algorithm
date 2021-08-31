package 위클리챌린지.오주차;

import java.util.*;

class Solution {
    static ArrayList<String>a1=new ArrayList<>();
    public int solution(String word) {
        dfs("",0);

        return a1.indexOf(word);
    }

    static public void dfs(String word,int len){
        char c1[]={'A','E','I','O','U'};
        if(len>5)
            return;
        a1.add(word);
        for(int i=0; i<c1.length; i++){
            dfs(word+c1[i],len+1);
        }
    }
}
