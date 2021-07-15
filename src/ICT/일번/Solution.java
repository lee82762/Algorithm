package ICT.일번;

import java.util.Collections;
import java.util.List;

public class Solution {
    static int maxTickets(List<Integer> tickets) {
        Collections.sort(tickets);
        int max=0;
        int answer=0;

        for(int i=0; i<tickets.size()-1; i++){
            if(tickets.get(i+1)==tickets.get(i)+1 || tickets.get(i+1)==tickets.get(i)){
                max++;
            }
            else{
                answer=Math.max(max,answer);
                max=0;
            }

        }
        return answer+1;


    }
}
