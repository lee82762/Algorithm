package KAKAO.셔틀버스;

import java.util.*;
class Retry {
    public String solution(int n, int t, int m, String[] timetable) {
        PriorityQueue<Integer>queue=new PriorityQueue<>();

        for(int i=0; i<timetable.length; i++){
            String s[]=timetable[i].split(":");
            int hour=Integer.parseInt(s[0])*60;
            int min=Integer.parseInt(s[1]);
            queue.add(hour+min);
        }

        int start=9*60;
        int answer=0;
        ArrayList<Integer>a1[]=new ArrayList[n];
        for(int i=0; i<n; i++){
            a1[i]=new ArrayList<>();
            while (!queue.isEmpty()){
                int temp=queue.poll();
                if(temp<=start && a1[i].size()<m){
                    a1[i].add(temp);
                    answer=temp-1;
                }
                else{
                    queue.add(temp);
                    break;
                }
            }
            start+=t;
        }
        if(a1[n-1].size()<m){
            answer=start-t;
        }

        String hour=String.format("%02d",answer/60);
        String min=String.format("%02d",answer%60);
        return hour+":"+min;
    }
}
