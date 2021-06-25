package 해시.다단계칫솔판매;

import java.util.*;
class Retry {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {


        HashMap<String,String>map=new HashMap<>();
        HashMap<String,Integer>map1=new HashMap<>();
        for(int i=0; i<enroll.length; i++){
            map.put(enroll[i],referral[i]);
            map1.put(enroll[i],i);
        }

        int result[]=new int[enroll.length];

        HashMap<String,Integer>map2=new HashMap<>();
        for(int i=0; i<seller.length; i++){
            String now=seller[i];
            int price=100*amount[i];

            while (!now.equals("-")){
                int recnt1=price/10;
                int recnt=price-recnt1;

                result[map1.get(now)]+=recnt;

                now=map.get(now);
                price/=10;
                if(price<1){
                    break;
                }

            }
        }
        return result;
    }
}
