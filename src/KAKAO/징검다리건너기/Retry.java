package KAKAO.징검다리건너기;

class Retry {
    public int solution(int[] stones, int k) {

        int first=0;
        int last=0;

        for(int i=0; i<stones.length; i++){
            last=Math.max(last,stones[i]);
        }
        int ansewr=0;

        while (first<=last){
            int mid=(first+last)/2;
            if(!check(mid,stones,k)){
                last=mid-1;
            }
            else{
                first=mid+1;
                ansewr=Math.max(ansewr,mid);
            }
        }

        return ansewr;
    }
    static public boolean check(int mid,int stone[],int k){
        int cnt=0;
        for(int i=0; i<stone.length; i++){
            if(stone[i]-mid<0){
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
