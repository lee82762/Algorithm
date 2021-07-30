package KAKAO.단체사진찍기;

class Solution {
    static String member[]={"A","C","F","J","M","N","R","T"};
    static boolean check[];
    static String output[];
    static int answer=0;
    public int solution(int n, String[] data) {
        check=new boolean[member.length];
        StringBuilder sb=new StringBuilder();
        output=new String[member.length];
        int r=member.length;
        answer=0;
        dfs(sb,0,r,data);
        return answer;
    }
    public static void dfs(StringBuilder sb,int dept,int r,String data[]){

        if(dept==r){
            if(check(sb,data)==true){
                answer++;
            }
            return;
        }

        for(int i=0; i<member.length; i++){
            if(check[i]) continue;

            check[i]=true;
            sb.append(member[i]);
            dfs(sb,dept+1,r,data);
            check[i]=false;

            sb.delete(dept,r);
        }
    }


    static boolean check(StringBuilder sb,String []data){
        for(int i=0; i<data.length; i++){
            int a = Math.abs(sb.indexOf(String.valueOf(data[i].charAt(0))) - sb.indexOf(String.valueOf(data[i].charAt(2))))-1;

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