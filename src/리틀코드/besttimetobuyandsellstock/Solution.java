package 리틀코드.besttimetobuyandsellstock;

class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=10000;

        for(int i=0; i<prices.length; i++){
            min=Math.min(prices[i],min);
            max=Math.max(max,prices[i]-min);
        }

        return max;

    }
}
