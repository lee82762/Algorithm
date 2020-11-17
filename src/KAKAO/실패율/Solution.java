package KAKAO.실패율;
import java.util.*;
class Solution {
    public int[] solution(int n, int[] stages) {

        int cnt=0;
        int cnt1=0;
        HashMap<Integer,Double>map=new HashMap<>();
        for(int i=1; i<=n; i++){
            cnt=0;
            cnt1=0;
            for(int j=0; j<stages.length; j++){
                if(i==stages[j]){
                    cnt++;
                }
                if(i<=stages[j]){
                    cnt1++;
                }

            }
            double cnt2=0;
            if(cnt==0){
                cnt2=0;
            }else {
                cnt2 = (double) cnt / (double) cnt1;
            }

            map.put(i,cnt2);
        }
        ArrayList<Integer>st=new ArrayList<>(map.keySet());
        Collections.sort(st,(s1,s2)->map.get(s2).compareTo(map.get(s1)));
        int answer[]=new int[n];
        int i=0;
        for(Integer keys:st){

            answer[i]=keys;
            i++;
        }


        return answer;
    }
}