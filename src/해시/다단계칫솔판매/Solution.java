package 해시.다단계칫솔판매;
import java.util.*;


class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int result[]=new int[enroll.length];

        HashMap<String,String>map=new HashMap<>();
        HashMap<String ,Integer>map1=new HashMap<>();

        for(int i=0; i<enroll.length; i++){
            map.put(enroll[i],referral[i]);
            map1.put(enroll[i],i);
        }

        for(int i=0; i<seller.length; i++){
            String now=seller[i];
            int p=100*amount[i];

            while (!now.equals("-")){
                int rep=p/10;
                int rep1=p-rep;

                result[map1.get(now)]+=rep1;

                now=map.get(now);
                p/=10;
                if(p<1){
                    break;
                }

            }
        }
        return result;
    }
}
