package KAKAO.주차요금계산;

import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        HashMap<String,String> map =new HashMap<>();
        HashMap<String,String> map1 =new HashMap<>();


        for(int i=0; i<records.length; i++){
            String temp[]=records[i].split(" ");
            if(map.get(temp[1])==null){
                String time[]=temp[0].split(":");
                int hour=Integer.parseInt(time[0])*60;
                int min=Integer.parseInt(time[1]);
                String re=Integer.toString(hour+min)+" IN";
                map.put(temp[1],re);
            }
            else{
                if(temp[2].equals("OUT")){
                    String time[]=temp[0].split(":");
                    int hour=Integer.parseInt(time[0])*60;
                    int min=Integer.parseInt(time[1]);
                    String re[]=map.get(temp[1]).split(" ");
                    int lasttime=Integer.parseInt(re[re.length-2]);
                    int outtime=(hour+min)-lasttime;
                    String re1=map.get(temp[1])+" "+Integer.toString(outtime)+" OUT";
                    map.put(temp[1],re1);
                }
                else{
                    String time[]=temp[0].split(":");
                    int hour=Integer.parseInt(time[0])*60;
                    int min=Integer.parseInt(time[1]);
                    String re=map.get(temp[1])+" "+Integer.toString(hour+min)+" IN";
                    map.put(temp[1],re);
                }
            }
        }
        ArrayList<String> car =new ArrayList<>(map.keySet());
        Collections.sort(car);
        int result[]=new int[car.size()];

        for(int i=0; i<car.size(); i++){
            String carname=car.get(i);
            String time=map.get(carname);
            String temp[]=time.split(" ");
            int anw=0;
            int answer=0;
            if(temp[temp.length-1].equals("IN")){
                int lasttime=23*60+59;
                int lesstime=lasttime-Integer.parseInt(temp[temp.length-2]);
                time+=" "+Integer.toString(lesstime)+" OUT";
            }
            temp=time.split(" ");

            for(int j=2; j<temp.length; j++){
                anw+=Integer.parseInt(temp[j]);
                j+=3;
            }
            if(anw<=fees[0]){
                answer=fees[1];
            }
            else{
                answer= fees[1]+(int)(Math.ceil((double)(anw-fees[0])/fees[2]))*fees[3];
            }

            result[i]=answer;
        }
        return result;
    }
}
