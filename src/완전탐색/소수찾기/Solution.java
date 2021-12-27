package 완전탐색.소수찾기;

import java.util.ArrayList;
class Solution {
    static String arr[];
    static boolean visit[];
    static String out[];
    static ArrayList<String>s1=new ArrayList<>();
    public int solution(String numbers) {
        arr=numbers.split("");
        visit=new boolean[arr.length];
        out=new String[arr.length];


        for(int i=1; i<=arr.length; i++){
            out=new String[i];
            dfs(i,0);
        }
        int answer=0;
        for(int i=0; i<s1.size(); i++){
            int tm=Integer.parseInt(s1.get(i));
            int cnt=0;
            for(int j=1; j<=tm; j++){
                if(tm%j==0){
                    cnt++;
                }
            }

            if(cnt==2) {
                answer++;
            }
        }


        return answer;

    }
    static public void dfs(int r, int dept){
        String s="";
        if(dept==r){
            for(int i=0; i<out.length; i++){
                if(s.length()==0 && out[i].equals("0")) continue;
                s+=out[i];
            }
            if(!s1.contains(s) && !s.equals("")) {
                s1.add(s);
            }
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(visit[i]==false){
                visit[i]=true;
                out[dept]=arr[i];
                dfs(r,dept+1);
                visit[i]=false;
            }
        }

    }
}
