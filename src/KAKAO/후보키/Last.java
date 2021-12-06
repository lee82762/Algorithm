package KAKAO.후보키;

import java.util.*;
class Last {
    static boolean visit[];
    static ArrayList<String> set=new ArrayList<>();
    public int solution(String[][] relation) {
        int r=relation[0].length;
        int arr[]=new int[r];
        visit=new boolean[r];
        for(int i=0; i<r; i++){
            arr[i]=i;
        }
        for(int i=1; i<=r; i++) {
            dfs(arr, 0, i,relation);
        }
        return set.size();
    }
    static public void dfs(int []arr,int dept,int r,String relation[][]){
        String tm="";
        if(r==0){
            for(int i=0; i<arr.length; i++){
                if(visit[i]){
                    tm+=arr[i];
                }
            }
            if(check(tm,relation)){
                set.add(tm);
            }

            return;
        }
        for(int i=dept; i<arr.length; i++){
            visit[i]=true;
            dfs(arr,i+1,r-1,relation);
            visit[i]=false;

        }

    }
    static public boolean check(String tm,String relation[][]){

        String tm1[]=tm.split("");

        for(int i=0; i<set.size(); i++){
            int cnt=0;

            String last[]=set.get(i).split("");
            int n=last.length;
            for(int j=0; j<last.length; j++){
                for(int k=0; k<tm1.length; k++){
                    if(last[j].equals(tm1[k])){
                        cnt++;
                    }
                }
            }
            if(cnt==n){
                return false;
            }
        }
        HashSet<String> set1=new HashSet<>();
        for(int i=0; i<relation.length; i++){
            String re="";
            for(int j=0; j<tm1.length; j++) {
                re += relation[i][Integer.parseInt(tm1[j])];
            }
            if(set1.contains(re)){
                return false;
            }
            else{
                set1.add(re);
            }
        }
        return true;
    }


}
