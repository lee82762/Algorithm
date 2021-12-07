package KAKAO.광고삽입;

class Solution {
    public String solution(String play_time, String adv_time, String[] logs) {
        int plays_time=changetime(play_time);
        int advs_time=changetime(adv_time);
        if(plays_time==advs_time){
            return "00:00:00";
        }
        int ans[]=new int[360001];

        for(int i=0; i<logs.length; i++){
            String log[]=logs[i].split("-");
            int start=changetime(log[0]);
            int end=changetime(log[1]);
            for(int j=start; j<end; j++){
                ans[j]+=1;
            }
        }

        int start=0;
        long sum=0;
        for(int i=start; i<advs_time; i++){
            sum+=ans[i];
        }

        long max=sum;
        int maxstart=0;
        while (advs_time<=plays_time){
            sum-=ans[start];
            sum+=ans[advs_time];
            if(sum>max){
                max=sum;
                maxstart=start+1;
            }
            start++;
            advs_time++;
        }

        return changeresult(maxstart);
    }
    static public int changetime(String time){
        String times[]=time.split(":");
        int re=0;
        re+=Integer.parseInt(times[0])*3600;
        re+=Integer.parseInt(times[1])*60;
        re+=Integer.parseInt(times[2]);
        return re;
    }

    static public String changeresult(int time){
        String re="";
        int re1=time/3600;
        time=time-(re1*3600);
        int re2=time/60;
        time=time-(re2*60);
        String hour=Integer.toString(re1);
        if(hour.length()==1){
            hour="0"+hour;
        }
        String min=Integer.toString(re2);
        if(min.length()==1){
            min="0"+min;
        }
        String sec=Integer.toString(time);
        if(sec.length()==1){
            sec="0"+sec;
        }
        re=hour+":"+min+":"+sec;
        return re;
    }
}
