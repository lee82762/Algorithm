package 연습문제.예산;

import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int an=0;
        int cnt=0;
        for(int i=0; i<d.length; i++){
            an+=d[i];
            cnt++;
            if(an>budget){
                cnt--;
                break;
            }
        }
        return cnt;
    }
}