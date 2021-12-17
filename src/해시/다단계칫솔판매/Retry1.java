package 해시.다단계칫솔판매;

import java.util.*;
class Retry1 {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int result[]=new int[enroll.length];
        HashMap<String,String> map =new HashMap<>();
        HashMap<String,Integer> map1 =new HashMap<>();
        for(int i=0; i<enroll.length; i++){
            map.put(enroll[i],referral[i]);
            map1.put(enroll[i],i);
        }

        for(int i=0; i<seller.length; i++){
            String tm = seller[i];
            int amt = amount[i]*100;
            while (!tm.equals("-")){
                int reamt=amt/10;
                int reamt1=amt-reamt;
                result[map1.get(tm)]+=reamt1;
                tm=map.get(tm);
                amt/=10;
                if(amt<1){
                    break;
                }
            }
        }
        return result;
    }
}
