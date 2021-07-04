package 네이버웹툰.문제1번;

import java.util.Arrays;
class Solution {
    public int solution(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);
        int cnt=discounts.length-1;
        int answer=0;
        for(int i=prices.length-1; i>=0; i--){

            if(cnt>=0) {
                double m = discounts[cnt] * 0.01;
                double pri = prices[i] * m;
                double ac = prices[i] - pri;

                answer+=(int)ac;
                cnt--;
            }
            else{
                answer+=prices[i];

            }
        }
        return answer;
    }
}
