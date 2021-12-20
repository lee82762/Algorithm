package KAKAO.외벽점검;

import java.util.*;
class Solution {
    static LinkedList<Integer> circleWeak;
    static int output[];
    static boolean visit[];
    static int answer=Integer.MAX_VALUE;
    static int weakSize;
    public int solution(int n, int[] weak, int[] dist) {
        output=new int[dist.length];
        visit=new boolean[dist.length];
        weakSize=weak.length;
        int r=dist.length;


        circleWeak = new LinkedList<>();
        for (int i = 0; i < weak.length; i++) {
            circleWeak.add(weak[i]);
        }

        for (int i = 0; i < weak.length; i++) {
            circleWeak.add(weak[i] + n);
        }

        dfs(dist,r,0);
        if (answer == Integer.MAX_VALUE) {
            return -1;

        }
        return answer;
    }
    static public void dfs(int []dist,int r,int dept){
        if(dept==r){
            check(output);
            return;
        }

        for(int i=0; i<dist.length; i++){
            if(visit[i]==false){
                output[dept]=dist[i];
                visit[i]=true;
                dfs(dist,r,dept+1);
                visit[i]=false;
            }
        }

    }
    static public void check(int []output){
        for (int i = 0; i < weakSize; i++) {
            int index = 0;
            boolean mark = false;
            int start = circleWeak.get(i);

            for (int j = i; j < i + weakSize; j++) {
                if (output[index] < (circleWeak.get(j) - start)) {
                    start = circleWeak.get(j);
                    index++;

                    if (index == output.length) {
                        mark = true;
                        break;
                    }
                }
            }

            if (!mark) {
                answer = Math.min(answer, index + 1);
            }
        }

    }
}
