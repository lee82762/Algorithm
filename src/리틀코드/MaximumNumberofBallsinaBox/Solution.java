package 리틀코드.MaximumNumberofBallsinaBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int answer=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=lowLimit; i<=highLimit; i++){
            String temp[]=Integer.toString(i).split("");
            int re=0;
            for(int j=0; j<temp.length; j++){
                re+=Integer.parseInt(temp[j]);
            }
            map.put(re,map.getOrDefault(re,0)+1);
        }
        ArrayList<Integer>a1=new ArrayList<>(map.values());

        Collections.sort(a1, Collections.reverseOrder());
        return a1.get(0);

    }
}
