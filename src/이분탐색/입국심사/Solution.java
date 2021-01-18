package 이분탐색.입국심사;

import java.util.Arrays;
class Solution {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer=0;
        long min=1;
        long max=(long)times[times.length-1]*n;

        while (min<=max){
            long mid=(min+max)/2;
            long sum=0;
            for(int i=0; i<times.length; i++){
                sum+=mid/times[i];
            }
            //시간안에 심사를 다 못하는 경우
            if(sum<n){
                min=mid+1;
            }
            //시간이 여융있거나 딱맞는 경우
            else{
                if(mid<answer) {
                    answer = mid;
                }
                answer=Math.max(answer,mid);
                max=mid-1;
            }

        }
        return answer;
    }
}
