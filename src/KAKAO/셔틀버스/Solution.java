package KAKAO.셔틀버스;

import java.util.*;
class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();
        for(int i=0; i<timetable.length; i++){
            String s[]=timetable[i].split(":");
            int hour=Integer.parseInt(s[0])*60;
            int min=Integer.parseInt(s[1]);
            queue.add(hour+min);
        }
        ArrayList<Integer>arrive[] = new ArrayList[n];
        int answer=0;
        int start=9*60;
        for(int i=0; i<n; i++){
            arrive[i]=new ArrayList<>();
            while (!queue.isEmpty()){
                int a=queue.poll();
                if(a<=start && arrive[i].size()<m){
                    arrive[i].add(a);
                    answer=a-1;
                }
                else{
                    queue.add(a);
                    break;
                }
            }
            start+=t;
        }
        if(arrive[n-1].size()<m){
            answer=start-t;
        }
        String hour=String.format("%02d",answer/60);
        String min=String.format("%02d",answer%60);
        return hour+":"+min;
    }
}
