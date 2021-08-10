package KAKAO.징검다리건너기;

class Solution {
    public int solution(int[] stones, int k) {
        int high=0;
        int low=1;
        for(int i=0; i<stones.length; i++){
            high=Math.max(high,stones[i]);
        }
        int answer=0;
        while (low<=high){
            int mid=(low+high)/2;
            if(!check(k,mid,stones)){
                high=mid-1;
            }
            else{
                low=mid+1;
                answer=Math.max(answer,mid);
            }
        }

        return answer;
    }
    static boolean check(int k,int mid,int []stones){
        int cnt=0;
        for(int i=0; i<stones.length; i++){
            if(stones[i]-mid<0){
                cnt++;
            }
            else{
                cnt=0;
            }
            if(cnt==k){
                return false;
            }
        }
        return true;
    }
}