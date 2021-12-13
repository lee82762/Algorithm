package KAKAO.단체사진찍기;


class Last {
    static boolean visit[];
    static String output[];
    static int answer=0;
    public int solution(int n, String[] data) {
        String mem[]={"A", "C", "F", "J", "M", "N", "R", "T"};
        int r=mem.length;
        output=new String[r];
        visit=new boolean[r];
        answer=0;
        comb(mem,0,r,data);

        return answer;
    }
    static public void comb(String mem[],int dept, int r,String data[]){
        String s="";
        if(dept==mem.length){
            for(int i=0; i<output.length; i++){
                s+=output[i];
            }
            if(check(data,s)){
                answer++;
            }

            return;
        }

        for(int i=0; i<mem.length; i++){
            if(visit[i]==false){
                visit[i]=true;
                output[dept]=mem[i];
                comb(mem,dept+1,r,data);
                visit[i]=false;
            }
        }
    }
    static public boolean check(String data[],String s){
        for(int i=0; i<data.length; i++){
            String s2[]=data[i].split("");
            String first=s2[0];
            String last=s2[2];
            String tm=s2[3];
            int re=Integer.parseInt(s2[4]);
            int re1=Math.abs(s.indexOf(first)-s.indexOf(last))-1;
            if(tm.equals("=")){
                if(re!=re1){
                    return  false;
                }
            }
            else if(tm.equals("<")){
                if(re1>=re){
                    return  false;
                }
            }
            else if(tm.equals(">")){
                if(re1<=re){
                    return  false;
                }
            }
        }

        return true;
    }

}
