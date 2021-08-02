package KAKAO.단체사진찍기;
class Retry {
    static String output[];
    static boolean visit[];
    static String member[]={"A","C","F","J","M","N","R","T"};
    static int answer=0;
    public int solution(int n, String[] data) {
        output=new String[member.length];
        visit=new boolean[member.length];
        int r=member.length;
        answer=0;
        dfs(0,r,data);
        return answer;
    }
    static void dfs(int dept,int r,String []data){
        String tm="";
        if(dept==r){
            for(int i=0; i<output.length; i++){
                tm+=output[i];
            }
            if(check(tm,data)==true){
                answer++;
            }
            return;
        }

        for(int i=0; i<member.length; i++){
            if(visit[i]==false){
                visit[i]=true;
                output[dept]=member[i];
                dfs(dept+1,r,data);
                visit[i]=false;
            }
        }
    }
    static boolean check(String tm,String []data){
        for(int i=0; i<data.length; i++){
            int a = Math.abs(tm.indexOf(String.valueOf(data[i].charAt(0))) - tm.indexOf(String.valueOf(data[i].charAt(2))))-1;

            int temp=Integer.parseInt(String.valueOf(data[i].charAt(4)));




            if(data[i].charAt(3)=='='){
                if(a!=temp){return false;}
            }
            else if(data[i].charAt(3)=='<'){
                if(a>=temp){return false;}
            }
            else if(data[i].charAt(3)=='>'){
                if(a<=temp){ return false; }
            }

        }
        return true;
    }



}
