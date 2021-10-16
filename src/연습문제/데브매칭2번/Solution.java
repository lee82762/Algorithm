package 연습문제.데브매칭2번;

import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public int solution(int leave, String day, int[] holidays) {
        HashMap<Integer,String>map=new HashMap<>();
        String s1[]={"SUN","MON","TUE","WED","THU","FRI","SAT"};

        int answer=0;
        int cnt=0;
        int temp[]=new int[31];
        for(int i=0; i<s1.length; i++){
            if (s1[i].equals(day)){
                cnt=i;
            }
        }
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=1; i<=30; i++){
            if(s1[cnt%7]=="SAT" ||s1[cnt%7]=="SUN"){
                a1.add(i);
                temp[i]=1;
            }
            for(int j=0; j<holidays.length; j++){
                if(holidays[j]==i){
                    temp[i]=1;
                }
            }
            map.put(i,s1[cnt%7]);
            cnt++;
        }

        int a[]=new int[holidays.length];
        for(int i=0; i<holidays.length; i++){
            int tm=holidays[i];
            a[i]=tm;
            if(!a1.contains(tm)) {
                a1.add(tm);
            }

        }
        int result=0;

        for(int i=0; i<a1.size(); i++){
            int tm=a1.get(i);
            int cnt1=leave;
            int result1=0;
            for(int j=tm; j<=30; j++){
                if(temp[j]==1){
                    result1++;
                }
                else if(temp[j]==0&&cnt1!=0){
                    result1++;
                    cnt1--;
                }
                else if(temp[j]==0&&cnt1==0){
                    break;
                }
            }
            result=Math.max(result1,result);
        }
        return result;
    }
}
