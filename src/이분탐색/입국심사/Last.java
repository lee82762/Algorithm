package 이분탐색.입국심사;

import java.util.Arrays;
class Last {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long first=1;
        long last=(long)times[times.length-1]*n;
        long answer=0;
        while (first<=last){
            long mid=(first+last)/2;
            long sum=0;
            for(int i=0; i<times.length; i++){
                sum+=mid/times[i];
            }
            if(sum<n){
                first=mid+1;
            }
            else{
                answer=mid;
                last=mid-1;
            }

        }
        return answer;
    }
}
