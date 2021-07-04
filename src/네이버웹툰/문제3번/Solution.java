package 네이버웹툰.문제3번;

public class Solution {
    static int answer=0;

    public int solution(String s, String t) {
        dfs(s,t);

        return answer;
    }
    public static void dfs(String s,String t){
        if(!s.contains(t)){
            return;
        }

        if(s.contains(t)){


            int idx=s.indexOf(t);
            System.out.println(idx);

            String temp=s.substring(0,idx);
            String temp2=s.substring(idx+t.length());

            s= temp+temp2;

            answer++;
            dfs(s,t);

        }

    }
}
