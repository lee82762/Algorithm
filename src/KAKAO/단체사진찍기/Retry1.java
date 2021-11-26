package KAKAO.단체사진찍기;

class Retry1 {
    static String output[];
    static boolean visit[];
    static String member[]={"A","C","F","J","M","N","R","T"};
    static int answer=0;
    public int solution(int n, String[] data) {
        output=new String[member.length];
        visit=new boolean[member.length];

        answer=0;
        dfs(0,data);
        return answer;
    }
    static public void dfs(int dept,String []data){
        if(dept==member.length){
            if(check(output,data)==true){
                answer++;
            }
            return;
        }
        for(int i=0; i<member.length; i++){
            if(visit[i]==false){
                output[dept]=member[i];
                visit[i]=true;
                dfs(dept+1,data);
                visit[i]=false;
            }
        }
    }
    static public boolean check(String []output,String []data){
        boolean check=true;
        String tm="";
        for(int i=0; i<output.length; i++){
            tm+=output[i];
        }

        for(int i=0; i<data.length; i++){
            String data1[]=data[i].split("");
            String first=data1[0];
            String next=data1[2];
            String bu=data1[3];
            int tm1=Integer.parseInt(data1[4]);
            int ind=Math.abs(tm.indexOf(first)-tm.indexOf(next))-1;

            if(bu.equals("=")){
                if(ind!=tm1){
                    return false;
                }
            }
            else if(bu.equals(">")){
                if(ind<=tm1){

                    return false;
                }
            }
            else if(bu.equals("<")){
                if(ind>=tm1){
                    return false;
                }
            }

        }
        return true;
    }
}

